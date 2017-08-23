package com.ysb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wushenjun on 2017/8/23.
 */
@RestController
public class Example {

    @RequestMapping("/info")
    String home() {
        return "hello world";
    }

}
