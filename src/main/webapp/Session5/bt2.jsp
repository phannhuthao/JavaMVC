<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>BT2: Tạo Form Nhập Dữ Liệu Sinh Viên</title>
</head>
<body>
<form action="bt2" method="post">
    <input type="text" name="name" placeholder="Nhap ten...">
    <input type="text" name="age" placeholder="Nhap tuoi...">
    <input type="text" name="address" placeholder="Nhap dia chi...">
    <input type="submit" value="Gui">
</form>

<form>
    <h1>Hiển Thị Thông Tin</h1>
    <p>Tên: ${name}</p>
    <p>Tuổi: ${age}</p>
    <p>Địa Chỉ: ${address}</p>
</form>
</body>
</html>
