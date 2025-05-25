<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <title>BT5: Thêm Chức Năng Xóa Sinh Viên</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      padding: 20px;
      background-color: #f4f4f4;
    }

    h2 {
      color: #333;
    }

    table {
      border-collapse: collapse;
      width: 100%;
      background-color: white;
      box-shadow: 0 0 10px rgba(0,0,0,0.1);
    }

    th, td {
      border: 1px solid #ddd;
      padding: 12px;
      text-align: left;
    }

    th {
      background-color: black;
      color: white;
    }

    tr:nth-child(even) {
      background-color: #f9f9f9;
    }

    form {
      margin: 0;
    }

    input[type="submit"] {
      padding: 8px 12px;
      border: none;
      cursor: pointer;
      font-weight: bold;
      border-radius: 4px;
    }

    input[value="Xóa"] {
      background-color: red;
      color: white;
    }

    input[value="Sửa"]:hover {
      background-color: #e0a800;
    }

    input[value="Cập nhật"] {
      background-color: #28a745;
      color: white;
    }

    input[value="Cập nhật"]:hover {
      background-color: #218838;
    }

    input[type="text"] {
      padding: 6px;
      margin: 4px;
      border-radius: 4px;
      border: 1px solid #ccc;
    }
  </style>
</head>
<body>

<h2>Danh sách sinh viên</h2>

<table>
  <thead>
  <tr>
    <th>Tên</th>
    <th>Tuổi</th>
    <th>Địa chỉ</th>
    <th>Chức năng</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach var="student" items="${students}" varStatus="status">
    <tr>
      <td>${student.name}</td>
      <td>${student.age}</td>
      <td>${student.address}</td>
      <td>
        <form action="bt5" method="post">
          <input type="hidden" name="deleteIndex" value="${status.index}">
          <input type="submit" value="Xóa">
        </form>
      </td>
    </tr>
  </c:forEach>
  </tbody>
</table>
</body>
</html>
