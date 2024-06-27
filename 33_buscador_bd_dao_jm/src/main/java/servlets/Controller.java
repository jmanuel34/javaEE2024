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
		String url="";
		String operation=request.getParameter("operation");
		url=switch(operation) {
			case "doAgregar"->{
				request.getRequestDispatcher("AltaAction").include(request, response);
				yield "index.html";
			}
			case "doEliminarPorId"->{
				request.getRequestDispatcher("EliminarPorIdAction").include(request, response);
				yield "index.html";
			}
			
			case "doBuscarPorId"-> {
				request.getRequestDispatcher("BuscarPorIdAction").include (request, response);
				yield "resultado.jsp";
			}
			
			case "toBuscarPorTemaAction" ->{
				request.getRequestDispatcher("BuscarPorTemaAction").include(request,  response);
				yield "resultadosPorTema.jsp";
			}
			case "doCerrar"->{
				request.getRequestDispatcher("CerrarSesionAction").include(request, response);
				yield "index.html";
			}
			case "toInicio"->"index.html";
			case "toAlta"->"alta.html";
			case "toBuscaPorId"->"buscarPorId.jsp";
			case "toBuscarPorTema" -> "buscarPorTema.html";
			case "toEliminar" -> "eliminar.jsp";
			default ->"index.html";
		};
		//transferimos el control a la vista definitiva
		request.getRequestDispatcher(url).forward(request, response);
	}

}
