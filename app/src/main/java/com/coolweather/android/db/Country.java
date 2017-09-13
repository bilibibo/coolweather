package com.coolweather.android.db;


import org.litepal.crud.DataSupport;

/**
 * Created by Fish on 2017/9/13.
 */

public class Country extends DataSupport {
    private int id;
    private String countryName;
    private int countryCode;
    private int cityId;
    private String weatherId;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getCountryName(){
        return countryName;
    }

    public void setCountryName(String countryName){
        this.countryName = countryName;
    }

    public int getCountryCode(){
        return countryCode;
    }

    public void setCountryCode(int countryCode){
        this.countryCode = countryCode;
    }

    public String getWeatherId(){
        return weatherId;
    }

    public void setWeatherId(String weatherId){
        this.weatherId = weatherId;
    }

    public int getCityId(){
        return cityId;
    }

    public void setCityId(int cityId){
        this.cityId = cityId;
    }
}
