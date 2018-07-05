package com.nguyenphucthienan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.nguyenphucthienan.service.GenericWelcomeService;

import java.util.List;

@Controller
public class WelcomeController {

    @Autowired
    private GenericWelcomeService welcomeService;

    @RequestMapping("/")
    public String doWelcome(Model model) {
        // 1. Retrieving the processed data
        List<String> welcomeMessages = welcomeService.getWelcomeMessages("An");

        // 2. Add data to the model
        model.addAttribute("welcomeMessages", welcomeMessages);

        // 3. Return logical view name
        return "welcome";
    }
}
