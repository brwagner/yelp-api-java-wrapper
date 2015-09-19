package com.brajswagner.yelpapi.model.request;

public class SearchRequest {
    private String term;
    private Integer limit;
    private Integer offset;
    private Sort sort;
    private String categoryFilter;
    private Double radiusFilter;
    private Double dealsFilter;
    private String location;
    private Double latitude;
    private Double longitude;
    private Double accuracy;
    private Double altitude;
    private Double altitudeAccuracy;
    private Double swLatitude;
    private Double swLongitude;
    private Double neLatitude;
    private Double neLongitude;
    private String countryCode;
    private String language;
    private Boolean actionLinks;

    public SearchRequest(String term, Integer limit, Integer offset, Sort sort, String categoryFilter,
        Double radiusFilter, Double dealsFilter, String location, Double latitude, Double longitude, Double accuracy,
        Double altitude, Double altitudeAccuracy, Double swLatitude, Double swLongitude, Double neLatitude,
        Double neLongitude, String countryCode, String language, Boolean actionLinks) {
        this.term = term;
        this.limit = limit;
        this.offset = offset;
        this.sort = sort;
        this.categoryFilter = categoryFilter;
        this.radiusFilter = radiusFilter;
        this.dealsFilter = dealsFilter;
        this.location = location;
        this.latitude = latitude;
        this.longitude = longitude;
        this.accuracy = accuracy;
        this.altitude = altitude;
        this.altitudeAccuracy = altitudeAccuracy;
        this.swLatitude = swLatitude;
        this.swLongitude = swLongitude;
        this.neLatitude = neLatitude;
        this.neLongitude = neLongitude;
        this.countryCode = countryCode;
        this.language = language;
        this.actionLinks = actionLinks;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public String getCategoryFilter() {
        return categoryFilter;
    }

    public void setCategoryFilter(String categoryFilter) {
        this.categoryFilter = categoryFilter;
    }

    public Double getRadiusFilter() {
        return radiusFilter;
    }

    public void setRadiusFilter(Double radiusFilter) {
        this.radiusFilter = radiusFilter;
    }

    public Double getDealsFilter() {
        return dealsFilter;
    }

    public void setDealsFilter(Double dealsFilter) {
        this.dealsFilter = dealsFilter;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

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

    public Double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Double accuracy) {
        this.accuracy = accuracy;
    }

    public Double getAltitude() {
        return altitude;
    }

    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }

    public Double getAltitudeAccuracy() {
        return altitudeAccuracy;
    }

    public void setAltitudeAccuracy(Double altitudeAccuracy) {
        this.altitudeAccuracy = altitudeAccuracy;
    }

    public Double getSwLatitude() {
        return swLatitude;
    }

    public void setSwLatitude(Double swLatitude) {
        this.swLatitude = swLatitude;
    }

    public Double getSwLongitude() {
        return swLongitude;
    }

    public void setSwLongitude(Double swLongitude) {
        this.swLongitude = swLongitude;
    }

    public Double getNeLatitude() {
        return neLatitude;
    }

    public void setNeLatitude(Double neLatitude) {
        this.neLatitude = neLatitude;
    }

    public Double getNeLongitude() {
        return neLongitude;
    }

    public void setNeLongitude(Double neLongitude) {
        this.neLongitude = neLongitude;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Boolean getActionLinks() {
        return actionLinks;
    }

    public void setActionLinks(Boolean actionLinks) {
        this.actionLinks = actionLinks;
    }
}
