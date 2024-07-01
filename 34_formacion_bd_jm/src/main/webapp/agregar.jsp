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
		<h1>Añadir nuevo curso</h1>
<!--  		<form action="FrontController?operation=doAgregar" onsubmit="return validar();" method="post"> -->
			<form action="Controller?option=doAgregar" method="post">
				
			Nombre curso: <input type="text" id="nombre" name="nombre" placeholder="Nombre del curso"><br>
			Temática: <input type="text" id="tematica" name="tematica" ><br>
			Duración: <input type="text" id="duracion" name="duracion" placeholder="Duración del curso"> <br>
			Precio: <input type="text" id="precio" name="precio" placeholder="Precio del curso"> <br>
			<input type="submit" value="Guardar">
		</form>
		<br>
		<br>
		<h2>${requestScope.mensaje}</h2>
		<a href="Controller?operation=toMenu">Volver</a>
	</div>

</body>
</html>