package com.nguyenphucthienan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCApp {
    public static void main(String[] args) {
        // Create the application context (container)
        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");

        // Create the bean
        Organization organization = (Organization) context.getBean("organization");

        // Invoke the company slogan via the bean
        organization.corporateSlogan();

        // Close the application context (container)
        ((FileSystemXmlApplicationContext) context).close();
    }
}
