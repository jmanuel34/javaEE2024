package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.Usuario;

public class UsuariosDao {
	
	private EntityManager eManager;
	
	public UsuariosDao() {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("buscador");
		eManager=factory.createEntityManager();
	}
	
	public Usuario finById(String usuario) {
		return eManager.find(Usuario.class, usuario);
	}

}
