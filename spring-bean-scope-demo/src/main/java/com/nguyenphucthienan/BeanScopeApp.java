package com.nguyenphucthienan;

import com.nguyenphucthienan.domain.Organization;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {
    public static void main(String[] args) {
        // Create the application context (container)
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Create the bean
        Organization organization1 = (Organization) context.getBean("organization");
        Organization organization2 = (Organization) context.getBean("organization");
        organization2.setPostalCode("88888");

        // Print organization details
        System.out.println(organization1);
        System.out.println(organization2);
        if (organization1==organization2){
            System.out.println("Singleton scope test: organization1 and organization2 point to the same instance");
        } else {
            System.out.println("Both organization1 and organization2 are separate instances");
        }

        // Close the application context (container)
        ((ClassPathXmlApplicationContext) context).close();
    }
}
