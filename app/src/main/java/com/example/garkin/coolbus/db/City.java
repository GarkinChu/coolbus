package com.example.garkin.coolbus.db;

/**
 * Created by Garkin on 2018/1/27.
 */

public class City {
    private int cityid;
    private String name;
    private String code;
    public int getCityid() {
        return cityid;
    }

    public void setCityid(int cityid) {
        this.cityid = cityid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
