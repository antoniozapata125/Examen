package implemts;

import Inter.iconexion;

public class ConexionPostgresql implements iconexion {
	private String host;
	private String puerto;
	private String usuario;
	private String contraseña;
	
	public ConexionPostgresql() {
		this.host = "localhost";
		this.puerto = "5432";
		this.usuario = "postgres";
		this.contraseña = "50288840";
	}

	@Override
	public void conectar() {
		System.out.println("Se conecto a Postgresql");	
		
	}
}
