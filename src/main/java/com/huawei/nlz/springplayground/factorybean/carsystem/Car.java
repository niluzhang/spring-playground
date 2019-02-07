package com.huawei.nlz.springplayground.factorybean.carsystem;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.text.MessageFormat;

@Data
@Slf4j
public class Car {
    private int maxSpeed;
    private String brand;
    private double price;

    public String getInfo() {
        return MessageFormat.format("brand is {0}, max speed is {1}, price is {2}.", brand, maxSpeed, price);
    }

    public void showInfo() {
        if (log.isInfoEnabled()) {
            log.info(getInfo());
        }
    }

}
