package servlets;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Item;
import service.ItemService;

@WebServlet("/Buscador")
public class Buscador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String tema = request.getParameter("tema");
		RequestDispatcher dispatcher;
		var service = new ItemService();
		List<Item> items = service.buscarTema(tema);
		if (items.size() != 0) {
			request.setAttribute("items", items);
			dispatcher = request.getRequestDispatcher("resultado.jsp");
		} else {
			dispatcher = request.getRequestDispatcher("error.jsp");
		}
		dispatcher.forward(request, response);
		/*
		 * for (Item i:items) { System.out.println("Tema: "+i.getTema());
		 * System.out.println("Descripcion: "+i.getDescripcion());
		 * System.out.println("Direccion: "+i.getDireccion()); //
		 */
	}
}
