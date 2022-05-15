package Modelo;

import java.sql.Statement;

public class ModeloClientes {
	
	private ConexionMySQL mysql;
	
	public ModeloClientes(ConexionMySQL mysql) {
		this.mysql = mysql;
	}

	public void insertar(Cliente cliente) {
		
		try {
			String sqlQuery = "INSERT INTO clientes (Nombre, Apellido, Dirección, DNI, Fecha) VALUE (\"" 
					+ cliente.getNombre() + "\",\"" + cliente.getApellido() + "\",\"" + cliente.getDirección() 
					+ "\",\"" + cliente.getDNI() + "\",\"" + cliente.getFecha() + ");";
			mysql.insertQuery("VideoClub", sqlQuery);
		} catch (Exception e) {
			System.out.println("Fallo insercion modelo cliente");
		}
	}
	
	public void mostrarTodo() {
		
		try {
			String sqlQuery = "SELECT * FROM " + clientes +" ;";
			mysql.insertQuery("VideoClub", sqlQuery);
			Statement st = this.mysql.connectionObj();
			
		} catch (Exception e) {
			System.out.println("Fallo mostrar registros");
		}
		
	}
	
	public void update(Cliente cliente) {
		
		try {
			String sqlQuery = "UPDATE clientes SET (Nombre, Apellido, Dirección, DNI, Fecha) WHERE ID = " 
			+ cliente.getID() + ";";
			mysql.insertQuery("VideoClub", sqlQuery);
			
		} catch (Exception e) {
			System.out.println("Fallo Update modelo cliente");
		}
		
	}
}
