package com.poot.demopoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.controller","com.po"})
public class DemoPootApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoPootApplication.class, args);
    }

}
