<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <title>BT3 - Danh sách sản phẩm</title>
</head>
<body>
<h2>Thông tin sản phẩm mới</h2>
<table border="1">
  <thead>
  <tr>
    <th>Tên</th>
    <th>Số Lượng</th>
    <th>Giá</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach var="product" items="${products}">
    <tr>
      <td>${product.name}</td>
      <td>${product.quantity}</td>
      <td>${product.price}</td>
    </tr>
  </c:forEach>
  </tbody>
</table>
</body>
</html>
