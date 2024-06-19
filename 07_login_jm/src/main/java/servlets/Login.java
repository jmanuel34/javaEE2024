package servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user= request.getParameter("username");
		String pwd= request.getParameter("password");
		RequestDispatcher dispacher;
		if (user.equals("admin" ) && pwd.equals("pass")) {
			dispacher=request.getRequestDispatcher("Bienvenida");
		}
		else {
			dispacher=request.getRequestDispatcher("Error");
		}
		dispacher.forward(request, response);
	}

}