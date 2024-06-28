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
		String urlVista="";
		String operation=request.getParameter("option");
		urlVista=switch(operation) {
			case "doAgregar"->{
				request.getRequestDispatcher("AgregarAction").include(request, response);
				yield "index.html";
			}
			case "doEliminar"->{
				request.getRequestDispatcher("EliminarAction").include(request, response);
				yield "index.html";
			}
			case "doBuscarPrecio"->{
				request.getRequestDispatcher("BuscarPorPrecioAction").include(request, response);
				yield "resultados.jsp";
			}
			
			case "doBuscarPorTema"->{
				request.getRequestDispatcher("BuscarPorTemaAction").include(request, response);
				yield "resultados.jsp";
			}
			case "doBuscarResultados"->{
				request.getRequestDispatcher("BuscarResultadosAction").include(request, response);
				yield "resultados.jsp";
			}
			case "toAlta"->"alta.html";
			case "toBuscar"->"buscar.html";
			case "toEliminar"->"eliminar.html";
			case "toBuscarResultados"->"buscarResultados.html";
			default ->"index.html";
		};
		//transferimos el control a la vista definitiva
		request.getRequestDispatcher(urlVista).forward(request, response);
	
	}

}
