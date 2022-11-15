package ar.com.codoacodo.buscador;

public class Articulo {
	private String img;
	private String titulo;
	private String autor;
	private float precio;
	
	public Articulo() {
		
	}
	
	public void detalle() {
		//mostrar por consola los datos
		System.out.println("Imagen: " + img);
		System.out.println("Titulo: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Precio: " + precio);
	}
}
