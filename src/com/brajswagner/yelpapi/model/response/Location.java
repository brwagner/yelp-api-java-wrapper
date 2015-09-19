package com.brajswagner.yelpapi.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Location {

    @Expose private List<String> address = new ArrayList<String>();
    @SerializedName("display_address") @Expose private List<String> displayAddress = new ArrayList<String>();
    @Expose private String city;
    @SerializedName("state_code") @Expose private String stateCode;
    @SerializedName("postal_code") @Expose private String postalCode;
    @SerializedName("country_code") @Expose private String countryCode;
    @SerializedName("cross_streets") @Expose private String crossStreets;

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("com.brajswagner.yelpapi.model.response.Location{");
        sb.append("address=").append(address);
        sb.append(", displayAddress=").append(displayAddress);
        sb.append(", city='").append(city).append('\'');
        sb.append(", stateCode='").append(stateCode).append('\'');
        sb.append(", postalCode='").append(postalCode).append('\'');
        sb.append(", countryCode='").append(countryCode).append('\'');
        sb.append(", crossStreets='").append(crossStreets).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Location location = (Location) o;

        if (getAddress() != null ? !getAddress().equals(location.getAddress()) : location.getAddress() != null)
            return false;
        if (getDisplayAddress() != null ?
            !getDisplayAddress().equals(location.getDisplayAddress()) :
            location.getDisplayAddress() != null)
            return false;
        if (getCity() != null ? !getCity().equals(location.getCity()) : location.getCity() != null)
            return false;
        if (getStateCode() != null ? !getStateCode().equals(location.getStateCode()) : location.getStateCode() != null)
            return false;
        if (getPostalCode() != null ?
            !getPostalCode().equals(location.getPostalCode()) :
            location.getPostalCode() != null)
            return false;
        if (getCountryCode() != null ?
            !getCountryCode().equals(location.getCountryCode()) :
            location.getCountryCode() != null)
            return false;
        if (getCrossStreets() != null ?
            !getCrossStreets().equals(location.getCrossStreets()) :
            location.getCrossStreets() != null)
            return false;

        return true;
    }

    @Override public int hashCode() {
        int result = getAddress() != null ? getAddress().hashCode() : 0;
        result = 31 * result + (getDisplayAddress() != null ? getDisplayAddress().hashCode() : 0);
        result = 31 * result + (getCity() != null ? getCity().hashCode() : 0);
        result = 31 * result + (getStateCode() != null ? getStateCode().hashCode() : 0);
        result = 31 * result + (getPostalCode() != null ? getPostalCode().hashCode() : 0);
        result = 31 * result + (getCountryCode() != null ? getCountryCode().hashCode() : 0);
        result = 31 * result + (getCrossStreets() != null ? getCrossStreets().hashCode() : 0);
        return result;
    }

    public List<String> getDisplayAddress() {
        return displayAddress;
    }

    public void setDisplayAddress(List<String> displayAddress) {
        this.displayAddress = displayAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCrossStreets() {
        return crossStreets;
    }

    public void setCrossStreets(String crossStreets) {
        this.crossStreets = crossStreets;
    }

}
