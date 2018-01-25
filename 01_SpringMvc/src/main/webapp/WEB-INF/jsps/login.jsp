<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>

	<form:form modelAttribute="usuario" action="/comprobarlogin" method="POST">
		<table>
			<tr>
				<td><spring:message code="usuario.usuario.nombre"></spring:message></td>
				<td><form:input path="login" /></td>
				<td><form:errors path="login"></form:errors></td>
				<td><spring:message code="usuario.usuario.password"></spring:message></td>
				<td><form:input path="passWord" /></td>
				<td><form:errors path="passWord"></form:errors></td>
			</tr>			
			<tr>
				<td colspan="2"><input type="submit" value="Login" /></td>
			</tr>
		</table>
	</form:form>
	
	
	<button type="button">Alta cliente</button>
	
	<button type="button">Alta Operador</button>
	
	
	
</body>
</html>