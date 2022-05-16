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
import Modelo.ModeloVideos;
import Modelo.Video;
import Vista.VistaConexion;
import Vista.VistaPrincipal;

public class Controlador {

	// Attributes
	private VistaConexion vistaConexion;
	private VistaPrincipal vistaPrincipal;
	private ConexionMySQL conexionMySQL;
	private ModeloClientes modeloClientes;
	private ModeloVideos modeloVideos;

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
		vistaPrincipal = new VistaPrincipal();
		vistaPrincipal.setVisible(true);

		
		// Inicializar vista Conexion mysql
		vistaConexion = new VistaConexion();
		vistaConexion.setVisible(true);
		
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

		listenerActualziarBtn();

	}

	/**
	 * Accion boton "Actualizar"
	 */
	public void listenerActualziarBtn() {
		vistaPrincipal.actualizarBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int selItem = vistaPrincipal.desplegable.getSelectedIndex();
				
				switch (selItem) {
				case 0:
					modeloClientes = new ModeloClientes(conexionMySQL);
					ArrayList<Cliente> clientes = modeloClientes.mostrarTodos();

					vistaPrincipal.getTextArea().setText("");
					for (int i = 0; i < clientes.size(); i++) {
						Cliente cliente = clientes.get(i);
						String stringCliente = cliente.getID() + ". " + cliente.getNombre() + ", " + cliente.getApellido() 
						+ cliente.getDirección() + ", " + cliente.getDNI() + ", " + cliente.getFecha() + ", " + "\n";
						vistaPrincipal.getTextArea().append(stringCliente);

					}
					break;
				case 1:
					modeloVideos = new ModeloVideos(conexionMySQL);
					ArrayList<Video> videos = modeloVideos.mostrarTodos();
					
					vistaPrincipal.getTextArea().setText("");
					for (int i = 0; i < videos.size(); i++) {
						Video video = videos.get(i);
						vistaPrincipal.getTextArea().append(video.getID() + ". " + video.getTitle() + ", " + video.getDirector() + ", " + video.getId_cli() + "\n");
						
					}
					break;

				default:

					break;
				}

			}
		});
	}

}
