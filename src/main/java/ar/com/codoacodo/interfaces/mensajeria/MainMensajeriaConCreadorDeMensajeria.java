package ar.com.codoacodo.interfaces.mensajeria;

public class MainMensajeriaConCreadorDeMensajeria {

	public static void main (String[] args) {
		
		String mensaje = "aprendiendo interfaces en java";
		String target = "";
		
		IEnviar msj = CreadorDeMensajeria.crearMensajeria(target);
		
		msj.enviar(mensaje);
	}

}
