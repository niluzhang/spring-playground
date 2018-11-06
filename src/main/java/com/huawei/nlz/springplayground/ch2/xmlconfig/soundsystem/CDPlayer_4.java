package com.huawei.nlz.springplayground.ch2.xmlconfig.soundsystem;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CDPlayer_4 implements MediaPlayer {

    private CompactDisc cd;

    private String version;

    private String name;

    @Override
    public void play() {
        if (log.isInfoEnabled()) {
            log.info(version);
            log.info(name);
        }
        cd.play();
    }

    public void setCompactDisc(CompactDisc cd) {
        if (log.isInfoEnabled()) {
            log.info("enter CDPlayer_4's setCompactDisc(CompactDisc).");
        }
        this.cd = cd;
        if (log.isInfoEnabled()) {
            log.info("leave CDPlayer_4's setCompactDisc(CompactDisc).");
        }
    }

    public void setVersion(String v) {
        if (log.isInfoEnabled()) {
            log.info("enter CDPlayer_4's setVersion(String).");
        }
        this.version = v;
        if (log.isInfoEnabled()) {
            log.info("leave CDPlayer_4's setVersion(String).");
        }
    }

    public void setName(String name) {
        if (log.isInfoEnabled()) {
            log.info("enter CDPlayer_4's setName(String).");
        }
        this.name = name;
        if (log.isInfoEnabled()) {
            log.info("leave CDPlayer_4's setName(String).");
        }
    }

}
