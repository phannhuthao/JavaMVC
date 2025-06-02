<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>BT3 - Đăng ký</title>
</head>
<body>

<h2>Đăng ký tài khoản</h2>
<form method="post" action="register">
    <input type="text" name="username" placeholder="Nhập tên..." required><br>
    <input type="text" name="password" placeholder="Nhập mật khẩu..." required><br>
    <input type="text" name="email" placeholder="Nhập email..." required><br>
    <input type="submit" value="Gửi">
</form>

<c:if test="${not empty account}">
    <h3>${message}</h3>
    <p><strong>Tên người dùng:</strong> ${account.username}</p>
    <p><strong>Email:</strong> ${account.email}</p>
</c:if>

</body>
</html>
