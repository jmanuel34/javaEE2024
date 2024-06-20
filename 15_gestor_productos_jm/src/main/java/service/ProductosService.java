package service;

import java.util.ArrayList;
import java.util.List;

import model.Producto;

public class ProductosService {
	private static List<Producto> productos = new ArrayList<>();
	

	public void agregar(Producto producto) {
		productos.add(producto);
	}

	public List<Producto> recuperarPorCategoria(String categoria) {
		return productos.stream()
				.filter(p -> p.getCategoria().equals(categoria))
				.toList();
	}
	
	public boolean eliminar(String nombre) {
		boolean result = false;
		if (productos.removeIf(p->p.getNombre().equals(nombre))) result = true;
		return result;		
	}
	
}
