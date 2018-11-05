package com.huawei.nlz.springplayground.ch3.ambiguity.qualifier2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;

@Component
public class Dinner {
    @Autowired
    @Soft
    private Dessert dessert;

    public void showDinner(){
        System.out.println(MessageFormat.format("dessert in dinner is {0}.", dessert.getKind()));
    }
}
