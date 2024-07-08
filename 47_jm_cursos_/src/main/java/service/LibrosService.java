package service;

import java.util.List;

import dao.LibrosDao;
import model.Libro;

public class LibrosService {
	LibrosDao dao = new LibrosDao();
	
	public List<Libro> findByTema(int idTema){
		return dao.findByTema(idTema);
	}
	public List<Libro> findAll() {
		return dao.finAll();
	}
}
