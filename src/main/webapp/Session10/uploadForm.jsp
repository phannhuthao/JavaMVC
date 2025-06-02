<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BT4 - Upload Avatar</title>
</head>
<body>
<h2>Upload ảnh đại diện</h2>
<form action="/upload" method="post" enctype="multipart/form-data">
    <input type="text" name="username" placeholder="Nhập tên..." required><br>
    <input type="file" name="avatar" required><br>
    <input type="submit" value="Tải lên">
</form>
</body>
</html>
