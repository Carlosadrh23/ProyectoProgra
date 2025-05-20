package vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Usuario {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuario window = new Usuario();
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
	public Usuario() {
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
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(50, 98, 115));
		btnNewButton.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton.setBounds(0, 0, 234, 49);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Ensamble");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(50, 98, 115));
		btnNewButton_1.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton_1.setBounds(226, 0, 227, 49);
		panel.add(btnNewButton_1);
	

		JButton btnNewButton_2 = new JButton("Inventario");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(50, 98, 115));
		btnNewButton_2.setFont(new Font("Inter", Font.BOLD, 14));
		btnNewButton_2.setBounds(452, 0, 227, 49);
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Clientes");
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(50, 98, 115));
		btnNewButton_3.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton_3.setBounds(677, 0, 234, 49);
		panel.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("Usuarios");
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(50, 98, 115));
		btnNewButton_4.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton_4.setBounds(909, 0, 227, 49);
		panel.add(btnNewButton_4);
		
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN CLIENTES
		JPanel panelContenido = new JPanel();
		panelContenido.setBounds(909, 49, 227, 49);
		panelContenido.setLayout(new BorderLayout());
		panelContenido.setVisible(false);
		panelContenido.setOpaque(false);
		panel.add(panelContenido);

		btnNewButton_4.addActionListener(e -> {
			if (panelContenido.isVisible()) {
				panelContenido.setVisible(false);
				panelContenido.removeAll();
			} else {
				panelContenido.removeAll();
				panelContenido.add(new UsuarioCerrarSesion(), BorderLayout.CENTER);
				panelContenido.setVisible(true);
			}
			panelContenido.revalidate();
			panelContenido.repaint();
		});
	}

}
