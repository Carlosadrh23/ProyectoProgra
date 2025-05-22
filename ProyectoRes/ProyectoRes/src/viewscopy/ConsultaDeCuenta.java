package viewscopy;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultaDeCuenta {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaDeCuenta window = new ConsultaDeCuenta();
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
	public ConsultaDeCuenta() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setAlwaysOnTop(false);
		frame.setResizable(false);
		frame.setBounds(100, 100, 1150, 799);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JButton btnNewButton = new JButton("Comedor");
		btnNewButton.setBounds(0, 0, 234, 49);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(50, 98, 115));
		btnNewButton.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setContentAreaFilled(true);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Ensamble");
		btnNewButton_1.setBounds(226, 0, 227, 49);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(50, 98, 115));
		btnNewButton_1.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setContentAreaFilled(true);
		panel.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Inventario");
		btnNewButton_2.setBounds(452, 0, 234, 49);
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(50, 98, 115));
		btnNewButton_2.setFont(new Font("Inter", Font.BOLD, 14));
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setContentAreaFilled(true);
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Clientes");
		btnNewButton_3.setBounds(677, 0, 234, 49);
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(50, 98, 115));
		btnNewButton_3.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton_3.setFocusPainted(false);
		btnNewButton_3.setContentAreaFilled(true);
		panel.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("Usuarios");
		btnNewButton_4.setBounds(909, 0, 227, 49);
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(50, 98, 115));
		btnNewButton_4.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton_4.setFocusPainted(false);
		btnNewButton_4.setContentAreaFilled(true);
		panel.add(btnNewButton_4);

		JLabel lblNewLabel = new JLabel("Consulta de cuentas");
		lblNewLabel.setFont(new Font("Inter", Font.BOLD, 18));
		lblNewLabel.setBounds(477, 99, 268, 23);
		panel.add(lblNewLabel);

		JButton btnNewButton_5 = new JButton("M1");
		btnNewButton_5.setForeground(new Color(255, 255, 255));
		btnNewButton_5.setFont(new Font("Inter", Font.BOLD, 14));
		btnNewButton_5.setBackground(new Color(33, 0, 125));
		btnNewButton_5.setBounds(56, 207, 200, 160);
		// QUITA las lineas que salen al picarle al boton
		btnNewButton_5.setFocusPainted(false);
		btnNewButton_5.setContentAreaFilled(true);
		// TEXTO ABAJO DE LA IMAGEN
		btnNewButton_5.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_5.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_5.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_5.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_5.setIconTextGap(1);
		// IMAGEN
		ImageIcon a1 = new ImageIcon("img/mesa.png");
		Image a2 = a1.getImage();
		Image a3 = a2.getScaledInstance(160, 140, Image.SCALE_SMOOTH);
		btnNewButton_5.setIcon(new ImageIcon(a3));
		panel.add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("M2");
		btnNewButton_6.setForeground(new Color(255, 255, 255));
		btnNewButton_6.setFont(new Font("Inter", Font.BOLD, 14));
		btnNewButton_6.setBackground(new Color(33, 0, 125));
		btnNewButton_6.setBounds(326, 207, 200, 160);
		// QUITA las lineas que salen al picarle al boton
		btnNewButton_6.setFocusPainted(false);
		btnNewButton_6.setContentAreaFilled(true);
		// TEXTO ABAJO DE LA IMAGEN
		btnNewButton_6.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_6.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_6.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_6.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_6.setIconTextGap(1);
		// IMAGEN
		ImageIcon b1 = new ImageIcon("img/mesa.png");
		Image b2 = b1.getImage();
		Image b3 = b2.getScaledInstance(160, 140, Image.SCALE_SMOOTH);
		btnNewButton_6.setIcon(new ImageIcon(b3));
		panel.add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("M3");
		btnNewButton_7.setForeground(new Color(255, 255, 255));
		btnNewButton_7.setFont(new Font("Inter", Font.BOLD, 14));
		btnNewButton_7.setBackground(new Color(33, 0, 125));
		btnNewButton_7.setBounds(598, 207, 200, 160);
		// QUITA las lineas que salen al picarle al boton
		btnNewButton_7.setFocusPainted(false);
		btnNewButton_7.setContentAreaFilled(true);
		// TEXTO ABAJO DE LA IMAGEN
		btnNewButton_7.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_7.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_7.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_7.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_7.setIconTextGap(1);
		// IMAGEN
		ImageIcon c1 = new ImageIcon("img/mesa.png");
		Image c2 = c1.getImage();
		Image c3 = c2.getScaledInstance(160, 140, Image.SCALE_SMOOTH);
		btnNewButton_7.setIcon(new ImageIcon(c3));

		panel.add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("M4");
		btnNewButton_8.setForeground(new Color(255, 255, 255));
		btnNewButton_8.setFont(new Font("Inter", Font.BOLD, 14));
		btnNewButton_8.setBackground(new Color(33, 0, 125));
		btnNewButton_8.setBounds(868, 207, 200, 160);
		// QUITA las lineas que salen al picarle al boton
		btnNewButton_8.setFocusPainted(false);
		btnNewButton_8.setContentAreaFilled(true);
		// TEXTO ABAJO DE LA IMAGEN
		btnNewButton_8.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_8.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_8.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_8.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_8.setIconTextGap(1);
		// IMAGEN
		ImageIcon d1 = new ImageIcon("img/mesa.png");
		Image d2 = d1.getImage();
		Image d3 = d2.getScaledInstance(160, 140, Image.SCALE_SMOOTH);
		btnNewButton_8.setIcon(new ImageIcon(d3));
		panel.add(btnNewButton_8);
	}
}
