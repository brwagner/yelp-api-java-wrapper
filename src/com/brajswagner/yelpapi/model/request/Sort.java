package com.brajswagner.yelpapi.model.request;

public enum Sort {
    BEST_MATCHED(0),
    DISTANCE(1),
    HIGHEST_RATED(2);

    private final int id;

    Sort(Integer id) {
        this.id = id;
    }

    public Integer id() {
        return id;
    }
}
