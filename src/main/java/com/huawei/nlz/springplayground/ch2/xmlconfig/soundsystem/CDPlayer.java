package com.huawei.nlz.springplayground.ch2.xmlconfig.soundsystem;

public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    public CDPlayer(CompactDisc cd) {
        System.out.println("enter CDPlayer's constructor: CDPlayer(CompactDisc).");
        this.cd = cd;
        System.out.println("leave CDPlayer's constructor: CDPlayer(CompactDisc).");
    }

    @Override
    public void play() {
        cd.play();
    }

}
