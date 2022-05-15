package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class vistaU extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void vistaU() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaU frame = new vistaU();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public vistaU() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUpgradeDeValores = new JLabel("Modificación de la tabla Cliente");
		lblUpgradeDeValores.setHorizontalAlignment(SwingConstants.CENTER);
		lblUpgradeDeValores.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblUpgradeDeValores.setBounds(78, 11, 272, 19);
		contentPane.add(lblUpgradeDeValores);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setBounds(24, 128, 86, 14);
		contentPane.add(lblNombre);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(24, 153, 185, 20);
		contentPane.add(textField);
		
		JLabel lblApellido = new JLabel("Apellido: ");
		lblApellido.setBounds(24, 194, 86, 14);
		contentPane.add(lblApellido);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(24, 219, 185, 20);
		contentPane.add(textField_1);
		
		JLabel lblDireccion = new JLabel("Dirección: ");
		lblDireccion.setBounds(24, 261, 86, 14);
		contentPane.add(lblDireccion);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(24, 286, 185, 20);
		contentPane.add(textField_2);
		
		JLabel lblDNI = new JLabel("DNI: ");
		lblDNI.setBounds(24, 328, 86, 14);
		contentPane.add(lblDNI);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(24, 353, 185, 20);
		contentPane.add(textField_3);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(24, 384, 86, 14);
		contentPane.add(lblFecha);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(24, 409, 185, 20);
		contentPane.add(textField_4);
		
		JButton btnEnviarDatos = new JButton("Actualizar");
		btnEnviarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEnviarDatos.setFont(new Font("SansSerif", Font.PLAIN, 11));
		btnEnviarDatos.setBounds(24, 478, 89, 23);
		contentPane.add(btnEnviarDatos);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(24, 58, 46, 14);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(24, 83, 30, 22);
		contentPane.add(comboBox);
		
		JButton btnEnviarDatos_1 = new JButton("Eliminar");
		btnEnviarDatos_1.setFont(new Font("SansSerif", Font.PLAIN, 11));
		btnEnviarDatos_1.setBounds(289, 479, 89, 23);
		contentPane.add(btnEnviarDatos_1);
	}
}
