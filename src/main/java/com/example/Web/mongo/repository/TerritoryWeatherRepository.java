package com.example.Web.mongo.repository;

import com.example.Web.mongo.entity.TerritoryWeather;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TerritoryWeatherRepository extends MongoRepository<TerritoryWeather, String> {

    List<TerritoryWeather> findAll();

    @Query("{ 'weather.weather' : ?0 }")
    List<TerritoryWeather> findPlacesByWea(String weather);
}
