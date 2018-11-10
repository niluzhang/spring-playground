package com.huawei.nlz.springplayground.advancedbeanwiring.ambiguity.qualifier2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        Dinner dinner = (Dinner)applicationContext.getBean("dinner");
        dinner.showDinner();
        applicationContext.close();
    }

}
