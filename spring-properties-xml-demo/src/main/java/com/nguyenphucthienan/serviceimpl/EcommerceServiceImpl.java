package com.nguyenphucthienan.serviceimpl;

import com.nguyenphucthienan.service.BusinessService;

import java.util.Random;

public class EcommerceServiceImpl implements BusinessService {
    @Override
    public String offerService(String companyName) {
        Random random = new Random();
        String service = "\n As an Organization, " + companyName +
                " provides an outstanding Ecommerce platform." +
                "\nThe annual revenue exceeds " + random.nextInt(revenue) + " dollars";
        return service;
    }

    public void postConstruct() {
        System.out.println("ecommerceService: postConstruct called");
    }

    public void preDestroy() {
        System.out.println("ecommerceService: preDestroy called");
    }
}
