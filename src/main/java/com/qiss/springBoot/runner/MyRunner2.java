package com.qiss.springBoot.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by qiss on 2017/6/22.
 */
@Component
@Order(value=1)
public class MyRunner2 implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("---------------加载myRunner2 222222222222222222----------------");
    }
}
