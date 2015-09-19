package com.brajswagner.yelpapi.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Business {

    @Expose private String id;
    @SerializedName("is_claimed") @Expose private String isClaimed;
    @SerializedName("is_closed") @Expose private Boolean isClosed;
    @Expose private String name;
    @SerializedName("image_url") @Expose private String imageUrl;
    @Expose private String url;
    @SerializedName("mobile_url") @Expose private String mobileUrl;
    @Expose private String phone;
    @SerializedName("display_phone") @Expose private String displayPhone;
    @SerializedName("review_count") @Expose private Double reviewCount;
    @Expose private List<List<String>> categories = new ArrayList<List<String>>();
    @Expose private Double distance;
    @Expose private Double rating;
    @SerializedName("rating_img_url") @Expose private String ratingImgUrl;
    @SerializedName("rating_img_url_small") @Expose private String ratingImgUrlSmall;
    @SerializedName("rating_img_url_large") @Expose private String ratingImgUrlLarge;
    @SerializedName("snippet_text") @Expose private String snippetText;
    @SerializedName("snippet_image_url") @Expose private String snippetImageUrl;
    @Expose private Location location;
    @Expose private List<Deal> deals = new ArrayList<Deal>();
    @SerializedName("gift_certificates") @Expose private List<GiftCertificate> giftCertificates =
        new ArrayList<GiftCertificate>();
    @SerializedName("menu_provider") @Expose private String menuProvider;
    @SerializedName("menu_date_updated") @Expose private Double menuDateUpdated;
    @SerializedName("reservation_url") @Expose private String reservationUrl;
    @SerializedName("eat24_url") @Expose private String eat24Url;
    @Expose private List<Review> reviews = new ArrayList<Review>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIsClaimed() {
        return isClaimed;
    }

    public void setIsClaimed(String isClaimed) {
        this.isClaimed = isClaimed;
    }

    public Boolean getIsClosed() {
        return isClosed;
    }

    public void setIsClosed(Boolean isClosed) {
        this.isClosed = isClosed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMobileUrl() {
        return mobileUrl;
    }

    public void setMobileUrl(String mobileUrl) {
        this.mobileUrl = mobileUrl;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDisplayPhone() {
        return displayPhone;
    }

    public void setDisplayPhone(String displayPhone) {
        this.displayPhone = displayPhone;
    }

    public Double getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(Double reviewCount) {
        this.reviewCount = reviewCount;
    }

    public List<List<String>> getCategories() {
        return categories;
    }

    public void setCategories(List<List<String>> categories) {
        this.categories = categories;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getRatingImgUrl() {
        return ratingImgUrl;
    }

    public void setRatingImgUrl(String ratingImgUrl) {
        this.ratingImgUrl = ratingImgUrl;
    }

    public String getRatingImgUrlSmall() {
        return ratingImgUrlSmall;
    }

    public void setRatingImgUrlSmall(String ratingImgUrlSmall) {
        this.ratingImgUrlSmall = ratingImgUrlSmall;
    }

    public String getRatingImgUrlLarge() {
        return ratingImgUrlLarge;
    }

    public void setRatingImgUrlLarge(String ratingImgUrlLarge) {
        this.ratingImgUrlLarge = ratingImgUrlLarge;
    }

    public String getSnippetText() {
        return snippetText;
    }

    public void setSnippetText(String snippetText) {
        this.snippetText = snippetText;
    }

    public String getSnippetImageUrl() {
        return snippetImageUrl;
    }

    public void setSnippetImageUrl(String snippetImageUrl) {
        this.snippetImageUrl = snippetImageUrl;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Deal> getDeals() {
        return deals;
    }

    public void setDeals(List<Deal> deals) {
        this.deals = deals;
    }

    public List<GiftCertificate> getGiftCertificates() {
        return giftCertificates;
    }

    public void setGiftCertificates(List<GiftCertificate> giftCertificates) {
        this.giftCertificates = giftCertificates;
    }

    public String getMenuProvider() {
        return menuProvider;
    }

    public void setMenuProvider(String menuProvider) {
        this.menuProvider = menuProvider;
    }

    public Double getMenuDateUpdated() {
        return menuDateUpdated;
    }

    public void setMenuDateUpdated(Double menuDateUpdated) {
        this.menuDateUpdated = menuDateUpdated;
    }

    public String getReservationUrl() {
        return reservationUrl;
    }

    public void setReservationUrl(String reservationUrl) {
        this.reservationUrl = reservationUrl;
    }

    public String getEat24Url() {
        return eat24Url;
    }

    public void setEat24Url(String eat24Url) {
        this.eat24Url = eat24Url;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("com.brajswagner.yelpapi.model.response.Business{");
        sb.append("id='").append(id).append('\'');
        sb.append(", isClaimed='").append(isClaimed).append('\'');
        sb.append(", isClosed=").append(isClosed);
        sb.append(", name='").append(name).append('\'');
        sb.append(", imageUrl='").append(imageUrl).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append(", mobileUrl='").append(mobileUrl).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", displayPhone='").append(displayPhone).append('\'');
        sb.append(", reviewCount=").append(reviewCount);
        sb.append(", categories=").append(categories);
        sb.append(", distance=").append(distance);
        sb.append(", rating=").append(rating);
        sb.append(", ratingImgUrl='").append(ratingImgUrl).append('\'');
        sb.append(", ratingImgUrlSmall='").append(ratingImgUrlSmall).append('\'');
        sb.append(", ratingImgUrlLarge='").append(ratingImgUrlLarge).append('\'');
        sb.append(", snippetText='").append(snippetText).append('\'');
        sb.append(", snippetImageUrl='").append(snippetImageUrl).append('\'');
        sb.append(", location=").append(location);
        sb.append(", deals=").append(deals);
        sb.append(", giftCertificates=").append(giftCertificates);
        sb.append(", menuProvider='").append(menuProvider).append('\'');
        sb.append(", menuDateUpdated=").append(menuDateUpdated);
        sb.append(", reservationUrl='").append(reservationUrl).append('\'');
        sb.append(", eat24Url='").append(eat24Url).append('\'');
        sb.append(", reviews=").append(reviews);
        sb.append('}');
        return sb.toString();
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Business business = (Business) o;

        if (getId() != null ? !getId().equals(business.getId()) : business.getId() != null)
            return false;
        if (getIsClaimed() != null ? !getIsClaimed().equals(business.getIsClaimed()) : business.getIsClaimed() != null)
            return false;
        if (getIsClosed() != null ? !getIsClosed().equals(business.getIsClosed()) : business.getIsClosed() != null)
            return false;
        if (getName() != null ? !getName().equals(business.getName()) : business.getName() != null)
            return false;
        if (getImageUrl() != null ? !getImageUrl().equals(business.getImageUrl()) : business.getImageUrl() != null)
            return false;
        if (getUrl() != null ? !getUrl().equals(business.getUrl()) : business.getUrl() != null)
            return false;
        if (getMobileUrl() != null ? !getMobileUrl().equals(business.getMobileUrl()) : business.getMobileUrl() != null)
            return false;
        if (getPhone() != null ? !getPhone().equals(business.getPhone()) : business.getPhone() != null)
            return false;
        if (getDisplayPhone() != null ?
            !getDisplayPhone().equals(business.getDisplayPhone()) :
            business.getDisplayPhone() != null)
            return false;
        if (getReviewCount() != null ?
            !getReviewCount().equals(business.getReviewCount()) :
            business.getReviewCount() != null)
            return false;
        if (getCategories() != null ?
            !getCategories().equals(business.getCategories()) :
            business.getCategories() != null)
            return false;
        if (getDistance() != null ? !getDistance().equals(business.getDistance()) : business.getDistance() != null)
            return false;
        if (getRating() != null ? !getRating().equals(business.getRating()) : business.getRating() != null)
            return false;
        if (getRatingImgUrl() != null ?
            !getRatingImgUrl().equals(business.getRatingImgUrl()) :
            business.getRatingImgUrl() != null)
            return false;
        if (getRatingImgUrlSmall() != null ?
            !getRatingImgUrlSmall().equals(business.getRatingImgUrlSmall()) :
            business.getRatingImgUrlSmall() != null)
            return false;
        if (getRatingImgUrlLarge() != null ?
            !getRatingImgUrlLarge().equals(business.getRatingImgUrlLarge()) :
            business.getRatingImgUrlLarge() != null)
            return false;
        if (getSnippetText() != null ?
            !getSnippetText().equals(business.getSnippetText()) :
            business.getSnippetText() != null)
            return false;
        if (getSnippetImageUrl() != null ?
            !getSnippetImageUrl().equals(business.getSnippetImageUrl()) :
            business.getSnippetImageUrl() != null)
            return false;
        if (getLocation() != null ? !getLocation().equals(business.getLocation()) : business.getLocation() != null)
            return false;
        if (getDeals() != null ? !getDeals().equals(business.getDeals()) : business.getDeals() != null)
            return false;
        if (getGiftCertificates() != null ?
            !getGiftCertificates().equals(business.getGiftCertificates()) :
            business.getGiftCertificates() != null)
            return false;
        if (getMenuProvider() != null ?
            !getMenuProvider().equals(business.getMenuProvider()) :
            business.getMenuProvider() != null)
            return false;
        if (getMenuDateUpdated() != null ?
            !getMenuDateUpdated().equals(business.getMenuDateUpdated()) :
            business.getMenuDateUpdated() != null)
            return false;
        if (getReservationUrl() != null ?
            !getReservationUrl().equals(business.getReservationUrl()) :
            business.getReservationUrl() != null)
            return false;
        if (getEat24Url() != null ? !getEat24Url().equals(business.getEat24Url()) : business.getEat24Url() != null)
            return false;
        return !(getReviews() != null ? !getReviews().equals(business.getReviews()) : business.getReviews() != null);

    }

    @Override public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getIsClaimed() != null ? getIsClaimed().hashCode() : 0);
        result = 31 * result + (getIsClosed() != null ? getIsClosed().hashCode() : 0);
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getImageUrl() != null ? getImageUrl().hashCode() : 0);
        result = 31 * result + (getUrl() != null ? getUrl().hashCode() : 0);
        result = 31 * result + (getMobileUrl() != null ? getMobileUrl().hashCode() : 0);
        result = 31 * result + (getPhone() != null ? getPhone().hashCode() : 0);
        result = 31 * result + (getDisplayPhone() != null ? getDisplayPhone().hashCode() : 0);
        result = 31 * result + (getReviewCount() != null ? getReviewCount().hashCode() : 0);
        result = 31 * result + (getCategories() != null ? getCategories().hashCode() : 0);
        result = 31 * result + (getDistance() != null ? getDistance().hashCode() : 0);
        result = 31 * result + (getRating() != null ? getRating().hashCode() : 0);
        result = 31 * result + (getRatingImgUrl() != null ? getRatingImgUrl().hashCode() : 0);
        result = 31 * result + (getRatingImgUrlSmall() != null ? getRatingImgUrlSmall().hashCode() : 0);
        result = 31 * result + (getRatingImgUrlLarge() != null ? getRatingImgUrlLarge().hashCode() : 0);
        result = 31 * result + (getSnippetText() != null ? getSnippetText().hashCode() : 0);
        result = 31 * result + (getSnippetImageUrl() != null ? getSnippetImageUrl().hashCode() : 0);
        result = 31 * result + (getLocation() != null ? getLocation().hashCode() : 0);
        result = 31 * result + (getDeals() != null ? getDeals().hashCode() : 0);
        result = 31 * result + (getGiftCertificates() != null ? getGiftCertificates().hashCode() : 0);
        result = 31 * result + (getMenuProvider() != null ? getMenuProvider().hashCode() : 0);
        result = 31 * result + (getMenuDateUpdated() != null ? getMenuDateUpdated().hashCode() : 0);
        result = 31 * result + (getReservationUrl() != null ? getReservationUrl().hashCode() : 0);
        result = 31 * result + (getEat24Url() != null ? getEat24Url().hashCode() : 0);
        result = 31 * result + (getReviews() != null ? getReviews().hashCode() : 0);
        return result;
    }
}

