package com.huawei.nlz.springplayground.beanwiring.xmlconfig.soundsystem;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/huawei/nlz/springplayground/beanwiring/xmlconfig/applicationContext.xml");

        MediaPlayer player = (MediaPlayer) context.getBean("cdPlayer");
        player.play();

        MediaPlayer player2 = (MediaPlayer) context.getBean("cdPlayer_2");
        player2.play();

        MediaPlayer player3 = (MediaPlayer) context.getBean("cdPlayer_3");
        player3.play();

        MediaPlayer player4 = (MediaPlayer) context.getBean("cdPlayer_4");
        player4.play();

        context.close();
    }

}
