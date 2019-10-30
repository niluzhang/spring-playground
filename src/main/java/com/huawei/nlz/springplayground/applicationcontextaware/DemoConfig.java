package com.huawei.nlz.springplayground.applicationcontextaware;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class DemoConfig {
    /**
     * 返回一个String类型的bean
     *
     * @return 一个String类型的bean
     */
    @Bean
    public String stringBean() {
        return "handsome ni";
    }
}
