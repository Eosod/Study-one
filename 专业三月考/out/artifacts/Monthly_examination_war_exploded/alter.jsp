<%--
  Created by IntelliJ IDEA.
  User: Myc
  Date: 2020/9/3
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改界面</title>
</head>
<body>
<form action="ServletAlter" method="post">
    <input type="hidden" value="${abyid.trainid}" name="trainid">
    车次<input type="text" value="${abyid.trainname}" name="trainname">
    始发站<input type="text" value="${abyid.trainstart}" name="trainstart">
    终点站<input type="text" value="${abyid.trainover}" name="trainover">
    车俩类型<input type="text" value="${abyid.typeid}" name="typeid">
    发车时间<input type="text" value="${abyid.begintime}" name="begintime">
    终到时间<input type="text" value="${abyid.endtime}" name="endtime">
    <input type="submit" name="保存">
</form>
</body>
</html>
