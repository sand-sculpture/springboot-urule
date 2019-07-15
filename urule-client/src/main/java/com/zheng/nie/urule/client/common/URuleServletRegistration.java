package com.zheng.nie.urule.client.common;

import com.bstek.urule.KnowledgePackageReceiverServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author: niezheng1
 * @Date: 2019/7/15 10:40
 */
@Component
public class URuleServletRegistration {

    //此Servlet用于接收Urule服务端发布的知识包，使用开源版本时删除或者注释这个bean
    @Bean
    public ServletRegistrationBean registerURuleServlet(){
        return new ServletRegistrationBean(new KnowledgePackageReceiverServlet(),"/knowledgepackagereceiver");
    }

}
