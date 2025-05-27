<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BT4: Tạo Form Góp Ý Cho Trang Web</title>
</head>
<body>
<form:form action="/submit" modelAttribute="feedback" method="post">
    <p><form:input path="name" placeholder="Nhập họ và tên..."/> *</p>
    <p><form:input path="phone" placeholder="Nhập số điện thoại..."/></p>
    <p><form:input path="address" placeholder="Nhập địa chỉ..."/></p>
    <p><form:textarea path="comment" placeholder="Nhập nội dung góp ý..."/> *</p>
    <p><input type="submit" value="Gửi góp ý"/></p>
</form:form>

<c:if test="${not empty error}">
    <p style="color:red">${error}</p>
</c:if>
</body>
</html>
