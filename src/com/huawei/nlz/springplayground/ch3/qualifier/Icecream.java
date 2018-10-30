package com.huawei.nlz.springplayground.ch3.qualifier;

import org.springframework.stereotype.Component;

@Component
@Cold
@Sweet
public class Icecream implements Dessert {

    @Override
    public String getKind() {
        return "icecream";
    }

}
