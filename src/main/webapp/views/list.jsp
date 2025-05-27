<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Danh Sách Góp Ý</title></head>
<body>
<h2>Danh Sách Góp Ý</h2>
<table border="1">
  <thead>
  <tr>
    <th>Họ và Tên</th>
    <th>SĐT</th>
    <th>Địa Chỉ</th>
    <th>Nội Dung Góp Ý</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach var="fb" items="${feedbacks}">
    <tr>
      <td>${fb.name}</td>
      <td>${fb.phone}</td>
      <td>${fb.address}</td>
      <td>${fb.comment}</td>
    </tr>
  </c:forEach>
  </tbody>
</table>
<a href="/form">Gửi góp ý mới</a>
</body>
</html>
