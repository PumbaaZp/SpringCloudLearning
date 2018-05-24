package com.zpstudio.sr.Controller;

import com.zpstudio.sr.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhangpeng
 * @Date 2018/5/24 13:56
 **/
@RestController
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("hi")
    public String hi(@RequestParam String name){
        return testService.hiService(name);
    }

}