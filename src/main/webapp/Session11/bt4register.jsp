<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Đăng ký người dùng</title>
  <style>
    .error {
      color: red;
      font-style: italic;
    }
    form {
      width: 400px;
      margin: 50px auto;
      padding: 20px;
      border: 1px solid #ccc;
      border-radius: 10px;
    }
    input {
      width: 100%;
      padding: 8px;
      margin-top: 6px;
      margin-bottom: 12px;
      box-sizing: border-box;
    }
    button {
      padding: 10px 20px;
      background-color: #4CAF50;
      border: none;
      color: white;
      font-weight: bold;
      border-radius: 5px;
      cursor: pointer;
    }
    h2 {
      text-align: center;
    }
  </style>
</head>
<body>

<h2>Đăng ký người dùng</h2>

<form:form modelAttribute="userRegister" method="post" action="/register">
  <label for="name">Tên:</label>
  <form:input path="name" id="name" />
  <form:errors path="name" cssClass="error" />

  <label for="email">Email:</label>
  <form:input path="email" id="email" />
  <form:errors path="email" cssClass="error" />

  <label for="password">Mật khẩu:</label>
  <form:password path="password" id="password" />
  <form:errors path="password" cssClass="error" />

  <button type="submit">Đăng ký</button>
</form:form>

</body>
</html>
