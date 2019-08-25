package com.huawei.nlz.springplayground.lifecycle.xmlconfig;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Demo Spring Bean
 */
@Slf4j
public class Person implements BeanFactoryAware, BeanNameAware,
        InitializingBean, DisposableBean {

    private String name;
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

    public void setName(String name) {
        if (log.isInfoEnabled()) {
            log.info("【注入属性】注入属性name");
        }
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (log.isInfoEnabled()) {
            log.info("【注入属性】注入属性address");
        }
        this.address = address;
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
            log.info("ibleBean接口】调用DisposableBean.destroy()");
        }
    }

    /**
     * 通过<bean>的init-method属性指定的初始化方法
     */
    public void myInit() {
        if (log.isInfoEnabled()) {
            log.info("【init-method】调用<bean>的init-method属性指定的初始化方法");
        }
    }

    /**
     * 通过<bean>的destroy-method属性指定的初始化方法
     */
    public void myDestroy() {
        if (log.isInfoEnabled()) {
            log.info("【destroy-method】调用<bean>的destroy-method属性指定的初始化方法");
        }
    }
}
