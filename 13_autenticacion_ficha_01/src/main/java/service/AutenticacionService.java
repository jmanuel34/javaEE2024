package service;

import java.util.List;

import model.Ficha;

public class AutenticacionService {
	private final String USER="admin";
	private final String PASSWORD="curso";

	List<Ficha> fichas = List.of(
			new Ficha("ar", 19, "admin.com"),
			new Ficha("ab", 20, "ab.com"),
			new Ficha("ac", 11, "ac.com")
		);
	
	public boolean autenticar(String usuario, String password) {
		return usuario.equals(USER) && password.equals(PASSWORD);
	}
	
	public Ficha fichausuario(String usuario) {
		return fichas.stream()
				.filter(f->f.getUsuario().equals(usuario))
				.findFirst()
				.orElse(new Ficha());
	}
}
