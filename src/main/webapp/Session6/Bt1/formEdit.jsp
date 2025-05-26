<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Sửa sách</title></head>
<body>
<h2>Chỉnh Sửa Sách</h2>
<form action="${pageContext.request.contextPath}/books?action=update" method="post">
    <input type="hidden" name="id" value="${book.id}"/>
    Tiêu đề: <input type="text" name="title" value="${book.title}"/><br/>
    Tác giả: <input type="text" name="author" value="${book.author}"/><br/>
    Thể loại: <input type="text" name="category" value="${book.category}"/><br/>
    Số lượng: <input type="number" name="quantity" value="${book.quantity}"/><br/>
    <input type="submit" value="Cập nhật"/>
</form>
</body>
</html>
