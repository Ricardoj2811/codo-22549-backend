package ar.com.codoacodo.interfaces.mensajeria;

public class MainMensajeriaConMensajero {

	public static void main (String[] args) {
		
		String mensaje = "aprendiendo interfaces en java";
		String target = "";
		
		var mensajero = new Mensajero();
		
		switch (target) {
		case "A":
			mensajero.setMensajeria(new EnviarMailImpl());
		case "B":
			mensajero.setMensajeria(new EnviarHDImpl());
		case "C":
			mensajero.setMensajeria(new EnviarDBImpl());
		default:
			System.out.println("Opcion Invalida");
			break;
		}
		
		if(mensajero.tieneMensajeria()) {
			mensajero.mandarMensaje(mensaje);
		};
	}

}
