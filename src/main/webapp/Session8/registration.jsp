<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Đăng Ký Người Dùng</title>
</head>
<body>
<h2>Form Đăng Ký</h2>
<form action="${pageContext.request.contextPath}/register" method="post">

  <label>Tên:</label><br>
  <input type="text" name="name" placeholder="Nhập tên..." value="${name}"><br>
  <span style="color:red">${errorName}</span><br>

  <label>Email:</label><br>
  <input type="text" name="email" placeholder="Nhập email..." value="${email}"><br>
  <span style="color:red">${errorEmail}</span><br>

  <label>Số điện thoại:</label><br>
  <input type="text" name="phone" placeholder="Nhập SĐT..." value="${phone}"><br>
  <span style="color:red">${errorPhone}</span><br><br>

  <input type="submit" value="Đăng ký">
</form>
</body>
</html>
