package com.example.cruddemo.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CityWeatherInfo {
    private String name;
    private String main;
    private String icon;
    private String description;
    private String date;
    private Double temperature;
    private Double min;
    private Double max;
    private Double pressure;
    private Double humidity;

    @Override
    public String toString() {
        return "CityWeatherInfo{" +
                "name='" + name + '\'' +
                ", main='" + main + '\'' +
                ", icon='" + icon + '\'' +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                ", temperature=" + temperature +
                ", min=" + min +
                ", max=" + max +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                '}';
    }
}
