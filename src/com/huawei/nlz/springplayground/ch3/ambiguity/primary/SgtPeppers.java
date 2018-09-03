package com.huawei.nlz.springplayground.ch3.ambiguity.primary;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {
    @Override
    public void play() {
        System.out.println("sgtPeppers play.");
    }
}
