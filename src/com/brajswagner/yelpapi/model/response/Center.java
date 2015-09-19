package com.brajswagner.yelpapi.model.response;

import com.google.gson.annotations.Expose;

public class Center {

    @Expose private Double latitude;
    @Expose private Double longitude;

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("com.brajswagner.yelpapi.model.response.Center{");
        sb.append("latitude=").append(latitude);
        sb.append(", longitude=").append(longitude);
        sb.append('}');
        return sb.toString();
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Center center = (Center) o;

        if (getLatitude() != null ? !getLatitude().equals(center.getLatitude()) : center.getLatitude() != null)
            return false;
        if (getLongitude() != null ? !getLongitude().equals(center.getLongitude()) : center.getLongitude() != null)
            return false;

        return true;
    }

    @Override public int hashCode() {
        int result = getLatitude() != null ? getLatitude().hashCode() : 0;
        result = 31 * result + (getLongitude() != null ? getLongitude().hashCode() : 0);
        return result;
    }
}
