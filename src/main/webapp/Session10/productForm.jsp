<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>BT2 - Form sản phẩm</title>
</head>
<body>
<h2>Nhập thông tin sản phẩm</h2>
<form method="post" action="product">
    <input type="text" name="name" placeholder="Nhập tên vào..." required>
    <input type="number" name="price" placeholder="Nhập giá vào..." step="0.01" required>
    <input type="text" name="description" placeholder="Nhập mô tả vào..." required>
    <input type="submit" value="Gửi">
</form>

<c:if test="${not empty product}">
    <h2>Thông tin sản phẩm đã thêm</h2>
    <table border="1" cellpadding="5" cellspacing="0">
        <thead>
        <tr>
            <th>Tên</th>
            <th>Giá</th>
            <th>Mô Tả</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>${product.name}</td>
            <td>${product.price}</td>
            <td>${product.description}</td>
        </tr>
        </tbody>
    </table>
</c:if>
</body>
</html>
