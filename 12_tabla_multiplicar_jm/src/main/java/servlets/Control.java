package servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Control")
public class Control extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher;
		String numero=request.getParameter("numero");
		// comentario
		try {
			int num = Integer.parseInt(numero);
//			request.setAttribute("num", num);
			dispatcher=request.getRequestDispatcher("Tabla.jsp");
//			response.sendRedirect("Tabla.jsp");
		} catch (NumberFormatException ex) {
			dispatcher=request.getRequestDispatcher("Error.jsp");
		}
		dispatcher.forward(request, response);
	}

}
