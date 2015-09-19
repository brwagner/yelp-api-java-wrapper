package com.brajswagner.yelpapi.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Option {

    @Expose private String title;
    @SerializedName("purchase_url") @Expose private String purchaseUrl;
    @Expose private Double price;
    @SerializedName("formatted_price") @Expose private String formattedPrice;
    @SerializedName("original_price") @Expose private Double originalPrice;
    @SerializedName("formatted_original_price") @Expose private String formattedOriginalPrice;
    @SerializedName("is_quantity_limited") @Expose private Boolean isQuantityLimited;
    @SerializedName("remaining_count") @Expose private Long remainingCount;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("com.brajswagner.yelpapi.model.response.Option{");
        sb.append("title='").append(title).append('\'');
        sb.append(", purchaseUrl='").append(purchaseUrl).append('\'');
        sb.append(", price=").append(price);
        sb.append(", formattedPrice='").append(formattedPrice).append('\'');
        sb.append(", originalPrice=").append(originalPrice);
        sb.append(", formattedOriginalPrice='").append(formattedOriginalPrice).append('\'');
        sb.append(", isQuantityLimited=").append(isQuantityLimited);
        sb.append(", remainingCount=").append(remainingCount);
        sb.append('}');
        return sb.toString();
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Option option = (Option) o;

        if (getTitle() != null ? !getTitle().equals(option.getTitle()) : option.getTitle() != null)
            return false;
        if (getPurchaseUrl() != null ?
            !getPurchaseUrl().equals(option.getPurchaseUrl()) :
            option.getPurchaseUrl() != null)
            return false;
        if (getPrice() != null ? !getPrice().equals(option.getPrice()) : option.getPrice() != null)
            return false;
        if (getFormattedPrice() != null ?
            !getFormattedPrice().equals(option.getFormattedPrice()) :
            option.getFormattedPrice() != null)
            return false;
        if (getOriginalPrice() != null ?
            !getOriginalPrice().equals(option.getOriginalPrice()) :
            option.getOriginalPrice() != null)
            return false;
        if (getFormattedOriginalPrice() != null ?
            !getFormattedOriginalPrice().equals(option.getFormattedOriginalPrice()) :
            option.getFormattedOriginalPrice() != null)
            return false;
        if (getIsQuantityLimited() != null ?
            !getIsQuantityLimited().equals(option.getIsQuantityLimited()) :
            option.getIsQuantityLimited() != null)
            return false;
        if (getRemainingCount() != null ?
            !getRemainingCount().equals(option.getRemainingCount()) :
            option.getRemainingCount() != null)
            return false;

        return true;
    }

    @Override public int hashCode() {
        int result = getTitle() != null ? getTitle().hashCode() : 0;
        result = 31 * result + (getPurchaseUrl() != null ? getPurchaseUrl().hashCode() : 0);
        result = 31 * result + (getPrice() != null ? getPrice().hashCode() : 0);
        result = 31 * result + (getFormattedPrice() != null ? getFormattedPrice().hashCode() : 0);
        result = 31 * result + (getOriginalPrice() != null ? getOriginalPrice().hashCode() : 0);
        result = 31 * result + (getFormattedOriginalPrice() != null ? getFormattedOriginalPrice().hashCode() : 0);
        result = 31 * result + (getIsQuantityLimited() != null ? getIsQuantityLimited().hashCode() : 0);
        result = 31 * result + (getRemainingCount() != null ? getRemainingCount().hashCode() : 0);
        return result;
    }

    public String getPurchaseUrl() {
        return purchaseUrl;
    }

    public void setPurchaseUrl(String purchaseUrl) {
        this.purchaseUrl = purchaseUrl;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getFormattedPrice() {
        return formattedPrice;
    }

    public void setFormattedPrice(String formattedPrice) {
        this.formattedPrice = formattedPrice;
    }

    public Double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getFormattedOriginalPrice() {
        return formattedOriginalPrice;
    }

    public void setFormattedOriginalPrice(String formattedOriginalPrice) {
        this.formattedOriginalPrice = formattedOriginalPrice;
    }

    public Boolean getIsQuantityLimited() {
        return isQuantityLimited;
    }

    public void setIsQuantityLimited(Boolean isQuantityLimited) {
        this.isQuantityLimited = isQuantityLimited;
    }

    public Long getRemainingCount() {
        return remainingCount;
    }

    public void setRemainingCount(Long remainingCount) {
        this.remainingCount = remainingCount;
    }

}
