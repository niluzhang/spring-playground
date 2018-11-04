package com.huawei.nlz.springplayground.ch3.runtimevalueinject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:/com/huawei/nlz/springplayground/ch3/runtimevalueinject/eureka.properties")
public class EurekaInitializer {
    @Value("${eureka.name:default_service}")
    private String serviceName;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
}
