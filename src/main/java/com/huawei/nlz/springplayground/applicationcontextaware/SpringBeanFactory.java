package com.huawei.nlz.springplayground.applicationcontextaware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanFactory implements ApplicationContextAware {
    private static ApplicationContext context;

    /**
     * 从Spring应用上下文中获取特定类型的bean
     *
     * @param c   类型的Class对象
     * @param <T> 类型
     * @return bean
     */
    public static <T> T getBean(Class<T> c) {
        return context.getBean(c);
    }

    /**
     * 从Spring应用上下文中获取指定名字的特定类型的bean
     *
     * @param name bean名字
     * @param c    类型的Class对象
     * @param <T>  类型
     * @return bean
     */
    public static <T> T getBean(String name, Class<T> c) {
        return context.getBean(name, c);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }
}
