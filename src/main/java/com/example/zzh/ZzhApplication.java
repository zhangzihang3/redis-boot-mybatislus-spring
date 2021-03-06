package com.example.zzh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan(basePackages = {"com.example.zzh.mapper"})
@SpringBootApplication
public class ZzhApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZzhApplication.class, args);
    }

}
