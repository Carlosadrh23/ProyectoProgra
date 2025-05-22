package viewscopy;

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

public class AlertaSeAgotaronExistencias {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlertaSeAgotaronExistencias window = new AlertaSeAgotaronExistencias();
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
	public AlertaSeAgotaronExistencias() {
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
		lblNewLabel.setBounds(202, 60, 103, 72);
		ImageIcon a1 =new ImageIcon("img/alerta.png");
        Image a2= a1.getImage();
        Image a3=a2.getScaledInstance(103, 72,Image.SCALE_SMOOTH);
        lblNewLabel .setIcon(new ImageIcon(a3));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Hamburguesa clásica combo");
		lblNewLabel_2.setFont(new Font("Inter", Font.BOLD, 17));
		lblNewLabel_2.setBounds(140, 10, 263, 23);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("CANCELAR");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Inter", Font.BOLD, 9));
		btnNewButton.setBounds(149, 208, 85, 57);
		btnNewButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton.setIconTextGap(1);
		ImageIcon b1 = new ImageIcon("img/cancelar.png");
		Image b2 = b1.getImage();
		Image b3 = b2.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		btnNewButton.setIcon(new ImageIcon(b3));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setContentAreaFilled(true);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ACEPTAR");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Inter", Font.BOLD, 9));
		btnNewButton_1.setBounds(275, 209, 85, 57);
		btnNewButton_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_1.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_1.setIconTextGap(1);
		ImageIcon c1 = new ImageIcon("img/aceptar.png");
		Image c2 = c1.getImage();
		Image c3 = c2.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		btnNewButton_1.setIcon(new ImageIcon(c3));
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setContentAreaFilled(true);
		panel.add(btnNewButton_1);
		
		JTextArea txtrSeAgotaronLas = new JTextArea();
		txtrSeAgotaronLas.setText("Se agotaron las existencias\r\n      para este producto");
		txtrSeAgotaronLas.setFont(new Font("Inter", Font.BOLD, 13));
		txtrSeAgotaronLas.setBounds(170, 139, 237, 38);
		txtrSeAgotaronLas.setEditable(false);
		txtrSeAgotaronLas.setFocusable(false);
		panel.add(txtrSeAgotaronLas);
		
	}
}
