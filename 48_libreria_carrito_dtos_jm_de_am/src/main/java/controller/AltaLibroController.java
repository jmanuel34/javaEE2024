package controller;

import java.io.IOException;
import java.io.PrintWriter;

import dtos.LibroDto;
import dtos.TemaDto;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.LibrosService;

@WebSrvlet("AltaLibroController")
public class AltaLibroController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int isbn= Integer.parseInt(request.getParameter("isbn"));
		String titulo= request.getParameter("titulo");
		String autor= request.getParameter("autor");
		double precio= Double.parseDouble(request.getParameter("precio"));
		int paginas= Integer.parseInt(request.getParameter("paginas"));
		int idTema= Integer.parseInt(request.getParameter("idTema"));
		LibroDto libro= new LibroDto(isbn, titulo, autor, precio, paginas, new TemaDto(idTema, null));		// `pmer argiuentos
		LibrosService service = new LibrosService();
		PrintWriter out = response.getWriter();
		response.setContentType("text/plain");
		out.print(service.agregarLibro(libro));

	}

}
