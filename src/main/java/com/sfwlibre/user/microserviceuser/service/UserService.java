package com.sfwlibre.user.microserviceuser.service;

import java.util.List;

import com.sfwlibre.user.microserviceuser.dto.User;

public interface UserService {
    
    public List<User> finAll();
    public List<User> finById();
}
