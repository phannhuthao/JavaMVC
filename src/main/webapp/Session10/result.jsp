<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Kết quả Upload</title>
</head>
<body>
<h2>${message}</h2>
<c:if test="${not empty fileName}">
    <p>Tên file đã tải lên: <strong>${fileName}</strong></p>
    <img src="file:///D:/uploads/${fileName}" width="200" />
</c:if>
</body>
</html>
