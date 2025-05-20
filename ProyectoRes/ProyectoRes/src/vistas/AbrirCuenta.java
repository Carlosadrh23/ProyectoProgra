package vistas;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AbrirCuenta {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AbrirCuenta window = new AbrirCuenta();
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
	public AbrirCuenta() {
		initialize();
		frame.setLocationRelativeTo(null); // ← Centra la ventana
		frame.setVisible(true); 
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1150, 799);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 215));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		//boton de comedor
		JButton btnNewButton = new JButton("Comedor");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(50, 98, 115));
		btnNewButton.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton.setBounds(0, 0, 234, 49);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setContentAreaFilled(true);
		panel.add(btnNewButton);
		//boton de ensamble
		JButton btnNewButton_1 = new JButton("Ensamble");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(50, 98, 115));
		btnNewButton_1.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton_1.setBounds(230, 0, 234, 49);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setContentAreaFilled(true);
		panel.add(btnNewButton_1);
		//boton de inventario
		JButton btnNewButton_2 = new JButton("Inventario");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(50, 98, 115));
		btnNewButton_2.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton_2.setBounds(462, 0, 209, 49);
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setContentAreaFilled(true);
		panel.add(btnNewButton_2);
		//boton de clientes
		JButton btnNewButton_3 = new JButton("Clientes");
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(50, 98, 115));
		btnNewButton_3.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton_3.setBounds(669, 0, 234, 49);
		btnNewButton_3.setFocusPainted(false);
		btnNewButton_3.setContentAreaFilled(true);
		panel.add(btnNewButton_3);
		//boton de usuarios
		JButton btnNewButton_4 = new JButton("Usuarios");
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(50, 98, 115));
		btnNewButton_4.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton_4.setBounds(902, 0, 234, 49);
		btnNewButton_4.setFocusPainted(false);
		btnNewButton_4.setContentAreaFilled(true);
		panel.add(btnNewButton_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(306, 194, 534, 271);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Abrir Cuenta");
		lblNewLabel.setFont(new Font("Inter", Font.BOLD, 20));
		lblNewLabel.setBounds(202, 10, 138, 43);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MESA:");
		lblNewLabel_1.setFont(new Font("Inter", Font.BOLD, 18));
		lblNewLabel_1.setBounds(79, 74, 95, 49);
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBackground(new Color(	237, 237, 237));
		textField.setBounds(139, 92, 46, 19);
		textField.setHorizontalAlignment(JTextField.CENTER);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("No.PERSONAS:");
		lblNewLabel_2.setFont(new Font("Inter", Font.BOLD, 18));
		lblNewLabel_2.setBounds(274, 74, 153, 49);
		panel_1.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(	237, 237, 237));
		textField_1.setBounds(413, 92, 46, 19);
		textField_1.setHorizontalAlignment(JTextField.CENTER);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_5 = new JButton("CANCELAR");
		btnNewButton_5.setBackground(new Color(255, 255, 255));
		btnNewButton_5.setFont(new Font("Inter", Font.BOLD, 10));
		btnNewButton_5.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_5.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_5.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_5.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_5.setIconTextGap(1);
		btnNewButton_5.setBounds(139, 181, 103, 49);
		btnNewButton_5.setFocusPainted(false);
		btnNewButton_5.setContentAreaFilled(true);
		ImageIcon portada1 =new ImageIcon("img/cancelar.png");
        Image portada2= portada1.getImage();
        Image portada3=portada2.getScaledInstance(35, 35,Image.SCALE_SMOOTH);
        btnNewButton_5 .setIcon(new ImageIcon(portada3));
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("ACEPTAR");
		btnNewButton_6.setBackground(new Color(255, 255, 255));
		btnNewButton_6.setFont(new Font("Ineter", Font.BOLD, 10));
		btnNewButton_6.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_6.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_6.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_6.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_6.setIconTextGap(1);
		btnNewButton_6.setBounds(294, 181, 95, 49);
		btnNewButton_6.setFocusPainted(false);
		btnNewButton_6.setContentAreaFilled(true);
		ImageIcon p1 =new ImageIcon("img/aceptar.png");
        Image p2= p1.getImage();
        Image p3=p2.getScaledInstance(35, 35,Image.SCALE_SMOOTH);
        btnNewButton_6 .setIcon(new ImageIcon(p3));
		panel_1.add(btnNewButton_6);
	}
}
