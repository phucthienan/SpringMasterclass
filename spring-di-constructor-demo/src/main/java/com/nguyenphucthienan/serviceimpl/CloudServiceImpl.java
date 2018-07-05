package com.nguyenphucthienan.serviceimpl;

import com.nguyenphucthienan.service.BusinessService;

import java.util.Random;

public class CloudServiceImpl implements BusinessService {

    @Override
    public String offerService(String companyName) {
        Random random = new Random();
        String service = "\nAs an Organization, " + companyName + "" +
                " offer world class Cloud computing infrastrucure." +
                "\nThe annual income exceeds " + random.nextInt(revenue) + " dollars";
        return service;
    }
}
