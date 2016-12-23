package com.wj.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2016/12/23.
 */

public class City extends DataSupport{
    private int id;
    private String cityName;

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    private int cityCode;
    private int provinceId;
}
