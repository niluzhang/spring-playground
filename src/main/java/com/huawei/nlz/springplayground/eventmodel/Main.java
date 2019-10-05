package com.huawei.nlz.springplayground.eventmodel;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(EventModelConfig.class);
        /*
         * ApplicationContext继承了ApplicationEventPublisher接口，可以发布事件。
         *
         * Spring读取配置类/配置文件之后，利用反射，将所有实现ApplicationListener的Bean找出来，
         * 注册为容器的事件监听器。当接收到事件的时候，Spring会逐个调用事件监听器。
         */
        applicationContext.publishEvent(new SessionCreateEvent("app", UUID.randomUUID().toString()));
        applicationContext.close();
    }
}
