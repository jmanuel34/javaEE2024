package service;

import dao.UsuariosDao;
import model.Usuario;

public class UsuariosService {
	
	public boolean findUsuario(String usuario,  String password) {
		UsuariosDao userDao = new UsuariosDao();
		Usuario user = userDao.finById(usuario);
		if (user.getPassword().equals(password)) return true;
		return false;
	}
}
