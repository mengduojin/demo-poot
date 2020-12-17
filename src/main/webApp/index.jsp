<%--
  Created by IntelliJ IDEA.
  User: 孟多金
  Date: 2020/12/16
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<form method="get" action="/check.do">
<table align="center" border="2px">
<tr>
    <td>姓名：
    </td>
    <td><input type="text" id="sname" name="sname">
    </td>
</tr>
    <tr>
        <td>密码：
        </td>
        <td><input type="password" id="passwd" name="passwd">
        </td>
    </tr>
    <tr>
        <td colspan="2" align="center"><input type="submit" value="提交">
        </td>
    </tr>
</table>
</form>
</body>
</html>
