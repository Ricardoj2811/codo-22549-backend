package ar.com.codoacodo.herencia.interfaces;

import ar.com.codoacodo.herencia.Consola;
import ar.com.codoacodo.herencia.Vendedor;

public class MainConsolas {

	public static void main(String[] args) {
		
		Consola[] consolas = Vendedor.venderConsolas();
		
		for (int i = 0; i < consolas.length; i++) {
			Consola aux = consolas[i];
			aux.mostrar();
			
			//Quiero saber si aux implementa la interface IActualizable
			
			if(aux instanceof IActualizable) {
				System.out.println(aux.getNombre() + " es actualizable");
				//TipoQueQuiero nombre = (TipoQueQuiero)objeto;
				IActualizable instancia = (IActualizable)aux;
				instancia.actualizar();
			}else {
				System.out.println(aux.getNombre() + " NO es actualizable");
			}
			
			if(aux instanceof IJugable) {
				//TipoQueQuiero nombre = (TipoQueQuiero)objeto;
				System.out.println(aux.getNombre() + " es jugable");
				IJugable instancia = (IJugable)aux;
				instancia.jugar();
			}else {
				System.out.println(aux.getNombre() + " NO es Jugable");
			}
			
			System.out.println("------------------------");
		}

	}

}
