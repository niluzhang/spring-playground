package com.huawei.nlz.springplayground.ch3.ambiguity.qualifier;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("new")
@Slf4j
public class SgtPeppers_2 implements CompactDisc {
    @Override
    public void play() {
        if (log.isInfoEnabled()) {
            log.info("sgtPeppers_2 play.");
        }
    }
}
