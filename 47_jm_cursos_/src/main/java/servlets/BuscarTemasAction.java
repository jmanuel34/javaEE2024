package servlets;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Tema;
import service.TemasService;

@WebServlet("/BuscarTemasAction")
public class BuscarTemasAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TemasService service = new TemasService();
		List<Tema> temas = service.findAll();
		request.setAttribute("temas", temas);
	}

}
