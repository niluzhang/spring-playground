package com.huawei.nlz.springplayground.factorybean.carsystem;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class AppConfig {

    @Bean
    public CarFactory car() {
        CarFactory cf = new CarFactory();
        cf.setCarInfo("比亚迪,120,200000");
        return cf;
    }

}
