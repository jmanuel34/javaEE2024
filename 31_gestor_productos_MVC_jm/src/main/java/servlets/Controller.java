package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String urlVista= "";
		String operation = request.getParameter("operation");
		urlVista = switch (operation) {
			case "doAgregar"-> {
				request.getRequestDispatcher("AltaProductoAction").include(request, response);
				yield ("inicio.html");
			}
			case "doEliminar"-> {
				request.getRequestDispatcher("EliminarProductoAction").include(request, response);
				yield ("inicio.html");
			}
			case  "doBuscar"-> {
				request.getRequestDispatcher("BuscarPorCategoriaAction").include(request, response);
				yield ("productos.jsp");
			}
			case "toAlta"->"alta.html";
			case "toBuscar"-> "buscar.html";
			case "toEliminar" -> "eliminar.html";
			default-> "inicio.html";
		};
		request.getRequestDispatcher(urlVista).forward(request, response);
	}

}
