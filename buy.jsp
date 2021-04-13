<%--
  Created by IntelliJ IDEA.
  User: jmlgf21
  Date: 2021/4/6
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>购物网站</title>
</head>
<body>
<center>
    <p style="color: red;font-size: 26px;font-family: 宋体;" align="center">请选择要选购的商品</p>
    <br>
    <br>
    <hr color="black">
    <form action="/myWeb/one" method="post" name="myform">
        <p>足球&nbsp; 66元
            <input type="checkbox" value="足球" name="item">
        <p>篮球&nbsp; 88元
            <input type="checkbox" value="篮球" name="item">
        </p>

        <input type="submit" value="加入并查看购物车">
        <br>
        <br>
    </form>
</center>
</body>
</html>
