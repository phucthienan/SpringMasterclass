package com.nguyenphucthienan;

import com.nguyenphucthienan.domain.promotion.TradeFair;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiesWithAnnotationApp {
    public static void main(String[] args) {
        // Create the application context (container)
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        TradeFair tradeFair = (TradeFair) context.getBean("tradeFair");
        System.out.println(tradeFair.specialPromotionPricing());

        // Close the application context (container)
        ((ClassPathXmlApplicationContext) context).close();
    }
}
