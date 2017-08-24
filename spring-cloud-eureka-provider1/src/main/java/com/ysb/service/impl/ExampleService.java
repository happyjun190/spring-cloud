package com.ysb.service.impl;

import com.ysb.service.IExampleService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by wushenjun on 2017/8/24.
 */
@Service
public class ExampleService implements IExampleService {

    @Override
    public String getExampleValueById(@RequestParam(value = "id") Integer id) {
        return "getExampleValueById:"+id;
    }
}
