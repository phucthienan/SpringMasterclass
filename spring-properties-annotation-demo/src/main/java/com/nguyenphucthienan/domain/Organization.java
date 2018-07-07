package com.nguyenphucthienan.domain;

import com.nguyenphucthienan.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component("organization")
public class Organization {
    @Value("${companyName}")
    private String companyName;

    @Value("${startUpYear}")
    private int yearOfIncorporation;

    @Value("${postalCode}")
    private String postalCode;

    @Value("${employeeCount:9000}")
    private int employeeCount;

    @Value("${corporateSlogan}")
    private String slogan;

    private String missionStatement;

    @Autowired
    private Environment environment;

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
        missionStatement = environment.getProperty("statement");
        return missionStatement + " and also " + slogan;
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
        System.out.println("organization: setPostalCode called");
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
        System.out.println("organization: setEmployeeCount called");
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
        System.out.println("organization: setSlogan called");
    }

    public void setBusinessService(BusinessService businessService) {
        this.businessService = businessService;
        System.out.println("organization: setBusinessService called");
    }
}
