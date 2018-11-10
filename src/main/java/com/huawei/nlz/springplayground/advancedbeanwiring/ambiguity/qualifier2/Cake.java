package com.huawei.nlz.springplayground.advancedbeanwiring.ambiguity.qualifier2;

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
