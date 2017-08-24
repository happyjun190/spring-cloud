package com.ysb.service;

import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by wushenjun on 2017/8/24.
 */
public interface IExampleService {

    /**
     * 通过id获取例子信息
     * @param id
     * @return
     */
    String getExampleValueById(@RequestParam(value = "id") Integer id);

}



