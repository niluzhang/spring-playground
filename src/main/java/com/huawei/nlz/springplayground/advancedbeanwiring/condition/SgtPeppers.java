package com.huawei.nlz.springplayground.advancedbeanwiring.condition;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SgtPeppers implements CompactDisc {

    @Override
    public void play() {
        if (log.isInfoEnabled()) {
            log.info("sgtPeppers play.");
        }
    }

}
