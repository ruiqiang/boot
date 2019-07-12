package com.ruiqiang.sp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
@MapperScan(basePackages = {"com.ruiqiang.sp.mapper"})
public class SpApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpApplication.class, args);
    }

}
