<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 01.11.2021
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Not permitted</title>
</head>
<body>
    <div>
        <div>
            <h3>You have no permission to access page </h3>
        </div>
        <form action="/logout" method="post">
            <input type="submit" value="Sing in as different user"/>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>
    </div>
</body>
</html>
