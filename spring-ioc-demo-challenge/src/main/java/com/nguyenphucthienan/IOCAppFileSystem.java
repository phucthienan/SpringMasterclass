package com.nguyenphucthienan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCAppFileSystem {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/beans.xml");

        City city = (City) context.getBean("city");

        city.printCityName();
    }
}
