package com.example.p_1.australia;

public class AuStData {
    private int img;
    private String country;
    private String city;
    private float rating;
    private String srating;

    public AuStData(int img, String country, String city, float rating, String srating) {
        this.img = img;
        this.country = country;
        this.city = city;
        this.rating = rating;
        this.srating = srating;
    }

    public int getImg() {
        return this.img;
    }

    public String getCountry() {
        return this.country;
    }

    public String getCity() {
        return this.city;
    }

    public float getRating() {
        return this.rating;
    }

    public String getSrating() {
        return this.srating;
    }
}
