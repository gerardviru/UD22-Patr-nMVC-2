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
import javax.swing.JScrollBar;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class VistaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void vistaR() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaPrincipal frame = new VistaPrincipal();
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
	public VistaPrincipal() {
		setTitle("Muestra Datos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnRegistro = new JMenu("Nuevo Registro");
		mnRegistro.setIcon(null);
		mnRegistro.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mnRegistro);
		
		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mntmCliente.setHorizontalAlignment(SwingConstants.LEFT);
		mnRegistro.add(mntmCliente);
		
		JMenuItem mntmVideo = new JMenuItem("Videos");
		mnRegistro.add(mntmVideo);
		
		JMenu mnMostrar = new JMenu("Buscar");
		menuBar.add(mnMostrar);
		
		JMenuItem mntmCliente_1 = new JMenuItem("Cliente");
		mntmCliente_1.setHorizontalAlignment(SwingConstants.LEFT);
		mnMostrar.add(mntmCliente_1);
		
		JMenuItem mntmVideo_1 = new JMenuItem("Videos");
		mnMostrar.add(mntmVideo_1);
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
		table.setBounds(38, 177, 557, 224);
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
		));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/com/sun/javafx/scene/web/skin/Undo_16x16_JFX.png")));
		btnNewButton.setBounds(431, 92, 49, 31);
		contentPane.add(btnNewButton);
	}
}
