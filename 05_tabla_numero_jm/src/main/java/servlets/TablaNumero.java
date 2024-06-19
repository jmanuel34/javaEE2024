package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Tabla")

public class TablaNumero extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer numero = Integer.parseInt(request.getParameter("numero"));
		response.setContentType("text/html");
		try (PrintWriter out = response.getWriter()){
			
			out.println("<html><head>"
					+ "</head><body>");
			out.println ("<div><table border=1>");	
			for (int i=1; i<=10; i++) {
				out.print("<tr><td>"+i+"</td>");
				out.print("<td>x</td> ");
				out.print("<td>"+numero+"</td>");
				out.print("<td> = </td>");
				out.print("<td>"+numero*i+"</td>");
			}
			
	//		out.println ("<tr><td><a href = 'http://localhost:8080/05_tabla_numero_jm/numero.html'>Volver1</a></td></tr>");
			out.println ("<p><a href = 'http://localhost:8080/05_tabla_numero_jm/numero.html'>Volver</a></p>");
			
			out.println("</div></body></html>");
				
		}
		
	}

}
/*
 * out.println("<html><head>"
					+"<style type='text/css'>"
					+" div {"
					+" border: 1px solid black;"
					+" padding: 10px;"
					+" width: 200px;"
					+" height: 200px;"
					+" text-align: right;"
					+"}"
					+" </style>"
					+ "</head><body>");
//*/
