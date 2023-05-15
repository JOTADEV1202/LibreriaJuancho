package model;

public class ColeccionLibros {
	
	String titulo;
	String autor;
	Categoria categoria;
	boolean disponibilidad;
	
	/*public ColeccionLibros(String titulo, String autor, Categoria categoria, boolean disponibilidad) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.categoria = categoria;
		this.disponibilidad = disponibilidad;
	}*/

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public boolean isDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
		
}
