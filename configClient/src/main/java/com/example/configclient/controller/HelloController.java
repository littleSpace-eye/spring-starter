package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HelloController {
//    @Value("${foo}")
//    String foo;
//    @GetMapping(value = "/foo")
//    public String hi(){
//        return foo;
//    }
    @Value("${spring.application.name}")
    private String name;

    @Value("${server.port}")
    private String port;
    @GetMapping("/show")
    public String show() {
        return port;
    }
}

