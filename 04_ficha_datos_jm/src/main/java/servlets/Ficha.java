package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Ficha")
public class Ficha extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try (PrintWriter out = response.getWriter()){
			out.println("<html><head>Ficha Usuario</head><body>");
			out.println("<h4> Te llamas: "+request.getParameter("nombre")+ "</h4>");
			out.println("<h4> Tienes: "+request.getParameter("edad")+ "</h4>");
			out.println("<h4> Tu email: "+request.getParameter("email")+ "</h4>");
			int registrado= Integer.parseInt(request.getParameter("Registrado "));
			String texto = registrado==1?"Estas registrado":"No estas registrado ";
			out.println("<h4>"+ texto+ "</h4");
			out.println(" </body></html>");
		}

	}

}
