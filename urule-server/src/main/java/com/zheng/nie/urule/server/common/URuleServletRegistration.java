package com.zheng.nie.urule.server.common;

import com.bstek.urule.console.servlet.URuleServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServlet;

/**
 * @author: niezheng1
 * @Date: 2019/7/15 10:08
 */
@Component
public class URuleServletRegistration {


    @Bean
    public ServletRegistrationBean<HttpServlet> registerURuleServlet()
    {
        return new ServletRegistrationBean(new URuleServlet(), new String[] { "/urule/*" });
    }


}
