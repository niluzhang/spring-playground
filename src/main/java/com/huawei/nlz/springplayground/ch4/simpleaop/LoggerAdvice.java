package com.huawei.nlz.springplayground.ch4.simpleaop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 日志通知类，用于打印方法的入参。
 */
public class LoggerAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        before(invocation);
        invocation.proceed();
        return null;
    }

    /*
     * 前置通知。
     */
    private void before(MethodInvocation invocation) {
        Object[] args = invocation.getArguments();
        for (Object arg : args) {
            System.out.print(arg + " ");
        }
        System.out.println();
    }

}
