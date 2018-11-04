package com.huawei.nlz.springplayground.ch4.simpleaop;

import org.springframework.aop.framework.ProxyFactory;

public class Main {

    public static void main(String[] args) {
        BusinessLogic biz = new BusinessLogic();
        ProxyFactory di = new ProxyFactory();
        di.addAdvice(new LoggerAdvice());
        di.setTarget(biz);
        BusinessLogic proxy = (BusinessLogic) di.getProxy();
        proxy.execute("set val 1");
    }

}
