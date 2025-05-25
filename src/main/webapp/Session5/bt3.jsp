<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BT3: Xử Lí Dữ Liệu Trong Servlet</title>
</head>
<body>
<form action="bt3" method="post">
    <input type="text" name="username" placeholder="Nhap ten...">
    <input type="number" name="age" placeholder="Nhap tuoi...">
    <input type="text" name="address" placeholder="Nhap dia chi">
    <input type="submit" value="Gui">
</form>

<h1>Hiển Thị Thông Tin Sinh Viên</h1>
<p>Tên: ${username}</p>
<p>Tuổi: ${age}</p>
<p>Địa Chỉ: ${address}</p>
</body>
</html>
