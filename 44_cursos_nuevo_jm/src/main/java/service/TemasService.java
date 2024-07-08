package service;

import java.util.List;

import dao.TemasDao;
import model.Tema;

public class TemasService {
	TemasDao dao = new TemasDao();
	
	public List<Tema> findAll(){
		return dao.findAll();
	}

}
