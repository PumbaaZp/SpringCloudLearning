package com.zpstudio.eurekaclient.controller;

import com.zpstudio.eurekaclient.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhangpeng
 * @Date 2018/5/24 14:51
 **/
@RestController
public class TestController {

    @Autowired
    private TestService testService;
    @RequestMapping("/hi")
    public String hi(@RequestParam String name){
        return testService.hi(name);
    }

}