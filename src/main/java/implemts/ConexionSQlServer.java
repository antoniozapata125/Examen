package implemts;

import Inter.iconexion;

public class ConexionSQlServer implements iconexion {
	private String host;
	private String puerto;
	private String usuario;
	private String contraseña;
	
	public ConexionSQlServer() {
		this.host = "localhost";
		this.puerto = "1433";
		this.usuario = "postgres";
		this.contraseña = "50288840";
	}
	
	
	@Override
	public void conectar() {
		System.out.println("Se a conectado a la base de SQL Server");
		
	}
	
	
}
