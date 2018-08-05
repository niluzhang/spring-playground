package com.huawei.nlz.springplayground.ch3.runtimevalueinject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:/com/huawei/nlz/springplayground/ch3/runtimevalueinject/app.properties")
//@PropertySource注解指定属性源文件的位置。属性文件会加载到Spring的Environment中。
@ComponentScan
public class CompactDiscConfig {

    @Autowired
    Environment env;

    @Bean
    public CompactDisc compactDisc() {
        return new SgtPeppers(env.getProperty("disc.title"), env.getProperty("disc.artist"));
    }

    @Bean
    /*
     * 为了使用占位符，必须要配置一个PropertySourcesPlaceholderConfigurer bean。它能够基于Spring Environment及其属性源来解析占位符。
     * 注意这个方法必须声明成静态的。
     */
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
