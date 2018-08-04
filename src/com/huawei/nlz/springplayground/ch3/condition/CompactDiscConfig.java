package com.huawei.nlz.springplayground.ch3.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CompactDiscConfig {

    @Bean
    @Conditional(SgtPeppersCondition.class)
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }

}
