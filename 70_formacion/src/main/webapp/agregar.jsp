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
        <form action="Controller?option=doAgregar" onsubmit="return validar();" method="post">			
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
	
	<script type="text/javascript">
		function validar(){
			const regex = "/^[PWS]+$/";
			let nombre=document.getElementById("nombre").value;
			let tematica=document.getElementById("tematica").value;
			let duracion=document.getElementById("duracion").value;
			let precio=document.getElementById("precio").value;
			if(nombre.trim().length==0){
				alert("El curso no puede estar vacío!");
				return false;
			}
//			if (!tematica.startsWith("P")&&!tematica.startsWith("W")&&!tematica.startsWith("S")){
			if (!tematica.startsWith(regex)) {
				console.log(tematica);
				alert("Temática no válida");
				return false;
			}
			if(duracion.trim().length==0||isNaN(duracion)||(duracion<30||duracion>200)){
				alert("Duración no válida");
				return false;
			}
			if(precio.trim().length==0||isNaN(precio)||precio<0){
				alert("precio no válido");
				return false;
			}
			alert("Datos correctos!");
			return true;
		}
		
	</script>

</body>
</html>