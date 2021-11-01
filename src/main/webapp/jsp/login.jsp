
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form name="f" action="<c:url value= "/j_spring_security_check" />" method="post">
        <div>
            <div>
                <input type="text" name="j_name" placeholder="User Name">
            </div>
            <div>
                <input type="password" name="j_password" placeholder="Password">
            </div>
            <div>
                <input type="submit"value="Sing in">

            </div>
            <c:if test="${param.error ne null}">
                <div>Invalid user name or password</div>
            </c:if>

            <c:if test="${param.error ne null}">
                <div>You have been logged out</div>
            </c:if>
        </div>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
    </form>
</body>
</html>
