package com.huawei.nlz.springplayground.ch3.scope;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CompactDiscConfig.class);

        CompactDisc cd = (CompactDisc) context.getBean("sgtPeppers");
        if (log.isInfoEnabled()) {
            log.info("hashCode of sgtPeppers is: " + cd.hashCode());
        }

        cd = (CompactDisc) context.getBean("sgtPeppers");
        if (log.isInfoEnabled()) {
            log.info("hashCode of sgtPeppers is: " + cd.hashCode());
        }

        CompactDisc cd2 = (CompactDisc) context.getBean("another");
        if (log.isInfoEnabled()) {
            log.info("hashCode of another is: " + cd2.hashCode());
        }

        cd2 = (CompactDisc) context.getBean("another");
        if (log.isInfoEnabled()) {
            log.info("hashCode of another is: " + cd2.hashCode());
        }

        CompactDisc cd_2 = (CompactDisc) context.getBean("sgtPeppers_2");
        if (log.isInfoEnabled()) {
            log.info("hashCode of sgtPeppers_2 is: " + cd_2.hashCode());
        }

        cd_2 = (CompactDisc) context.getBean("sgtPeppers_2");
        if (log.isInfoEnabled()) {
            log.info("hashCode of sgtPeppers_2 is: " + cd_2.hashCode());
        }

        context.close();
    }

}
