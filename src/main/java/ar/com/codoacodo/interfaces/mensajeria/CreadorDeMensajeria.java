package ar.com.codoacodo.interfaces.mensajeria;

public class CreadorDeMensajeria {
	
	public static IEnviar crearMensajeria(String target) {
		
		IEnviar mensajeria = null;
		
		switch (target) {
		case "A":
			mensajeria = new EnviarMailImpl();
		case "B":
			mensajeria = new EnviarHDImpl();
		case "C":
			mensajeria = new EnviarDBImpl();
		default:
			System.out.println("Opcion Invalida");
			break;
		}
		
		return mensajeria;
	}

}
