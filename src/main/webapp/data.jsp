<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Products</title>
</head>
<body>
<h2>Products List</h2>
<p><a href='<c:url value="/create" />'>Create new</a></p>
<table>
    <tr><th>Description</th><th>Number</th><th></th></tr>
    <c:forEach var="massage" items="${massageList}">
        <tr><td>${massage.name}</td>
            <td>${massage.price}</td>
            <td>
                <a href='<c:url value="/edit?id=${massage.id}" />'>Edit</a> |
                <form method="post" action='<c:url value="/delete" />' style="display:inline;">
                    <input type="hidden" name="id" value="${massage.id}">
                    <input type="submit" value="Delete">
                </form>
            </td></tr>
    </c:forEach>
</table>
</body>
</html>