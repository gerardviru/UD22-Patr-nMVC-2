package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VistaC_cli extends JFrame {

	private JPanel contentPane;
	private JTextField TxtField_Nombre;
	private JTextField TxtField_Apellido;
	private JTextField TxtField_Direccion;
	private JTextField TxtField_DNI;
	private JTextField TxtField_Fecha;

	/**
	 * Launch the application.
	 */
	public static void vista() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaC_cli frame = new VistaC_cli();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Creacion de la vista Creación Tabla.
	 */
	public VistaC_cli() {
		setTitle("Insertar valores ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(750, 200, 450, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Introduce los valores de la tabla Cliente");
		lblTitulo.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(78, 11, 272, 19);
		contentPane.add(lblTitulo);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setBounds(20, 45, 86, 14);
		contentPane.add(lblNombre);
		
		TxtField_Nombre = new JTextField();
		TxtField_Nombre.setBounds(20, 69, 185, 20);
		contentPane.add(TxtField_Nombre);
		TxtField_Nombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido: ");
		lblApellido.setBounds(20, 111, 86, 14);
		contentPane.add(lblApellido);
		
		TxtField_Apellido = new JTextField();
		TxtField_Apellido.setColumns(10);
		TxtField_Apellido.setBounds(20, 136, 185, 20);
		contentPane.add(TxtField_Apellido);
		
		JLabel lblDireccion = new JLabel("Dirección: ");
		lblDireccion.setBounds(20, 184, 86, 14);
		contentPane.add(lblDireccion);
		
		TxtField_Direccion = new JTextField();
		TxtField_Direccion.setColumns(10);
		TxtField_Direccion.setBounds(20, 209, 185, 20);
		contentPane.add(TxtField_Direccion);
		
		JLabel lblDNI = new JLabel("DNI: ");
		lblDNI.setBounds(20, 254, 86, 14);
		contentPane.add(lblDNI);
		
		TxtField_DNI = new JTextField();
		TxtField_DNI.setColumns(10);
		TxtField_DNI.setBounds(20, 279, 185, 20);
		contentPane.add(TxtField_DNI);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(20, 324, 86, 14);
		contentPane.add(lblFecha);
		
		TxtField_Fecha = new JTextField();
		TxtField_Fecha.setColumns(10);
		TxtField_Fecha.setBounds(20, 349, 185, 20);
		contentPane.add(TxtField_Fecha);
		
		JButton btnEnviarDatos = new JButton("Aceptar");
		btnEnviarDatos.setFont(new Font("SansSerif", Font.PLAIN, 11));
		btnEnviarDatos.setBounds(20, 421, 89, 23);
		contentPane.add(btnEnviarDatos);
	}
}
