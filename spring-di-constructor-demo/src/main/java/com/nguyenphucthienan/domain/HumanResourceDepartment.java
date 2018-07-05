package com.nguyenphucthienan.domain;

import com.nguyenphucthienan.service.RecruimentService;

public class HumanResourceDepartment implements Department {
    private String departmentName;
    private RecruimentService recruimentService;
    private Organization organization;

    public HumanResourceDepartment(RecruimentService recruimentService, Organization organization) {
        this.recruimentService = recruimentService;
        this.organization = organization;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String hiringStatus(int numberOfRecruitments) {
        String hiringFacts = recruimentService.recruitEmployees(organization.getCompanyName(),
                departmentName, numberOfRecruitments);
        return hiringFacts;
    }
}
