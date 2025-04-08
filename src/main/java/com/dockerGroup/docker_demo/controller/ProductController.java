package com.dockerGroup.docker_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/JenkinTest")
@RestController
public class ProductController {

    @GetMapping
    public String getHello(){
        return "Hello from Jenkin-demo";
    }


}
