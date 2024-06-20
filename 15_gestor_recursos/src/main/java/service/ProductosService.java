package service;

import java.util.ArrayList;
import java.util.List;

import model.Producto;

public class ProductosService {
	private static List<Producto> productos = new ArrayList<>();
	
	public void agregar(Producto p) {
		productos.add(p);
		
	}
	
	public List<Producto> buscar(String categoria) {
		return productos.stream()
				.filter(p->p.getCategoria().equals(categoria))
				.toList();
	}

}
