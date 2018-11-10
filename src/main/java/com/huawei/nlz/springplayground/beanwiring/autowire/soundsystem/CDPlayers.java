package com.huawei.nlz.springplayground.beanwiring.autowire.soundsystem;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component("cdPlayers")
@Slf4j
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
        if (log.isInfoEnabled()) {
            log.info(Arrays.toString(mediaPlayerArr));
            log.info(String.valueOf(mediaPlayerList));
            log.info(String.valueOf(mediaPlayerMap));
        }
    }
}
