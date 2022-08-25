package com.sfwlibre.user.microserviceuser.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sfwlibre.user.microserviceuser.dto.User;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private RestTemplate clienteRest;

    @Override
    public List<User> finAll() {
        
        List<User> productos = Arrays.asList(clienteRest.getForObject("http://localhost:8001/products", User[].class));
            
        return productos;
    }

    @Override
    public List<User> finById() {
        
        return null;
    }
    
}
