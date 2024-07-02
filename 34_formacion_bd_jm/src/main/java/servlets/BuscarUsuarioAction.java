package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.UsuariosService;

@WebServlet("/BuscarUsuarioAction")
public class BuscarUsuarioAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("usuario");
		String password = request.getParameter("password");
		UsuariosService service = new UsuariosService();
		if (service.findUsuario(username, password)) {
			request.setAttribute("mensaje", "Valido");
		}
		else request.setAttribute("mensaje", "Invalido");
	}

}
