<%@ page import="com.example.javaeetest.mysql.business.Message" %>
<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Messages</title>
</head>
<body>
<h2>Message List</h2>
<p><a href="/java_ee_test_war_exploded/create">Create new</a></p>
<table>
    <tr>
        <th>Description</th>
        <th>Number</th>
        <th></th>
    </tr>
    <%
        ArrayList<Message> messageList = (ArrayList<Message>) request.getAttribute("messageList");
        for (Message message : messageList) {
    %>
    <tr>
        <td><%= message.getDescription() %>
        </td>
        <td><%= message.getSomeNumber() %>
        </td>
        <td>
            <a href="/java_ee_test_war_exploded/edit?id=<%= message.getId() %>">Edit</a>
            <form method="post" action="/java_ee_test_war_exploded/delete" style="display:inline;">
                <input type="hidden" name="id" value="<%= message.getId() %>">
                <input type="submit" value="Delete">
            </form>
        </td>
    </tr>
    <% } %>
</table>
</body>
</html>