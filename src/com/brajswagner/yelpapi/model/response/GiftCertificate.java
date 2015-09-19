package com.brajswagner.yelpapi.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class GiftCertificate {

    @Expose private String id;
    @Expose private String url;
    @SerializedName("image_url") @Expose private String imageUrl;
    @SerializedName("currency_code") @Expose private String currencyCode;
    @SerializedName("unused_balances") @Expose private String unusedBalances;
    @Expose private List<Option> options = new ArrayList<Option>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getUnusedBalances() {
        return unusedBalances;
    }

    public void setUnusedBalances(String unusedBalances) {
        this.unusedBalances = unusedBalances;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("com.brajswagner.yelpapi.model.response.GiftCertificate{");
        sb.append("id='").append(id).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append(", imageUrl='").append(imageUrl).append('\'');
        sb.append(", currencyCode='").append(currencyCode).append('\'');
        sb.append(", unusedBalances='").append(unusedBalances).append('\'');
        sb.append(", options=").append(options);
        sb.append('}');
        return sb.toString();
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        GiftCertificate that = (GiftCertificate) o;

        if (getId() != null ? !getId().equals(that.getId()) : that.getId() != null)
            return false;
        if (getUrl() != null ? !getUrl().equals(that.getUrl()) : that.getUrl() != null)
            return false;
        if (getImageUrl() != null ? !getImageUrl().equals(that.getImageUrl()) : that.getImageUrl() != null)
            return false;
        if (getCurrencyCode() != null ?
            !getCurrencyCode().equals(that.getCurrencyCode()) :
            that.getCurrencyCode() != null)
            return false;
        if (getUnusedBalances() != null ?
            !getUnusedBalances().equals(that.getUnusedBalances()) :
            that.getUnusedBalances() != null)
            return false;
        if (getOptions() != null ? !getOptions().equals(that.getOptions()) : that.getOptions() != null)
            return false;

        return true;
    }

    @Override public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getUrl() != null ? getUrl().hashCode() : 0);
        result = 31 * result + (getImageUrl() != null ? getImageUrl().hashCode() : 0);
        result = 31 * result + (getCurrencyCode() != null ? getCurrencyCode().hashCode() : 0);
        result = 31 * result + (getUnusedBalances() != null ? getUnusedBalances().hashCode() : 0);
        result = 31 * result + (getOptions() != null ? getOptions().hashCode() : 0);
        return result;
    }
}
