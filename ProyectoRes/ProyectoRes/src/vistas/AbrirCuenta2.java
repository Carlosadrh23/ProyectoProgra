package vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class AbrirCuenta2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AbrirCuenta2 window = new AbrirCuenta2();
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
	public AbrirCuenta2() {
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
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ensamble");
		btnNewButton_1.setBounds(226, 0, 227, 49);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(50, 98, 115));
		btnNewButton_1.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Inventario");
		btnNewButton_2.setBounds(452, 0, 234, 49);
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(50, 98, 115));
		btnNewButton_2.setFont(new Font("Inter", Font.BOLD, 14));
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Clientes");
		btnNewButton_3.setBounds(677, 0, 234, 49);
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(50, 98, 115));
		btnNewButton_3.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Usuarios");
		btnNewButton_4.setBounds(909, 0, 227, 49);
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(50, 98, 115));
		btnNewButton_4.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_4);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBorder(new MatteBorder(0, 1, 0, 0, Color.BLACK));
		panel_1.setBounds(315, 136, 838, 591);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_5 = new JButton("HAMBURGUESAS");
		btnNewButton_5.setFont(new Font("Inter", Font.BOLD, 17));
		btnNewButton_5.setBackground(new Color(151, 216, 196));
		btnNewButton_5.setBounds(0, 0, 281, 88);
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("BONELESS");
		btnNewButton_6.setFont(new Font("Inter", Font.BOLD, 17));
		btnNewButton_6.setBackground(new Color(	179, 140, 180));
		btnNewButton_6.setBounds(280, 0, 260, 88);
		panel_1.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("PAPAS");
		btnNewButton_7.setFont(new Font("Inter", Font.BOLD, 17));
		btnNewButton_7.setBackground(new Color(141, 178, 206));
		btnNewButton_7.setBounds(540, 0, 276, 88);
		panel_1.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("BEBIDAS");
		btnNewButton_8.setFont(new Font("Inter", Font.BOLD, 17));
		btnNewButton_8.setBackground(new Color(228, 87, 46));
		btnNewButton_8.setBounds(0, 88, 281, 88);
		panel_1.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("COMBOS");
		btnNewButton_9.setFont(new Font("Inter", Font.BOLD, 17));
		btnNewButton_9.setBackground(new Color(215, 224, 166));
		btnNewButton_9.setBounds(280, 88, 260, 88);
		panel_1.add(btnNewButton_9);
		
		RoundedPanel panel_2 = new RoundedPanel(20);
		panel_2.setBackground(new Color(217, 217, 217));
		Border borde = BorderFactory.createLineBorder(Color.BLACK, 0);
        panel_2.setBorder(borde);
		panel_2.setBounds(56, 243, 704, 338);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_10 = new JButton("<html><div style='text-align:center;'>HAMBURGUESA COMBO CLÁSICO<br><br></div></html>");
		btnNewButton_10.setBackground(new Color(255, 255, 255));
		btnNewButton_10.setFont(new Font("Inter", Font.BOLD, 10));
		btnNewButton_10.setHorizontalTextPosition(SwingConstants.LEFT);
		btnNewButton_10.setVerticalTextPosition(SwingConstants.CENTER);
		btnNewButton_10.setIconTextGap(20);
		btnNewButton_10.setBounds(0, 0, 244, 90);
		ImageIcon p1 =new ImageIcon("img/hamburguesa1.png");
        Image p2= p1.getImage();
        Image p3=p2.getScaledInstance(50, 90,Image.SCALE_SMOOTH);
        btnNewButton_10 .setIcon(new ImageIcon(p3));
		panel_2.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("<html><div style='text-align:center;'>HAMBURGUESA CON CHAMPIÑÓN COMBO<br><br></div></html>");
		btnNewButton_11.setBackground(new Color(255, 255, 255));
		btnNewButton_11.setFont(new Font("Inter", Font.BOLD, 10));
		btnNewButton_11.setHorizontalTextPosition(SwingConstants.LEFT);
		btnNewButton_11.setVerticalTextPosition(SwingConstants.CENTER);
		btnNewButton_11.setIconTextGap(20);
		btnNewButton_11.setBounds(237, 0, 244, 90);
		ImageIcon a1 =new ImageIcon("img/hamburguesa2.png");
        Image a2= a1.getImage();
        Image a3=a2.getScaledInstance(50, 90,Image.SCALE_SMOOTH);
        btnNewButton_11 .setIcon(new ImageIcon(a3));
		panel_2.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("<html><div style='text-align:center;'>HAMBURGUESA HAWAIANA COMBO<br><br></div></html>");
		btnNewButton_12.setBackground(new Color(255, 255, 255));
		btnNewButton_12.setFont(new Font("Inter", Font.BOLD, 10));
		btnNewButton_12.setHorizontalTextPosition(SwingConstants.LEFT);
		btnNewButton_12.setVerticalTextPosition(SwingConstants.CENTER);
		btnNewButton_12.setIconTextGap(20);
		btnNewButton_12.setBounds(479, 0, 225, 90);
		ImageIcon b1 =new ImageIcon("img/hamburguesa3.png");
        Image b2= b1.getImage();
        Image b3=p2.getScaledInstance(50, 90,Image.SCALE_SMOOTH);
        btnNewButton_12 .setIcon(new ImageIcon(b3));
		panel_2.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("Buscar por producto");
		btnNewButton_13.setFont(new Font("Inter", Font.BOLD, 12));
		btnNewButton_13.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton_13.setVerticalTextPosition(SwingConstants.CENTER);
		btnNewButton_13.setIconTextGap(20);
		btnNewButton_13.setBackground(new Color(217, 217, 217));
		ImageIcon c1 =new ImageIcon("img/lupa.png");
        Image c2= c1.getImage();
        Image c3=c2.getScaledInstance(50, 64,Image.SCALE_SMOOTH);
        btnNewButton_13 .setIcon(new ImageIcon(c3));
		btnNewButton_13.setBounds(36, 227, 227, 64);
		panel.add(btnNewButton_13);
		
		
		
		
		
		
		
		
	

	}
}
