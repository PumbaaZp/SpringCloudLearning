package com.zpstudio.sf.controller;

import com.zpstudio.sf.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhangpeng
 * @Date 2018/5/24 17:10
 **/
@RestController
public class TestController {

    @Autowired
    TestService testService;
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return testService.sayHi(name);
    }
}