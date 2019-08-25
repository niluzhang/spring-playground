package com.huawei.nlz.springplayground.lifecycle.javaconfig;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Demo Spring Bean
 */
@Slf4j
@Component("demoPerson")
public class Person implements BeanFactoryAware, BeanNameAware,
        InitializingBean, DisposableBean {

    @Value("张三")
    private String name;
    @Value("广州")
    private String address;
    private int phone;

    private BeanFactory beanFactory;
    private String beanName;

    public Person() {
        if (log.isInfoEnabled()) {
            log.info("【构造器】调用Person的构造器实例化");
        }
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        if (log.isInfoEnabled()) {
            log.info("【注入属性】注入属性phone");
        }
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person [address=" + address + ", name=" + name + ", phone="
                + phone + "]";
    }

    /**
     * 这是BeanFactoryAware接口方法
     *
     * @param arg0
     * @throws BeansException
     */
    @Override
    public void setBeanFactory(BeanFactory arg0) throws BeansException {
        if (log.isInfoEnabled()) {
            log.info("【BeanFactoryAware接口】调用BeanFactoryAware.setBeanFactory()");
        }
        this.beanFactory = arg0;
    }

    /**
     * 这是BeanNameAware接口方法
     *
     * @param arg0
     */
    @Override
    public void setBeanName(String arg0) {
        if (log.isInfoEnabled()) {
            log.info("【BeanNameAware接口】调用BeanNameAware.setBeanName()");
        }
        this.beanName = arg0;
    }

    /**
     * 这是InitializingBean接口方法
     *
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        if (log.isInfoEnabled()) {
            log.info("【InitializingBean接口】调用InitializingBean.afterPropertiesSet()");
        }
    }

    /**
     * 这是DisposableBean接口方法
     *
     * @throws Exception
     */
    @Override
    public void destroy() throws Exception {
        if (log.isInfoEnabled()) {
            log.info("【DisposableBean接口】调用DisposableBean.destroy()");
        }
    }

    @PostConstruct
    public void myInit() {
        if (log.isInfoEnabled()) {
            log.info("【@PostConstruct】调用bean的@PostConstruct方法");
        }
    }

    @PreDestroy
    public void myDestroy() {
        if (log.isInfoEnabled()) {
            log.info("【@PreDestroy】调用bean的@PreDestory方法");
        }
    }
}
