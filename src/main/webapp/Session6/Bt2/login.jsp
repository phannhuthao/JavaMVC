
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Trang Đăng Nhập</title>
</head>
<body>
<form action="login" method="post">
    <input type="text" name="email" placeholder="Nhập email vào...">
    <input type="password" name="password" placeholder="Nhập password vào...">
    <input type="submit" value="Đăng nhập">
</form>
<% if (request.getAttribute("error") != null) { %>
<p style="color:red;"><%= request.getAttribute("error") %></p>
<% } %>
</body>
</html>
