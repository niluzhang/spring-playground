package com.huawei.nlz.springplayground.ch3.runtimevalueinject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CompactDiscConfig.class);

        CompactDisc cd = (CompactDisc) context.getBean("compactDisc");
        cd.play();

        CompactDisc cd_2 = (CompactDisc) context.getBean("compactDisc_2");
        cd_2.play();

        context.close();

        AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(EurekaConfig.class);

        EurekaInitializer ei = (EurekaInitializer) context2.getBean("eurekaInitializer");
        System.out.println(ei.getServiceName());
    }

}
