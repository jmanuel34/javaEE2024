package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.google.gson.Gson;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Libro;
import service.LibrosService;

@WebServlet("/BuscarLibrosPorTemaAction")
public class BuscarLibrosPorTemaAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LibrosService service = new LibrosService();
		int idTema= Integer.parseInt(request.getParameter("idTema"));
		List<Libro> libros = service.findByTema(idTema);
		Gson gson=new Gson();
		try(PrintWriter out=response.getWriter();) {
			response.setContentType("application/json");
			out.println(gson.toJson(libros));//serializar objetos Java a JSON
		}
	}
}