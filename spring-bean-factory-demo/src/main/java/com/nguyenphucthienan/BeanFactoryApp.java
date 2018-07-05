package com.nguyenphucthienan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryApp {
    public static void main(String[] args) {
        // Create the application context (container)
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Create the bean
        Organization organization = (Organization) context.getBean("secondOrganization");

        // Invoke the company slogan via the bean
        organization.corporateSlogan();

        // Print organization details
        System.out.println(organization);

        // Close the application context (container)
        ((ClassPathXmlApplicationContext) context).close();
    }
}
