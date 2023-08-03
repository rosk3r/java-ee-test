<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Edit massage</title>
</head>
<body>
<h3>Edit massage</h3>
<form method="post">
  <input type="hidden" value="${massage.id}" name="id" />
  <label>Description</label><br>
  <input name="description" value="${massage.description}" /><br><br>
  <label>SomeNumber</label><br>
  <input name="someNumber" value="${massage.someNumber}" type="number"/><br><br>
  <input type="submit" value="Send" />
</form>
</body>
</html>