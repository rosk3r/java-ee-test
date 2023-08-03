package com.example.javaeetest;

import com.example.javaeetest.mysql.business.JavaDB;
import com.example.javaeetest.mysql.business.Massage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "createServlet", value = "/create")
public class CreateServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/create.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            String description = request.getParameter("description");
            int someNumber = Integer.parseInt(request.getParameter("someNumber"));
            Massage massage = new Massage(description, someNumber);
            JavaDB.insert(massage);
            response.sendRedirect(request.getContextPath() + "/index");
        } catch (Exception ex) {

            getServletContext().getRequestDispatcher("/create.jsp").forward(request, response);
        }
    }

}
