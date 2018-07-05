package com.nguyenphucthienan.domain;

public class Organization {
    private String companyName;
    private int yearOfIncorporation;

    // public Organization() {
    // }

    public Organization(String companyName, int yearOfIncorporation) {
        this.companyName = companyName;
        this.yearOfIncorporation = yearOfIncorporation;
    }

    public void corporateSlogan() {
        String slogan = "My Slogan";
        System.out.println(slogan);
    }

    @Override
    public String toString() {
        return "Organization{" +
                "companyName='" + companyName + '\'' +
                ", yearOfIncorporation=" + yearOfIncorporation +
                '}';
    }
}