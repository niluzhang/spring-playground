package com.huawei.nlz.springplayground.beanwiring.mixed.assemblejavaconfig.soundsystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SoundSystemConfig.class);

        MediaPlayer player = (MediaPlayer) context.getBean("cdPlayer");
        player.play();

        context.close();
    }

}
