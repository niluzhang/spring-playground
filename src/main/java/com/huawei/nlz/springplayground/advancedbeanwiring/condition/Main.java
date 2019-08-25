package com.huawei.nlz.springplayground.advancedbeanwiring.condition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CompactDiscConfig.class);

        CompactDisc cd = (CompactDisc) context.getBean("compactDisc");
        cd.play();

        context.close();
    }

}
