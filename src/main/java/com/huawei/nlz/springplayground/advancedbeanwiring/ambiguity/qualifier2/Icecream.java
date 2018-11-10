package com.huawei.nlz.springplayground.advancedbeanwiring.ambiguity.qualifier2;

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
