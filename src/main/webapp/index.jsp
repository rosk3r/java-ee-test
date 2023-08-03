<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>
    <%
//        response.setContentType("text/html");
//        PrintWriter writer = response.getWriter();
//
//        String url = "jdbc:mysql://localhost/delivery";
//        String username = "root";
//        String password = "root";
//        Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
//        try (Connection connection = DriverManager.getConnection(url, username, password)) {
//            writer.println("Connection to ProductDB successful!");
//        }
    %>
    <%= "A test project to learn the basic functionality of java ee." %>
</h1>
<br/>
<p><a href="hello">Hello Servlet</a> - Simple Servlet</p>
<p><a href="get-parameter">Get Parameter Servlet</a> - Servlet with parameter (use: ?id=8)</p>
<p><a href="form.jsp">Form Servlet</a> - Servlet with a form to be filled in</p>
<p><a href="forward">Forward Servlet</a> - Servlet with forward menu</p>
<p><a href="redirect">Redirect Servlet</a> - Servlet with redirecting</p>
<p><a href="errorPage">Error Page</a> - Handling the 404 error</p>
<p><a href="exception">Exception Page</a> - Error when an exception occurs</p>
<p><a href="set">Cookies</a> - Set and Get Cookies page</p>
<p><a href="session">Session</a> - Session Servlet</p>
<p><a href="create">Create Servlet</a> - Start work with database</p>
<p><a href="index">Index Servlet</a> - Start work with database</p>
</body>
</html>