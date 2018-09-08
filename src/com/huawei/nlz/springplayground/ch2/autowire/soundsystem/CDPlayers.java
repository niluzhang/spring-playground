package com.huawei.nlz.springplayground.ch2.autowire.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component("cdPlayers")
public class CDPlayers {

    /*
     * Spring自动装配数组、集合、Map时，是把同类型的元素数据装配进集合，而不是装配一个同类型的集合。
     */
    @Autowired
    private MediaPlayer[] mediaPlayerArr;

    @Autowired
    private List<MediaPlayer> mediaPlayerList;

    @Autowired
    private Map<String, MediaPlayer> mediaPlayerMap;

    @Autowired
    public void printInfo() {
        System.out.println(Arrays.toString(mediaPlayerArr));
        System.out.println(mediaPlayerList);
        System.out.println(mediaPlayerMap);
    }
}
