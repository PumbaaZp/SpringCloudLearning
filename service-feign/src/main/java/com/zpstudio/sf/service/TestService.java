package com.zpstudio.sf.service;

import com.zpstudio.sf.domain.TestInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author zhangpeng
 * @Date 2018/5/24 17:20
 **/
@Service
public class TestService {

    @Autowired
    TestInterface testInterface;

    public String sayHi(String name){
        return testInterface.sayHi(name);
    }
}