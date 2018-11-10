package com.huawei.nlz.springplayground.advancedbeanwiring.profile;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProdSgtPeppers implements CompactDisc {

    @Override
    public void play() {
        if (log.isInfoEnabled()) {
            log.info("prodSgtPeppers play.");
        }
    }

}
