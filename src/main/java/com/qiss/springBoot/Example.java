package com.qiss.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qiss on 2017/6/18.
 */
@RestController
@SpringBootApplication
public class Example {
    public static void main(String[] args) {
        SpringApplication.run(Example.class,args);
    }

    @RequestMapping("/")
    public String hello(){
        return "hello";
    }
}
