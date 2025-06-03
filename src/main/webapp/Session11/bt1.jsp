<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form Nhập Thông Tin</title>
</head>
<body>
<h2>Nhập thông tin người dùng</h2>
<form:form modelAttribute="user" method="post">
    <div>
        <form:label path="name">Tên:</form:label>
        <form:input path="name"/>
        <form:errors path="name" cssClass="error"/>
    </div>
    <div>
        <form:label path="email">Email:</form:label>
        <form:input path="email"/>
        <form:errors path="email" cssClass="error"/>
    </div>
    <div>
        <form:label path="phone">Số điện thoại:</form:label>
        <form:input path="phone"/>
        <form:errors path="phone" cssClass="error"/>
    </div>
    <div>
        <form:label path="password">Mật khẩu:</form:label>
        <form:password path="password"/>
        <form:errors path="password" cssClass="error"/>
    </div>
    <div>
        <form:label path="status">Trạng thái (true/false):</form:label>
        <form:input path="status"/>
        <form:errors path="status" cssClass="error"/>
    </div>
    <div>
        <input type="submit" value="Gửi"/>
    </div>
</form:form>
</body>
</html>
