package com.huawei.nlz.springplayground.ch4.simpleaop;

/**
 * 业务逻辑类，它是被代理的目标对象。
 */
public class BusinessLogic {

    /**
     * 业务逻辑
     * @param cmd 指令
     */
    public void execute(String cmd){
        System.out.println("business logic start to deal with " + cmd);
    }

}
