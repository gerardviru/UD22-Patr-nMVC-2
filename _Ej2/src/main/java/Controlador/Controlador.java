package Controlador;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Modelo.Cliente;
import Modelo.Conexion;
import Modelo.ConexionMySQL;
import Modelo.ModeloClientes;
import Vista.VistaPrincipal;

public class Controlador {
	
	// Attributes
	private VistaPrincipal vistaPrincipal;
	private ConexionMySQL conexionMySQL;
	private ModeloClientes modeloClientes;
	
	// Constructors
	public Controlador() {
	}

	/**
	 * @return the vistaPrincipal
	 */
	public VistaPrincipal getVistaPrincipal() {
		return vistaPrincipal;
	}

	/**
	 * @param vistaPrincipal the vistaPrincipal to set
	 */
	public void setVistaPrincipal(VistaPrincipal vistaPrincipal) {
		this.vistaPrincipal = vistaPrincipal;
	}

	/**
	 * @return the conexionMySQL
	 */
	public ConexionMySQL getConexionMySQL() {
		return conexionMySQL;
	}

	/**
	 * @param conexionMySQL the conexionMySQL to set
	 */
	public void setConexionMySQL(ConexionMySQL conexionMySQL) {
		this.conexionMySQL = conexionMySQL;
	}
	
	
	
	/**
	 * @return the modeloClientes
	 */
	public ModeloClientes getModeloClientes() {
		return modeloClientes;
	}

	/**
	 * @param modeloClientes the modeloClientes to set
	 */
	public void setModeloClientes(ModeloClientes modeloClientes) {
		this.modeloClientes = modeloClientes;
	}

	/**
	 * Inicializar la vista principal
	 */
	public void init() {
		// Inicializar la vista principal
		VistaPrincipal vistaPrincipal = new VistaPrincipal();
		vistaPrincipal.crearVista(this);
		
		// Inicializar conexion mysql
		conexionMySQL = new ConexionMySQL();
		conexionMySQL.conectar();
		conexionMySQL.dropDB("VideoClub");
		
		// Crear base de datos si no existe
		conexionMySQL.createDB("VideoClub");
		Conexion conexion = new Conexion(conexionMySQL);
		conexion.crearTablaClientes();
		conexion.crearTablaVideos();
		conexion.insertarRegistrosClientes();
		conexion.insertarRegistrosVideos();
		
		modeloClientes = new ModeloClientes(conexionMySQL);
		ArrayList<Cliente> clientes = modeloClientes.mostrarTodos();
		
	}
	
}
