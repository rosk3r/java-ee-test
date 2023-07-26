package com.example.javaeetest;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter writer = response.getWriter();
        writer.println("<html><body>");
        writer.println("<h1>" + message + "</h1>");
        writer.println("<p><a href=\"index.jsp\">Go back</a> - Return to main page</p>");
        writer.println("</body></html>");

        writer.close();
    }

    public void destroy() {
    }
}