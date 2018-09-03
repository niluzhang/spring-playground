package com.huawei.nlz.springplayground.ch3.ambiguity.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("old")  //声明bean的限定符。
public class SgtPeppers implements CompactDisc {
    @Override
    public void play() {
        System.out.println("sgtPeppers play.");
    }
}
