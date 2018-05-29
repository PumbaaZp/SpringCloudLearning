package com.zpstudio.cc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 配置信息git->server->client
 * @Author zhangpeng
 * @Date 2018/5/29 9:40
 **/
@RestController
public class TestController {

    @Value("${foo}")
    String foo;
    @RequestMapping("/hi")
    public String sayHi(){
        return foo;
    }
}