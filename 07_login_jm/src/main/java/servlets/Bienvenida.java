package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Bienvenida")
public class Bienvenida extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try (PrintWriter out = response.getWriter()){
			out.println("<html><head>Pagina de Bienvenida</head><body>");
			out.println("<h4> Usuario: "+request.getParameter("username")+ "</h4>");
			out.println("<h4> Password: "+request.getParameter("password")+ "</h4>");
			out.println(" </body></html>");
		}
	}

}
