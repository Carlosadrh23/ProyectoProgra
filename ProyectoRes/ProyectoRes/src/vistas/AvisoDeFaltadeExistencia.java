package vistas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class AvisoDeFaltadeExistencia {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AvisoDeFaltadeExistencia window = new AvisoDeFaltadeExistencia();
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
	public AvisoDeFaltadeExistencia() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setAlwaysOnTop(true);
		frame.setResizable(false);
		frame.setBounds(100, 100, 1150, 799);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(313, 90, 545, 320);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hamburguesa clásica combo");
		lblNewLabel.setFont(new Font("Inter", Font.BOLD, 18));
		lblNewLabel.setBounds(145, 10, 281, 30);
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
		ImageIcon a1 =new ImageIcon("img/cancelar.png");
        Image a2= a1.getImage();
        Image a3=a2.getScaledInstance(35, 35,Image.SCALE_SMOOTH);
        btnNewButton .setIcon(new ImageIcon(a3));
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
		ImageIcon portada1 =new ImageIcon("img/aceptar.png");
        Image portada2= portada1.getImage();
        Image portada3=portada2.getScaledInstance(35, 35,Image.SCALE_SMOOTH);
        btnNewButton_1 .setIcon(new ImageIcon(portada3));
		panel.add(btnNewButton_1);
		
		JTextArea txtrSe = new JTextArea();
		txtrSe.setForeground(new Color(0, 0, 0));
		txtrSe.setEditable(false);
		txtrSe.setFont(new Font("Inter", Font.BOLD, 13));
		txtrSe.setText("Se agotaron las existencias\r\n          para este producto\r\n    \r\n    ");
		txtrSe.setBounds(178, 145, 182, 40);
		panel.add(txtrSe);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(232, 50, 75, 70);
		ImageIcon b1 =new ImageIcon("img/alerta.png");
        Image b2= b1.getImage();
        Image b3=b2.getScaledInstance(75, 70,Image.SCALE_SMOOTH);
        lblNewLabel_1 .setIcon(new ImageIcon(b3));
		panel.add(lblNewLabel_1);
	}
}
