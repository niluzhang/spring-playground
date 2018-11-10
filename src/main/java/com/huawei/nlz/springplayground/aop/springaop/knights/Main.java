package com.huawei.nlz.springplayground.aop.springaop.knights;

import org.springframework.context.support.
        ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/huawei/nlz/springplayground/aop/springaop/applicationContext.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }

}
