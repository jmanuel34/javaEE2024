package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Producto;
import service.ProductosService;

@WebServlet("/Alta")
public class AltaProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		var productosService= new ProductosService();
		productosService.agregar(new Producto (request.getParameter("nombre"),
												Integer.parseInt(request.getParameter("precio")),
												request.getParameter("categoria")));
		request.getRequestDispatcher("inicio.html").forward(request, response);
	}
	
	
	
}
