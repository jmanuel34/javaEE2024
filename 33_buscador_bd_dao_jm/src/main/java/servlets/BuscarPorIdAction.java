package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Resultado;
import service.BuscadorService;

@WebServlet("/BuscarPorIdAction")
public class BuscarPorIdAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		var service = BuscadorService.getInstance();
		int id = Integer.parseInt(request.getParameter("idResultado"));
		Resultado res = service.buscarResultadoPorId(id);
		request.setAttribute("resultado", res);
	}

}
