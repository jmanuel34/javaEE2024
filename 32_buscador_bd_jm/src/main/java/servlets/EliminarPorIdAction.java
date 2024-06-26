package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.BuscadorService;

@WebServlet ("/EliminarPorIdAction")
public class EliminarPorIdAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		var service = BuscadorService.getInstance();
		int id = Integer.parseInt(request.getParameter("idResultado"));
		service.eliminarResultado(id);
	}

}
