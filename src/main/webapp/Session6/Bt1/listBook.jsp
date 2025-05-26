<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Danh sách sách</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 40px;
            background-color: #f8f9fa;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            background-color: #ffffff;
            box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1);
        }

        th, td {
            padding: 12px 15px;
            border: 1px solid #dee2e6;
            text-align: center;
        }

        th {
            background-color: #343a40;
            color: #ffffff;
        }

        tr:nth-child(even) {
            background-color: #f1f1f1;
        }

        .action-btn {
            background-color: #007bff;
            color: white;
            padding: 6px 12px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 14px;
            margin-right: 5px;
        }

        .action-btn:hover {
            background-color: #0056b3;
        }

        .delete-btn {
            background-color: #dc3545;
        }

        .delete-btn:hover {
            background-color: #a71d2a;
        }

        .add-btn {
            margin-bottom: 15px;
            background-color: #28a745;
        }

        .add-btn:hover {
            background-color: #1e7e34;
        }
    </style>
</head>
<body>

<form action="${pageContext.request.contextPath}/books" method="get" style="margin-bottom: 20px;">
    <input type="hidden" name="action" value="add"/>
    <input type="submit" value="Thêm sach moi" class="action-btn add-btn"/>
</form>

<table>
    <thead>
    <tr>
        <th>Mã</th>
        <th>Tiêu đề</th>
        <th>Tác giả</th>
        <th>Thể loại</th>
        <th>Số lượng</th>
        <th>Chức năng</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${books}" var="book">
        <tr>
            <td><c:out value="${book.id}"/></td>
            <td><c:out value="${book.title}"/></td>
            <td><c:out value="${book.author}"/></td>
            <td><c:out value="${book.category}"/></td>
            <td><c:out value="${book.quantity}"/></td>
            <td>
                <form action="${pageContext.request.contextPath}/books" method="get" style="display:inline;">
                    <input type="hidden" name="action" value="edit"/>
                    <input type="hidden" name="id" value="${book.id}"/>
                    <input type="submit" value="Sửa" class="action-btn"/>
                </form>

                <form action="${pageContext.request.contextPath}/books" method="post" style="display:inline;">
                    <input type="hidden" name="action" value="delete"/>
                    <input type="hidden" name="id" value="${book.id}"/>
                    <input type="submit" value="Xóa" class="action-btn delete-btn"/>
                </form>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
