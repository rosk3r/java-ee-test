<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit message</title>
</head>
<body>
<h3>Edit message</h3>
<form method="post">
    <input type="hidden" value="${message.id}" name="id"/>
    <label>Description</label><br>
    <input name="description" value="${message.description}"/><br><br>
    <label>SomeNumber</label><br>
    <input name="someNumber" value="${message.someNumber}" type="number"/><br><br>
    <input type="submit" value="Send"/>
</form>
</body>
</html>