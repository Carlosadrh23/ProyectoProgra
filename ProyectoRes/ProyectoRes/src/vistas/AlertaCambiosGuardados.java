package vistas;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

public class AlertaCambiosGuardados {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlertaCambiosGuardados window = new AlertaCambiosGuardados();
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
	public AlertaCambiosGuardados() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setAlwaysOnTop(true);
		frame.setBounds(198, 76, 526, 320);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 526, 291);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(213, 76, 103, 72);
		ImageIcon a1 =new ImageIcon("img/guardado.png");
        Image a2= a1.getImage();
        Image a3=a2.getScaledInstance(103, 72,Image.SCALE_SMOOTH);
        lblNewLabel .setIcon(new ImageIcon(a3));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cambios guardados con éxito");
		lblNewLabel_1.setFont(new Font("Inter", Font.BOLD, 13));
		lblNewLabel_1.setBounds(170, 158, 201, 23);
		panel.add(lblNewLabel_1);
		
		
	}
}
