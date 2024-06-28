package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Curso;
import service.CursosService;

@WebServlet("/AgregarAction")
public class AgregarAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CursosService service = new CursosService();

		String nombre = 	request.getParameter("nombre"); 
		String tematica = request.getParameter("tematica"); 
		int duracion = 	Integer.parseInt(request.getParameter("duracion"));
		double precio = Double.parseDouble(request.getParameter("precio"));
		Curso curso = new Curso(0,nombre, tematica, duracion, precio);
		if (service.agregar(curso)) { 
			request.setAttribute("resultado", true);
		}
		else request.setAttribute("resultado", false);
	}
}
