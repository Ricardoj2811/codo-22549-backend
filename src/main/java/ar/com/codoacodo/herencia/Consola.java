package ar.com.codoacodo.herencia;

//Las clases abstractas no se pueden instaciar en ninguna parte del codigo
public abstract class Consola {
	private String nombre;
	protected int bit;
	private String marca;
	
	
	public Consola(String nombre, int bit, String marca) {
		this.nombre = nombre;
		this.bit = bit;
		this.marca = marca;
	}


	public String getNombre() {
		return nombre;
	}


	public int getBit() {
		return bit;
	}


	public String getMarca() {
		return marca;
	}


	@Override
	public String toString() {
		return "Consola [nombre=" + nombre + ", bit=" + bit + ", marca=" + marca + "]";
	}
	
	public void mostrar() {
		System.out.println(toString());
	}
	
}
