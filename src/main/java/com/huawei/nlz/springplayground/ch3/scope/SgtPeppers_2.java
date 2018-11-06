package com.huawei.nlz.springplayground.ch3.scope;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("sgtPeppers_2")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Slf4j
public class SgtPeppers_2 implements CompactDisc {

    @Override
    public void play() {
        if (log.isInfoEnabled()) {
            log.info("sgtPeppers_2 play.");
        }
    }

}
