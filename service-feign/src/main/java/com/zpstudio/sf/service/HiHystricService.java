package com.zpstudio.sf.service;

import com.zpstudio.sf.domain.TestInterface;
import org.springframework.stereotype.Service;

/**
 * @Description feign指定熔断器fallback类
 * @Author zhangpeng
 * @Date 2018/5/25 16:04
 **/
@Service
public class HiHystricService implements TestInterface{
    @Override
    public String sayHi(String name) {
        return "Feign hi. ".concat(name).concat(", service error.");
    }
}
