<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>BT5: Trò chơi Oẳn Tù Tì</title>
</head>
<body>
<h1>Chọn Búa, Kéo hoặc Lá</h1>
<form action="gameBt5" method="post">
    <input type="radio" name="choiceUser" value="Búa" required> Búa<br>
    <input type="radio" name="choiceUser" value="Kéo"> Kéo<br>
    <input type="radio" name="choiceUser" value="Lá"> Lá<br>
    <button type="submit">Chơi</button>
</form>

<c:if test="${not empty choiceUser}">
    <h2>Kết Quả</h2>
    <p>Lựa chọn của bạn: ${choiceUser}</p>
    <p>Lựa chọn của máy: ${choiceMachine}</p>
    <p>Kết quả: ${winner}</p>
</c:if>
</body>
</html>
