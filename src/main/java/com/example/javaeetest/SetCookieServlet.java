package com.example.javaeetest;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "setCookieServlet", value = "/set")
public class SetCookieServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        response.addCookie(new Cookie("user", "Tom"));
        writer.println("Cookie is set");
        writer.println("<p><a href=\"get\">Get</a> - Get Cookies Servlet</p>");
        writer.close();

    }

}