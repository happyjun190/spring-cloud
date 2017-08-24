package com.ysb.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by wushenjun on 2017/8/24.
 */
@FeignClient(value = "provider-service", fallback = IExampleService.ExapleServiceHystris.class)
public interface IExampleService {

    /**
     * 通过id获取例子信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/getExampleValueById", method = RequestMethod.GET)
    String getExampleValueById(@RequestParam(value = "id") Integer id);


    class ExapleServiceHystris implements IExampleService {
        @Override
        public String getExampleValueById(Integer id) {
            return "ExapleServiceHystris:"+id;
        }
    }
}



