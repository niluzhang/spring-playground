package com.huawei.nlz.springplayground.eventmodel;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(EventModelConfig.class);
        /*
         * ApplicationContext继承了ApplicationEventPublisher接口，可以发布事件。
         */
        applicationContext.publishEvent(new SessionCreateEvent("app", UUID.randomUUID().toString()));
        applicationContext.close();
    }
}
