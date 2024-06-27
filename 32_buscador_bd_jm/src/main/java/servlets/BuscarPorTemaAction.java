package servlets;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Resultado;
import service.BuscadorService;

@WebServlet("/BuscarPorTemaAction")
public class BuscarPorTemaAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		var service = BuscadorService.getInstance();
		String tema = request.getParameter("tematica");
		List<Resultado> resultados = service.resultadosPorTematica(tema);
		request.setAttribute("resultados", resultados);
	}

}
