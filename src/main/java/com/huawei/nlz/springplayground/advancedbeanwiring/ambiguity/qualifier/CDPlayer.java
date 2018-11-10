package com.huawei.nlz.springplayground.advancedbeanwiring.ambiguity.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("cdPlayer")
public class CDPlayer implements MediaPlayer {
    @Autowired
    @Qualifier("new")
    /*
     * @Qualifier注解可以和@Autowired或@Inject注解一起使用，指定在注入的时候想要注入的bean。
     */
    private CompactDisc cd;

    @Override
    public void play() {
        cd.play();
    }
}
