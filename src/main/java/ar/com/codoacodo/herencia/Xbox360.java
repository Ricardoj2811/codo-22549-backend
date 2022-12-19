package ar.com.codoacodo.herencia;

import ar.com.codoacodo.herencia.interfaces.IActualizable;

public class Xbox360 extends Consola implements IActualizable{
	
	//Escribo explicitamente el constructor de Xbox360
	//Pero debo enviarle al padre los 3 parametros que me pide
	public Xbox360() {
		//la primer linea de una clase hija, es invocar al constructor del padre
		//cumpliendo con los paremtros que requiere
		super("Xbox360", 1024, "Microsoft");
	}

	@Override
	public void actualizar() {
		System.out.println("Conectando xbox al servidor de microsoft..");
		System.out.println("Descargando nuevo firmware..");
		System.out.println("Finalizando instalacion");
	}
}
