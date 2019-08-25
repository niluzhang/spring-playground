package com.huawei.nlz.springplayground.beanwiring.mixed.assemblejavaconfig.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CompactDiscConfig {

    @Bean
    public CompactDisc getSgtPeppers() {
        return new SgtPeppers();
    }
}
