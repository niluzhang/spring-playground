package com.huawei.nlz.springplayground.advancedbeanwiring.ambiguity.qualifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfig.class);

        MediaPlayer player = (MediaPlayer) context.getBean("cdPlayer");
        player.play();

        context.close();
    }
}
