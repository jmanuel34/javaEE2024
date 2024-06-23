package servlets;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Contador")
public class Contador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		
		int contadorSesion=1;
		int contadorTotal=0;
		
		HttpSession sesion=request.getSession();
		if(sesion.getAttribute("contadorSesion")!=null) {
			contadorSesion=(Integer)sesion.getAttribute("contadorSesion");
			contadorSesion++;
		}
		
		ServletContext context = request.getServletContext();
		
		if (context.getAttribute("contadorTotal") == null) {
			context.setAttribute("contadorTotal", contadorTotal);
			request.setAttribute("contadorTotal", 1);		
		}
		contadorTotal = (Integer)context.getAttribute("contadorTotal");
		contadorTotal++;
		context.setAttribute("contadorTotal", contadorTotal);
		request.setAttribute("contadorTotal", contadorTotal);
		
		sesion.setAttribute("contadorSesion", contadorSesion);
		
		request.getRequestDispatcher("resultado.jsp").forward(request, response);
	}
}
