package Controlador;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputFilter.Config;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Modelo.Cliente;
import Modelo.Conexion;
import Modelo.ConexionMySQL;
import Modelo.ConfigConexion;
import Modelo.ModeloClientes;
import Modelo.ModeloVideos;
import Modelo.Video;
import Vista.VistaC_cli;
import Vista.VistaC_vid;
import Vista.VistaConexion;
import Vista.VistaPrincipal;
import Vista.VistaU;
import Vista.VistaUVid;

public class Controlador {

	// Attributes
	private VistaConexion vistaConexion;
	private VistaPrincipal vistaPrincipal;
	private ConexionMySQL conexionMySQL;
	private ModeloClientes modeloClientes;
	private ModeloVideos modeloVideos;
	private ConfigConexion configConexion;

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

		// Inicializar vista Conexion mysql
		vistaConexion = new VistaConexion();
		vistaConexion.setVisible(true);

		listenerConectarBtn();

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
						String stringCliente = cliente.getID() + ". " + cliente.getNombre() + ", "
								+ cliente.getApellido() + cliente.getDirección() + ", " + cliente.getDNI() + ", "
								+ cliente.getFecha() + ", " + "\n";
						vistaPrincipal.getTextArea().append(stringCliente);

					}
					break;
				case 1:
					modeloVideos = new ModeloVideos(conexionMySQL);
					ArrayList<Video> videos = modeloVideos.mostrarTodos();

					vistaPrincipal.getTextArea().setText("");
					for (int i = 0; i < videos.size(); i++) {
						Video video = videos.get(i);
						vistaPrincipal.getTextArea().append(video.getID() + ". " + video.getTitle() + ", "
								+ video.getDirector() + ", " + video.getId_cli() + "\n");

					}
					break;

				default:

					break;
				}

			}
		});
	}

	/**
	 * Listener boton "Conectar"
	 */
	public void listenerConectarBtn() {
		vistaConexion.btnConectar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Conectar");
				configConexion = new ConfigConexion();
				configConexion.setDireccion(vistaConexion.textFieldIP.getText());
				configConexion.setUser(vistaConexion.textFieldUser.getText());
				configConexion.setPass(vistaConexion.passwordField.getText());

				System.out.println(vistaConexion.textFieldIP.getText());
				System.out.println(vistaConexion.textFieldUser.getText());
				System.out.println(vistaConexion.passwordField.getText());

				conexionMySQL = new ConexionMySQL();
				conexionMySQL.conectar(configConexion);

				if (conexionMySQL.conexionEstablecida) {
					JOptionPane dialog = new JOptionPane();
					dialog.showMessageDialog(null, "Conectado a la base de datos con exito");
					vistaConexion.dispose();
					// Abrir vistaPrincipal
					abrirVistaPrincipal();

					// Crear base de datos si no existe
					conexionMySQL.dropDB("VideoClub");
					conexionMySQL.createDB("VideoClub");
					Conexion conexion = new Conexion(conexionMySQL);
					conexion.crearTablaClientes();
					conexion.crearTablaVideos();
					conexion.insertarRegistrosClientes();
					conexion.insertarRegistrosVideos();

				} else {
					JOptionPane dialog = new JOptionPane();
					dialog.showMessageDialog(null, "Conexión fallida");

				}

			}
		});
	}

	public void abrirVistaPrincipal() {
		// Inicializar la vista principal
		vistaPrincipal = new VistaPrincipal();
		vistaPrincipal.setVisible(true);
		listenerActualziarBtn();
		listenerNuevoClienteMenu();
		listenerNuevoVideoMenu();
		listenerBuscarClienteMenu();
		listenerBuscarVideoMenu();
	}

	private void listenerNuevoClienteMenu() {
		vistaPrincipal.nuevoClienteMenu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				VistaC_cli vistaCli = new VistaC_cli();
				vistaCli.setVisible(true);
				vistaCli.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		
	}
	private void listenerBuscarClienteMenu() {
		vistaPrincipal.buscarClienteMenu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				VistaU vistaU = new VistaU();
				vistaU.setVisible(true);
				vistaU.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		
	}
	private void listenerBuscarVideoMenu() {
		vistaPrincipal.buscarVideoMenu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				VistaUVid vistaUVid = new VistaUVid();
				vistaUVid.setVisible(true);
				vistaUVid.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		
	}
	private void listenerNuevoVideoMenu() {
		vistaPrincipal.nuevoVideoMenu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				VistaC_vid vistaVid = new VistaC_vid();
				vistaVid.setVisible(true);
				vistaVid.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		
	}
}
