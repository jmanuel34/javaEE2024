package dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import model.Resultado;

public class BuscadorDao {
	private static EntityManager eManager;
	
	// Aplicacion de patron Singleton. solo se ejecuta una vez en la vida de la aplicacion
	static  {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("buscador");
		eManager.getEntityManagerFactory().createEntityManager();
	}
	
	public void save (Resultado resultado) {
		EntityTransaction tx = eManager.getTransaction();
		tx.begin();
		try {
			eManager.persist(resultado);
			tx.commit();
		} catch (Exception ex) {
			tx.rollback();
		}
	}
	
	public Resultado findByUrl (String url) {
		return eManager.find(null, url);
	}
	
	public Resultado findById(int idResultado) {
		return eManager.find(Resultado.class, idResultado);
	}
	
	public void deleteById(int idResultado) {
		eManager.remove(findById(idResultado));
	}
	
	public List<Resultado> findByTematica(String tematica) {
		String jpql = "Select r from Resultado r where r.tematica =?1";
		TypedQuery<Resultado> query = eManager.createNamedQuery(jpql, Resultado.class);
		query.setParameter(1, tematica);
		return  query.getResultList();
	}
	
}
