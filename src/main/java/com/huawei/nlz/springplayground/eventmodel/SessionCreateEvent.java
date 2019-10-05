package com.huawei.nlz.springplayground.eventmodel;

import lombok.Data;
import org.springframework.context.ApplicationEvent;

/**
 * 该类代表我们的业务要处理的事件对象类。
 * 事件对象类需要继承org.springframework.context.ApplicationEvent。
 */
@Data
public class SessionCreateEvent extends ApplicationEvent {
    /**
     * 会话ID。
     */
    private String sessionId;

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public SessionCreateEvent(Object source) {
        super(source);
    }

    public SessionCreateEvent(Object source, String sessionId) {
        super(source);
        this.sessionId = sessionId;
    }
}
