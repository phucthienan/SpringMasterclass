package com.nguyenphucthienan;

import com.nguyenphucthienan.domain.Organization;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiesWithAnnotationApp {
    public static void main(String[] args) {
        // Create the application context (container)
        ApplicationContext context = new AnnotationConfigApplicationContext(PropertyConfig.class);

        Organization organization = (Organization) context.getBean("organization");
        System.out.println(organization);
        System.out.println(organization.corporateSlogan());

        // Close the application context (container)
        ((AnnotationConfigApplicationContext) context).close();
    }
}
