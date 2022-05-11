package Modelo;

public class modeloVideos {

	public void querys() {
		
		ConexionMySQL mysql = new ConexionMySQL();
		String sqlQuery = "";
		
		/* Conectar a mysql server */
		
		mysql.conectar();
		
		
		/* Crear base de datos Videos */
		
		mysql.createDB("Videos");
		
		/* Crear tabla videos */
		
		sqlQuery = "CREATE TABLE videos("
				+ "ID INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,"
				+ "Title VARCHAR(100) DEFAULT NULL ,"
				+ "Director VARCHAR(100) DEFAULT NULL,"
				+ "ID_cli INT(11) DEFAULT NULL,"
				+ "CONSTRAINT videos_fk FOREIGN KEY (ID_cli) REFERENCES cliente(ID) ON DELETE CASCADE ON UPDATE CASCADE);";
				
		mysql.insertQuery("Clientes", sqlQuery);
		
		/*
		 * Insertar registros en la tabla videos
		 */

		sqlQuery = "INSERT INTO videos (Title, Director,ID_cli) VALUE" 
		+ "(\"Cocina\",\"Arguiñano\",2),"
		+ "(\"Deportes\",\"Dani Parejo\",1),"
		+ "(\"Viajes\",\"Jesus Calleja\",3),"
		+ "(\"Cine\",\"Almodovar\",4),"
		+ "(\"Juegos\",\"Sergio\",5);";
		mysql.insertQuery("Clientes", sqlQuery);
	}
}
