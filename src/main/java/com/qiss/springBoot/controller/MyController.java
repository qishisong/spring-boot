package com.qiss.springBoot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by qiss on 2017/6/22.
 */
@Controller
@RequestMapping("/my")
public class MyController {

    private static final Logger logger = LoggerFactory.getLogger(MyController.class);

    @RequestMapping("/test1")
    @ResponseBody
    public String test1(){
        logger.debug("日志级别 debug");
        logger.info("日志级别 info");
        logger.error("日志级别 error");
        return "myTest1";
    }

    @RequestMapping("/test2")
    public String test2(ModelMap model){
        model.put("time",new Date());
        model.put("message","这是测试的内容。。。");
        model.put("toUserName","张三");
        model.put("fromUserName","老许");
        return "welcome";
    }
}
