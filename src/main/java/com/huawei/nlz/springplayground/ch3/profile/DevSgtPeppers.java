package com.huawei.nlz.springplayground.ch3.profile;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DevSgtPeppers implements CompactDisc {

    @Override
    public void play() {
        if (log.isInfoEnabled()) {
            log.info("devSgtPeppers play.");
        }
    }

}
