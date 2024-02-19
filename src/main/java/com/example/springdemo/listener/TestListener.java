package com.example.springdemo.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.builder.ParentContextApplicationContextInitializer;
import org.springframework.boot.context.event.*;
import org.springframework.boot.web.servlet.context.ServletWebServerInitializedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.GenericApplicationListener;
import org.springframework.core.ResolvableType;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TestListener implements GenericApplicationListener {

    @Override
    public boolean supportsEventType(ResolvableType eventType) {
        return true;
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof ApplicationStartingEvent) {
            log.info("TestListener.....加载成功了。。。。。ApplicationStartingEvent");
        }
        else if (event instanceof ApplicationEnvironmentPreparedEvent) {
            log.info("TestListener.....加载成功了。。。。。ApplicationEnvironmentPreparedEvent");
        }
        else if (event instanceof ApplicationPreparedEvent) {
            log.info("TestListener.....加载成功了。。。。。ApplicationPreparedEvent");
        }
        else if (event instanceof ContextClosedEvent
                && ((ContextClosedEvent) event).getApplicationContext().getParent() == null) {
            log.info("TestListener.....加载成功了。。。。。ContextClosedEvent");
        }
        else if (event instanceof ApplicationFailedEvent) {
            log.info("TestListener.....加载成功了。。。。。ApplicationFailedEvent");
        }
        else if (event instanceof ApplicationContextInitializedEvent){
            log.info("TestListener.....加载成功了。。。。。ApplicationContextInitializedEvent");
        }
        else if (event instanceof ContextRefreshedEvent){
            log.info("TestListener.....加载成功了。。。。。ContextRefreshedEvent");
        }
        else if (event instanceof ApplicationStartedEvent){
            log.info("TestListener.....加载成功了。。。。。ApplicationStartedEvent");
        }
        else if (event instanceof AvailabilityChangeEvent){
            log.info("TestListener.....加载成功了。。。。。AvailabilityChangeEvent");
        }
        else if (event instanceof ParentContextApplicationContextInitializer.ParentContextAvailableEvent){
            log.info("TestListener.....加载成功了。。。。。ParentContextApplicationContextInitializer.ParentContextAvailableEvent");
        }
        else if (event instanceof ApplicationReadyEvent){
            log.info("TestListener.....加载成功了。。。。。ApplicationReadyEvent");
        }
        else if (event instanceof ServletWebServerInitializedEvent){
            log.info("TestListener.....加载成功了。。。。。ServletWebServerInitializedEvent");
        }
        else{
            log.info("TestListener.....加载成功了。。。。。未知");
        }

    }
}
