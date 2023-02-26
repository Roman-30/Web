package com.example.Web.mongo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class TerritoryWeather {
    @Id
    private Long id;

    private Territory territory;
    private Weather weather;

    public TerritoryWeather(Long id, Territory territory, Weather weather) {
        this.id = id;
        this.territory = territory;
        this.weather = weather;
    }

    public TerritoryWeather() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Territory getTerritory() {
        return territory;
    }

    public void setTerritory(Territory territory) {
        this.territory = territory;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }
}
