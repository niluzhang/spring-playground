package com.huawei.nlz.springplayground.beanwiring.autowire.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("cdPlayer_3")
public class CDPlayer_3 implements MediaPlayer {

    @Autowired
    /*
     * @Autowired注解作用在属性上实现自动装配。根据类型装配，直接赋值给bean的属性，不调用setter。
     */
    private CompactDisc cd;

    @Override
    public void play() {
        cd.play();
    }

}
