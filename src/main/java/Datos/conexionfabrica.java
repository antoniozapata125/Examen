package Datos;

import Inter.iconexion;
import implemts.ConexionMysQl;
import implemts.ConexionPostgresql;
import implemts.ConexionSQlServer;
import implemts.ConexionVacia;

public class conexionfabrica {
	public iconexion getConexion(String motor) {
		if (motor == null ) {
			return new ConexionVacia();
			
		}
		if (motor.equalsIgnoreCase("Postgresql")) {
			return new ConexionPostgresql();
		}if (motor.equalsIgnoreCase("SQL SERVER")) {
			return new ConexionSQlServer();
		}if (motor.equalsIgnoreCase("MySQL")) {
			return new ConexionMysQl();
		}
		return new ConexionVacia(); 
		}
	}


