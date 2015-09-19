package com.brajswagner.yelpapi.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Deal {

    @Expose private String id;
    @Expose private String title;
    @Expose private String url;
    @SerializedName("image_url") @Expose private String imageUrl;
    @SerializedName("currency_code") @Expose private String currencyCode;
    @SerializedName("time_start") @Expose private Double timeStart;
    @SerializedName("time_end") @Expose private Double timeEnd;
    @SerializedName("is_popular") @Expose private Boolean isPopular;
    @SerializedName("what_you_get") @Expose private String whatYouGet;
    @SerializedName("important_restrictions") @Expose private String importantRestrictions;
    @SerializedName("additional_restrictions") @Expose private String additionalRestrictions;
    @Expose private List<Option> options = new ArrayList<Option>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Double getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Double timeStart) {
        this.timeStart = timeStart;
    }

    public Double getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Double timeEnd) {
        this.timeEnd = timeEnd;
    }

    public Boolean getIsPopular() {
        return isPopular;
    }

    public void setIsPopular(Boolean isPopular) {
        this.isPopular = isPopular;
    }

    public String getWhatYouGet() {
        return whatYouGet;
    }

    public void setWhatYouGet(String whatYouGet) {
        this.whatYouGet = whatYouGet;
    }

    public String getImportantRestrictions() {
        return importantRestrictions;
    }

    public void setImportantRestrictions(String importantRestrictions) {
        this.importantRestrictions = importantRestrictions;
    }

    public String getAdditionalRestrictions() {
        return additionalRestrictions;
    }

    public void setAdditionalRestrictions(String additionalRestrictions) {
        this.additionalRestrictions = additionalRestrictions;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("com.brajswagner.yelpapi.model.response.Deal{");
        sb.append("id='").append(id).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append(", imageUrl='").append(imageUrl).append('\'');
        sb.append(", currencyCode='").append(currencyCode).append('\'');
        sb.append(", timeStart=").append(timeStart);
        sb.append(", timeEnd=").append(timeEnd);
        sb.append(", isPopular=").append(isPopular);
        sb.append(", whatYouGet='").append(whatYouGet).append('\'');
        sb.append(", importantRestrictions='").append(importantRestrictions).append('\'');
        sb.append(", additionalRestrictions='").append(additionalRestrictions).append('\'');
        sb.append(", options=").append(options);
        sb.append('}');
        return sb.toString();
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Deal deal = (Deal) o;

        if (getId() != null ? !getId().equals(deal.getId()) : deal.getId() != null)
            return false;
        if (getTitle() != null ? !getTitle().equals(deal.getTitle()) : deal.getTitle() != null)
            return false;
        if (getUrl() != null ? !getUrl().equals(deal.getUrl()) : deal.getUrl() != null)
            return false;
        if (getImageUrl() != null ? !getImageUrl().equals(deal.getImageUrl()) : deal.getImageUrl() != null)
            return false;
        if (getCurrencyCode() != null ?
            !getCurrencyCode().equals(deal.getCurrencyCode()) :
            deal.getCurrencyCode() != null)
            return false;
        if (getTimeStart() != null ? !getTimeStart().equals(deal.getTimeStart()) : deal.getTimeStart() != null)
            return false;
        if (getTimeEnd() != null ? !getTimeEnd().equals(deal.getTimeEnd()) : deal.getTimeEnd() != null)
            return false;
        if (getIsPopular() != null ? !getIsPopular().equals(deal.getIsPopular()) : deal.getIsPopular() != null)
            return false;
        if (getWhatYouGet() != null ? !getWhatYouGet().equals(deal.getWhatYouGet()) : deal.getWhatYouGet() != null)
            return false;
        if (getImportantRestrictions() != null ?
            !getImportantRestrictions().equals(deal.getImportantRestrictions()) :
            deal.getImportantRestrictions() != null)
            return false;
        if (getAdditionalRestrictions() != null ?
            !getAdditionalRestrictions().equals(deal.getAdditionalRestrictions()) :
            deal.getAdditionalRestrictions() != null)
            return false;
        if (getOptions() != null ? !getOptions().equals(deal.getOptions()) : deal.getOptions() != null)
            return false;

        return true;
    }

    @Override public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        result = 31 * result + (getUrl() != null ? getUrl().hashCode() : 0);
        result = 31 * result + (getImageUrl() != null ? getImageUrl().hashCode() : 0);
        result = 31 * result + (getCurrencyCode() != null ? getCurrencyCode().hashCode() : 0);
        result = 31 * result + (getTimeStart() != null ? getTimeStart().hashCode() : 0);
        result = 31 * result + (getTimeEnd() != null ? getTimeEnd().hashCode() : 0);
        result = 31 * result + (getIsPopular() != null ? getIsPopular().hashCode() : 0);
        result = 31 * result + (getWhatYouGet() != null ? getWhatYouGet().hashCode() : 0);
        result = 31 * result + (getImportantRestrictions() != null ? getImportantRestrictions().hashCode() : 0);
        result = 31 * result + (getAdditionalRestrictions() != null ? getAdditionalRestrictions().hashCode() : 0);
        result = 31 * result + (getOptions() != null ? getOptions().hashCode() : 0);
        return result;
    }
}
