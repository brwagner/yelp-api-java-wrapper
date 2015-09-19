package com.brajswagner.yelpapi.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class YelpUser {

    @Expose private String id;
    @SerializedName("image_url") @Expose private String imageUrl;
    @Expose private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("com.brajswagner.yelpapi.model.response.YelpUser{");
        sb.append("id='").append(id).append('\'');
        sb.append(", imageUrl='").append(imageUrl).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        YelpUser yelpUser = (YelpUser) o;

        if (getId() != null ? !getId().equals(yelpUser.getId()) : yelpUser.getId() != null)
            return false;
        if (getImageUrl() != null ? !getImageUrl().equals(yelpUser.getImageUrl()) : yelpUser.getImageUrl() != null)
            return false;
        return !(getName() != null ? !getName().equals(yelpUser.getName()) : yelpUser.getName() != null);

    }

    @Override public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getImageUrl() != null ? getImageUrl().hashCode() : 0);
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        return result;
    }
}
