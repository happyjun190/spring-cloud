package com.ysb;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by wushenjun on 2017/8/22.
 */
@EnableEurekaClient
@SpringBootApplication
public class YsbEurekaProviderApplication {

    public static void main(String[] args) {
        //SpringApplication.run(YsbEurekaProviderApplication.class, args);
        new SpringApplicationBuilder(YsbEurekaProviderApplication.class).web(true).run(args);
    }
}
