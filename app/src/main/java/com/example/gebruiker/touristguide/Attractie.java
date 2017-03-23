package com.example.gebruiker.touristguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Attractie {
    private String website;
    private String url;
    private String tijd;
    private String locatie;
    private String prijs;
    private String artiest;
    private int mImageId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;


    public Attractie(int imageResourceId, String location, String time, String price, String artist) {
        mImageId = imageResourceId;
        tijd = time;
        prijs = price;
        locatie = location;
        artiest = artist;


    }

    public Attractie(int imageResourceId, String location, String time, String price, String artist, String url) {
        mImageId = imageResourceId;
        tijd = time;
        prijs = price;
        locatie = location;
        artiest = artist;
        this.url = url;


    }

    public int getImageResourceId() {
        return mImageId;
    }


    public String getTijd() {
        return tijd;

    }

    public String getLocatie() {
        return locatie;
    }

    public String getPrijs() {
        return prijs;
    }

    public String getArtiest() {
        return artiest;
    }

    public String getUrl() {
        return url;
    }


    public Boolean hasImage() {
        return mImageId != NO_IMAGE_PROVIDED;


    }


}


