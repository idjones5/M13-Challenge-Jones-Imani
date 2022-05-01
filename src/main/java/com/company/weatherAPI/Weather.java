package com.company.weatherAPI;


import com.sun.xml.internal.bind.v2.TODO;

import java.lang.reflect.Array;

public class Weather {

    // variables in the json object

    private String base;
    private String visibility;
    private Object coord;
    private Object[] weather;


    public Object[] Okey(Object[] weather) {
       return null;
    }

    // getters and setters


    public String getBase() {
        return base;
    }

    public String getVisibility() {
        return visibility;
    }

    public Object getCoord() {
        return coord;
    }

    public Object[] getWeather() {
        return weather;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }


}
