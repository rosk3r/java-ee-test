package com.example.javaeetest;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "forwardServlet", value = "/forward")
public class ForwardServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        writer.println("<p><a href=\"forward.jsp\">JSP</a> - Forward to .jsp</p>");
        writer.println("<p><a href=\"hello\">SERVLET</a> - Forward to another Servlet</p>");
        writer.close();
    }
}