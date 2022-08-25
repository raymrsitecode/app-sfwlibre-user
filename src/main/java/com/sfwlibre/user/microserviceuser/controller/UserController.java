package com.sfwlibre.user.microserviceuser.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sfwlibre.user.microserviceuser.dto.User;
import com.sfwlibre.user.microserviceuser.service.UserService;

@RestController
public class UserController {
    
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> listUser(){
        return userService.finAll();
    }
}
