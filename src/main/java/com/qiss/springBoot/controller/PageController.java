package com.qiss.springBoot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.Map;

/**
 * Created by qiss on 2017/6/18.
 */
@Controller
@RequestMapping("/page")
public class PageController {

    @Value("${application.hello:Hello Shanhy}")
    private String hello =  "Hello s=Shanhy";

    @RequestMapping(value={"/","/index"})
    public String index(Map<String,Object>model){
        model.put("time",new Date());
        model.put("message",this.hello);
        return "index";
    }

    @RequestMapping("/page1")
    public ModelAndView page1(){
        ModelAndView modelAndView = new ModelAndView("page/page1");
        modelAndView.addObject("content",hello);
        return modelAndView;
    }

    @RequestMapping("/page2")
    public String page2(Model model){
        model.addAttribute("content",hello+"(第二种)");
        return "page/page1";
    }
}
