package com.example.Web.mongo.repository;

import com.example.Web.mongo.entity.User;
import com.example.Web.mongo.entity.Weather;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherRepository extends MongoRepository<Weather, String> {
}
