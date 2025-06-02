<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Danh Sách Phim</title></head>
<body>
<h2>Danh Sách Phim Đang Chiếu</h2>
<table border="1">
    <tr>
        <th>Tiêu Đề</th>
        <th>Đạo Diễn</th>
        <th>Thể Loại</th>
        <th>Chi Tiết</th>
    </tr>
    <c:forEach var="movie" items="${movies}">
        <tr>
            <td>${movie.title}</td>
            <td>${movie.director}</td>
            <td>${movie.genre}</td>
            <td><a href="detailMovie?id=${movie.id}">Xem Chi Tiết</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
