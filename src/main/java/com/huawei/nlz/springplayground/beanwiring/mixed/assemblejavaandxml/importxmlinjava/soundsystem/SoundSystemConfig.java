package com.huawei.nlz.springplayground.beanwiring.mixed.assemblejavaandxml.importxmlinjava.soundsystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(CDPlayerConfig.class)
@ImportResource("com/huawei/nlz/springplayground/beanwiring/mixed/assemblejavaandxml/importxmlinjava/compactDisc.xml")
public class SoundSystemConfig {
}
