<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="scr" uri="http://www.springframework.org/security/tags"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>WELCOME SAYFASI HOSGELDINIZ</h1>

<scr:authorize access="Authenticated">

<c:url  var="logoutUrl" value="/logout" />
<form action="${logoutUrl }" method="POST">
	<input type="submit" value="Cikis Yap" />
	<input  type="hidden" name="${_csrf.parameterName }" value="${_csrf.token }" />
</form>

</scr:authorize>


<scr:authorize access="!Authenticated">
<a href="${pageContext.request.contextPath }/loginpage">Login</a><br/>
</scr:authorize>


<scr:authorize access="hasRole('ROLE_USER')">
<a href="${pageContext.request.contextPath }/search">Search</a><br/>
</scr:authorize>

<scr:authorize access="hasRole('ROLE_ADMIN')" >
<a href="${pageContext.request.contextPath }/newaccount">Register</a><br/>
</scr:authorize>

<scr:authorize access="hasRole('ROLE_ADMIN')">
	<a href="${pageContext.request.contextPath }/controlpage">Control Page</a>
</scr:authorize>

</body>
</html>