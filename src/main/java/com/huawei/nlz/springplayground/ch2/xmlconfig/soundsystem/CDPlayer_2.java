package com.huawei.nlz.springplayground.ch2.xmlconfig.soundsystem;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CDPlayer_2 implements MediaPlayer {

    private CompactDisc cd;

    private String version;

    private String name;

    public CDPlayer_2(String version, String name, CompactDisc cd) {
        if (log.isInfoEnabled()) {
            log.info("enter CDPlayer_2's constructor: CDPlayer_2(String, String, CompactDisc).");
        }
        this.cd = cd;
        this.version = version;
        this.name = name;
        if (log.isInfoEnabled()) {
            log.info("leave CDPlayer_2's constructor: CDPlayer_2(String, String, CompactDisc).");
        }
    }

    @Override
    public void play() {
        if (log.isInfoEnabled()) {
            log.info(version);
            log.info(name);
        }
        cd.play();
    }

}
