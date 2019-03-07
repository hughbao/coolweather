package com.android.hughbao.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {
    public String data;

    @SerializedName("tmp")
    public Temperature temperature;

    public class Temperature {
        public String max;
        public String min;
    }

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("tet_d")
        public String info;
    }
}
