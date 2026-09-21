package com.example.mybignumber.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.mybignumber.web", "com.example.mybignumber"})
public class MyBigNumberWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyBigNumberWebApplication.class, args);
    }
}
