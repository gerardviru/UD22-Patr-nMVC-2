package Controlador;

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
	
	public void init() {
		// Inicializar la vista principal
		VistaPrincipal vistaPrincipal = new VistaPrincipal();
		vistaPrincipal.crearVista();
		vistaPrincipal = new VistaPrincipal();
		vistaPrincipal.crearVista();
		
		// Inicializar conexion mysql
		conexionMySQL = new ConexionMySQL();
		conexionMySQL.conectar();
		
	}
	
	
	
	
}
