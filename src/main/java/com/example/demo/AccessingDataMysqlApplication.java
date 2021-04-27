package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;



@ServletComponentScan
@SpringBootApplication
public class AccessingDataMysqlApplication {

    public static void main(String[] args) {

        SpringApplication.run(AccessingDataMysqlApplication.class, args);
    }
}