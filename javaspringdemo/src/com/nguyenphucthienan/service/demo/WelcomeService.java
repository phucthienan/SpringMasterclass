package com.nguyenphucthienan.service.demo;

import java.util.ArrayList;
import java.util.List;

public class WelcomeService {
    public List<String> getWelcomeMessages(String name) {
        List<String> welcomeMessages = new ArrayList<>();

        welcomeMessages.add("Hello, ");
        welcomeMessages.add(name);
        welcomeMessages.add(" welcome to Spring framework");

        return welcomeMessages;
    }
}
