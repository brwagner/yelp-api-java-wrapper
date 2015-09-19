package com.brajswagner.yelpapi;

import com.brajswagner.yelpapi.model.request.SearchRequest;
import com.brajswagner.yelpapi.model.response.Business;
import com.brajswagner.yelpapi.model.response.SearchResult;
import com.brajswagner.yelpapi.oauth.TwoStepOAuth;
import com.google.gson.Gson;
import org.scribe.builder.ServiceBuilder;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.oauth.OAuthService;

public class YelpAPI {

    private static final String API_HOST = "api.yelp.com";
    private static final String SEARCH_PATH = "/v2/search";
    private static final String BUSINESS_PATH = "/v2/business";

    private OAuthService service;
    private Token accessToken;
    private Gson gson;

    /**
     * Setup the Yelp API OAuth credentials.
     *
     * @param consumerKey    Consumer key
     * @param consumerSecret Consumer secret
     * @param token          Token
     * @param tokenSecret    Token secret
     */
    public YelpAPI(Gson gson, String consumerKey, String consumerSecret, String token, String tokenSecret) {
        this.gson = gson;
        this.service =
            new ServiceBuilder().provider(TwoStepOAuth.class).apiKey(consumerKey).apiSecret(consumerSecret).build();
        this.accessToken = new Token(token, tokenSecret);
    }

    /**
     * Creates and sends a request to the Search API by term and location.
     * <p>
     * See <a href="http://www.yelp.com/developers/documentation/v2/search_api">Yelp Search API V2</a>
     * for more info.
     *
     * @param searchRequest pojo containing search parameters
     * @return <tt>String</tt> JSON Response
     */
    public SearchResult searchForBusinessesByLocation(SearchRequest searchRequest) {
        OAuthRequest request = createOAuthRequest(SEARCH_PATH);
        if (searchRequest.getTerm() != null) {
            request.addQuerystringParameter("term", searchRequest.getTerm());
        }
        if (searchRequest.getLimit() != null) {
            request.addQuerystringParameter("limit", searchRequest.getLimit().toString());
        }
        if (searchRequest.getOffset() != null) {
            request.addQuerystringParameter("offset", searchRequest.getOffset().toString());
        }
        if (searchRequest.getSort() != null) {
            request.addQuerystringParameter("sort", searchRequest.getSort().id().toString());
        }
        if (searchRequest.getCategoryFilter() != null) {
            request.addQuerystringParameter("category_filter", searchRequest.getCategoryFilter());
        }
        if (searchRequest.getRadiusFilter() != null) {
            request.addQuerystringParameter("radius_filter", searchRequest.getRadiusFilter().toString());
        }
        if (searchRequest.getDealsFilter() != null) {
            request.addQuerystringParameter("deals_filter", searchRequest.getDealsFilter().toString());
        }
        if (searchRequest.getLocation() != null) {
            request.addQuerystringParameter("location", searchRequest.getLocation());
            if (searchRequest.getLatitude() != null && searchRequest.getLongitude() != null) {
                String cll = searchRequest.getLatitude() + "," + searchRequest.getLongitude();
                request.addQuerystringParameter("cll", cll);
            }
        }
        if (searchRequest.getSwLatitude() != null && searchRequest.getSwLongitude() != null
            && searchRequest.getNeLatitude() != null && searchRequest.getNeLongitude() != null) {
            String bounds = searchRequest.getSwLatitude() + "," +
                searchRequest.getSwLongitude() + "|" +
                searchRequest.getNeLatitude() + "," +
                searchRequest.getNeLongitude();
            request.addQuerystringParameter("bounds", bounds);
        }
        if (searchRequest.getLanguage() == null && searchRequest.getLatitude() != null
            && searchRequest.getLongitude() != null) {
            String ll = searchRequest.getLatitude() + "," +
                searchRequest.getLongitude() + "," +
                searchRequest.getAccuracy() + "," +
                searchRequest.getAltitude() + "," +
                searchRequest.getAltitudeAccuracy();
            request.addQuerystringParameter("ll", ll);
        }
        if (searchRequest.getCountryCode() != null) {
            request.addQuerystringParameter("cc", searchRequest.getCountryCode());
        }
        if (searchRequest.getLanguage() != null) {
            request.addQuerystringParameter("lang", searchRequest.getLanguage());
        }
        if (searchRequest.getActionLinks() != null) {
            request.addQuerystringParameter("actionlinks", searchRequest.getActionLinks().toString());
        }
        return sendRequestAndGetResponse(request, SearchResult.class);
    }

    /**
     * Creates and sends a request to the Business API by business ID.
     * <p>
     * See <a href="http://www.yelp.com/developers/documentation/v2/business">Yelp Business API V2</a>
     * for more info.
     *
     * @param businessID <tt>String</tt> business ID of the requested business
     * @return <tt>String</tt> JSON Response
     */
    public Business searchByBusinessId(String businessID) {
        OAuthRequest request = createOAuthRequest(BUSINESS_PATH + "/" + businessID);
        return sendRequestAndGetResponse(request, Business.class);
    }

    /**
     * Creates and sends a request to the Business API by business ID with additional params.
     * <p>
     * See <a href="http://www.yelp.com/developers/documentation/v2/business">Yelp Business API V2</a>
     * for more info.
     *
     * @param businessID <tt>String</tt> business ID of the requested business
     * @param searchRequest SearchRequest pojo used to provide parameters
     * @return <tt>String</tt> JSON Response
     */
    public Business searchByBusinessId(String businessID, SearchRequest searchRequest) {
        OAuthRequest request = createOAuthRequest(BUSINESS_PATH + "/" + businessID);
        if (searchRequest.getCountryCode() != null) {
            request.addQuerystringParameter("cc", searchRequest.getCountryCode());
        }
        if (searchRequest.getLanguage() != null) {
            request.addQuerystringParameter("lang", searchRequest.getLanguage());
        }
        if (searchRequest.getActionLinks() != null) {
            request.addQuerystringParameter("actionlinks", searchRequest.getActionLinks().toString());
        }
        return sendRequestAndGetResponse(request, Business.class);
    }

    /**
     * Creates and returns an {@link OAuthRequest} based on the API endpoint specified.
     *
     * @param path API endpoint to be queried
     * @return <tt>OAuthRequest</tt>
     */
    private OAuthRequest createOAuthRequest(String path) {
        return new OAuthRequest(Verb.GET, "http://" + API_HOST + path);
    }

    /**
     * Sends an {@link OAuthRequest} and returns the {@link Response} body.
     *
     * @param request {@link OAuthRequest} corresponding to the API request
     * @return <tt>String</tt> body of API response
     */
    private <T> T sendRequestAndGetResponse(OAuthRequest request, Class<T> tClass) {
        System.out.println("Querying " + request.getCompleteUrl() + " ...");
        this.service.signRequest(this.accessToken, request);
        Response response = request.send();
        return this.gson.fromJson(response.getBody(), tClass);
    }
}
