package com.nguyenphucthienan;

import com.nguyenphucthienan.domain.Organization;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitDestroyApp {
    public static void main(String[] args) {
        // Create the application context (container)
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Create the bean
        Organization organization = (Organization) context.getBean("organization");

        // Invoke the company slogan via the bean
        System.out.println(organization.corporateSlogan());;

        // Print organization details
        System.out.println(organization);
        System.out.println(organization.corporateService());

        // Close the application context (container)
        ((ClassPathXmlApplicationContext) context).close();
    }
}
