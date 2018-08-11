package com.huawei.nlz.springplayground.ch2.javaconfig.soundsystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfig.class);

        MediaPlayer player = (MediaPlayer) context.getBean("cdPlayer");
        player.play();

        MediaPlayer player2 = (MediaPlayer) context.getBean("cdPlayer_2");
        player2.play();

        context.close();
    }

}
