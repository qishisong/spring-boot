package com.qiss.springBoot.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by qiss on 2017/6/22.
 */
public class MyInterceptor2 implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>myInterceptor2 preHandler<<<<<<<<<<<请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之前");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>myInterceptor2 postHandle<<<<<<<<<<<请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后)");

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>myInterceptor2 afterCompletion<<<<<<<<<<<在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作");

    }
}
