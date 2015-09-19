package com.brajswagner.yelpapi.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Span {

    @SerializedName("latitude_delta") @Expose private Double latitudeDelta;
    @SerializedName("longitude_delta") @Expose private Double longitudeDelta;

    public Double getLatitudeDelta() {
        return latitudeDelta;
    }

    public void setLatitudeDelta(Double latitudeDelta) {
        this.latitudeDelta = latitudeDelta;
    }

    public Double getLongitudeDelta() {
        return longitudeDelta;
    }

    public void setLongitudeDelta(Double longitudeDelta) {
        this.longitudeDelta = longitudeDelta;
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("com.brajswagner.yelpapi.model.response.Span{");
        sb.append("latitudeDelta=").append(latitudeDelta);
        sb.append(", longitudeDelta=").append(longitudeDelta);
        sb.append('}');
        return sb.toString();
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Span span = (Span) o;

        if (getLatitudeDelta() != null ?
            !getLatitudeDelta().equals(span.getLatitudeDelta()) :
            span.getLatitudeDelta() != null)
            return false;
        if (getLongitudeDelta() != null ?
            !getLongitudeDelta().equals(span.getLongitudeDelta()) :
            span.getLongitudeDelta() != null)
            return false;

        return true;
    }

    @Override public int hashCode() {
        int result = getLatitudeDelta() != null ? getLatitudeDelta().hashCode() : 0;
        result = 31 * result + (getLongitudeDelta() != null ? getLongitudeDelta().hashCode() : 0);
        return result;
    }
}
