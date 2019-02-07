package com.huawei.nlz.springplayground.factorybean.carsystem;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.FactoryBean;

@Slf4j
/*
 * 使用Spring FactoryBean需要实现FactoryBean接口，实现它的getObject()、getObjectType()、isSingleton()方法。
 */
public class CarFactory implements FactoryBean<Car> {

    private String carInfo;

    public String getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(String carInfo) {
        this.carInfo = carInfo;
    }

    @Override
    /*
     * getObject()方法返回由FactoryBean创建的bean的实例，如果isSingleton()返回true，则该实例还会放入Spring容器中的单实例缓存池中。
     */
    public Car getObject() throws Exception {
        Car car = new Car();
        String[] infs = carInfo.split(",");
        car.setBrand(infs[0]);
        car.setMaxSpeed(Integer.parseInt(infs[1]));
        car.setPrice(Double.parseDouble(infs[2]));
        return car;
    }

    @Override
    /*
     * 返回FactoryBean创建的bean的类型。
     */
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    /*
     * 返回由FactoryBean创建的bean实例的作用域是singleton还是prototype。
     */
    public boolean isSingleton() {
        return false;
    }

}
