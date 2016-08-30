<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/user_login.action" method="post">
    userName: <input type="text" name="user.userName" value="${user.userName}"><br/>
    password: <input type="password" name="user.password" value="${user.password}"><br/>
    <input type="submit" value="login" /><font color="red">${error}</font>
</form>
</body>
</html>
