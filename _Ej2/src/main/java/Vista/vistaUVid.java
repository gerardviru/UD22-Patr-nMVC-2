package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class vistaUVid extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void vistaUVid() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaUVid frame = new vistaUVid();
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
	public vistaUVid() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUpgradeTablaVideos = new JLabel("Upgrade de la tabla Videos");
		lblUpgradeTablaVideos.setHorizontalAlignment(SwingConstants.CENTER);
		lblUpgradeTablaVideos.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblUpgradeTablaVideos.setBounds(123, 21, 272, 19);
		contentPane.add(lblUpgradeTablaVideos);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(31, 63, 46, 14);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(31, 88, 30, 22);
		contentPane.add(comboBox);
		
		JLabel lblTitle = new JLabel("Titulo:");
		lblTitle.setBounds(31, 132, 86, 14);
		contentPane.add(lblTitle);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(31, 156, 185, 20);
		contentPane.add(textField);
		
		JLabel lblDirector = new JLabel("Director: ");
		lblDirector.setBounds(31, 198, 86, 14);
		contentPane.add(lblDirector);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(31, 223, 185, 20);
		contentPane.add(textField_1);
		
		JLabel lblID_cli = new JLabel("ID Cliente:");
		lblID_cli.setBounds(31, 271, 86, 14);
		contentPane.add(lblID_cli);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(31, 296, 185, 20);
		contentPane.add(textField_2);
		
		JButton btnEnviarDatos = new JButton("Aceptar");
		btnEnviarDatos.setFont(new Font("SansSerif", Font.PLAIN, 11));
		btnEnviarDatos.setBounds(31, 360, 89, 23);
		contentPane.add(btnEnviarDatos);
	}

}
