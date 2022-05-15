package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VistaC_vid extends JFrame {

	private JPanel contentPane;
	private JTextField TxtField_Title;
	private JTextField TxtField_Director;
	private JTextField TxtField_ID_Cli;

	/**
	 * Launch the application.
	 */
	public static void vista() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaC_vid frame = new VistaC_vid();
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
	public VistaC_vid() {
		setTitle("Insertar valores ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Introduce los valores de la tabla Videos");
		lblTitulo.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(78, 11, 272, 19);
		contentPane.add(lblTitulo);
		
		JLabel lblTitle = new JLabel("Titulo:");
		lblTitle.setBounds(20, 45, 86, 14);
		contentPane.add(lblTitle);
		
		TxtField_Title = new JTextField();
		TxtField_Title.setBounds(20, 69, 185, 20);
		contentPane.add(TxtField_Title);
		TxtField_Title.setColumns(10);
		
		JLabel lblDirector = new JLabel("Director: ");
		lblDirector.setBounds(20, 111, 86, 14);
		contentPane.add(lblDirector);
		
		TxtField_Director = new JTextField();
		TxtField_Director.setColumns(10);
		TxtField_Director.setBounds(20, 136, 185, 20);
		contentPane.add(TxtField_Director);
		
		JLabel lblID_cli = new JLabel("ID Cliente:");
		lblID_cli.setBounds(20, 184, 86, 14);
		contentPane.add(lblID_cli);
		
		TxtField_ID_Cli = new JTextField();
		TxtField_ID_Cli.setColumns(10);
		TxtField_ID_Cli.setBounds(20, 209, 185, 20);
		contentPane.add(TxtField_ID_Cli);
		
		JButton btnEnviarDatos = new JButton("Aceptar");
		btnEnviarDatos.setFont(new Font("SansSerif", Font.PLAIN, 11));
		btnEnviarDatos.setBounds(20, 273, 89, 23);
		contentPane.add(btnEnviarDatos);
	}
}
