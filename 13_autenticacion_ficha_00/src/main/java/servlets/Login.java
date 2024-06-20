package servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Ficha;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("username");
		String pwd=request.getParameter("password");
		RequestDispatcher dispatcher;
		if(user.equals("admin")&&pwd.equals("pass")) {
			//creamos la ficha del usuario y la guardamos en un atributo
			//de petición para que la pueda recuperar la página JSP
			Ficha ficha=new Ficha(user,80,"test@gmail.com");
			request.setAttribute("ficha", ficha);
			dispatcher=request.getRequestDispatcher("bienvenida.jsp");
		}else {
			dispatcher=request.getRequestDispatcher("error.jsp");
		}
		dispatcher.forward(request, response);
		
	}

}
