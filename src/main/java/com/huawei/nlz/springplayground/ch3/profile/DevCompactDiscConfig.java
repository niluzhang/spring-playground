package com.huawei.nlz.springplayground.ch3.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")  //在类级别上使用@Profile注解，告诉Spring这个配置类里的bean只有在dev profile激活时才创建。
public class DevCompactDiscConfig {

    @Bean("compactDisc")
    public CompactDisc compactDisc(){
        return new DevSgtPeppers();
    }

}
