<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Danh sách sách</title></head>
<body>
<h2>Danh sách Sách</h2>
<a href="${pageContext.request.contextPath}/books?action=add">Thêm sách mới</a>
<table border="1">
    <thead>
    <tr>
        <th>Mã</th>
        <th>Tiêu đề</th>
        <th>Tác giả</th>
        <th>Thể loại</th>
        <th>Số lượng</th>
        <th>Hành động</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${books}" var="book">
        <tr>
            <td><c:out value="${book.id}"/></td>
            <td><c:out value="${book.title}"/></td>
            <td><c:out value="${book.author}"/></td>
            <td><c:out value="${book.category}"/></td>
            <td><c:out value="${book.quantity}"/></td>
            <td>
                <a href="${pageContext.request.contextPath}/books?action=edit&id=${book.id}">Sửa</a>
                <form action="${pageContext.request.contextPath}/books?action=delete&id=${book.id}" method="post" style="display:inline;">
                    <input type="submit" value="Xóa"/>
                </form>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
