package com.huawei.nlz.springplayground.lifecycle.xmlconfig;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

@Slf4j
public class MyBeanPostProcessor implements BeanPostProcessor {

    public MyBeanPostProcessor() {
        super();
        if (log.isInfoEnabled()) {
            log.info("这是BeanPostProcessor实现类构造器！！");
        }
    }

    @Override
    public Object postProcessAfterInitialization(Object arg0, String arg1)
            throws BeansException {
        if (log.isInfoEnabled()) {
            log.info("BeanPostProcessor接口方法postProcessAfterInitialization对属性进行更改！");
        }
        return arg0;
    }

    @Override
    public Object postProcessBeforeInitialization(Object arg0, String arg1)
            throws BeansException {
        if (log.isInfoEnabled()) {
            log.info("BeanPostProcessor接口方法postProcessBeforeInitialization对属性进行更改！");
        }
        return arg0;
    }
}
