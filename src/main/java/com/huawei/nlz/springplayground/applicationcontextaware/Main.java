package com.huawei.nlz.springplayground.applicationcontextaware;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoConfig.class);

        if (log.isInfoEnabled()) {
            log.info(SpringBeanFactory.getBean(String.class));
        }

        applicationContext.close();
    }
}
