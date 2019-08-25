package com.huawei.nlz.springplayground.aop.simpleaop;

import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.Arrays;

/**
 * 日志通知类，用于打印方法的入参。
 */
@Slf4j
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
        if (log.isInfoEnabled()) {
            log.info(Arrays.asList(args).toString());
        }
    }

}
