<%@ page language="java" contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8" import="java.util.List, model.Item"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%--
		recuperamos el atributo de petición ficha, y mostramos sus datos
	 --%>
	<%List<Item> items=(List<Item>)request.getAttribute("items"); %>
	<% for (Item i:items) {%>
		<h2>Tema: <%=i.getTema()%></h2>
		<h2>Direccion: <%=i.getDireccion()%></h2>
		<h2>Descripcion: <%=i.getDescripcion()%></h2>
	<%} %>
	<a href="login.html">Volver</a>
</body>
</html>