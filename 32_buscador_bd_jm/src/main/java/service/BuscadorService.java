package service;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import model.Resultado;


public class BuscadorService {

	private static BuscadorService service;
	private EntityManager eManager;
	
	private BuscadorService() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("buscador");
		eManager = factory.createEntityManager();
		service = this;
	}
	
	public static BuscadorService getInstance() {
		if (service==null)  {
			new BuscadorService();
		}
		return service;
	}
	
	public void altaResultado(Resultado resultado) {
		EntityTransaction tx = eManager.getTransaction();
		tx.begin();
		try {
			eManager.persist(resultado);
			tx.commit();
		}catch (Exception ex) {
			tx.rollback();
		}
	}
	
	public Resultado buscarResultadoPorId(int idResultado) {
		return eManager.find(Resultado.class, idResultado);
	}
	
	public void eliminarResultado( int idResultado) {
		
		Resultado res = buscarResultadoPorId(idResultado);
		if (res != null) {
			EntityTransaction tx = eManager.getTransaction();
			tx.begin();
			eManager.remove(res);
			tx.commit();
		}
	}
	public List<Resultado> resultadosPorTematica(String tematica) {
		String jpql = "Select r from Resultado r where r.tematica =?1";
		TypedQuery<Resultado> query = eManager.createNamedQuery(jpql, Resultado.class);
		query.setParameter(1, tematica);
		return  query.getResultList();
	}
	
	public Resultado buscarPorUrl(String url) {
		String jpql = "Select r from Resultado r where r.url =?1";
		TypedQuery<Resultado> query = eManager.createQuery (jpql, Resultado.class);
		query.setParameter(1, url);
		return  query.getResultList()
						.stream()
						.findFirst()
						.orElse(new Resultado());
		
		//Opcion B
		/*try {
			return query.getSingleResult();
		}
		catch(NoResultException ex) {
			return null;
		}
		catch(NonUniqueResultException ex) {
			return query.getResultList().get(0);
		}*/ 
	}
	public void eliminarResultadosPorTematica (String tematica) {
		String jpql = "Delete fom Resultado r where r.tematica=?1";
		Query query=eManager.createQuery(jpql);
		query.setParameter(1, tematica);
		EntityTransaction tx = eManager.getTransaction();
		tx.begin();
			query.executeUpdate();
		tx.commit();
	}
	
}
