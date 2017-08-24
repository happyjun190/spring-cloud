package com.ysb.controller;

import com.ysb.service.IExampleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by wushenjun on 2017/8/23.
 */
@RestController
public class ExampleController {

    private static final Logger logger = LoggerFactory.getLogger(ExampleController.class);

    @Autowired
    private IExampleService exampleService;

    @RequestMapping("/example")
    String home() {
        return "hello world";
    }


    @GetMapping("/getExampleValueById")
    public String getExampleValueById(@RequestParam(value = "id") Integer id) {
        logger.info("Ribbon 负载均衡:{}", id);
        return exampleService.getExampleValueById(id);
    }


}
