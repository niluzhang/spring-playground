package com.huawei.nlz.springplayground.ch3.ambiguity.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary  //@Primary注解可以与@Component或@Bean一起使用，用以标识首选的bean。
public class SgtPeppers_2 implements CompactDisc {
    @Override
    public void play() {
        System.out.println("sgtPeppers_2 play.");
    }
}
