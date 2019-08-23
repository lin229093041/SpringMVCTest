<%--
  Created by IntelliJ IDEA.
  User: tingzi
  Date: 2019/8/22
  Time: 1:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1">
        <tr>
            <th>水果名</th>
            <th>水果价格</th>
            <th>水果产地</th>
        </tr>
        <c:forEach items="${fruitsList}" var="fruits">
            <tr>
                <td>${fruits.name}</td>
                <td>${fruits.price}</td>
                <td>${fruits.producing_area}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
