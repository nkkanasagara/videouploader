<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${title}</title>
<body>
<form:form action="register" method="POST" commandName="user">
	<div>
		<h1></h1>
		<table>
			<tr>
				<td style="text-align: right;">Email :</td>
				<td><form:input path="email" /></td>
			</tr>

			<tr>
				<td style="text-align: right;">User Id :</td>
				<td><form:input path="logInId" /></td>
			</tr>

			<tr>
				<td style="text-align: right;">Password :</td>
				<td><form:input path="password" /></td>
			</tr>

			<tr>
				<td colspan=2 style="text-align: center;"><input type="submit"
					name="action" value="Register" /></td>
			</tr>
		</table>
	</div>
</form:form>
</body>
</html>