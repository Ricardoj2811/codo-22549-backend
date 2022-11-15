package ar.com.codoacodo.buscador;

public class HomeMain {

	public static void main(String[] args) {
		//Para crear un objeto de una clase XX
		//Clase nombreDelObjeto = new Clase();
		
		Buscador miBuscador = new Buscador();
		//ahora mi Buscador esta vivo! entonces puedo
		//ejecutar cualqueira de sus metodos "publicos"
		
		//primero defino cual es la clave de busqueda
		miBuscador.cambiarClave("iron man");
		
		//ejecuto el metodo buscar() del objeto miBuscador
		miBuscador.buscar();
		
		//mostrar cuantos resultados encontro el buscador
		System.out.println("Hemos encontrado "+ miBuscador.getCantRes() + " Resultados para " + miBuscador.getClaveBusqueda());
	}
}
