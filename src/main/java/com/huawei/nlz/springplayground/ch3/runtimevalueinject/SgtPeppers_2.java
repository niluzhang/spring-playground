package com.huawei.nlz.springplayground.ch3.runtimevalueinject;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;

@Component("compactDisc_2")
@Slf4j
public class SgtPeppers_2 implements CompactDisc {

    private String title;
    private String artist;

    /*
     * @Value注解可以用在字段、方法参数、构造器参数等上，将SpEL或者属性占位符的结果注入给目标。
     * 与@Autowired注解非常相似。
     */
    public SgtPeppers_2(@Value("${disc.title2}") String title, @Value("${disc.artist2}") String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public void play() {
        if (log.isInfoEnabled()) {
            log.info(MessageFormat.format("sgtPeppers_2 play. title is {0}, artist is {1}.", title, artist));
        }
    }

}
