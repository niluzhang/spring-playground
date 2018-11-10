package com.huawei.nlz.springplayground.advancedbeanwiring.ambiguity.qualifier;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("old")  //声明bean的限定符。
@Slf4j
public class SgtPeppers implements CompactDisc {
    @Override
    public void play() {
        if (log.isInfoEnabled()) {
            log.info("sgtPeppers play.");
        }
    }
}
