package model;

public class Item {
	private String url;
	private String tema;
	private String descripcion;
	public Item() {
		super();
	}
	public Item(String url, String tema, String descripcion) {
		super();
		this.url = url;
		this.tema = tema;
		this.descripcion = descripcion;
	}
	public String getDireccion() {
		return url;
	}
	public void setDireccion(String direccion) {
		this.url = direccion;
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