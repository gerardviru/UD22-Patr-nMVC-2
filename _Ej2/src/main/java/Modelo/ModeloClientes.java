package Modelo;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ModeloClientes {

	private ConexionMySQL mysql;

	public ModeloClientes(ConexionMySQL mysql) {
		this.mysql = mysql;
	}

	public void insertar(Cliente cliente) {

		try {
			String sqlQuery = "INSERT INTO clientes (Nombre, Apellido, Dirección, DNI, Fecha) VALUE (\""
					+ cliente.getNombre() + "\",\"" + cliente.getApellido() + "\",\"" + cliente.getDirección() + "\",\""
					+ cliente.getDNI() + "\",\"" + cliente.getFecha() + ");";
			mysql.insertQuery("VideoClub", sqlQuery);
		} catch (Exception e) {
			System.out.println("Fallo insercion modelo cliente");
		}
	}

	public ArrayList<Cliente> mostrarTodos() {

		try {
			String sqlQuery = "SELECT * FROM clientes;";
			ResultSet rs = mysql.getAllRows("VideoClub", sqlQuery);

			ArrayList<Cliente> arrClientes = new ArrayList<Cliente>();
			
			while (rs.next()) {
				// Crear cliente y anadirlo al array
				Cliente cliente = new Cliente(rs.getLong("ID"), rs.getString("Nombre"), rs.getString("Apellido"), rs.getString("Direccion"),
						rs.getString("DNI"), rs.getDate("Fecha"));
				
				arrClientes.add(cliente);
			}
			
			return arrClientes;
			
		} catch (Exception e) {
			System.out.println("Fallo mostrar registros");
			System.out.println(e);

			return new ArrayList<Cliente>();
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
