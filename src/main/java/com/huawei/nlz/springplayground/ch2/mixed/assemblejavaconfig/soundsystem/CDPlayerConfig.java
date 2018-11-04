package com.huawei.nlz.springplayground.ch2.mixed.assemblejavaconfig.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {

    @Bean("cdPlayer")
    public MediaPlayer getCDPlayer(CompactDisc cd){
        return new CDPlayer(cd);
    }

}
