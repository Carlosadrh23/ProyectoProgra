package viewscopy;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Comedor {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Comedor window = new Comedor();
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
	public Comedor() {
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
		// boton de comedor
		JButton btnNewButton = new JButton("Comedor");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(50, 98, 115));
		btnNewButton.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton.setBounds(0, 0, 234, 49);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setContentAreaFilled(true);
		panel.add(btnNewButton);
		// boton de ensamble
		JButton btnNewButton_1 = new JButton("Ensamble");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(50, 98, 115));
		btnNewButton_1.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton_1.setBounds(230, 0, 234, 49);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setContentAreaFilled(true);
		panel.add(btnNewButton_1);
		// boton de inventario
		JButton btnNewButton_2 = new JButton("Inventario");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(50, 98, 115));
		btnNewButton_2.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton_2.setBounds(462, 0, 209, 49);
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setContentAreaFilled(true);
		panel.add(btnNewButton_2);
		// boton de clientes
		JButton btnNewButton_3 = new JButton("Clientes");
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(50, 98, 115));
		btnNewButton_3.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton_3.setBounds(669, 0, 234, 49);
		btnNewButton_3.setFocusPainted(false);
		btnNewButton_3.setContentAreaFilled(true);
		panel.add(btnNewButton_3);
		// boton de usuarios
		JButton btnNewButton_4 = new JButton("Usuarios");
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(50, 98, 115));
		btnNewButton_4.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton_4.setBounds(902, 0, 234, 49);
		btnNewButton_4.setFocusPainted(false);
		btnNewButton_4.setContentAreaFilled(true);
		panel.add(btnNewButton_4);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(259, 253, 240, 192);
		ImageIcon p1 = new ImageIcon("img/cuenta.png");
		Image p2 = p1.getImage();
		Image p3 = p2.getScaledInstance(234, 192, Image.SCALE_SMOOTH);
		lblNewLabel.setIcon(new ImageIcon(p3));
		panel.add(lblNewLabel);

		JButton btnNewButton_5 = new JButton("Abrir cuenta");
		btnNewButton_5.setBackground(new Color(217, 217, 217));
		btnNewButton_5.setFont(new Font("Inter", Font.BOLD, 13));
		btnNewButton_5.setBounds(259, 447, 240, 49);
		btnNewButton_5.setFocusPainted(false);
		btnNewButton_5.setContentAreaFilled(true);
		panel.add(btnNewButton_5);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(660, 253, 234, 192);
		ImageIcon portada1 = new ImageIcon("img/consulcuent.png");
		Image portada2 = portada1.getImage();
		Image portada3 = portada2.getScaledInstance(234, 192, Image.SCALE_SMOOTH);
		lblNewLabel_1.setIcon(new ImageIcon(portada3));
		panel.add(lblNewLabel_1);

		JButton btnNewButton_6 = new JButton("Consultar cuenta");
		btnNewButton_6.setBackground(new Color(217, 217, 217));
		btnNewButton_6.setFont(new Font("Inter", Font.BOLD, 13));
		btnNewButton_6.setBounds(660, 447, 234, 49);
		btnNewButton_6.setFocusPainted(false);
		btnNewButton_6.setContentAreaFilled(true);
		panel.add(btnNewButton_6);
	}

}
