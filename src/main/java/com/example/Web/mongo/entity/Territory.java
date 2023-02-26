package com.example.Web.mongo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.Document;

import java.awt.*;
import java.util.Random;

@Document
public class Territory {

    @Id
    private Long id;
    private Point place;

    private GeoJsonPoint location;

    public Territory(Point place) {
        Random random = new Random(Long.MAX_VALUE);
        this.id = Math.abs(random.nextLong());
        this.place = place;
    }

    public Territory() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Point getPlace() {
        return place;
    }

    public void setPlace(Point place) {
        this.place = place;
    }
}
