package com.huawei.nlz.springplayground.advancedbeanwiring.ambiguity.qualifier2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;

@Component
@Slf4j
public class Dinner {
    @Autowired
    @Soft
    private Dessert dessert;

    public void showDinner() {
        if (log.isInfoEnabled()) {
            log.info(MessageFormat.format("dessert in dinner is {0}.", dessert.getKind()));
        }
    }
}
