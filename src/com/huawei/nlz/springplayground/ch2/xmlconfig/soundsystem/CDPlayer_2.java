package com.huawei.nlz.springplayground.ch2.xmlconfig.soundsystem;

public class CDPlayer_2 implements MediaPlayer {

    private CompactDisc cd;

    private String version;

    private String name;

    public CDPlayer_2(String version, String name, CompactDisc cd){
        System.out.println("enter CDPlayer_2's constructor: CDPlayer_2(String, String, CompactDisc).");
        this.cd = cd;
        this.version = version;
        this.name = name;
        System.out.println("leave CDPlayer_2's constructor: CDPlayer_2(String, String, CompactDisc).");
    }

    @Override
    public void play() {
        System.out.println(version);
        System.out.println(name);
        cd.play();
    }

}
