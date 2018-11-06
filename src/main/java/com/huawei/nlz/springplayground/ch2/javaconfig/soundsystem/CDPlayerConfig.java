package com.huawei.nlz.springplayground.ch2.javaconfig.soundsystem;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration     // @Configuration注解表明这个类是一个配置类。
@Slf4j
public class CDPlayerConfig {

    @Bean
    /*
     * @Bean注解告诉Spring这个方法将会返回一个对象，这个对象要注册为Spring应用上下文中的bean。方法体包含产生bean实例的逻辑。
     * 默认情况下，通过@Bean注解生成的bean实例，其id与方法名一致，这里就是sgtPeppers。
     * @Bean(name="beanName")，可以指定bean的id。
     */
    public CompactDisc sgtPeppers() {
        if (log.isInfoEnabled()) {
            log.info("enter CDPlayerConfig's sgtPeppers().");
        }
        return new SgtPeppers();
    }

    @Bean
    /*
     * 本方法演示JavaConfig中实现bean装配。
     * sgtPeppers()方法上由于添加了@Bean注解，Spring会拦截所有对此方法的调用，直接返回该方法创建的bean，而不是实际进行调用。
     */
    public MediaPlayer cdPlayer() {
        if (log.isInfoEnabled()) {
            log.info("enter CDPlayerConfig's cdPlayer().");
        }
        return new CDPlayer(sgtPeppers());
    }

    @Bean
    /*
     * JavaConfig中装配bean的另一种方式。
     * 这里，当Spring调用cdPlayer_2创建bean的时候，它会自动装配一个CompactDisc到配置方法中。
     * 总结一下，@Bean注解作用的方法，如果带了参数，Spring在创建这个bean的时候对于依赖参数，走自动装配逻辑，按类型装配。
     */
    public MediaPlayer cdPlayer_2(CompactDisc cd) {
        if (log.isInfoEnabled()) {
            log.info("enter CDPlayerConfig's cdPlayer_2().");
        }
        return new CDPlayer(cd);
    }

}
