package com.huawei.nlz.springplayground.lazyinit.javaconfig;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Lazy
public class ObsStorageService {
    public ObsStorageService() {
        if (log.isInfoEnabled()) {
            log.info("ObsStorageService被初始化!");
        }
    }
}
