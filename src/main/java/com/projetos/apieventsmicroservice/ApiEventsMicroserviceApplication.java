package com.projetos.apieventsmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiEventsMicroserviceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiEventsMicroserviceApplication.class, args);
    }
}
