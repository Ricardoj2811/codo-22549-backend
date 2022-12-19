package ar.com.codoacodo.domain;

public class Articulo {
	private Long id;
	private String img;
	private String titulo;
	private String autor;
	private float precio;

	public Articulo(Long id, String img, String titulo, String autor, float precio) {
		this.id = id;
		this.img = img;
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}

	public Articulo(String img, String titulo, String autor, float precio) {
		this.img = img;
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImg() {
		return img != null ? img: "";
	}

	public void setImg(String img) {
		this.img = img;
	}

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

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public void detalle() {
		System.out.println("Imagen: " + img);
		System.out.println("Titulo: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Precio: " + precio);
	}

	@Override
	public String toString() {
		return "Articulo [id=" + id + ", img=" + img + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio
				+ "]";
	}
	
}
