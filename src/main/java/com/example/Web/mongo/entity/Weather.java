package com.example.Web.mongo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.Date;
import java.util.Random;
import java.util.TimeZone;

@Indexed
@Document
public class Weather {
    @Id
    private Long id;
    private Date date;

    @Indexed(expireAfterSeconds=60)
    private String weather;

    public Weather(Date date, String weather) {
        Random random = new Random(Long.MAX_VALUE);
        this.id = Math.abs(random.nextLong());
        this.date = date;
        this.weather = weather;
    }

    public Weather() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "id=" + id +
                ", date=" + date +
                ", weather='" + weather + '\'' +
                '}';
    }
}
