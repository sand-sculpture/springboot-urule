package com.zheng.nie.urule.client.controller;

import com.bstek.urule.Utils;
import com.bstek.urule.runtime.KnowledgePackage;
import com.bstek.urule.runtime.KnowledgeSession;
import com.bstek.urule.runtime.KnowledgeSessionFactory;
import com.bstek.urule.runtime.service.KnowledgeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: niezheng1
 * @Date: 2019/7/15 10:42
 */
@RestController
public class TestController  {

    @RequestMapping("/rule")
    public String  getRara(@RequestParam String data)throws IOException {
        KnowledgeService knowledgeService = (KnowledgeService) Utils.getApplicationContext().getBean(KnowledgeService.BEAN_ID);
//参数，Urule项目名/知识包名
        KnowledgePackage knowledgePackage = knowledgeService.getKnowledge("letasa/pare");
        KnowledgeSession session = KnowledgeSessionFactory.newKnowledgeSession(knowledgePackage);
        Integer integer = Integer.valueOf(data);
        Map<String, Object> param = new HashMap();
//参数，var，传入参数，和参数库中定义一致
        param.put("var", integer);
        session.fireRules(param);
//result，返回参数，和参数库中定义一致
        Integer result = (Integer) session.getParameter("result");
        return String.valueOf(result);
    }

}
