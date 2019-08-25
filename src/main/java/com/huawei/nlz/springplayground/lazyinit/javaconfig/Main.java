package com.huawei.nlz.springplayground.lazyinit.javaconfig;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoConfig.class);

        if (log.isInfoEnabled()) {
            log.info("容器初始化成功!");
        }

        ObsStorageService obsStorageService = (ObsStorageService) applicationContext.getBean("obsStorageService");

        applicationContext.close();
    }

}
