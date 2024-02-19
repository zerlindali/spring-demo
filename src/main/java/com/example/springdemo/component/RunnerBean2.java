package com.example.springdemo.component;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class RunnerBean2 implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("RunnerBean.....implements ApplicationRunner.......order.........2");
        System.out.println("System.getProperties()---" + System.getProperties());
        System.out.println("System.getenv()---" + System.getenv());

    }
}
