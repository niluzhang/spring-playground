/**
 * bean的作用域，包括：
 * 单例(singleton): 在整个应用中，只创建bean的一个实例。
 * 原型(prototype): 每次注入或者通过Spring应用上下文获取的时候，都会创建一个新的bean实例。
 * 会话(session): 在Web应用中，为每个会话创建一个bean实例。
 * 请求(request): 在Web应用中，为每个请求创建一个bean实例。
 */

package com.huawei.nlz.springplayground.ch3.scope;