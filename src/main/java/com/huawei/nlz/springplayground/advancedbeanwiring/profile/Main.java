package com.huawei.nlz.springplayground.advancedbeanwiring.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args){
        /*
         * Spring通过spring.profiles.active和spring.profiles.default确定哪个profile处于激活。
         * 优先使用spring.profiles.active，如果spring.profiles.active没有设置，则使用spring.profiles.default。
         * 如果两者都没有设置，那么就没有profile处于激活。
         */
        System.setProperty("spring.profiles.active", "prod");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DevCompactDiscConfig.class, ProdCompactDiscConfig.class);
        CompactDisc cd = (CompactDisc) context.getBean("compactDisc");
        cd.play();

        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(CompactDiscConfig.class);
        CompactDisc cd1 = (CompactDisc) context1.getBean("compactDisc");
        cd1.play();

        context.close();
        context1.close();
    }

}
