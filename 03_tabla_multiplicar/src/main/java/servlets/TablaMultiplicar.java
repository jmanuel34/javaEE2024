package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/TablaMultiplicar")

public class TablaMultiplicar extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try (PrintWriter out = response.getWriter()){
			out.println("<html><head>Tabla Multiplicar</head><body>");
			out.println ("<table border = 1>");
				for (int i=1; i<=10; i++) {
					out.println("<tr>");
					for (int j=1; j<=10; j++ ) {
						out.println("<td>"+i*j +"</td>");
					}	
					out.println ("</td>");
				}
						
			out.println("</body></html>");
		}
	}

}
