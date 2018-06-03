package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class HelloController {
    private final Logger logger=Logger.getLogger(getClass().toString());
    @Autowired
    private DiscoveryClient discoveryClient;
}
