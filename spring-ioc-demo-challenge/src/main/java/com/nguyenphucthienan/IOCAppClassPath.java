package com.nguyenphucthienan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCAppClassPath {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        City city = (City) context.getBean("city");

        city.printCityName();
    }
}
