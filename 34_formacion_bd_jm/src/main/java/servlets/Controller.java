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
		String option=request.getParameter("option");
		urlVista=switch(option) {
		
			case "doAutenticar"-> {
				request.getRequestDispatcher("BuscarUsuarioAction").include(request, response);
				String mensaje = (String)request.getAttribute("mensaje");
				if (mensaje.equals("Valido")) yield "menu.html";
				else yield "error.jsp";
			}
			case "doAgregar"->{
				request.getRequestDispatcher("AgregarAction").include(request, response);
				yield "menu.html";
			}
			case "doEliminar"->{
				request.getRequestDispatcher("EliminarAction").include(request, response);
				yield "menu.html";
			}
			case "doBuscarPorPrecio"->{
				request.getRequestDispatcher("BuscarPorPrecioAction").include(request, response);
				yield "resultadosPorPrecio.jsp";
			}
			
			case "doBuscarPorTema"->{
				request.getRequestDispatcher("BuscarPorTemaAction").include(request, response);
				yield "resultados.jsp";
			}
			case "doBuscarResultados"->{
				request.getRequestDispatcher("BuscarResultadosAction").include(request, response);
				yield "resultados.jsp";
			}
			case "toAlta"->"agregar.jsp";
			case "toBuscar"->"buscar.html";
			case "toEliminar"->"eliminar.html";
			case "toBuscarPorPrecio"-> "buscarPorPrecio.html";
			case "toBuscarResultados"->"buscarResultados.html";
			case "toLogin"->"login.html";
			case "toMenu"->"menu.html";
			default ->"login.html";
		};
		//transferimos el control a la vista definitiva
		request.getRequestDispatcher(urlVista).forward(request, response);
	
	}

}
