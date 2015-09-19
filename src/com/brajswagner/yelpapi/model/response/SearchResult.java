package com.brajswagner.yelpapi.model.response;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

public class SearchResult {

    @Expose private Region region;
    @Expose private Long total;
    @Expose private List<Business> businesses = new ArrayList<Business>();

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<Business> getBusinesses() {
        return businesses;
    }

    public void setBusinesses(List<Business> businesses) {
        this.businesses = businesses;
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("com.brajswagner.yelpapi.model.response.SearchResult{");
        sb.append("region=").append(region);
        sb.append(", total=").append(total);
        sb.append(", businesses=").append(businesses);
        sb.append('}');
        return sb.toString();
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        SearchResult that = (SearchResult) o;

        if (getRegion() != null ? !getRegion().equals(that.getRegion()) : that.getRegion() != null)
            return false;
        if (getTotal() != null ? !getTotal().equals(that.getTotal()) : that.getTotal() != null)
            return false;
        if (getBusinesses() != null ? !getBusinesses().equals(that.getBusinesses()) : that.getBusinesses() != null)
            return false;

        return true;
    }

    @Override public int hashCode() {
        int result = getRegion() != null ? getRegion().hashCode() : 0;
        result = 31 * result + (getTotal() != null ? getTotal().hashCode() : 0);
        result = 31 * result + (getBusinesses() != null ? getBusinesses().hashCode() : 0);
        return result;
    }

}
