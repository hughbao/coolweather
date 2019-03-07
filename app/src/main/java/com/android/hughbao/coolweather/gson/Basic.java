package com.android.hughbao.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    @SerializedName("Name")
    public String cityName;

    @SerializedName("Id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
