package com.example.javaeetest;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "redirectServlet", value = "/redirect")
public class RedirectServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        String path = "https://www.youtube.com/watch?v=dQw4w9WgXcQ";
        response.sendRedirect(path);
    }
}