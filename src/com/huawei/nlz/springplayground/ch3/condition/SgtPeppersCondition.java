package com.huawei.nlz.springplayground.ch3.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class SgtPeppersCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //返回true表示创建该bean，返回false表示不创建该bean。
        //你可以debug来查看ConditionContext和AnnotatedTypeMetadata的属性值。
        return true;
    }

}
