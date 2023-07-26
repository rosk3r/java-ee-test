package com.example.javaeetest;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "formServlet", value = "/form")
public class FormServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        String productName = request.getParameter("productName");
        String quantity = request.getParameter("quantity");
        String payment = request.getParameter("payment");
        String country = request.getParameter("country");
        String[] options = request.getParameterValues("options");

        writer.println("<p>Product name: " + productName + "</p>");
        writer.println("<p>Quantity: " + quantity + "</p>");
        writer.println("<p>Payment: " + payment + "</p>");
        writer.println("<p>Country: " + country + "</p>");
        writer.println("<h4>Options</h4>");
        for (String option : options)
            writer.println("<li>" + option + "</li>");
        writer.println("<p><a href=\"index.jsp\">Go back</a> - Return to main page</p>");
        writer.close();
    }
}