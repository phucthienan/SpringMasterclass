package com.nguyenphucthienan.domain;

import com.nguyenphucthienan.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Organization {
    private String companyName;
    private int yearOfIncorporation;

    @Value("${org.postalCode}")
    private String postalCode;
    private int employeeCount;
    private String slogan;
    private BusinessService businessService;

    public Organization() {
        System.out.println("organization: default constructor called");
    }

    public Organization(String companyName, int yearOfIncorporation) {
        this.companyName = companyName;
        this.yearOfIncorporation = yearOfIncorporation;
        System.out.println("organization: constructor called");
    }

    public void postConstruct() {
        System.out.println("organization: postConstruct called");
    }

    public void preDestroy() {
        System.out.println("organization: preDestroy called");
    }

    public String corporateSlogan() {
        return slogan;
    }

    public String corporateService() {
        return businessService.offerService(companyName);
    }

    @Override
    public String toString() {
        return "Organization{" +
                "companyName='" + companyName + '\'' +
                ", yearOfIncorporation=" + yearOfIncorporation +
                ", postalCode='" + postalCode + '\'' +
                ", employeeCount=" + employeeCount +
                ", slogan='" + slogan + '\'' +
                '}';
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        System.out.println("organization: setPostalCode called");
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
        System.out.println("organization: setEmployeeCount called");
    }

    // @Value("${org.slogan}")
    // public void setSlogan(String slogan) {
    //     this.slogan = slogan;
    //     System.out.println("organization: setSlogan called");
    // }

    @Autowired
    public void setSlogan(@Value("${org.slogan}") String slogan) {
        this.slogan = slogan;
        System.out.println("organization: setSlogan called");
    }

    public void setBusinessService(BusinessService businessService) {
        this.businessService = businessService;
        System.out.println("organization: setBusinessService called");
    }
}
