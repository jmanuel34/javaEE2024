package servlets;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Curso;
import service.CursosService;

@WebServlet("/EliminarPorNombreAction")
public class EliminarPorNombreAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CursosService service = new CursosService();
		String nombre = request.getParameter("nombre");		
		if (service.eliminarPorNombre(nombre)) { 
			request.setAttribute("resultado", true);
		}
		else request.setAttribute("resultado", false);
	}

}
