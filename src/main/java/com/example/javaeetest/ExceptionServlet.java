package com.example.javaeetest;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "exceptionServlet", value = "/exception")
public class ExceptionServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {

        int x = 0;
        int y = 8 / x;
    }
}