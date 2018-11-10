package com.huawei.nlz.springplayground.aop.simpleaop;

import lombok.extern.slf4j.Slf4j;

/**
 * 业务逻辑类，它是被代理的目标对象。
 */
@Slf4j
public class BusinessLogic {

    /**
     * 业务逻辑
     *
     * @param cmd 指令
     */
    public void execute(String cmd) {
        if (log.isInfoEnabled()) {
            log.info("business logic start to deal with " + cmd);
        }
    }

}
