<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<h2>Hello World!</h2>
<sf:form method="post" modelAttribute="user" action="/toJson">
    用户名:<sf:input path="username"/>
    密码:<sf:password path="password"/>
    <input type="submit" value="提交">
</sf:form>
</body>
</html>