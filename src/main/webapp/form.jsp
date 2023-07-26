<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Form</title>
</head>
<body>
<label>
    <form action="form" method="POST">
        Product name: <input name="productName"/>
        <br><br>
        Quantity: <input name="quantity"/>
        <br><br>
        Payment: <input type="radio" name="payment" value="Upon receipt" checked/>Upon receipt
        <input type="radio" name="payment" value="Online"/>Online
        <br><br>
        Country: <select name="country">
        <option>Canada</option>
        <option>Spain</option>
        <option>France</option>
        <option>Germany</option>
    </select>
        <br><br>
        Options:

        <input type="checkbox" name="options" value="Delivery" checked/>Delivery
        <input type="checkbox" name="options" value="Warranty" checked/>Warranty
        <br><br>
        <input type="submit" value="Submit"/>
    </form>
</label>
</body>
</html>