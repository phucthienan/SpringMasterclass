package com.nguyenphucthienan.servlet.demo;

import com.nguyenphucthienan.service.demo.WelcomeService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "/NewWelcomeServlet")
public class WelcomeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. Create the data (model) and then add it to the request object
        // Invoking business layer
        WelcomeService welcomeService = new WelcomeService();
        List<String> welcomeMessages = welcomeService.getWelcomeMessages("An");
        request.setAttribute("welcomeMessages", welcomeMessages);

        // 2. Retrieve request dispatcher
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/welcome.jsp");

        // 3. Forward request to the view
        requestDispatcher.forward(request, response);
    }

}
