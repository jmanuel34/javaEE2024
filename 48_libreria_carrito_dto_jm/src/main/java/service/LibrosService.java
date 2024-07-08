package service;

import java.util.List;

import dao.LibrosDao;
import dao.TemasDao;
import dto.LibroDto;
import dto.TemaDto;
import model.Libro;

public class LibrosService {
	LibrosDao librosDao=new LibrosDao();
	TemasDao temasDao=new TemasDao();
	
	public List<TemaDto> getTemas(){
		return temasDao.findAll();
	}
	
	public List<LibroDto> librosTema(int idTema){
		
		if(idTema!=0) {
			return librosDao.findByIdTema(idTema);
		}else{
			return librosDao.findAll();
		}
			
	}
	public LibroDto getLibro(int isbn) {
		return librosDao.findByIsbn(isbn);
	}
	public TemaDto getTema(int idTema(){
		
	}
}
