package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.ProductosService;

@WebServlet("/Eliminar")
public class Eliminar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		var service = new ProductosService();
		boolean result = false;
		String nombre = request.getParameter("nombre");
		if (service.eliminar(nombre)) result = true;
		request.setAttribute("resultado", result);
		request.getRequestDispatcher("inicio.html").forward(request, response);
	}

}
