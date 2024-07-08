<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Seleccione Tema:
	<select id="temaSel" >
		<option value="0">Todos</option>
		<c:forEach var="t" items="${requestScope.temas}">
			<option value="${t.idTema }"> ${t.tema }</option>
		</c:forEach>
	</select>
	<div id=tblLibros>
	
	</div>
	
	<script type ="text/javascript">
		$("#temaSel").change(function(){
			var url="FrontController";
			var params ={"option":"doBuscarLibrosPorTema", "idTema": $("#temaSel").val()};
			gestionarPeticion(url, params);
			});	
		function gestionarPeticion(url, params) {
			var tabla="<table border='1'><tr><td><th>Titulo</th><th>Autor</th><th>Precio</th><th>Paginas</th></td></tr>";
			$.get(url, params, function (data){	
			$.each(data, function(i,l) {
					tabla+="<tr><td>"+l.titulo+"</td><td>"+l.autor+"</td><td>"+l.precio+"</td><td>"+l.paginas+"</td></tr>";
				});
				tabla+="</tabla>";
			$("#tblLibros").html(tabla);
		});

	</script>
</body>
</html>