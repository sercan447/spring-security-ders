<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="${pageContext.request.contextPath }/createaccount" method="POST">
<input  type="hidden" name="${_csrf.parameterName }"  value="${_csrf.token }"/>
<table>
	
	<tr>
	<td>Username : </td>
	<td> <input type="text" name="username" /> </td>
	</tr>
	
	<tr>
	<td>Email : </td>
	<td> <input type="text" name="email" /></td>
	</tr>
	
	<tr>
	<td>Password</td>
	<td><input type="text" name="password" /></td>
	</tr>
	
	<tr>
	<td>COnfirm Password</td>
	<td><input type="text" name="confirmpassword" /></td>
	</tr>
	
	<tr>
	<td></td>
	<td><input type="submit" value="Signup" /></td>
	</tr>
</table>
</form>



</body>
</html>