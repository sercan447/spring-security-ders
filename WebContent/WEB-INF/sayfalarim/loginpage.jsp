<%@ page language="java" contentType="text/html; charset=ISO-8859-9"
    pageEncoding="ISO-8859-9"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-9">
<title>Insert title here</title>
</head>
<body>

ozelleştirilmiş custom login


<form action="${pageContext.request.contextPath }/login" method="post">

<input type="hidden" name="${_csrf.parameterName }" value="${_csrf.token }" /> <br/>

Username : <input type="text" name="username" /> <br/>
Password :<input type="text" name="password" /> <br/>
Hatırla <input type="checkbox" name="remember_me" checked="checked" /> <br/>
<input type="submit" value="Giris yAP" /> <br/>
	
</form>

</body>
</html>