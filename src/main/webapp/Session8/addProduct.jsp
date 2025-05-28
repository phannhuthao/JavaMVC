<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Thêm sản phẩm</title>
</head>
<body>
<h2>Thêm sản phẩm mới</h2>
<form method="post" action="/products/add">
  <label>Tên sản phẩm:</label>
  <input type="text" name="name" placeholder="Nhập tên..." required><br><br>

  <label>Số lượng:</label>
  <input type="number" name="quantity" placeholder="Nhập số lượng..." required><br><br>

  <label>Giá tiền:</label>
  <input type="number" name="price" placeholder="Nhập giá tiền..." required><br><br>

  <button type="submit">Thêm sản phẩm</button>
</form>
</body>
</html>
