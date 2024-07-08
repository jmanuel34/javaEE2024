package mappers;

import dto.LibroDto;
import dto.TemaDto;
import model.Libro;
import model.Tema;
import service.LibrosService;

public class Mapeador {
	public static TemaDto temaEntityToDto(Tema tema) {
		return new TemaDto(tema.getIdTema(), tema.getTema());
		
	}
	
	public static LibroDto LibroEntityToDto(Libro libro) {
		var LibrosService=new LibrosService();
		return new (LibroDto(libro.getIsbn(), libro.getTitulo(),
						libro.getAutor(), libro.getPrecio(), libro.getPaginas(),
						LibrosService.getTema(libro.getIdTema() 
					);
	}

}
