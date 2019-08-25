package com.huawei.nlz.springplayground.lazyinit.xmlconfig;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "com/huawei/nlz/springplayground/lazyinit/xmlconfig/applicationContext.xml");

        if (log.isInfoEnabled()) {
            log.info("容器初始化完成!");
        }

        ObsStorageService obsStorageService = (ObsStorageService) applicationContext.getBean("obsStorageService");

        applicationContext.close();
    }

}
