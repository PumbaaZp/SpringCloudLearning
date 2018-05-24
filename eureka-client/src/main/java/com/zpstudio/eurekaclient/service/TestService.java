package com.zpstudio.eurekaclient.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Author zhangpeng
 * @Date 2018/5/24 14:49
 **/
@Service
public class TestService {

    @Value("${server.port}")
    private String port;

    public String hi(String name){
        // 实例间无法相互调用，service-ribbon不是可用的实例
        // return restTemplate.getForObject("http://SERVICE-RIBBON/hi?name=" + name, String.class);
        return "hi ".concat(name).concat(", i am from port:").concat(port);
    }
}