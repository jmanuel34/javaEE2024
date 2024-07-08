package controller;

import java.io.IOException;

import com.google.gson.Gson;

import dtos.LibroDto;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.LibrosService;

@WebServlet("/doPaginaNuevo")
public class AddLibroAction extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		LibrosService service = new LibrosService();
		
		if (service.agregar(libro)) { 
			request.setAttribute("resultado", true);
		}
		else request.setAttribute("resultado", false);
	}

}

/*
int idTema=Integer.parseInt(request.getParameter("idTema"));
		LibrosService service=new LibrosService();
		List<LibroDto> libros=service.librosTema(idTema);
		Gson gson=new Gson();
		PrintWriter out=response.getWriter();
//*/
