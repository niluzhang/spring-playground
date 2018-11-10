package com.huawei.nlz.springplayground.advancedbeanwiring.runtimevalueinject;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
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
        if (log.isInfoEnabled()) {
            log.info(ei.getServiceName());
        }

        context2.close();
    }

}
