package com.huawei.nlz.springplayground.beanwiring.xmlconfig.soundsystem;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    public CDPlayer(CompactDisc cd) {
        if (log.isInfoEnabled()) {
            log.info("enter CDPlayer's constructor: CDPlayer(CompactDisc).");
        }
        this.cd = cd;
        if (log.isInfoEnabled()) {
            log.info("leave CDPlayer's constructor: CDPlayer(CompactDisc).");
        }
    }

    @Override
    public void play() {
        cd.play();
    }

}
