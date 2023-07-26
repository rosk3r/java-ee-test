package com.example.javaeetest;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "getParameterServlet", value = "/get-parameter")
public class GetParameterServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        String id = request.getParameter("id");

        writer.println("<h2>Id:" + id + "</h2>");

        writer.println("<html><body>");
        writer.println("<p><a href=\"index.jsp\">Go back</a> - Return to main page</p>");
        writer.println("</body></html>");
        writer.close();

    }

}