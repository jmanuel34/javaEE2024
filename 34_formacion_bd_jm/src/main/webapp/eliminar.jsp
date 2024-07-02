<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
		<h1>Eliminar Curso</h1>
		<form action="Controller?operation=doEliminar" method="post">
			Nombre del curso:<input type="text" name="nombre"
				placeholder="Nombre del curso a eliminar"> <br><br><input
				type="submit" value="Eliminar">
		</form>
		<br>
		<h2>${requestScope.mensaje}</h2>
		<a href="Controller?operation=toMenu">Volver</a>
	</div>

</body>
</html>