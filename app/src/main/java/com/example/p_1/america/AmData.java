package com.example.p_1.america;

public class AmData {
    private int img;
    private String country;
    private String city;

    public AmData(int img, String country, String city){
        this.img = img;
        this.country = country;
        this.city = city;
    }

    public int getImg()
    {
        return this.img;
    }

    public String getCountry()
    {
        return this.country;
    }

    public String getCity()
    {
        return this.city;
    }
}

