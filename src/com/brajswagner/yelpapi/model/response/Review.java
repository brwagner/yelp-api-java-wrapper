package com.brajswagner.yelpapi.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Review {

    @Expose private String id;
    @Expose private Double rating;
    @SerializedName("rating_image_url") @Expose private String ratingImageUrl;
    @SerializedName("rating_image_small_url") @Expose private String ratingImageSmallUrl;
    @SerializedName("rating_image_large_url") @Expose private String ratingImageLargeUrl;
    @Expose private String excerpt;
    @SerializedName("time_created") @Expose private Long timeCreated;
    @Expose private YelpUser user;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getRatingImageUrl() {
        return ratingImageUrl;
    }

    public void setRatingImageUrl(String ratingImageUrl) {
        this.ratingImageUrl = ratingImageUrl;
    }

    public String getRatingImageSmallUrl() {
        return ratingImageSmallUrl;
    }

    public void setRatingImageSmallUrl(String ratingImageSmallUrl) {
        this.ratingImageSmallUrl = ratingImageSmallUrl;
    }

    public String getRatingImageLargeUrl() {
        return ratingImageLargeUrl;
    }

    public void setRatingImageLargeUrl(String ratingImageLargeUrl) {
        this.ratingImageLargeUrl = ratingImageLargeUrl;
    }

    public String getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }

    public Long getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Long timeCreated) {
        this.timeCreated = timeCreated;
    }

    public YelpUser getUser() {
        return user;
    }

    public void setUser(YelpUser user) {
        this.user = user;
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("com.brajswagner.yelpapi.model.response.Review{");
        sb.append("id='").append(id).append('\'');
        sb.append(", rating=").append(rating);
        sb.append(", ratingImageUrl='").append(ratingImageUrl).append('\'');
        sb.append(", ratingImageSmallUrl='").append(ratingImageSmallUrl).append('\'');
        sb.append(", ratingImageLargeUrl='").append(ratingImageLargeUrl).append('\'');
        sb.append(", excerpt='").append(excerpt).append('\'');
        sb.append(", timeCreated=").append(timeCreated);
        sb.append(", user=").append(user);
        sb.append('}');
        return sb.toString();
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Review review = (Review) o;

        if (getId() != null ? !getId().equals(review.getId()) : review.getId() != null)
            return false;
        if (getRating() != null ? !getRating().equals(review.getRating()) : review.getRating() != null)
            return false;
        if (getRatingImageUrl() != null ?
            !getRatingImageUrl().equals(review.getRatingImageUrl()) :
            review.getRatingImageUrl() != null)
            return false;
        if (getRatingImageSmallUrl() != null ?
            !getRatingImageSmallUrl().equals(review.getRatingImageSmallUrl()) :
            review.getRatingImageSmallUrl() != null)
            return false;
        if (getRatingImageLargeUrl() != null ?
            !getRatingImageLargeUrl().equals(review.getRatingImageLargeUrl()) :
            review.getRatingImageLargeUrl() != null)
            return false;
        if (getExcerpt() != null ? !getExcerpt().equals(review.getExcerpt()) : review.getExcerpt() != null)
            return false;
        if (getTimeCreated() != null ?
            !getTimeCreated().equals(review.getTimeCreated()) :
            review.getTimeCreated() != null)
            return false;
        return !(getUser() != null ? !getUser().equals(review.getUser()) : review.getUser() != null);

    }

    @Override public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getRating() != null ? getRating().hashCode() : 0);
        result = 31 * result + (getRatingImageUrl() != null ? getRatingImageUrl().hashCode() : 0);
        result = 31 * result + (getRatingImageSmallUrl() != null ? getRatingImageSmallUrl().hashCode() : 0);
        result = 31 * result + (getRatingImageLargeUrl() != null ? getRatingImageLargeUrl().hashCode() : 0);
        result = 31 * result + (getExcerpt() != null ? getExcerpt().hashCode() : 0);
        result = 31 * result + (getTimeCreated() != null ? getTimeCreated().hashCode() : 0);
        result = 31 * result + (getUser() != null ? getUser().hashCode() : 0);
        return result;
    }
}
