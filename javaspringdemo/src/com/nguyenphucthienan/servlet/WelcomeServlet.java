package com.nguyenphucthienan.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. Create the data (model) and then add it to the request object
        String[] welcomeMessages = {"Hello", "Welcome to Java Spring"};
        request.setAttribute("welcomeMessages", welcomeMessages);

        // 2. Retrieve request dispatcher
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/welcome.jsp");

        // 3. Forward request to the view
        requestDispatcher.forward(request, response);
    }

}
