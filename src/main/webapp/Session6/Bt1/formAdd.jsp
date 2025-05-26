<html>
<head><title>Thêm sách</title></head>
<body>
<h2>Thêm Sách Mới</h2>
<form action="${pageContext.request.contextPath}/books?action=create" method="post">
    Tiêu đề: <input type="text" name="title"/><br/>
    Tác giả: <input type="text" name="author"/><br/>
    Thể loại: <input type="text" name="category"/><br/>
    Số lượng: <input type="number" name="quantity"/><br/>
    <input type="submit" value="Thêm"/>
</form>
</body>
</html>
