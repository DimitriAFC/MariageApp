package com.example.mariageapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.mariageapp.Config"})
public class MariageAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(MariageAppApplication.class, args);
    }

}
