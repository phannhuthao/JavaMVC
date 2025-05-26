<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Trang Đăng Ký</title>
</head>
<body>
<form action="register" method="post">
    <input type="text" name="username" placeholder="Nhập username vào...">
    <input type="password" name="password" placeholder="Nhập password vào...">
    <input type="text" name="email" placeholder="Nhập email vào...">
    <input type="number" name="phone" placeholder="Nhập phone vào...">
    <input type="submit" value="Đăng ký">
</form>
<% if (request.getAttribute("error") != null) { %>
<p style="color:red;"><%= request.getAttribute("error") %></p>
<% } %>
</body>
</html>
