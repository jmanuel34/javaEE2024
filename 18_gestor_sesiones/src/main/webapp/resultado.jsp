<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%int contadorSesion=(Integer)session.getAttribute("contadorSesion"); %>
	<%    
	 int contadorTotal = (Integer)request.getAttribute( "contadorTotal"); %> 
	<center>
		<h1>Has entrado <%=contadorSesion%> veces</h1>
		<br>
  	<h1>Total:  <%=contadorTotal%> veces</h1> 
		<a href="inicio.html">Volver</a>
	</center>
</body>
</html>