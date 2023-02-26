package com.example.Web.mongo.controllers;

import com.example.Web.mongo.entity.TerritoryWeather;
import com.example.Web.mongo.service.TerritoryWeatherService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TerritoryWeatherController {
    private final TerritoryWeatherService service;

    public TerritoryWeatherController(TerritoryWeatherService service) {
        this.service = service;
    }

    @GetMapping("/tw")
    public List<TerritoryWeather> get() {
        return service.getAll();
    }

    @GetMapping("/tw/{weather}")
    public List<TerritoryWeather> getAllWeatPlaces(@PathVariable String weather) {
        return service.getAllWeatherPlaces(weather);
    }
    @PostMapping("/tw/new")
    public void addNew(@RequestBody TerritoryWeather territoryWeather) {
        service.addNew(territoryWeather);
    }
}
