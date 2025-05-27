<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Kết Quả Góp Ý</title></head>
<body>
<h2>Thông Tin Góp Ý</h2>
<table border="1">
    <tr><th>Họ và Tên</th><td>${feedback.name}</td></tr>
    <tr><th>SĐT</th><td>${feedback.phone}</td></tr>
    <tr><th>Địa Chỉ</th><td>${feedback.address}</td></tr>
    <tr><th>Nội Dung Góp Ý</th><td>${feedback.comment}</td></tr>
</table>
<br/>
<a href="/list">Xem danh sách góp ý</a>
</body>
</html>
