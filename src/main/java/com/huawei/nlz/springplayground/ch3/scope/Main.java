package com.huawei.nlz.springplayground.ch3.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CompactDiscConfig.class);

        CompactDisc cd = (CompactDisc) context.getBean("sgtPeppers");
        System.out.println("hashCode of sgtPeppers is: " + cd.hashCode());

        cd = (CompactDisc) context.getBean("sgtPeppers");
        System.out.println("hashCode of sgtPeppers is: " + cd.hashCode());

        CompactDisc cd2 = (CompactDisc) context.getBean("another");
        System.out.println("hashCode of another is: " + cd2.hashCode());

        cd2 = (CompactDisc) context.getBean("another");
        System.out.println("hashCode of another is: " + cd2.hashCode());

        CompactDisc cd_2 = (CompactDisc) context.getBean("sgtPeppers_2");
        System.out.println("hashCode of sgtPeppers_2 is: " + cd_2.hashCode());

        cd_2 = (CompactDisc) context.getBean("sgtPeppers_2");
        System.out.println("hashCode of sgtPeppers_2 is: " + cd_2.hashCode());

        context.close();
    }

}
