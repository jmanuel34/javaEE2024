package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.CursosService;

@WebServlet("/ActualizarDuracionAction")
public class ActualizarDuracionAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mensaje;
		int idCurso = Integer.parseInt(request.getParameter("codigoCurso"));
		int duracion = Integer.parseInt(request.getParameter("duracion"));
		CursosService service = new CursosService();
		
		if (service.actualizar(idCurso, duracion)) {
			request.setAttribute("mensaje","Curso actualizado" );
		}
		else request.setAttribute("mensaje", "El curso no se ha podido actualizar");
	}
}
