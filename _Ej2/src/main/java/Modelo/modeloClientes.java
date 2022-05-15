package Modelo;

public class modeloClientes {
	
	public void querys() {
		
		ConexionMySQL mysql = new ConexionMySQL();
		String sqlQuery = "";
		
		/* Conectar a mysql server */
		
		mysql.conectar();
		
		
		/* Crear base de datos Clientes */
		
		mysql.createDB("Clientes");
		
		/* Crear tabla cliente */
		
		sqlQuery = "CREATE TABLE cliente ("
				+ "ID INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,"
				+ "Nombre VARCHAR(100) DEFAULT NULL ,"
				+ "Apellido VARCHAR(100) DEFAULT NULL,"
				+ "Dirección VARCHAR(100) DEFAULT NULL,"
				+ "DNI INT(11) DEFAULT NULL,"
				+ "Fecha date DEFAULT NULL);";
				
		mysql.insertQuery("Clientes", sqlQuery);
		
		
		/*
		 * Insertar registros en la tabla cliente
		 */

		sqlQuery = "INSERT INTO cliente(Nombre, Apellido, Dirección, DNI, Fecha) VALUE" 
		+ "(\"Manolo\",\"Garcia\",\"Calle Francia Nº4\",\"39324562\",\"1994/09/05\"),"
		+ "(\"Maria\",\"Ramirez\",\"Calle Argentera Nº7\",\"39247289\",\"1989/08/15\"),"
		+ "(\"Juan\",\"Garcia\",\"Calle Larios Nº1\",\"39183471\",\"1995/11/25\"),"
		+ "(\"Belen\",\"Gutierrez\",\"Calle Palacios Nº32\",\"39183948\",\"1990/05/17\"),"
		+ "(\"Azucena\",\"Monte\",\"Calle Nueve Nº10\",\"39192398\",\"1998/11/12\");";
		mysql.insertQuery("Clientes", sqlQuery);
	
	}
	
	
	
	
	
	
	
}
