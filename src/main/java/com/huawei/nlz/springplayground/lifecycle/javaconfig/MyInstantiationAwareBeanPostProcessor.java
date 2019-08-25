package com.huawei.nlz.springplayground.lifecycle.javaconfig;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;
import org.springframework.stereotype.Component;

import java.beans.PropertyDescriptor;

@Slf4j
@Component
public class MyInstantiationAwareBeanPostProcessor extends
        InstantiationAwareBeanPostProcessorAdapter {

    public MyInstantiationAwareBeanPostProcessor() {
        super();
        if (log.isInfoEnabled()) {
            log.info("这是InstantiationAwareBeanPostProcessorAdapter实现类构造器！！");
        }
    }

    /**
     * 接口方法、实例化Bean之前调用
     *
     * @param beanClass
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInstantiation(Class beanClass,
                                                 String beanName) throws BeansException {
        if (log.isInfoEnabled()) {
            log.info("InstantiationAwareBeanPostProcessor调用postProcessBeforeInstantiation方法");
        }
        return null;
    }

    /**
     * 接口方法、实例化Bean之后调用
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
        if (log.isInfoEnabled()) {
            log.info("InstantiationAwareBeanPostProcessor调用postProcessAfterInitialization方法");
        }
        return bean;
    }

    /**
     * 接口方法、设置某个属性时调用
     *
     * @param pvs
     * @param pds
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs,
                                                    PropertyDescriptor[] pds, Object bean, String beanName)
            throws BeansException {
        if (log.isInfoEnabled()) {
            log.info("InstantiationAwareBeanPostProcessor调用postProcessPropertyValues方法");
        }
        return pvs;
    }
}
