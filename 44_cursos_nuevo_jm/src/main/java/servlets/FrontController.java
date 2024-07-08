package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String urlVista="";
		String option=request.getParameter("option");
		switch(option) {
			case "doBuscarTemas" :
				request.getRequestDispatcher("BuscarTemasAction").include(request, response);
				urlVista="libros.html";
				break;
			case "doBuscarLibros":
				request.getRequestDispatcher("BuscarLibrosAction").forward(request, response);
				urlVista="libros.html";
				break;
			case "doBuscarLibrosPorTema":
				request.getRequestDispatcher("BuscarLibrosPorTemaAction").forward(request, response);
				urlVista="libros.html";
				break;
			default:
				urlVista="index.html";
		}
		request.getRequestDispatcher(urlVista).forward(request, response);
		
	}

}
