package com.huawei.nlz.springplayground.ch3.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("sgtPeppers_2")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SgtPeppers_2 implements CompactDisc {

    @Override
    public void play() {
        System.out.println("sgtPeppers_2 play.");
    }

}
