package com.sinankaymak.learnrecycle;

public class City {
    private int picName;
    private String placeName;

    public int getPicName() {
        return picName;
    }

    public void setPicName(int picName) {
        this.picName = picName;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public City(int picName, String placeName) {
        this.picName = picName;
        this.placeName = placeName;
    }
}
