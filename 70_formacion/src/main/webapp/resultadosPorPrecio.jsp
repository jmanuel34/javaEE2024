<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="model.Curso,java.util.ArrayList"%>
<%@taglib uri="jakarta.tags.core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>Cursos cuyo precio maximo es ${param.precio}</p>
		<c:if test="${!empty requestScope.cursos}">
			<table border="1">
				<tr>
					<th>Nombre</th>
					<th>Duración</th>
					<th>Precio</th>
				</tr>
				<%--recuperamos el arraylist de cursos que está en un atributo de petición,
				lo recorremos y mostramos una fila por cada curso --%>
				<c:forEach var="c" items="${requestScope.cursos}">
					<tr>
						<td>${c.nombre}</td>
						<td>${c.duracion}</td>
						<td>${c.precio}</td>
					</tr>
				</c:forEach>
			</table>
		</c:if>
		<c:if test="${empty requestScope.cursos}">
			<h1>No hay cursos con ese criterio</h1>
		</c:if>
		<br>
		<a href="Controller?option=toMenu">volver</a>

</body>
</html>