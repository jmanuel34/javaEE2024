<%@ page language="java" contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8" "%>
<%@taglib uri="jakarta.tags.core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:choose>
			<c:when test="${not empty param.resultado}">
				<table border="1">
	<!-- requestScope.resultado.tematica -->			
					<tr><th>url</th><th>Tematica</th><th>Descripcion</th><th></th></tr>
					<c:forEach var="pr" items="${param.resultado}">
						<tr>
							<td>${pr.url}</td>
							<td>${pr.tematica}</td>
							<td>${pr.descripcion}</td>
<!--  							<td><a href="doEliminarPorId?operation=${pr.nombre}">Eliminar</a></td>
-->
						</tr>
					
					</c:forEach>
				
				</table>
				
			
			</c:when>
			<c:otherwise>
				<h1>El carrito está vacío</h1>
			</c:otherwise>
		</c:choose>
	<a href="index.html">Volver</a>
</body>
</html>