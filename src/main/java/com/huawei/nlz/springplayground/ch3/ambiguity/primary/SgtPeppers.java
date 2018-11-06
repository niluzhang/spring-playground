package com.huawei.nlz.springplayground.ch3.ambiguity.primary;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SgtPeppers implements CompactDisc {
    @Override
    public void play() {
        if (log.isInfoEnabled()) {
            log.info("sgtPeppers play.");
        }
    }
}
