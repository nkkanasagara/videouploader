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
</head>
<body>
<%-- 	<form:form action="login" method="POST" commandName="user">
 --%>		<div>
			<h1></h1>
			<table>
				<tr>
					<td style="text-align: right;">User Id :</td>
					<td><input type="text" name="uid" /></td>
				</tr>

				<tr>
					<td style="text-align: right;">Password :</td>
					<td><input  type="text" name="password" /></td>
				</tr>

				<tr>
					<td colspan=2 style="text-align: center;"><input type="submit"
						name="action" value="Log In" /></td>
				</tr>

				<tr>
					<td colspan=2 style="text-align: center;"><a
						href="${contextRoot}/registerpage">Not Registered? - click here to
							Register</a></td>

				</tr>
				<tr>
					<td colspan=2 style="text-align: center;"><a
						href="${contextRoot}/forgetpass">Forgot username or password?</a></td>
				</tr>
			</table>
		</div>
<%-- 	</form:form>
 --%></body>
</html>