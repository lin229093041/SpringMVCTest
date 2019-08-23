<%--
  Created by IntelliJ IDEA.
  User: tingzi
  Date: 2019/8/22
  Time: 0:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  $END$
    <form action="rony/testTwo.action">
<%--      <input type="text" name="fruits.name">--%>
<%--      <input type="text" name="fruits.price">--%>
<%--      <input type="text" name="list[0].name">--%>
<%--      <input type="text" name="list[0].price">--%>
      <input type="text" name="map['name']">
      <input type="text" name="map['price']">
      <input type="submit">
    </form>
  </body>
</html>
