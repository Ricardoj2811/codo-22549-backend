package ar.com.codoacodo.interfaces.mensajeria;

public class MainMensajeria {

	public static void main (String[] args) {
		var Mensajeria = new Mensajeria();
		String mensaje = "aprendiendo interfaces en java";
		String target = "";
		
		switch (target) {
		case "A":
			Mensajeria.enviarMail(mensaje);
		case "B":
			Mensajeria.enviarHD(mensaje);
		case "C":
			Mensajeria.enviarADB(mensaje);
		default:
			System.out.println("Opcion Invalida");
			break;
		}

	}

}
