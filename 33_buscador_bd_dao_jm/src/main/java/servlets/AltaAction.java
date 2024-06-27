package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Resultado;
import service.BuscadorService;

@WebServlet("/AltaAction")
public class AltaAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		var service = BuscadorService.getInstance();
		String url = request.getParameter("url");
		String tematica = request.getParameter("tematica");
		String descripcion = request.getParameter("descripcion");
		Resultado res = new Resultado (0, url, tematica, descripcion);
		service.altaResultado(res);
	}

}
