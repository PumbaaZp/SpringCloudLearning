package com.zpstudio.sz.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Description zuul自定义服务过滤
 * @Author zhangpeng
 * @Date 2018/5/28 14:23
 **/
@Component
public class MyFilter extends ZuulFilter{

    private static Logger log = LoggerFactory.getLogger(MyFilter.class);
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    /*
    * @Description 判断token参数
    * @Param []
    * @return java.lang.Object
    **/
    @Override
    public Object run() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest httpServletRequest = requestContext.getRequest();
        log.info(httpServletRequest.getMethod().concat(" >>> ").concat(httpServletRequest.getRequestURL().toString()));
        Object token = httpServletRequest.getParameter("token");
        if(token == null){
            log.warn("token is null");
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(401);
            try {
                requestContext.getResponse().getWriter().write("token is null");
            } catch (IOException e) {
                log.error(e.getMessage());
            }
            return null;
        }
        log.info("ok");
        return null;
    }
}