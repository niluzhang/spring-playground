package com.huawei.nlz.springplayground.lazyinit.xmlconfig;

import lombok.extern.slf4j.Slf4j;

/**
 * Spring Bean类
 */
@Slf4j
public class ObsStorageService {

    public ObsStorageService() {
        if (log.isInfoEnabled()) {
            log.info("ObsStorageService被初始化!");
        }
    }

}
