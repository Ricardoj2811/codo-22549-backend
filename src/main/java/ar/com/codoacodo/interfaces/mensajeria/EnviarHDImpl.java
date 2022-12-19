package ar.com.codoacodo.interfaces.mensajeria;

public class EnviarHDImpl implements IEnviar{
	
	private String emailTarget = "destino@mail.com";
	private String emailSource = "yo@yo.com";
	private String provider = "gmail";
	
	public void enviar(String msj) {
		System.out.println("Enviando mail a " + emailTarget);
		System.out.println("Enviando desde " + emailSource);
		System.out.println("Usando: " + provider);
	}
}
