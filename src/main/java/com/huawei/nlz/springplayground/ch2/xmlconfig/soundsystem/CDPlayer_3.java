package com.huawei.nlz.springplayground.ch2.xmlconfig.soundsystem;

public class CDPlayer_3 implements MediaPlayer {

    private CompactDisc cd;

    @Override
    public void play() {
        cd.play();
    }

    public void setCompactDisc(CompactDisc cd){
        System.out.println("enter CDPlayer_3's setCompactDisc(CompactDisc).");
        this.cd = cd;
        System.out.println("leave CDPlayer_3's setCompactDisc(CompactDisc).");
    }

}
