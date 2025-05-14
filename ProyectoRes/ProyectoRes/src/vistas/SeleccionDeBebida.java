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

public class SeleccionDeBebida {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeleccionDeBebida window = new SeleccionDeBebida();
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
	public SeleccionDeBebida() {
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
		lblNewLabel.setBounds(135, 10, 281, 30);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Seleccióne el refresco");
		lblNewLabel_1.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_1.setBounds(193, 63, 161, 13);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(67, 117, 68, 59);
		ImageIcon b1 =new ImageIcon("img/CocaColaLogo.png");
        Image b2= b1.getImage();
        Image b3=b2.getScaledInstance(68, 59,Image.SCALE_SMOOTH);
        btnNewButton .setIcon(new ImageIcon(b3));
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(235, 117, 68, 59);
		ImageIcon c1 =new ImageIcon("img/SpriteLogo.png");
        Image c2= c1.getImage();
        Image c3=c2.getScaledInstance(68, 59,Image.SCALE_SMOOTH);
        btnNewButton_1 .setIcon(new ImageIcon(c3));
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.setBounds(406, 117, 68, 59);
		ImageIcon d1 =new ImageIcon("img/MundetLogo.png");
        Image d2= d1.getImage();
        Image d3=d2.getScaledInstance(68, 59,Image.SCALE_SMOOTH);
        btnNewButton_2 .setIcon(new ImageIcon(d3));
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("CANCELAR");
		btnNewButton_3.setBackground(new Color(255, 255, 255));
		btnNewButton_3.setFont(new Font("Inter", Font.BOLD, 10));
		btnNewButton_3.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_3.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_3.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_3.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_3.setIconTextGap(1);
		btnNewButton_3.setBounds(146, 224, 92, 49);
		ImageIcon a1 =new ImageIcon("img/cancelar.png");
        Image a2= a1.getImage();
        Image a3=a2.getScaledInstance(35, 35,Image.SCALE_SMOOTH);
        btnNewButton_3 .setIcon(new ImageIcon(a3));
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("ACEPTAR");
		btnNewButton_4.setBackground(new Color(255, 255, 255));
		btnNewButton_4.setFont(new Font("Inter", Font.BOLD, 9));
		btnNewButton_4.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_4.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_4.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_4.setIconTextGap(1);
		btnNewButton_4.setBounds(295, 224, 92, 49);
		ImageIcon portada1 =new ImageIcon("img/aceptar.png");
        Image portada2= portada1.getImage();
        Image portada3=portada2.getScaledInstance(35, 35,Image.SCALE_SMOOTH);
        btnNewButton_4 .setIcon(new ImageIcon(portada3));
		panel.add(btnNewButton_4);
	}

}
