package com.huawei.nlz.springplayground.beanwiring.xmlconfig.soundsystem;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CDPlayer_3 implements MediaPlayer {

    private CompactDisc cd;

    @Override
    public void play() {
        cd.play();
    }

    public void setCompactDisc(CompactDisc cd) {
        if (log.isInfoEnabled()) {
            log.info("enter CDPlayer_3's setCompactDisc(CompactDisc).");
        }
        this.cd = cd;
        if (log.isInfoEnabled()) {
            log.info("leave CDPlayer_3's setCompactDisc(CompactDisc).");
        }
    }

}
