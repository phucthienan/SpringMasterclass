package com.nguyenphucthienan.service;

import java.util.ArrayList;
import java.util.List;

public class WelcomeService implements GenericWelcomeService {
    public List<String> getWelcomeMessages(String name) {
        List<String> welcomeMessages = new ArrayList<>();

        welcomeMessages.add("Hello ");
        welcomeMessages.add(name);
        welcomeMessages.add(", welcome to Spring framework");

        return welcomeMessages;
    }
}
