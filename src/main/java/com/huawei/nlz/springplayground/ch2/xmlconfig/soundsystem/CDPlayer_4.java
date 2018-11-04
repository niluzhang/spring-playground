package com.huawei.nlz.springplayground.ch2.xmlconfig.soundsystem;

public class CDPlayer_4 implements MediaPlayer {

    private CompactDisc cd;

    private String version;

    private String name;

    @Override
    public void play() {
        System.out.println(version);
        System.out.println(name);
        cd.play();
    }

    public void setCompactDisc(CompactDisc cd) {
        System.out.println("enter CDPlayer_4's setCompactDisc(CompactDisc).");
        this.cd = cd;
        System.out.println("leave CDPlayer_4's setCompactDisc(CompactDisc).");
    }

    public void setVersion(String v) {
        System.out.println("enter CDPlayer_4's setVersion(String).");
        this.version = v;
        System.out.println("leave CDPlayer_4's setVersion(String).");
    }

    public void setName(String name) {
        System.out.println("enter CDPlayer_4's setName(String).");
        this.name = name;
        System.out.println("leave CDPlayer_4's setName(String).");
    }

}
