package com.huawei.nlz.springplayground.ch2.autowire.soundsystem;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component  //@Component注解表明该类会作为组件类，并告知Spring要为这个类创建bean。bean id为首字母小写的类名。
//@Component("sgtPeppers")     //给bean指定id为sgtPeppers。
@Slf4j
public class SgtPeppers implements CompactDisc {

    /*
     * private SgtPeppers(){}       //这边如果给Bean类添加私有的构造器，Spring也依然能实例化bean成功。
     */

    @Override
    public void play() {
        if (log.isInfoEnabled()) {
            log.info("sgtPeppers play.");
        }
    }

}
