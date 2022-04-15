package com.project.wewed;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.project.wewed.mybatis.mapper")
public class WewedApplication {

    public static void main(String[] args) {
        SpringApplication.run(WewedApplication.class, args);
    }

}
