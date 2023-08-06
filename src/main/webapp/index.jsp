<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>
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
<p><a href="index">Index Servlet</a> - Start work with database</p>
</body>
</html>