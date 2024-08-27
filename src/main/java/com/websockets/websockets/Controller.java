package com.websockets.websockets;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Controller {

    @Value("${nonsecret.key}")
    String nonsecretKey;

    @Value("${secret.key}")
    String secretKey;

    @GetMapping
    public String getMethodName() {
        return "Icke hemlig nyckel: " + nonsecretKey + " Hemlig nyckel: " + secretKey;
    }
    
    
}
