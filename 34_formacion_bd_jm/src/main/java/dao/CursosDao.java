package dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import model.Curso;


public class CursosDao {

	private static EntityManager eManager;

	// Aplicacion de patron Singleton. solo se ejecuta una vez en la vida de la
	// aplicacion
	static {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cursos");
		eManager.getEntityManagerFactory().createEntityManager();
	}

	public void save(Curso curso) {
		EntityTransaction tx = eManager.getTransaction();
		tx.begin();
		try {
			eManager.persist(curso);
			tx.commit();
		} catch (Exception ex) {
			tx.rollback();
		}
	}

	public Curso findById(int codCurso) {
		return eManager.find(Curso.class, codCurso);
	}

	public void deleteById(int codCurso) {
		eManager.remove(findById(codCurso));
	}
	
	public List<Curso> findByPrecioMaximo(Double precio){
		String jpql="select c from Curso c where c.precio<=:precio";
		TypedQuery<Curso> query= eManager.createQuery(jpql, Curso.class);
		query.setParameter("precio", precio);
		return query.getResultList();
	}
	
	public List<Curso> findByTematica(String tematica){
		String jpql="select c from Curso c where c.precio =:tem";
		TypedQuery<Curso> query= eManager.createQuery(jpql, Curso.class);
		query.setParameter("tem", tematica);
		return query.getResultList();
	}
	
	public void updateDuracionCurso(int codC, int durC) {
		String jpql="update Curso c set c.duracion=?1 where c.codigoCurso =?2";
		Query query= eManager.createQuery(jpql, Curso.class);
		query.setParameter(1, durC);
		query.setParameter(2, codC);
		EntityTransaction tx = eManager.getTransaction();
		tx.begin();
		query.executeUpdate();
		tx.commit();
	}
}
