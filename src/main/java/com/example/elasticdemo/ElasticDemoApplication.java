package com.example.elasticdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class ElasticDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElasticDemoApplication.class, args);
    }
}
