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
<%!public void m() {
		int a = 10;
	}%>

	Error: El numero <%=request.getParameter("numero")%> no es correcto
	<a href = "inicio.jsp">Volver</a>
</div>
</body>
</html>