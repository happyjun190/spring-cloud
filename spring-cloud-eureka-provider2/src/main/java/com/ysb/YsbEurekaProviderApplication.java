package com.ysb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by wushenjun on 2017/8/22.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class YsbEurekaProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(YsbEurekaProviderApplication.class, args);
        //new SpringApplicationBuilder(YsbEurekaProviderApplication.class).web(true).run(args);
    }
}
