package com.huawei.nlz.springplayground.ch2.mixed.assemblexmlconfig.soundsystem;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/huawei/nlz/springplayground/ch2/mixed/assemblexmlconfig/applicationContext.xml");

        MediaPlayer player = (MediaPlayer) context.getBean("cdPlayer");
        player.play();

        context.close();
    }

}
