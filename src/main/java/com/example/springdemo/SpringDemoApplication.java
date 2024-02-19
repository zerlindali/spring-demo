package com.example.springdemo;

import com.example.springdemo.domain.SimpleBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringDemoApplication {

    public static void main(String[] args) {
        List<String> argsList = Arrays.asList("spring.profiles.active=prod");
        SpringApplication springApplication = new SpringApplication(SpringDemoApplication.class);
        springApplication.setAdditionalProfiles("prod");
        ApplicationContext context = SpringApplication.run(SpringDemoApplication.class, argsList.toArray(new String[args.length]));

        SimpleBean bean = context.getBean(SimpleBean.class);
        bean.doA();
    }

}
