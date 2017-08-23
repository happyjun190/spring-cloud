package com.ysb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by wushenjun on 2017/8/22.
 */
@EnableEurekaServer
@SpringBootApplication
public class YsbEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(YsbEurekaServerApplication.class, args);
    }

}
