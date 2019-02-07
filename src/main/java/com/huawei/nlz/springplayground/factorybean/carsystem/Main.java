package com.huawei.nlz.springplayground.factorybean.carsystem;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        /*
         * 调用getBean("car")时，Spring通过反射机制发现CarFactory实现了FactoryBean接口，这时Spring容器就调用
         * CarFactory#getObject()方法返回。如果希望获取CarFactory实例，则在调用getBean(beanName)时在beanName前面
         * 加上&前缀，即getBean("&car")。
         */
        Car car = (Car) context.getBean("car");
        car.showInfo();

        context.close();
    }

}
