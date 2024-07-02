package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.Usuario;

public class UsuariosDao {
	
	private static EntityManager eManager;
	
	static {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("cursos");
		eManager=factory.createEntityManager();
	}
	
	public Usuario findByPk(String usuario) {
		return eManager.find(Usuario.class, usuario);
	}

}
