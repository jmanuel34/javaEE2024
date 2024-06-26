package service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
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
		eManager.persist(resultado);
	}
	
	public Resultado buscarResultadoPorId(int idResultado) {
		return eManager.find(Resultado.class, idResultado);
	}
	
	public void eliminarResultado( int idResultado) {
		Resultado res = buscarResultadoPorId(idResultado);
		if (res != null) {
			eManager.remove(res);	
		}
	}
}
