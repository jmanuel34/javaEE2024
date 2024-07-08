package dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import model.Libro;

public class LibrosDao {
	private static EntityManager eManager;
	
	static {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("libros");
	}
	public void save(Libro libro) {
		EntityTransaction tx = eManager.getTransaction();
		tx.begin();
		try {
			eManager.persist(libro);
			tx.commit();
		} catch (Exception ex) {
			tx.rollback();
		}
	
	}
	
	public List<Libro> findByTema (int idTema) {
		String jpql = "Select l from libros l where l.idTema=?";
		TypedQuery<Libro> query =eManager.createQuery(jpql, Libro.class);
		query.setParameter(1, idTema);
		return query.getResultList();
		
	}
	
	public List<Libro> finAll() {
		String jpql = "Select l from libos l";
		TypedQuery<Libro> query =eManager.createQuery(jpql, Libro.class);
		return query.getResultList();
	}
	
	// Proximas versiones
	/*
	public Libro finByTitulo(String titulo) {
		return null;
	}
	*/
	
}
