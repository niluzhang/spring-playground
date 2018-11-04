package com.huawei.nlz.springplayground.ch2.autowire.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("cdPlayer")
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    @Autowired
    /*
     * @Autowired注解告诉Spring当创建CDPlayer bean的时候，通过这个构造器来实例化并传入一个可设置给CompactDisc类型的bean。
     * 即@Autowired注解默认是按类型自动装配的(byType)。
     */
    public CDPlayer(CompactDisc cd) {
        System.out.println("enter CDPlayer's constructor: CDPlayer(CompactDisc).");
        this.cd = cd;
        System.out.println("leave CDPlayer's constructor: CDPlayer(CompactDisc).");
    }

    @Override
    public void play() {
        cd.play();
    }

}