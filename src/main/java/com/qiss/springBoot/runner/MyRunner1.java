package com.qiss.springBoot.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by qiss on 2017/6/22.
 */
@Component
@Order(value=2)
public class MyRunner1 implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("---------------加载myRunner    1111111111111111----------------");
    }
}
