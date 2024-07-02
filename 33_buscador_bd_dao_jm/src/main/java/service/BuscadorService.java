package service;

import java.util.List;
import java.util.Optional;

import dao.BuscadorDao;
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
	
	public boolean altaResultado(Resultado resultado) {
			if (dao.findByUrl(resultado.getUrl())==null) {
				dao.save(resultado);
				return true;
			}
			return false;
	}
	
	public Optional<Resultado> buscarResultadoPorId(int idResultado) {
		Resultado resultado = dao.findById(idResultado);
		return resultado!=null?Optional.of(resultado):Optional.empty();
	}
	
	public Optional<Resultado> eliminarResultado( int idResultado) {
		Resultado resultado = dao.findById(idResultado);
		if (resultado!= null) {
			dao.deleteById(idResultado);
		}
		return resultado!=null?Optional.of(resultado):Optional.empty();
	}
	public List<Resultado> resultadosPorTematica(String tematica) {
		return dao.findByTematica(tematica);
	}
	
}
