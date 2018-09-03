package com.huawei.nlz.springplayground.ch3.ambiguity.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("new")
public class SgtPeppers_2 implements CompactDisc {
    @Override
    public void play() {
        System.out.println("sgtPeppers_2 play.");
    }
}
