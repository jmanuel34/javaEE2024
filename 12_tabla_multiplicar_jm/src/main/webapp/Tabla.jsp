<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div><center>
	<table border=1>
	
		<%Integer numero = Integer.parseInt(request.getParameter("numero"));%>
		<%for (int i=1; i<=10; i++) { %>
			<tr><td> <%=numero %></td>
			<td>x</td>
			<td><%=i%></td>
			<td> = </td>
			<td><%=numero*i %></td>
		<%} %>
	
	</table>
	<a href='inicio.jsp'>Volver</a>
	</center>
</div>
</body>
</html>