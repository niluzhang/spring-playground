package com.huawei.nlz.springplayground.lifecycle.xmlconfig;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class Main {

    public static void main(String[] args) {
        if (log.isInfoEnabled()) {
            log.info("现在开始初始化容器");
        }

        ApplicationContext factory = new ClassPathXmlApplicationContext("com/huawei/nlz/springplayground/lifecycle/xmlconfig/applicationContext.xml");
        if (log.isInfoEnabled()) {
            log.info("容器初始化成功");
        }
        Person person = factory.getBean("person", Person.class);
        if (log.isInfoEnabled()) {
            log.info("Person是: {}", String.valueOf(person));
        }

        if (log.isInfoEnabled()) {
            log.info("现在开始关闭容器！");
        }
        ((ClassPathXmlApplicationContext) factory).registerShutdownHook();
    }

}
