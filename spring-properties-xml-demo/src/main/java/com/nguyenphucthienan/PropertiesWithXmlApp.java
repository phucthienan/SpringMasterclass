package com.nguyenphucthienan;

import com.nguyenphucthienan.domain.Organization;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiesWithXmlApp {
    public static void main(String[] args) {
        // Create the application context (container)
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Organization organization = (Organization) context.getBean("organization");
        System.out.println(organization);

        // Close the application context (container)
        ((ClassPathXmlApplicationContext) context).close();
    }
}
