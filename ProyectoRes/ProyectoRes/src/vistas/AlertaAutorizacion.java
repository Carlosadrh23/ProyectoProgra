package vistas;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextField;

public class AlertaAutorizacion {

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
					AlertaAutorizacion window = new AlertaAutorizacion();
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
	public AlertaAutorizacion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setAlwaysOnTop(true);
		frame.setResizable(false);
		
		frame.setBounds(0, 0, 545, 320);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 545, 320);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Autorización para modificar almacén");
		lblNewLabel.setFont(new Font("Inter", Font.BOLD, 16));
		lblNewLabel.setBounds(130, 30, 346, 30);
		panel.add(lblNewLabel);

		JButton btnNewButton = new JButton("CANCELAR");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Inter", Font.BOLD, 9));
		btnNewButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton.setIconTextGap(1);
		btnNewButton.setBounds(153, 224, 92, 49);
		ImageIcon a1 = new ImageIcon("img/cancelar.png");
		Image a2 = a1.getImage();
		Image a3 = a2.getScaledInstance(35, 35, Image.SCALE_SMOOTH);
		btnNewButton.setIcon(new ImageIcon(a3));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setContentAreaFilled(true);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("ACEPTAR");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Inter", Font.BOLD, 10));
		btnNewButton_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_1.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_1.setIconTextGap(1);
		btnNewButton_1.setBounds(304, 225, 92, 49);
		ImageIcon portada1 = new ImageIcon("img/aceptar.png");
		Image portada2 = portada1.getImage();
		Image portada3 = portada2.getScaledInstance(35, 35, Image.SCALE_SMOOTH);
		btnNewButton_1.setIcon(new ImageIcon(portada3));
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setContentAreaFilled(true);
		panel.add(btnNewButton_1);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(162, 106, 44, 25);
		ImageIcon b1 = new ImageIcon("img/admin4.png");
		Image b2 = b1.getImage();
		Image b3 = b2.getScaledInstance(44, 25, Image.SCALE_SMOOTH);
		panel.setLayout(null);
		lblNewLabel_2.setIcon(new ImageIcon(b3));
		panel.add(lblNewLabel_2);

		textField = new JTextField("Administrador");
		textField.setFont(new Font("Inter", Font.BOLD, 12));
		textField.setBackground(new Color(242, 255, 168));
		textField.setBounds(153, 106, 243, 25);
		panel.add(textField);
		textField.setEditable(false);
		textField.setHorizontalAlignment(JTextField.CENTER);
		textField.setColumns(10);
		textField.setBorder(BorderFactory.createEmptyBorder());
		textField.setOpaque(true);
		textField.setFocusable(false);
		
		JLabel lblNewLabel_1 = new JLabel(""); // imagen del candado 
		lblNewLabel_1.setBounds(161, 165, 45, 30);
		ImageIcon c1 = new ImageIcon("img/candado_1.png");
		Image c2 = c1.getImage();
		Image c3 = c2.getScaledInstance(44, 30, Image.SCALE_SMOOTH);
		lblNewLabel_1.setIcon(new ImageIcon(c3));
		panel.add(lblNewLabel_1);

		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Inter", Font.PLAIN, 12));
		textField_1.setBackground(new Color(242, 255, 168));
		textField_1.setBounds(153, 165, 243, 30);
		textField_1.setColumns(10);
		textField_1.setHorizontalAlignment(JTextField.CENTER);
		panel.add(textField_1);
		

	}
}