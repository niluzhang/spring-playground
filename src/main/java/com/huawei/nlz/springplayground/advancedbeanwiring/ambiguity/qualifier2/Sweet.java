package com.huawei.nlz.springplayground.advancedbeanwiring.ambiguity.qualifier2;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface Sweet {
}
