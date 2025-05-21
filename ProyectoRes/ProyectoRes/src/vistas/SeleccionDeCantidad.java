package vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class SeleccionDeCantidad {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeleccionDeCantidad window = new SeleccionDeCantidad();
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
	public SeleccionDeCantidad() {
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
		
		JLabel lblNewLabel = new JLabel("Hamburguesa clásica combo");
		lblNewLabel.setFont(new Font("Inter", Font.BOLD, 18));
		lblNewLabel.setBounds(135, 10, 281, 30);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Seleccióna la cantidad");
		lblNewLabel_1.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_1.setBounds(193, 63, 161, 13);
		panel.add(lblNewLabel_1);
		//boton -
		JButton btnNewButton = new JButton("-");
		btnNewButton.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(67, 117, 68, 59);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setContentAreaFilled(true);
		panel.add(btnNewButton);
		//boton de la cantidad
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(235, 117, 68, 59);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setContentAreaFilled(true);
		panel.add(btnNewButton_1);
		//boton *+*
		JButton btnNewButton_2 = new JButton("+");
		btnNewButton_2.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.setBounds(406, 117, 68, 59);
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setContentAreaFilled(true);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("CANCELAR");
		btnNewButton_3.setBackground(new Color(255, 255, 255));
		btnNewButton_3.setFont(new Font("Inter", Font.BOLD, 9));
		//QUITA las lineas que salen al picarle al boton 
		btnNewButton_3.setFocusPainted(false);
		btnNewButton_3.setContentAreaFilled(true);
		//TEXTO ABAJO DE LA IMAGEN
		btnNewButton_3.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_3.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_3.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_3.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_3.setIconTextGap(1);
		btnNewButton_3.setBounds(146, 224, 92, 49);
		//imagen
		ImageIcon a1 =new ImageIcon("img/cancelar.png");
        Image a2= a1.getImage();
        Image a3=a2.getScaledInstance(35, 35,Image.SCALE_SMOOTH);
        btnNewButton_3 .setIcon(new ImageIcon(a3));
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("ACEPTAR");
		btnNewButton_4.setBackground(new Color(255, 255, 255));
		btnNewButton_4.setFont(new Font("Inter", Font.BOLD, 9));
		//QUITA las lineas que salen al picarle al boton 
		btnNewButton_4.setFocusPainted(false);
		btnNewButton_4.setContentAreaFilled(true);
		//TEXTO ABAJO DE LA IMAGEN
		btnNewButton_4.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_4.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_4.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_4.setIconTextGap(1);
		btnNewButton_4.setBounds(295, 224, 92, 49);
		//IMAGEN
		ImageIcon portada1 =new ImageIcon("img/aceptar.png");
        Image portada2= portada1.getImage();
        Image portada3=portada2.getScaledInstance(35, 35,Image.SCALE_SMOOTH);
        btnNewButton_4 .setIcon(new ImageIcon(portada3));
		panel.add(btnNewButton_4);
	}
}
