package com.example.javaeetest;

import com.example.javaeetest.logic.Person;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "sessionServlet", value = "/session")
public class SessionServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        HttpSession session = request.getSession();
        Person tom = (Person) session.getAttribute("person");

        PrintWriter writer = response.getWriter();

        if (tom == null) {

            tom = new Person("Tom", 34);
            session.setAttribute("person", tom);
            writer.println("Session data are set");
        } else {
            writer.println("Name: " + tom.getName() + " Age: " + tom.getAge());
            session.removeAttribute("person");
        }

        writer.close();
    }
}