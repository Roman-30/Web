package com.example.Web.mongo.repository;

import com.example.Web.mongo.entity.Territory;
import com.example.Web.mongo.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TerritoryRepository extends MongoRepository<Territory, String> {
}
