package com.huawei.nlz.springplayground.advancedbeanwiring.runtimevalueinject;

import lombok.extern.slf4j.Slf4j;

import java.text.MessageFormat;

@Slf4j
public class SgtPeppers implements CompactDisc {

    private String title;
    private String artist;

    public SgtPeppers(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public void play() {
        if (log.isInfoEnabled()) {
            log.info(MessageFormat.format("sgtPeppers play. title is {0}, artist is {1}.", title, artist));
        }
    }

}
