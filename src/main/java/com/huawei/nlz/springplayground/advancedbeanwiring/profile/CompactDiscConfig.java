package com.huawei.nlz.springplayground.advancedbeanwiring.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class CompactDiscConfig {

    @Bean("compactDisc")
    @Profile("dev")
    /*
     * @Profile作用在方法上，与@Bean一同使用。
     */
    public CompactDisc devCompactDisc() {
        return new DevSgtPeppers();
    }

    @Bean("compactDisc")
    @Profile("prod")
    public CompactDisc prodCompactDisc() {
        return new ProdSgtPeppers();
    }

}
