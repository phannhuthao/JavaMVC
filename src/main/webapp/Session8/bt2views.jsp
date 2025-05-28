<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <title>BT2</title>
</head>
<body>
<h2>Danh sách sản phẩm</h2>
<table border="1">
  <thead>
  <tr>
    <th>ID</th>
    <th>Tên</th>
    <th>Giá</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach var="product" items="${products}">
    <tr>
      <td>${product.id}</td>
      <td>${product.name}</td>
      <td>${product.price}</td>
    </tr>
  </c:forEach>
  </tbody>
</table>
</body>
</html>
