package com.huawei.nlz.springplayground.eventmodel;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 该类监听事件并完成对事件的处理。
 * 事件监听类需要实现org.springframework.context.ApplicationListener接口。
 */
@Component
@Slf4j
public class SessionCreateEventHandler implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof SessionCreateEvent) {
            handleSessionCreate((SessionCreateEvent) event);
        }
    }

    private void handleSessionCreate(SessionCreateEvent e) {
        if (log.isInfoEnabled()) {
            log.info("begin to process {}", JSON.toJSONString(e));
        }
    }
}
