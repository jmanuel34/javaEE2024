package dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import model.Tema;

public class TemasDao {
	private static EntityManager eManager;
	
	static {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("libros");
	}
	
	public List<Tema> findAll() {
		String jpql="select t from Tema t";
		TypedQuery<Tema> query= eManager.createQuery(jpql, Tema.class);
		return query.getResultList();
	}
}
