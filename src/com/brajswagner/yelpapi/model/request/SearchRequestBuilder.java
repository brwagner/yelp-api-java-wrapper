package com.brajswagner.yelpapi.model.request;

public class SearchRequestBuilder {
    private String term;
    private Integer limit;
    private Integer offset;
    private Sort sort;
    private String categoryFilter;
    private Double radiusFilter;
    private Double dealsFilter;
    private String location;
    private Double latitude;
    private Double longitude;
    private Double accuracy;
    private Double altitude;
    private Double altitudeAccuracy;
    private Double swLatitude;
    private Double swLongitude;
    private Double neLatitude;
    private Double neLongitude;
    private String countryCode;
    private String language;
    private Boolean actionLinks;

    public SearchRequestBuilder setTerm(String term) {
        this.term = term;
        return this;
    }

    public SearchRequestBuilder setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public SearchRequestBuilder setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    public SearchRequestBuilder setSort(Sort sort) {
        this.sort = sort;
        return this;
    }

    public SearchRequestBuilder setCategoryFilter(String categoryFilter) {
        this.categoryFilter = categoryFilter;
        return this;
    }

    public SearchRequestBuilder setRadiusFilter(Double radiusFilter) {
        this.radiusFilter = radiusFilter;
        return this;
    }

    public SearchRequestBuilder setDealsFilter(Double dealsFilter) {
        this.dealsFilter = dealsFilter;
        return this;
    }

    public SearchRequestBuilder setLocation(String location) {
        this.location = location;
        return this;
    }

    public SearchRequestBuilder setLatitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    public SearchRequestBuilder setLongitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    public SearchRequestBuilder setAccuracy(Double accuracy) {
        this.accuracy = accuracy;
        return this;
    }

    public SearchRequestBuilder setAltitude(Double altitude) {
        this.altitude = altitude;
        return this;
    }

    public SearchRequestBuilder setAltitudeAccuracy(Double altitudeAccuracy) {
        this.altitudeAccuracy = altitudeAccuracy;
        return this;
    }

    public SearchRequestBuilder setSwLatitude(Double swLatitude) {
        this.swLatitude = swLatitude;
        return this;
    }

    public SearchRequestBuilder setSwLongitude(Double swLongitude) {
        this.swLongitude = swLongitude;
        return this;
    }

    public SearchRequestBuilder setNeLatitude(Double neLatitude) {
        this.neLatitude = neLatitude;
        return this;
    }

    public SearchRequestBuilder setNeLongitude(Double neLongitude) {
        this.neLongitude = neLongitude;
        return this;
    }

    public SearchRequestBuilder setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public SearchRequestBuilder setLanguage(String language) {
        this.language = language;
        return this;
    }

    public SearchRequestBuilder setActionLinks(Boolean actionLinks) {
        this.actionLinks = actionLinks;
        return this;
    }

    public SearchRequest create() {
        return new SearchRequest(term, limit, offset, sort, categoryFilter, radiusFilter, dealsFilter, location,
            latitude, longitude, accuracy, altitude, altitudeAccuracy, swLatitude, swLongitude, neLatitude, neLongitude,
            countryCode, language, actionLinks);
    }
}
