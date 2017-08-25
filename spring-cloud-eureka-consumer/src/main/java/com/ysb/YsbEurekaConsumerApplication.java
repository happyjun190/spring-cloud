package com.ysb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by wushenjun on 2017/8/22.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker
@EnableHystrixDashboard
public class YsbEurekaConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(YsbEurekaConsumerApplication.class, args);
        //new SpringApplicationBuilder(YsbEurekaProviderApplication.class).web(true).run(args);
    }
}
