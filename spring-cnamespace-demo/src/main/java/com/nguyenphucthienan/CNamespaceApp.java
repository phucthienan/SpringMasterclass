package com.nguyenphucthienan;

import com.nguyenphucthienan.domain.Organization;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CNamespaceApp {
    public static void main(String[] args) {
        // Create the application context (container)
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Create the bean
        Organization organization = (Organization) context.getBean("organization");

        // Print organization details
        System.out.println(organization);

        // Close the application context (container)
        ((ClassPathXmlApplicationContext) context).close();
    }
}
