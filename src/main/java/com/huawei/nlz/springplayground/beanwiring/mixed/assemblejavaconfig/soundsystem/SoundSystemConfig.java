package com.huawei.nlz.springplayground.beanwiring.mixed.assemblejavaconfig.soundsystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({CDPlayerConfig.class, CompactDiscConfig.class})
public class SoundSystemConfig {
}
