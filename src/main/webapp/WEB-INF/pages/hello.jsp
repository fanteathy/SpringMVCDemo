<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<h2>Hello World!</h2>
<sf:form method="post" modelAttribute="user" action="/toJson">
	username:<sf:input path="username"/>
	password:<sf:password path="password"/>
	<input type="submit" value="submit">
</sf:form>
</body>
</html>