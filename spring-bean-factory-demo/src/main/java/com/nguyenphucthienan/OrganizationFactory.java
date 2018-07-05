package com.nguyenphucthienan;

public class OrganizationFactory {
    public Organization getInstance(String companyName, int yearOfIncorporation) {
        System.out.println("Invoking the instance factory method");
        return new Organization(companyName, yearOfIncorporation);
    }
}
