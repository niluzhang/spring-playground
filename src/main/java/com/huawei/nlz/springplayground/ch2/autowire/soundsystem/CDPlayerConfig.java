package com.huawei.nlz.springplayground.ch2.autowire.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration   //@Configuration注解表示这个类是一个配置类，这个类包含在Spring应用上下文中如何创建bean的细节。
@ComponentScan   //@ComponentScan注解表示启用组件扫描，默认扫描与配置类相同的包及其子包，这里就是：com.huawei.nlz.springplayground.ch2.autowire.soundsystem。
//@ComponentScan("com.huawei.nlz.springplayground.ch2.autowire.soundsystem")    //指定组件扫描的基本包。
//@ComponentScan(basePackages="com.huawei.nlz.springplayground.ch2.autowire.soundsystem")    //指定组件扫描的基本包。
//@ComponentScan(basePackages={"pkg1", "pkg2"})    //指定多个包作为组件扫描的基本包。
//@ComponentScan(basePackageClasses={SgtPeppers.class, CompactDisc.class})    //指定多个类所在的包作为组件扫描的基本包。
public class CDPlayerConfig {
}
