package com.example.springdemo.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class RunnerBean implements ApplicationRunner {


    @Override
    public void run(ApplicationArguments args) {
        System.out.println("RunnerBean.....implements ApplicationRunner.......order.........1");

        System.out.println("1. 可以用于加载初始化数据到数据库");

        System.out.println("2. 启动异步任务，进行后台数据处理等复杂业务逻辑");

        System.out.println("3. 接口健康检查，可以调用并验证依赖服务的健康状态,如果不正常可以终止Spring Boot启动");

        System.out.println("4. 动态设置配置");

        System.out.println("...");

    }
}
