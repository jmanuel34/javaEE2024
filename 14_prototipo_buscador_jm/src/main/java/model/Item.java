package model;

public class Item {
	private String direccion;
	private String tema;
	private String descripcion;
	public Item() {
		super();
	}
	public Item(String direccion, String tema, String descripcion) {
		super();
		this.direccion = direccion;
		this.tema = tema;
		this.descripcion = descripcion;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}