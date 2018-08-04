package com.huawei.nlz.springplayground.ch3.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan
public class CompactDiscConfig {

    @Bean("sgtPeppers")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    /*
     * @Scope注解可以指定作用域，它可以和@Component或@Bean一起使用。
     */
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

    @Bean("another")
    /*
     * Spring bean的默认作用域是singleton。
     */
    public CompactDisc another() {
        return new SgtPeppers();
    }

}
