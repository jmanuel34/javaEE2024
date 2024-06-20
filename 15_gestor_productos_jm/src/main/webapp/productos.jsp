<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List,model.Producto"%>
<html>
<head>
    <title>Lista de Productos</title>
     <link rel="stylesheet" href="styles.css">
</head>
<body>
    <h1>Lista de Productos</h1>
    <%List<Producto> productos=(List<Producto>)request.getAttribute("productos"); 
	if(productos!=null && productos.size()>0){
		for(Producto p:productos){%>
			<h2><a href="<%=p.getNombre()%>">
				<%=p.getPrecio()%></a></h2>
			<h4><%=p.getCategoria() %></h4>
			<hr>
		<%}%>
	<%} %>
	<br>
	<a href="buscar.html">Volver</a>
</body>
</html>