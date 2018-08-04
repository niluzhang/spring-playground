package com.huawei.nlz.springplayground.ch3.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CompactDiscConfig {

    @Bean
    @Conditional(SgtPeppersCondition.class)
    /*
     * @Conditional注解可以用到带有@Bean注解的方法上，如果给定的条件计算结果为true，就会创建这个bean，否则的话，这个bean就会被忽略。
     */
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }

}
