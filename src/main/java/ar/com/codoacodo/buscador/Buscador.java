package ar.com.codoacodo.buscador;

public class Buscador {
	//OOP los atributos de una clase deberian ser privados
	//atributos
	private String claveBusqueda;
	private Articulo[] resultados;
	private int cantidadResultados;
	
	//constructor/es
	//Todas las clase tienen por defecto un constructor vacio
	public Buscador() {
		System.out.println("nace un Buscador");
		resultados = new Articulo[0];
	}
	//metodos
	public void buscar() {
		System.out.println("buscando " + claveBusqueda);
		
		//aca debo cargar el array de resultados con objetos de la clase Articulo
		//Simular que encontramos 3 resultados
		Articulo res1 = new Articulo();
		Articulo res2 = new Articulo();
		Articulo res3 = new Articulo();
		
		resultados = new Articulo[3];
		
		resultados[0] = res1;
		resultados[1] = res2;
		resultados[2] = res3;
		
		//actualizo la cantidad de resultados.
		cantidadResultados = resultados.length;
	}
	
	public void cambiarClave(String nuevaClave) {
		claveBusqueda = nuevaClave;
	}
	
	public int getCantRes() {
		return cantidadResultados;
	}
	
	public String getClaveBusqueda() {
		if(claveBusqueda == null) {
			return "";
		}
		return claveBusqueda;
	}
}
