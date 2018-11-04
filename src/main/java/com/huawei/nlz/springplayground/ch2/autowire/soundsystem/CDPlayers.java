package com.huawei.nlz.springplayground.ch2.autowire.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component("cdPlayers")
public class CDPlayers {

    /*
     * Spring按类型自动装配注入数组、集合、Map时，是把应用上下文中对应类型的bean装配进集合，而不是直接查找一个对应类型的集合然后注入。
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
