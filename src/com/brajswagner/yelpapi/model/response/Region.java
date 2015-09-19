package com.brajswagner.yelpapi.model.response;

import com.google.gson.annotations.Expose;

public class Region {

    @Expose private Span span;
    @Expose private Center center;

    public Span getSpan() {
        return span;
    }

    public void setSpan(Span span) {
        this.span = span;
    }

    public Center getCenter() {
        return center;
    }

    public void setCenter(Center center) {
        this.center = center;
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("com.brajswagner.yelpapi.model.response.Region{");
        sb.append("span=").append(span);
        sb.append(", center=").append(center);
        sb.append('}');
        return sb.toString();
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Region region = (Region) o;

        if (getSpan() != null ? !getSpan().equals(region.getSpan()) : region.getSpan() != null)
            return false;
        if (getCenter() != null ? !getCenter().equals(region.getCenter()) : region.getCenter() != null)
            return false;

        return true;
    }

    @Override public int hashCode() {
        int result = getSpan() != null ? getSpan().hashCode() : 0;
        result = 31 * result + (getCenter() != null ? getCenter().hashCode() : 0);
        return result;
    }
}
