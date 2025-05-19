package vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JCheckBox;

public class AltaDeClientes {

	private JFrame frame;
	private JTextField txtAlejandro;
	private JTextField txtDaniel;
	private JTextField txtGonzales;
	private JTextField txtHernndez;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txtCalleTeotihuacn;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField txtLosOlivares;
	private JTextField txtLaPaz;
	private JTextField textField_4;
	private JTextField txtErickuabcsmx;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AltaDeClientes window = new AltaDeClientes();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AltaDeClientes() {
		try {
            UIManager.setLookAndFeel(new FlatLightLaf());  
            UIManager.put("TextComponent.arc", 5);//textfield redondeadas
            UIManager.put("Buttom.arc", 700); // Esquinas redondeadas
            UIManager.put("CheckBox.arc", 25);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setAlwaysOnTop(true);
		frame.setBounds(100, 100, 1150, 799);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 215));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Comedor");
		btnNewButton.setBounds(0, 0, 234, 49);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(50, 98, 115));
		btnNewButton.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ensamble");
		btnNewButton_1.setBounds(226, 0, 227, 49);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(50, 98, 115));
		btnNewButton_1.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Inventario");
		btnNewButton_2.setBounds(452, 0, 227, 49);
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(50, 98, 115));
		btnNewButton_2.setFont(new Font("Inter", Font.BOLD, 14));
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Clientes");
		btnNewButton_3.setBounds(677, 0, 234, 49);
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(50, 98, 115));
		btnNewButton_3.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("Usuarios");
		btnNewButton_4.setBounds(909, 0, 227, 49);
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(50, 98, 115));
		btnNewButton_4.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_4);
		
		RoundedPanel panel_1 = new RoundedPanel(10);
		panel_1.setForeground(new Color(128, 128, 128));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(176, 97, 807, 583);
		panel_1.setBorder(BorderFactory.createLineBorder(Color.GRAY, 0));//crea la line del borde
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Alta de clientes");
		lblNewLabel.setFont(new Font("Inter", Font.BOLD, 20));
		lblNewLabel.setBounds(333, 10, 235, 25);
		panel_1.add(lblNewLabel);
		
		
		RoundedPanel panel_2 = new RoundedPanel(10);
		panel_2.setForeground(new Color(128, 128, 128));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(41, 45, 297, 283);
		panel_2.setBorder(BorderFactory.createLineBorder(Color.GRAY, 0));//crea la linea del borde
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		
		JLabel lblNewLabel_1 = new JLabel("Información básica");
		lblNewLabel_1.setFont(new Font("Inter", Font.BOLD, 16));
		lblNewLabel_1.setBounds(71, 0, 151, 21);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Primer nombre:");
		lblNewLabel_2.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 41, 118, 21);
		panel_2.add(lblNewLabel_2);
		
		txtAlejandro = new JTextField();
		txtAlejandro.setText("Erick");
		txtAlejandro.setFont(new Font("Inter", Font.PLAIN, 14));
		txtAlejandro.setBackground(new Color(237, 237, 237));
		txtAlejandro.setBounds(154, 41, 96, 21);
		panel_2.add(txtAlejandro);
		txtAlejandro.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Segundo nombre:");
		lblNewLabel_3.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 88, 135, 24);
		panel_2.add(lblNewLabel_3);
		
		txtDaniel = new JTextField();
		txtDaniel.setText("Daniel");
		txtDaniel.setFont(new Font("Inter", Font.PLAIN, 14));
		txtDaniel.setBackground(new Color(237, 237, 237));
		txtDaniel.setBounds(154, 92, 96, 21);
		panel_2.add(txtDaniel);
		txtDaniel.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Primer apellido: ");
		lblNewLabel_4.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_4.setBounds(10, 150, 135, 19);
		panel_2.add(lblNewLabel_4);
		
		txtGonzales = new JTextField();
		txtGonzales.setText("González");
		txtGonzales.setBackground(new Color(237, 237, 237));
		txtGonzales.setFont(new Font("Inter", Font.PLAIN, 14));
		txtGonzales.setBounds(154, 151, 96, 21);
		panel_2.add(txtGonzales);
		txtGonzales.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Segundo apellido:");
		lblNewLabel_5.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_5.setBounds(10, 208, 128, 21);
		panel_2.add(lblNewLabel_5);
		
		txtHernndez = new JTextField();
		txtHernndez.setText("Martínez");
		txtHernndez.setFont(new Font("Inter", Font.PLAIN, 14));
		txtHernndez.setBackground(new Color(237, 237, 237));
		txtHernndez.setBounds(154, 209, 96, 21);
		panel_2.add(txtHernndez);
		txtHernndez.setColumns(10);
		
		RoundedPanel panel_3 = new RoundedPanel(10);
		panel_3.setForeground(new Color(128, 128, 128));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(41, 359, 297, 86);
		panel_3.setBorder(BorderFactory.createLineBorder(Color.GRAY, 0));//crea la line del borde
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Fecha de nacimiento");
		lblNewLabel_6.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(80, 0, 150, 13);
		panel_3.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Día:");
		lblNewLabel_7.setFont(new Font("Inter", Font.BOLD, 12));
		lblNewLabel_7.setBounds(10, 32, 45, 13);
		panel_3.add(lblNewLabel_7);
		
		textField_1 = new JTextField();
		textField_1.setText("24");
		textField_1.setBackground(new Color(237, 237, 237));
		textField_1.setFont(new Font("Inter", Font.PLAIN, 11));
		textField_1.setBounds(42, 30, 34, 19);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Mes:");
		lblNewLabel_8.setFont(new Font("Inter", Font.BOLD, 12));
		lblNewLabel_8.setBounds(90, 32, 45, 13);
		panel_3.add(lblNewLabel_8);
		
		textField_2 = new JTextField();
		textField_2.setText("11");
		textField_2.setFont(new Font("Inter", Font.PLAIN, 11));
		textField_2.setBackground(new Color(237, 237, 237));
		textField_2.setBounds(124, 30, 34, 19);
		panel_3.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Año:");
		lblNewLabel_9.setFont(new Font("Inter", Font.BOLD, 12));
		lblNewLabel_9.setBounds(185, 33, 34, 13);
		panel_3.add(lblNewLabel_9);
		
		textField_3 = new JTextField();
		textField_3.setText("1998");
		textField_3.setFont(new Font("Inter", Font.PLAIN, 11));
		textField_3.setBackground(new Color(237, 237, 237));
		textField_3.setBounds(220, 30, 45, 19);
		panel_3.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Sexo:");
		lblNewLabel_10.setFont(new Font("Inter", Font.BOLD, 16));
		lblNewLabel_10.setBounds(51, 455, 43, 25);
		panel_1.add(lblNewLabel_10);
		
		
		RoundedPanel panel_4 = new RoundedPanel(10);
		panel_4.setForeground(new Color(128, 128, 128));
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(466, 45, 297, 283);
		panel_4.setBorder(BorderFactory.createLineBorder(Color.GRAY, 0));//crea la line del borde
		panel_1.add(panel_4);
		panel_4.setLayout(null);

		
		JLabel lblNewLabel_11 = new JLabel("Dirección");
		lblNewLabel_11.setFont(new Font("Inter", Font.BOLD, 16));
		lblNewLabel_11.setBounds(110, 0, 96, 13);
		panel_4.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Calle:");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_12.setBounds(10, 30, 45, 26);
		panel_4.add(lblNewLabel_12);
		
		txtCalleTeotihuacn = new JTextField();
		txtCalleTeotihuacn.setBackground(new Color(237, 237, 237));
		txtCalleTeotihuacn.setBackground(new Color(237, 237, 237));
		txtCalleTeotihuacn.setText("Calle Teotihuacán");
		txtCalleTeotihuacn.setBackground(new Color(237, 237, 237));
		txtCalleTeotihuacn.setFont(new Font("Inter", Font.PLAIN, 14));
		txtCalleTeotihuacn.setBounds(79, 30, 208, 26);
		panel_4.add(txtCalleTeotihuacn);
		txtCalleTeotihuacn.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("No.");
		lblNewLabel_13.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_13.setBounds(10, 93, 45, 18);
		panel_4.add(lblNewLabel_13);
		
		textField_5 = new JTextField();
		textField_5.setText("1946");
		textField_5.setBackground(new Color(237, 237, 237));
		textField_5.setFont(new Font("Inter", Font.PLAIN, 14));
		textField_5.setBounds(39, 88, 62, 26);
		panel_4.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("C.P.");
		lblNewLabel_14.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_14.setBounds(154, 93, 45, 18);
		panel_4.add(lblNewLabel_14);
		
		textField_6 = new JTextField();
		textField_6.setText("21095");
		textField_6.setBackground(new Color(237, 237, 237));
		textField_6.setFont(new Font("Inter", Font.PLAIN, 14));
		textField_6.setBounds(190, 89, 62, 26);
		panel_4.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Colonia");
		lblNewLabel_15.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_15.setBounds(10, 152, 69, 26);
		panel_4.add(lblNewLabel_15);
		
		txtLosOlivares = new JTextField();
		txtLosOlivares.setText("Los olivos");
		txtLosOlivares.setBackground(new Color(237, 237, 237));
		txtLosOlivares.setFont(new Font("Inter", Font.PLAIN, 14));
		txtLosOlivares.setBounds(79, 150, 208, 26);
		panel_4.add(txtLosOlivares);
		txtLosOlivares.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Ciudad");
		lblNewLabel_16.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_16.setBounds(10, 219, 69, 26);
		panel_4.add(lblNewLabel_16);
		
		txtLaPaz = new JTextField();
		txtLaPaz.setBackground(new Color(237, 237, 237));
		txtLaPaz.setFont(new Font("Inter", Font.PLAIN, 14));
		txtLaPaz.setText("La paz");
		txtLaPaz.setBounds(67, 219, 62, 26);
		panel_4.add(txtLaPaz);
		txtLaPaz.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("Estado");
		lblNewLabel_17.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_17.setBounds(154, 219, 52, 26);
		panel_4.add(lblNewLabel_17);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Inter", Font.PLAIN, 14));
		textField_4.setBackground(new Color(237, 237, 237));
		textField_4.setBounds(205, 221, 62, 26);
		panel_4.add(textField_4);
		textField_4.setColumns(10);
		
		
		RoundedPanel panel_5 = new RoundedPanel(10);
		panel_5.setForeground(new Color(128, 128, 128));
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(466, 353, 297, 117);
		panel_5.setBorder(BorderFactory.createLineBorder(Color.GRAY, 0));//crea la line del borde
		panel_1.add(panel_5);
		panel_5.setLayout(null);

		
		JLabel lblNewLabel_18 = new JLabel("Datos de contacto");
		lblNewLabel_18.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_18.setBounds(92, 0, 149, 13);
		panel_5.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Correo");
		lblNewLabel_19.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_19.setBounds(10, 32, 61, 13);
		panel_5.add(lblNewLabel_19);
		
		txtErickuabcsmx = new JTextField();
		txtErickuabcsmx.setBackground(new Color(237, 237, 237));
		txtErickuabcsmx.setFont(new Font("Inter", Font.PLAIN, 14));
		txtErickuabcsmx.setText("erick@uabcs.mx");
		txtErickuabcsmx.setBounds(77, 30, 191, 19);
		panel_5.add(txtErickuabcsmx);
		txtErickuabcsmx.setColumns(10);
		
		JLabel lblNewLabel_20 = new JLabel("Teléfono");
		lblNewLabel_20.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_20.setBounds(10, 77, 73, 13);
		panel_5.add(lblNewLabel_20);
		
		textField_7 = new JTextField();
		textField_7.setBackground(new Color(237, 237, 237));
		textField_7.setText("6121659613");
		textField_7.setFont(new Font("Inter", Font.PLAIN, 14));
		textField_7.setBounds(77, 75, 191, 19);
		panel_5.add(textField_7);
		textField_7.setColumns(10);
		JButton btnNewButton_6 = new JButton("CANCELAR");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6.setFont(new Font("Inter", Font.BOLD, 9));
		btnNewButton_6.setBounds(303, 486, 85, 60);
		btnNewButton_6.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_6.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_6.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_6.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_6.setIconTextGap(1);
		ImageIcon b1 = new ImageIcon("img/cancelar.png");
		Image b2 = b1.getImage();
		Image b3 = b2.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		btnNewButton_6.setIcon(new ImageIcon(b3));
		btnNewButton_6.setFocusPainted(false);
		btnNewButton_6.setContentAreaFilled(true);
		panel_1.add(btnNewButton_6);
		
		//boton aceptar
		JButton btnNewButton_7 = new JButton("ACEPTAR");
		btnNewButton_7.setFont(new Font("Inter", Font.BOLD, 9));
		btnNewButton_7.setBounds(419, 486, 85, 60);
		btnNewButton_7.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_7.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_7.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_7.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_7.setIconTextGap(1);
		ImageIcon a1 = new ImageIcon("img/aceptar.png");
		Image a2 = a1.getImage();
		Image a3 = a2.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		btnNewButton_7.setIcon(new ImageIcon(a3));
		btnNewButton_7.setFocusPainted(false);
		btnNewButton_7.setContentAreaFilled(true);
		panel_1.add(btnNewButton_7);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Masculino");
		chckbxNewCheckBox.setFont(new Font("Inter", Font.BOLD, 12));
		chckbxNewCheckBox.setBounds(105, 458, 93, 21);
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Femenino");
		chckbxNewCheckBox_1.setFont(new Font("Inter", Font.BOLD, 12));
		chckbxNewCheckBox_1.setBounds(232, 458, 93, 21);
		panel_1.add(chckbxNewCheckBox_1);
		
		
		
	}
}
