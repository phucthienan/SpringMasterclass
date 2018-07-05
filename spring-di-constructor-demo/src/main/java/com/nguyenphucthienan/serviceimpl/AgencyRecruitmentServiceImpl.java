package com.nguyenphucthienan.serviceimpl;

import com.nguyenphucthienan.service.RecruimentService;

import java.util.Random;

public class AgencyRecruitmentServiceImpl implements RecruimentService {
    @Override
    public String recruitEmployees(String companyName, String departmentName, int numberOfRecruitments) {
        Random random = new Random();
        String hiringFacts = "\n" + companyName + "'s " + departmentName
                + " hired " + random.nextInt(numberOfRecruitments)
                + " employees using various hiring agencies.";
        return hiringFacts;
    }
}
