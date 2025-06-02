<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Chi Tiết Phim</title></head>
<body>
<h2>Chi Tiết Phim</h2>
<table border="1">
    <tr><th>Tiêu Đề</th><td>${movie.title}</td></tr>
    <tr><th>Đạo Diễn</th><td>${movie.director}</td></tr>
    <tr><th>Thể Loại</th><td>${movie.genre}</td></tr>
    <tr><th>Mô Tả</th><td>${movie.description}</td></tr>
    <tr><th>Thời Gian</th><td>${movie.duration} phút</td></tr>
    <tr><th>Ngôn Ngữ</th><td>${movie.language}</td></tr>
</table>
<a href="home">Quay đi quay lại</a>
</body>
</html>
