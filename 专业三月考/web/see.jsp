<%--
  Created by IntelliJ IDEA.
  User: Myc
  Date: 2020/9/3
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>所有信息</title>
</head>
<body>

<form method="post" action="ServletChaxun">
    <input type="text" value="请输入车次" name="trainname">
    <input type="text" value="请输入始发地" name="trainstart">
    <input type="text" value="请输入发车时间" name="begintime">
    <input type="submit" value="查询">
</form>
<table border="1" cellspacing="1" cellpadding="1">
    <tr>
        <td>车辆编号</td>
        <td>车次</td>
        <td>始发站/td>
        <td>终点站</td>
        <td>车辆类型</td>
        <td>发车世家</td>
        <td>终到时间</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${alist}" var="a">
        <tr>
            <td>${a.trainid}</td>
            <td>${a.trainname}</td>
            <td>${a.trainstart}</td>
            <td>${a.trainover}</td>
            <td>${a.typeid}</td>
            <td>${a.begintime}</td>
            <td>${a.endtime}</td>
            <td><a href="ServletByid?ids=${a.trainid}">修改</a>
                <a href="ServletDelete?ids=${a.trainid}">删除</a
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
