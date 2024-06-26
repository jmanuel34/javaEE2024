<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="jakarta.tags.core" prefix="c" %>    
    
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" >
</head>
<body>
	<h2>Productos de ${param.categoria} </h2>
	<table border="1">
		<tr>
			<th>Nombre</th>
			<th>Precio</th>
		</tr>
			<c:forEach var "p" items ="${requesScope.productos}">
				<tr>
					<td>${p.nombre}</td>
					<td>${p.precio}</td>
					<td>${p.categoria}</td>
					
				</tr>
			</c:forEach>
	</table>
	<a href="inicio.html">Volver a home</a>
</body>
</html> 

