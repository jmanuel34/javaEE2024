package service;

import java.util.ArrayList;
import java.util.List;

import dao.CursosDao;
import model.Curso;

public class CursosService {
	CursosDao cDao = new CursosDao();

	public boolean agregar(Curso curso) {
//		String nombre = curso.getNombre();
		if (cDao.findByName (curso.getNombre()) == null) {
			cDao.save(curso);
			return true;
		}
		return false;
	}

	public boolean actualizar(int codCurso, int duracion) {
		if (cDao.findById(codCurso).getCodigoCurso() == codCurso) {
			cDao.updateDuracionCurso(codCurso, duracion);
			return true;
		}
		return false;
	}
	
	public boolean eliminar (int codigoCurso) { 
		if (cDao.findById(codigoCurso).getCodigoCurso() == codigoCurso) {
			cDao.deleteById(codigoCurso);
			return true;
		}
		return false;
	}

	public List<Curso> buscarCursosPorTema(String tematica) {
		return cDao.findByTematica(tematica);
	}
	
	public List<Curso> buscarCursosPorPrecioMaximo(double precio) {
		return cDao.findByPrecioMaximo(precio);
	}

}