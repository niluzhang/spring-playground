package com.huawei.nlz.springplayground.ch3.runtimevalueinject;

import java.text.MessageFormat;

public class SgtPeppers implements CompactDisc {

    private String title;
    private String artist;

    public SgtPeppers(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println(MessageFormat.format("sgtPeppers play. title is {0}, artist is {1}.", title, artist));
    }

}
