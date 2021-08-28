package Datos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Inter.iconexion;

@SpringBootApplication
public class Fabrica_Padre {

	public static void main(String[] args) {
		SpringApplication.run(Fabrica_Padre.class, args);
		
conexionfabrica Fabrica = new conexionfabrica();
		
		iconexion cx1 = Fabrica.getConexion("Postgresql");
		System.out.println();
		System.out.println("1.  Conexion base de datos a postgresql");
		System.out.println();
		System.out.println("--------------------------------");
		cx1.conectar();
		System.out.println("--------------------------------");
		
		
		iconexion cx2 = Fabrica.getConexion("Vacia");
		System.out.println();
		System.out.println("2.  Conexion vacia no hay ninguna base de datos");
		System.out.println();
		System.out.println("--------------------------------");
		cx2.conectar();
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		
		iconexion cx5 = Fabrica.getConexion("SQL Server");
		System.out.println();
		System.out.println("3.  Conexion a la base de datos de SQL Server");
		System.out.println();
		System.out.println("--------------------------------");
		cx5.conectar();
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");

		iconexion cx4 = Fabrica.getConexion("MysQL");
		System.out.println();
		System.out.println("4.	Conexion a la base de datos de MysQL Server");
		System.out.println();
		System.out.println("--------------------------------");
		cx4.conectar();
		System.out.println("--------------------------------");

		System.out.println("--------------------------------");
	}



	}


