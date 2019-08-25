package com.huawei.nlz.springplayground.lazyinit.javaconfig;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Lazy // @Lazy注解可以与@Component或@Bean或@Configuration注解一起使用，标注对应的Bean或者对应配置里的Bean是否延迟初始化。
public class ObsStorageService {
    public ObsStorageService() {
        if (log.isInfoEnabled()) {
            log.info("ObsStorageService被初始化!");
        }
    }
}
