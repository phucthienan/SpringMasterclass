package com.nguyenphucthienan.controller;

import com.nguyenphucthienan.service.RandomizerRequestScopeService;
import com.nguyenphucthienan.service.RandomizerSessionScopeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class ScopeController {
    @Autowired
    RandomizerRequestScopeService randomizerRequestScopeService;

    @Autowired
    RandomizerSessionScopeService randomizerSessionScopeService;

    @RequestMapping("/")
    public void getRandom(HttpServletResponse response) throws IOException {
        response.getWriter().write("Request scope \n");
        response.getWriter().write("Old number: " + randomizerRequestScopeService.getRandomNumber() + "\n");
        randomizerRequestScopeService.generateRandomNumber();
        response.getWriter().write("New number: " + randomizerRequestScopeService.getRandomNumber() + "\n");
        response.getWriter().write("Object referece: " + randomizerRequestScopeService + "\n");

        response.getWriter().write("Session scope \n");
        response.getWriter().write("Old number: " + randomizerSessionScopeService.getRandomNumber() + "\n");
        randomizerSessionScopeService.generateRandomNumber();
        response.getWriter().write("New number: " + randomizerSessionScopeService.getRandomNumber() + "\n");
        response.getWriter().write("Object referece: " + randomizerSessionScopeService + "\n");
    }
}
