package com.example.Web.mongo.entity;

public class Place {
    private double x;
    private double y;

    public Place(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Place() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
