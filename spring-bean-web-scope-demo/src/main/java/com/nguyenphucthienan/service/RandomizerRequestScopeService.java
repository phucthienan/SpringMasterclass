package com.nguyenphucthienan.service;

public class RandomizerRequestScopeService {
    private int randomNumber = 5;

    public int getRandomNumber() {
        return randomNumber;
    }

    public void generateRandomNumber() {
        this.randomNumber = (int) (Math.random() * 9999);
    }
}
