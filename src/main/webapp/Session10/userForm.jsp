<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Nhập Thông Tin Người Dùng</title>
</head>
<body>
<h2>Nhập thông tin cá nhân</h2>
<form action="user" method="post">
    <input type="text" name="name" placeholder="Nhập tên vào..." required><br>
    <input type="number" name="age" placeholder="Nhập tuổi vào..." required><br>
    <input type="text" name="address" placeholder="Nhập địa chỉ vào..." required><br>
    <input type="submit" value="Gửi">
</form>
</body>
</html>
