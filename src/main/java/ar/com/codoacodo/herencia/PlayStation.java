package ar.com.codoacodo.herencia;

import ar.com.codoacodo.herencia.interfaces.IActualizable;
import ar.com.codoacodo.herencia.interfaces.IJugable;

public class PlayStation extends Consola implements IActualizable, IJugable{ 
	
	private Integer version;
	
	public PlayStation(Integer bit, Integer version) {
		super("PlayStation", 1024, "Sony");
		this.version = version;
	}
	
	public Integer getVersion() {
		return version;
	}
		
	@Override
	public String toString() {
		String toSatringDelPadre = super.toString();
		String toStringDeHijo = "PlayStation [version=" + version + "]";
		return toSatringDelPadre + toStringDeHijo;
	}

	@Override
	public void actualizar() {
		if(this.version == 3) {
			System.out.println("actualizando play" + this.version);
			System.out.println("conectando al servidor de sony");
			System.out.println("Descargando nuevo software");
		}else {
		System.out.println("play " + this.version + " no se puede actualizar");
		}
	}

	@Override
	public void jugar() {
		System.out.println("Encendiendo Play " + this.version);
		System.out.println("Cargando juegos del HD");
		System.out.println("todo listo seleccione juego");
	}
}

	
