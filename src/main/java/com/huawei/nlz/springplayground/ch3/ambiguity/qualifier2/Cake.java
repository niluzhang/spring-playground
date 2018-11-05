package com.huawei.nlz.springplayground.ch3.ambiguity.qualifier2;

import org.springframework.stereotype.Component;

@Component
@Sweet
@Soft
public class Cake implements Dessert {

    @Override
    public String getKind() {
        return "cake";
    }

}
