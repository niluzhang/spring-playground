package com.huawei.nlz.springplayground.aop.springaop.knights;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RescueDamselQuest implements Quest {

    @Override
    public void embark() {
        if (log.isInfoEnabled()) {
            log.info("Embarking on a quest to rescue the damsel.");
        }
    }

}
