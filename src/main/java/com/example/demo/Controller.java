package com.example.demo;

import jdk.jfr.Registered;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
@Bean
    @GetMapping("/devName")
    public String getDevName() {
        return "Arazzio";
    }
}

