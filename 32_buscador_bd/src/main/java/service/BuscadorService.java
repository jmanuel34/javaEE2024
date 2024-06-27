package service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import model.Resultado;

public class BuscadorService {
	
	private EntityManager eManager;
	public BuscadorService() {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("buscador");
		eManager=factory.createEntityManager();
	}
	
	public void altaResultado(Resultado resultado) {
		EntityTransaction tx=eManager.getTransaction();
		tx.begin();
		eManager.persist(resultado);
		tx.commit();
	}
	
	public Resultado buscarResultadoPorId(int idResultado) {
		return eManager.find(Resultado.class, idResultado);
	}
	public void eliminarResultado(int idResultado) {
		Resultado resultado=buscarResultadoPorId(idResultado);
		if(resultado!=null) {
			EntityTransaction tx=eManager.getTransaction();
			tx.begin();
			eManager.remove(resultado);
			tx.commit();
		}
	}
}
