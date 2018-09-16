package com.spring.boot.app.carIT.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = {"com.spring.boot.app.carIT"})
@EntityScan(basePackages = {"com.spring.boot.app.carIT"})
public class CarItApplication {

    public static void main(String[] args) {

        SpringApplication.run(CarItApplication.class, args);
    }
}
