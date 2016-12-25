package com.wj.coolweather.gson;

import java.util.List;

/**
 * Created by Administrator on 2016/12/23.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;



    @SuppressWarnings("daily_forecast")
    public List<Forecast> forecastList;
}

/**
 * {"HeWeather": [{"aqi":{"city":{"aqi":"102","pm10":"73","pm25":"102","qlty":"轻度污染"}},
 * "basic":{"city":"海淀","cnty":"中国","id":"CN101010200","lat":"39.590000","lon":"116.170000",
 * "update":{"loc":"2016-12-23 21:54","utc":"2016-12-23 13:54"}},
 * "daily_forecast":[{"astro":{"mr":"01:41","ms":"13:25","sr":"07:33","ss":"16:55"},
 * "cond":{"code_d":"100","code_n":"100","txt_d":"晴","txt_n":"晴"},
 * "date":"2016-12-23","hum":"41","pcpn":"0.0","pop":"0","pres":"1031",
 * "tmp":{"max":"4","min":"-7"},"uv":"2","vis":"10",
 * "wind":{"deg":"146","dir":"南风","sc":"微风","spd":"8"}},
 * {"astro":{"mr":"02:37","ms":"13:55","sr":"07:33","ss":"16:56"},
 * "cond":{"code_d":"101","code_n":"101","txt_d":"多云","txt_n":"多云"},
 * "date":"2016-12-24","hum":"50","pcpn":"0.0","pop":"0","pres":"1030",
 * "tmp":{"max":"5","min":"-5"},"uv":"1","vis":"10",
 * "wind":{"deg":"183","dir":"北风","sc":"微风","spd":"5"}},
 * {"astro":{"mr":"03:33","ms":"14:27","sr":"07:34","ss":"16:56"},
 * "cond":{"code_d":"502","code_n":"400","txt_d":"霾","txt_n":"小雪"},"
 * date":"2016-12-25","hum":"50","pcpn":"0.1","pop":"57","pres":"1029","
 * tmp":{"max":"4","min":"-2"},"uv":"1","vis":"10",
 * "wind":{"deg":"72","dir":"北风","sc":"微风","spd":"9"}},
 * {"astro":{"mr":"04:28","ms":"15:03","sr":"07:34","ss":"16:57"},"
 * cond":{"code_d":"104","code_n":"101","txt_d":"阴","txt_n":"多云"},"
 * date":"2016-12-26","hum":"57","pcpn":"0.2","pop":"81","pres":"1033",
 * "tmp":{"max":"2","min":"-8"},"uv":"1","vis":"10",
 * "wind":{"deg":"150","dir":"北风","sc":"微风","spd":"0"}},
 * {"astro":{"mr":"05:23","ms":"15:42","sr":"07:34","ss":"16:58"},
 * "cond":{"code_d":"100","code_n":"101","txt_d":"晴","txt_n":"多云"},
 * "date":"2016-12-27","hum":"49","pcpn":"0.0","pop":"7","pres":"1035",
 * "tmp":{"max":"2","min":"-7"},"uv":"1","vis":"10",
 * "wind":{"deg":"331","dir":"南风","sc":"微风","spd":"1"}}
 * ,{"astro":{"mr":"06:16","ms":"16:25","sr":"07:35","ss":"16:58"},
 * "cond":{"code_d":"101","code_n":"100","txt_d":"多云","txt_n":"晴"},
 * "date":"2016-12-28","hum":"56","pcpn":"0.0","pop":"0","pres":"1030",
 * "tmp":{"max":"1","min":"-8"},"uv":"-999","vis":"10",
 * "wind":{"deg":"79","dir":"北风","sc":"3-4","spd":"11"}},
 * {"astro":{"mr":"07:08","ms":"17:13","sr":"07:35","ss":"16:59"},
 * "cond":{"code_d":"100","code_n":"101","txt_d":"晴","txt_n":"多云"},
 * "date":"2016-12-29","hum":"40","pcpn":"0.0","pop":"0","pres":"1033","
 * tmp":{"max":"3","min":"-8"},"uv":"-999","vis":"10",
 * "wind":{"deg":"213","dir":"北风","sc":"微风","spd":"2"}}],"hourly_forecast":[{"cond":{"code":"100","txt":"晴"},"date":"2016-12-23 22:00","hum":"50","pop":"0","pres":"1032","tmp":"-2","wind":{"deg":"210","dir":"南风","sc":"微风","spd":"6"}}],"now":{"cond":{"code":"101","txt":"多云"},"fl":"-3","hum":"64","pcpn":"0","pres":"1031","tmp":"-4","vis":"10","wind":{"deg":"110","dir":"西南风","sc":"3-4","spd":"16"}},"status":"ok","suggestion":{"air":{"brf":"较差","txt":"气象条件较不利于空气污染物稀释、扩散和清除，请适当减少室外活动时间。"},"comf":{"brf":"较舒适","txt":"白天虽然天气晴好，但早晚会感觉偏凉，午后舒适、宜人。"},"cw":{"brf":"较适宜","txt":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"},"drsg":{"brf":"冷","txt":"天气冷，建议着棉服、羽绒服、皮夹克加羊毛衫等冬季服装。年老体弱者宜着厚棉衣、冬大衣或厚羽绒服。"},"flu":{"brf":"极易发","txt":"天气寒冷，且昼夜温差很大，极易发生感冒。请特别注意增加衣服保暖防寒。"},"sport":{"brf":"较不宜","txt":"天气较好，但考虑天气寒冷，推荐您进行各种室内运动，若在户外运动请注意保暖并做好准备活动。"},"trav":{"brf":"适宜","txt":"天气较好，气温稍低，会感觉稍微有点凉，不过也是个好天气哦。适宜旅游，可不要错过机会呦！"},"uv":{"brf":"弱","txt":"紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。"}}}]}

 */
