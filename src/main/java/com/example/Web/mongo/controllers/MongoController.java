package com.example.Web.mongo.controllers;

import com.example.Web.mongo.entity.User;
import com.example.Web.mongo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MongoController {
    private final UserService service;

    public MongoController(UserService service) {
        this.service = service;
    }

    @PostMapping("/user/new")
    public void addOneUser(@RequestBody User user) {
        service.addUser(user);
    }

    @GetMapping("/users")
    public List<User> getaAll() {
        return service.getAllUsers();
    }


}
