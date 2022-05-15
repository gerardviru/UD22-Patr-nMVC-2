package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import javax.swing.DefaultComboBoxModel;

public class vistaR extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void vistaR() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaR frame = new vistaR();
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
	public vistaR() {
		setTitle("Muestra Datos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Selecciona la tabla que quiere mostrar");
		lblTitulo.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(172, 24, 261, 22);
		contentPane.add(lblTitulo);
		
		JComboBox<String> Desplegable = new JComboBox<String>();
		Desplegable.setModel(new DefaultComboBoxModel<String>(new String[] {"Tabla Cliente", "Tabla Video", "Ambas Tablas"}));
		Desplegable.setBounds(229, 92, 183, 31);
		contentPane.add(Desplegable);
		
		table = new JTable();
		table.setRowSelectionAllowed(false);
		table.setVisible(false);
		contentPane.add(table);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(51, 184, 536, 224);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"1", "2", "3", "4", "5", "6"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
	}
}
