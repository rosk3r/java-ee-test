package com.example.javaeetest;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.javaeetest.mysql.business.JavaDB;
import com.example.javaeetest.mysql.business.Massage;

@WebServlet("/index")
public class IndexServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ArrayList<Massage> massageList = JavaDB.select();
        request.setAttribute("massageList", massageList);

        getServletContext().getRequestDispatcher("/data.jsp").forward(request, response);
    }
}