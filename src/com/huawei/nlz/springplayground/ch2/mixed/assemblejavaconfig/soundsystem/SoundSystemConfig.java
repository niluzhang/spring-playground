package com.huawei.nlz.springplayground.ch2.mixed.assemblejavaconfig.soundsystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({CDPlayerConfig.class, CompactDiscConfig.class})
public class SoundSystemConfig {
}
