package com.nguyenphucthienan.service;

public class RandomizerSessionScopeService {
    private int randomNumber = 10;

    public int getRandomNumber() {
        return randomNumber;
    }

    public void generateRandomNumber() {
        this.randomNumber = (int) (Math.random() * 9999);
    }
}
