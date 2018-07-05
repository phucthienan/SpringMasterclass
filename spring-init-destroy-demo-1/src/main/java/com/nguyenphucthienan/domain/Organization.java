package com.nguyenphucthienan.domain;

import com.nguyenphucthienan.service.BusinessService;

public class Organization {
    private String companyName;
    private int yearOfIncorporation;
    private String postalCode;
    private int employeeCount;
    private String slogan;
    private BusinessService businessService;

    public Organization() {
        System.out.println("default constructor called");
    }

    public Organization(String companyName, int yearOfIncorporation) {
        this.companyName = companyName;
        this.yearOfIncorporation = yearOfIncorporation;
        System.out.println("constructor called");
    }

    public void initialize() {
        System.out.println("organization: initialize called");
    }

    public void destroy() {
        System.out.println("organization: destroy called");
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
                '}';
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        System.out.println("setPostalCode called");
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
        System.out.println("setEmployeeCount called");
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
        System.out.println("setSlogan called");
    }

    public void setBusinessService(BusinessService businessService) {
        this.businessService = businessService;
        System.out.println("setBusinessService called");
    }
}
