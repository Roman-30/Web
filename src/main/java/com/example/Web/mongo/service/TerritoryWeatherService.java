package com.example.Web.mongo.service;

import com.example.Web.mongo.entity.TerritoryWeather;
import com.example.Web.mongo.repository.TerritoryRepository;
import com.example.Web.mongo.repository.TerritoryWeatherRepository;
import com.example.Web.mongo.repository.WeatherRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class TerritoryWeatherService {
    private final TerritoryWeatherRepository tWRepository;
    private final WeatherRepository weatherRepository;
    private final TerritoryRepository territoryRepository;

    public TerritoryWeatherService(TerritoryWeatherRepository tWRepository, WeatherRepository weatherRepository, TerritoryRepository territoryRepository) {
        this.tWRepository = tWRepository;
        this.weatherRepository = weatherRepository;
        this.territoryRepository = territoryRepository;
    }

    public List<TerritoryWeather> getAll() {

        return tWRepository.findAll();
    }

    public List<TerritoryWeather> getAllWeatherPlaces(String weather) {
        return tWRepository.findPlacesByWea(weather);
    }

    public void addNew(TerritoryWeather territoryWeather) {
        Random random = new Random(Long.MAX_VALUE);
        territoryWeather.getTerritory().setId(random.nextLong());
        territoryWeather.getWeather().setId(random.nextLong());
        territoryWeather.setId(random.nextLong());
        territoryRepository.save(territoryWeather.getTerritory());
        weatherRepository.save(territoryWeather.getWeather());
        tWRepository.save(territoryWeather);
    }
}
