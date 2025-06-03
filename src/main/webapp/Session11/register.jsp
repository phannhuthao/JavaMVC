<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Đăng ký người dùng</title>
  <style>
    .error { color: red; }
  </style>
</head>
<body>
<h2>Form Đăng Ký</h2>
<form:form method="post" modelAttribute="userRegister">
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
    <form:label path="password">Mật khẩu:</form:label>
    <form:password path="password"/>
    <form:errors path="password" cssClass="error"/>
  </div>
  <div>
    <input type="submit" value="Đăng ký"/>
  </div>
</form:form>
</body>
</html>
