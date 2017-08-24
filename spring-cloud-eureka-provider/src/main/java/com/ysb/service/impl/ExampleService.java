package com.ysb.service.impl;

import com.ysb.service.IExampleService;
import org.springframework.stereotype.Service;

/**
 * Created by wushenjun on 2017/8/24.
 */
@Service
public class ExampleService implements IExampleService {

    @Override
    public String getExampleValueById(Integer id) {
        return "getExampleValueById:"+id;
    }
}
