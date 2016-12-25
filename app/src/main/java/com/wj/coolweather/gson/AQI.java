package com.wj.coolweather.gson;

/**
 * Created by Administrator on 2016/12/23.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
