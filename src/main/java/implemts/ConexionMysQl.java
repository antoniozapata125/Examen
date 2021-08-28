package implemts;

import Inter.iconexion;

public class ConexionMysQl implements iconexion {
	private String host;
	private String puerto;
	private String usuario;
	private String contraseña;
	
	public void ConexionMysQL() {
		this.host = "localhost";
		this.puerto = "3306";
		this.usuario = "MysQl";
		this.contraseña = "50288840";
}

	@Override
	public void conectar() {
		System.out.println("Se conecto a la base da datos de MysQl");
		
	}
}
