package vistas;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import com.formdev.flatlaf.FlatLightLaf;

import controllers.HomeController;

public class HomeView {
	public HomeView() {
		
	}
	
	public void Comedor() {
		
		JFrame frame = new JFrame();
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

	public void Clientes() {
		
		JFrame frame = new JFrame();
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

		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN CLIENTES
		JPanel panelContenido = new JPanel();
		panelContenido.setBounds(677, 49, 234, 65);
		panelContenido.setLayout(new BorderLayout());
		panelContenido.setVisible(false);
		panelContenido.setOpaque(false);
		panel.add(panelContenido);

		btnNewButton_3.addActionListener(e -> {
		    if (panelContenido.isVisible()) {
		        panelContenido.setVisible(false);
		        panelContenido.removeAll();
		    } else {
		        panelContenido.removeAll();
		        panelContenido.add(new HistorialyConsulta(), BorderLayout.CENTER);
		        panelContenido.setVisible(true);
		    }
		    panelContenido.revalidate();
		    panelContenido.repaint();
		});
		
		JButton btnNewButton_4 = new JButton("Usuarios");
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(50, 98, 115));
		btnNewButton_4.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton_4.setBounds(909, 0, 227, 49);
		panel.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(259, 253, 240, 192);
		ImageIcon p1 =new ImageIcon("img/cuenta.png");
        Image p2= p1.getImage();
        Image p3=p2.getScaledInstance(234, 192,Image.SCALE_SMOOTH);
        lblNewLabel .setIcon(new ImageIcon(p3));
		panel.add(lblNewLabel);
		
		JButton btnNewButton_5 = new JButton("Abrir cuenta");
		btnNewButton_5.setBackground(new Color(217, 217, 217));
		btnNewButton_5.setFont(new Font("Inter", Font.BOLD, 13));
		btnNewButton_5.setBounds(259, 447, 240, 49);
		panel.add(btnNewButton_5);
		btnNewButton_5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				HomeController cc = new HomeController();
				cc.abrirCuenta();
			}
		});
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(660, 253, 234, 192);
		ImageIcon portada1 =new ImageIcon("img/consulcuent.png");
        Image portada2= portada1.getImage();
        Image portada3=portada2.getScaledInstance(234, 192,Image.SCALE_SMOOTH);
        lblNewLabel_1 .setIcon(new ImageIcon(portada3));
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton_6 = new JButton("Consultar cuenta");
		btnNewButton_6.setBackground(new Color(217, 217, 217));
		btnNewButton_6.setFont(new Font("Inter", Font.BOLD, 13));
		btnNewButton_6.setBounds(660, 447, 234, 49);
		panel.add(btnNewButton_6);
	}
	public void AbrirCuenta() {
		
		JFrame frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1150, 799);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 215));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		//boton de comedor
		JButton btnNewButton = new JButton("Comedor");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(50, 98, 115));
		btnNewButton.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton.setBounds(0, 0, 234, 49);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setContentAreaFilled(true);
		panel.add(btnNewButton);
		//boton de ensamble
		JButton btnNewButton_1 = new JButton("Ensamble");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(50, 98, 115));
		btnNewButton_1.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton_1.setBounds(230, 0, 234, 49);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setContentAreaFilled(true);
		panel.add(btnNewButton_1);
		//boton de inventario
		JButton btnNewButton_2 = new JButton("Inventario");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(50, 98, 115));
		btnNewButton_2.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton_2.setBounds(462, 0, 209, 49);
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setContentAreaFilled(true);
		panel.add(btnNewButton_2);
		//boton de clientes
		JButton btnNewButton_3 = new JButton("Clientes");
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(50, 98, 115));
		btnNewButton_3.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton_3.setBounds(669, 0, 234, 49);
		btnNewButton_3.setFocusPainted(false);
		btnNewButton_3.setContentAreaFilled(true);
		panel.add(btnNewButton_3);
		//boton de usuarios
		JButton btnNewButton_4 = new JButton("Usuarios");
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(50, 98, 115));
		btnNewButton_4.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton_4.setBounds(902, 0, 234, 49);
		btnNewButton_4.setFocusPainted(false);
		btnNewButton_4.setContentAreaFilled(true);
		panel.add(btnNewButton_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(306, 194, 534, 271);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Abrir Cuenta");
		lblNewLabel.setFont(new Font("Inter", Font.BOLD, 20));
		lblNewLabel.setBounds(202, 10, 138, 43);
		panel_1.add(lblNewLabel);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("MESA:");
		lblNewLabel_1.setFont(new Font("Inter", Font.BOLD, 18));
		lblNewLabel_1.setBounds(79, 74, 95, 49);
		panel_1.add(lblNewLabel_1);
		
		JTextField textField = new JTextField();
		textField.setBackground(new Color(	237, 237, 237));
		textField.setBounds(139, 92, 46, 19);
		textField.setHorizontalAlignment(JTextField.CENTER);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("No.PERSONAS:");
		lblNewLabel_2.setFont(new Font("Inter", Font.BOLD, 18));
		lblNewLabel_2.setBounds(274, 74, 153, 49);
		panel_1.add(lblNewLabel_2);
		
		JTextField textField_1 = new JTextField();
		textField_1.setBackground(new Color(	237, 237, 237));
		textField_1.setBounds(413, 92, 46, 19);
		textField_1.setHorizontalAlignment(JTextField.CENTER);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_5 = new JButton("CANCELAR");
		btnNewButton_5.setBackground(new Color(255, 255, 255));
		btnNewButton_5.setFont(new Font("Inter", Font.BOLD, 10));
		btnNewButton_5.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_5.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_5.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_5.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_5.setIconTextGap(1);
		btnNewButton_5.setBounds(139, 181, 103, 49);
		btnNewButton_5.setFocusPainted(false);
		btnNewButton_5.setContentAreaFilled(true);
		ImageIcon portada1 =new ImageIcon("img/cancelar.png");
        Image portada2= portada1.getImage();
        Image portada3=portada2.getScaledInstance(35, 35,Image.SCALE_SMOOTH);
        btnNewButton_5 .setIcon(new ImageIcon(portada3));
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("ACEPTAR");
		btnNewButton_6.setBackground(new Color(255, 255, 255));
		btnNewButton_6.setFont(new Font("Ineter", Font.BOLD, 10));
		btnNewButton_6.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_6.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_6.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_6.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_6.setIconTextGap(1);
		btnNewButton_6.setBounds(294, 181, 95, 49);
		btnNewButton_6.setFocusPainted(false);
		btnNewButton_6.setContentAreaFilled(true);
		ImageIcon p1 =new ImageIcon("img/aceptar.png");
        Image p2= p1.getImage();
        Image p3=p2.getScaledInstance(35, 35,Image.SCALE_SMOOTH);
        btnNewButton_6 .setIcon(new ImageIcon(p3));
		panel_1.add(btnNewButton_6);
		 
		
	}
	public void AbrirCuenta2() {
	
		JFrame frame = new JFrame();
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
	public void AbrirCuenta3() {
	
		JFrame frame = new JFrame();
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
		btnNewButton_5.setFocusPainted(false);
		btnNewButton_5.setContentAreaFilled(true);
		panel_1.add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("BONELESS");
		btnNewButton_6.setFont(new Font("Inter", Font.BOLD, 17));
		btnNewButton_6.setBackground(new Color(179, 140, 180));
		btnNewButton_6.setBounds(280, 0, 260, 88);
		btnNewButton_6.setFocusPainted(false);
		btnNewButton_6.setContentAreaFilled(true);
		panel_1.add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("PAPAS");
		btnNewButton_7.setFont(new Font("Inter", Font.BOLD, 17));
		btnNewButton_7.setBackground(new Color(141, 178, 206));
		btnNewButton_7.setBounds(540, 0, 276, 88);
		btnNewButton_7.setFocusPainted(false);
		btnNewButton_7.setContentAreaFilled(true);
		panel_1.add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("BEBIDAS");
		btnNewButton_8.setFont(new Font("Inter", Font.BOLD, 17));
		btnNewButton_8.setBackground(new Color(228, 87, 46));
		btnNewButton_8.setBounds(0, 88, 281, 88);
		btnNewButton_8.setFocusPainted(false);
		btnNewButton_8.setContentAreaFilled(true);
		panel_1.add(btnNewButton_8);

		JButton btnNewButton_9 = new JButton("COMBOS");
		btnNewButton_9.setFont(new Font("Inter", Font.BOLD, 17));
		btnNewButton_9.setBackground(new Color(215, 224, 166));
		btnNewButton_9.setBounds(280, 88, 260, 88);
		btnNewButton_9.setFocusPainted(false);
		btnNewButton_9.setContentAreaFilled(true);
		panel_1.add(btnNewButton_9);

		String[] columnas = { "Cantidad", "Código", "Descripción", "Precio" };
		DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
		JTable	table = new JTable(modelo) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		table.setFont(new Font("Inter", Font.PLAIN, 14));
		table.setRowHeight(35);
		table.setShowGrid(true);
		table.setGridColor(Color.BLACK);
		table.getTableHeader().setReorderingAllowed(false);

		// Centrar contenido de celdas
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
		for (int i = 0; i < table.getColumnCount(); i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
		}

		// Estilo de encabezado
		JTableHeader header = table.getTableHeader();
		header.setFont(new Font("Inter", Font.BOLD, 14));
		header.setDefaultRenderer(new DefaultTableCellRenderer() {
			@Override
			public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
					boolean hasFocus, int row, int column) {
				JLabel label = new JLabel(value.toString(), JLabel.CENTER);
				label.setFont(new Font("Inter", Font.BOLD, 14));
				label.setBackground(new Color(220, 220, 220));
				label.setOpaque(true);
				label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
				return label;
			}
		});

		// SCROLLPANE
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(57, 246, 703, 220); // tabla ajustada
		panel_1.add(scrollPane);

		
		modelo.addRow(new Object[] { "1", "SKU09", "Hamburguesa clásica combo CH", "$150" });

		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Inter", Font.BOLD, 15));
		lblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotal.setBounds(57, 464, 524, 30); 
		lblTotal.setHorizontalAlignment(JLabel.CENTER);
		lblTotal.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lblTotal.setOpaque(true);
		lblTotal.setBackground(new Color(220, 220, 220));
		panel_1.add(lblTotal);

		JLabel	lblTotalValor = new JLabel("$150");
		lblTotalValor.setFont(new Font("Inter", Font.BOLD, 15));
		lblTotalValor.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalValor.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lblTotalValor.setOpaque(true);
		lblTotalValor.setBackground(new Color(220, 220, 220));
		lblTotalValor.setBounds(580, 464, 180, 30); 
		panel_1.add(lblTotalValor);

		JButton btnNewButton_10 = new JButton("<html><div style='text-align:left;'>ENVIAR<br>PEDIDO</div></html>");
		btnNewButton_10.setFont(new Font("Inter", Font.PLAIN, 10));
		btnNewButton_10.setBackground(new Color(190, 190, 190));
		btnNewButton_10.setBounds(215, 537, 120, 44);
		// imagen a la izquierda y texto a la derecha
		btnNewButton_10.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton_10.setVerticalTextPosition(SwingConstants.CENTER);
		btnNewButton_10.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_10.setIconTextGap(10); // espacio entre imagen y texto
		ImageIcon a1 = new ImageIcon("img/enviar.png");
		Image a2 = a1.getImage();
		Image a3 = a2.getScaledInstance(30, 30, Image.SCALE_SMOOTH); 
		btnNewButton_10.setIcon(new ImageIcon(a3));
		btnNewButton_10.setFocusPainted(false);
		btnNewButton_10.setContentAreaFilled(true);
		panel_1.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("CANCELAR");
		btnNewButton_11.setFont(new Font("Inter", Font.PLAIN, 9));
		btnNewButton_11.setBackground(new Color(190, 190, 190));
		btnNewButton_11.setBounds(354, 537, 120, 44);
		btnNewButton_11.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton_11.setVerticalTextPosition(SwingConstants.CENTER);
		btnNewButton_11.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_11.setIconTextGap(1); // espacio entre imagen y texto
		ImageIcon b1 = new ImageIcon("img/cancelar.png");
		Image b2 = b1.getImage();
		Image b3 = b2.getScaledInstance(30, 30, Image.SCALE_SMOOTH); 
		btnNewButton_11.setIcon(new ImageIcon(b3));
		btnNewButton_11.setFocusPainted(false);
		btnNewButton_11.setContentAreaFilled(true);
		panel_1.add(btnNewButton_11);
		btnNewButton_11.setFocusPainted(false);
		btnNewButton_11.setContentAreaFilled(true);

		JButton btnNewButton_12 = new JButton("<html><div style='text-align:center;'>ENVIAR Y COBRAR<br><br></div></html>");
		btnNewButton_12.setFont(new Font("Inter", Font.PLAIN, 9));
		btnNewButton_12.setBackground(new Color(190, 190, 190));
		btnNewButton_12.setBounds(501, 537, 120, 44);
		btnNewButton_12.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton_12.setVerticalTextPosition(SwingConstants.CENTER);
		btnNewButton_12.setHorizontalAlignment(SwingConstants.LEFT);
		ImageIcon c1 = new ImageIcon("img/enviarycobrar.png");
		Image c2 = c1.getImage();
		Image c3 = c2.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		btnNewButton_12.setIcon(new ImageIcon(c3));
		btnNewButton_12.setIconTextGap(20); // espacio entre imagen y texto
		panel_1.add(btnNewButton_12);
		btnNewButton_12.setFocusPainted(false);
		btnNewButton_12.setContentAreaFilled(true);

		JButton btnNewButton_13 = new JButton("Buscar por producto");
		btnNewButton_13.setFont(new Font("Inter", Font.BOLD, 12));
		btnNewButton_13.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton_13.setVerticalTextPosition(SwingConstants.CENTER);
		btnNewButton_13.setIconTextGap(20);
		btnNewButton_13.setBackground(new Color(217, 217, 217));
		ImageIcon d1 = new ImageIcon("img/lupa.png");
		Image d2 = d1.getImage();
		Image d3 = d2.getScaledInstance(50, 64, Image.SCALE_SMOOTH);
		btnNewButton_13.setIcon(new ImageIcon(d3));
		btnNewButton_13.setBounds(36, 227, 227, 64);
		panel.add(btnNewButton_13);
		btnNewButton_13.setFocusPainted(false);
		btnNewButton_13.setContentAreaFilled(true);

	}
	public void AlmacenEditar() {
		try {
            UIManager.setLookAndFeel(new FlatLightLaf());  
            UIManager.put("TextComponent.arc", 30);//textfield redondeadas
            UIManager.put("Buttom.arc", 700); // Esquinas redondeadas
        } catch (Exception ex) {
            ex.printStackTrace();
        }
	
		JFrame frame = new JFrame();
		frame.setResizable(false);
		frame.setAlwaysOnTop(true);
		frame.setBounds(100, 100, 1150, 799);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 215));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		// Botones del menú superior
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
		
		JLabel lblNewLabel = new JLabel("ALMACEN");
		lblNewLabel.setBounds(517, 82, 256, 25);
		lblNewLabel.setFont(new Font("Inter", Font.BOLD, 20));
		panel.add(lblNewLabel);
		
		//Boton añadir
		JButton btnNewButton_5 = new JButton("AÑADIR");
		btnNewButton_5.setFont(new Font("Inter", Font.BOLD, 10));
		btnNewButton_5.setBackground(new Color(190, 190, 190));
		btnNewButton_5.setBounds(80, 150, 85, 49);
		btnNewButton_5.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_5.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_5.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_5.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_5.setIconTextGap(1);
		btnNewButton_5.setBounds(80, 150, 85, 49);
		ImageIcon d1 =new ImageIcon("img/añadir.png");
        Image d2= d1.getImage();
        Image d3=d2.getScaledInstance(35, 35,Image.SCALE_SMOOTH);
        btnNewButton_5.setIcon(new ImageIcon(d3));
		panel.add(btnNewButton_5);
		
		//Botton editar
		JButton btnNewButton_6 = new JButton("EDITAR");
		btnNewButton_6.setFont(new Font("Inter", Font.BOLD, 10));
		btnNewButton_6.setBackground(new Color(190, 190, 190));
		btnNewButton_6.setBounds(199, 150, 85, 49);
		btnNewButton_6.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_6.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_6.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_6.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_6.setIconTextGap(1);
		btnNewButton_6.setBounds(199, 150, 85, 49);
		ImageIcon b1 =new ImageIcon("img/lapiz.png");
        Image b2= b1.getImage();
        Image b3=b2.getScaledInstance(35, 35,Image.SCALE_SMOOTH);
        btnNewButton_6 .setIcon(new ImageIcon(b3));
		panel.add(btnNewButton_6);
		

		ImageIcon lupaIcon = new ImageIcon("img/lupa.png");
		Image lupaImg = lupaIcon.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);

		Lupa textField_1 = new Lupa(lupaImg);
		textField_1.setBounds(357, 150, 263, 43);
		textField_1.setBackground(new Color(190, 190, 190));
		textField_1.setFont(new Font("Inter", Font.PLAIN, 16));
		textField_1.setHorizontalAlignment(JTextField.CENTER);
		textField_1.setColumns(10);
		panel.add(textField_1);
		
	
		
		JButton btnNewButton_7 = new JButton("BORRAR");
		btnNewButton_7.setBackground(new Color(190, 190, 190));
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_7.setBounds(963, 150, 85, 49);
		btnNewButton_7.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_7.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_7.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_7.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_7.setIconTextGap(1);
		btnNewButton_7.setBounds(963, 150, 85, 49);
		ImageIcon c1 =new ImageIcon("img/borrar.png");
        Image c2= c1.getImage();
        Image c3=c2.getScaledInstance(35, 35,Image.SCALE_SMOOTH);
        btnNewButton_7 .setIcon(new ImageIcon(c3));
		panel.add(btnNewButton_7);
		
		//crea la barra
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(140, 296, 795, 260);
		panel.add(scrollPane);

		String[] columnas = {"Código", "Descripción", "Existencia", "U.M.", "Costo"};
		String[][] datos = {
			{"ING001", "Carne molida de res", "43", "KG", "$105"},
			{"ING002", "Pan para hamburguesa", "20", "paq c/8", "$75"},
			{"ING003", "Lechuga", "90", "Pieza", "$25"},
			{"ING004", "Tomate", "25", "Kg", "$35"},
			{"ING005", "Cebolla", "25", "Kg", "$60"},
			{"ING006", "Pepinillos", "15", "Kg", "$45"},
			{"ING007", "Papa blanca", "50", "Kg", "$45"},
			{"ING008", "Refresco Coca Cola Regular", "200", "L", "$19"}
		};

		// Creamos la tabla permitiendo editar solo la columna "U.M."
		JTable table = new JTable(datos, columnas) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return column == 3; // Solo se puede editar la columna "U.M."
			}
		};

		// Editor de celda tipo JComboBox para la columna "U.M."
		String[] unidades = {"Kg", "Pieza", "L", "paq c/8"};
		JComboBox<String> comboBoxUM = new JComboBox<>(unidades);
		table.getColumnModel().getColumn(3).setCellEditor(new javax.swing.DefaultCellEditor(comboBoxUM));

		table.setRowSorter(null);
		table.setFont(new Font("Inter", Font.PLAIN, 14));
		table.setRowHeight(30);
		table.setShowGrid(true);
		table.setGridColor(Color.BLACK);
		table.getTableHeader().setReorderingAllowed(false);

		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
		for (int i = 0; i < table.getColumnCount(); i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
		}

		table.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
			@Override
			public Component getTableCellRendererComponent(JTable table, Object value,
					boolean isSelected, boolean hasFocus, int row, int column) {

				JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
				label.setHorizontalAlignment(SwingConstants.CENTER);
				label.setFont(new Font("Inter", Font.BOLD, 14));
				label.setBackground(new Color(220, 220, 220));
				label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
				return label;
			}
		});

		scrollPane.setViewportView(table);
	}
	public void AñadirPlatillo() {
		try {
            UIManager.setLookAndFeel(new FlatLightLaf());  
            UIManager.put("TextComponent.arc", 10);//textfield redondeadas
            UIManager.put("Buttom.arc", 700); // Esquinas redondeadas
        } catch (Exception ex) {
            ex.printStackTrace();
        }
		
		JFrame frame = new JFrame();
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
		
		
		RoundedPanel panel_1 = new RoundedPanel(20);
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(167, 108, 798, 509);
		Border borde = BorderFactory.createLineBorder(Color.BLACK, 0);
        panel_1.setBorder(borde);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Añadir platillo");
		lblNewLabel.setFont(new Font("Inter", Font.BOLD, 20));
		lblNewLabel.setBounds(326, 21, 198, 25);
		panel_1.add(lblNewLabel);
		
		//segundo panel    ,       el roundpanel espara hacer las esquinas redondas
		RoundedPanel panel_2 = new RoundedPanel(20) {
        
          protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dibuja línea vertical en el centro de panel_2
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setStroke(new BasicStroke(1));
                g2.setColor(Color.LIGHT_GRAY);
                int x = getWidth() / 2;
                g2.drawLine(x, 50, x, getHeight() - 30);
                g2.dispose();
            }
        };
        panel_2.setForeground(new Color(128, 128, 128));
        panel_2.setBackground(Color.WHITE);
        panel_2.setBounds(41, 76, 731, 321);
        panel_2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
        panel_1.add(panel_2);
        panel_2.setLayout(null);
        
        JTextField TextField = new JTextField("BUSCAR");
		TextField.setBackground(new Color(237, 237, 237));
		TextField.setFont(new Font("Inter", Font.BOLD, 10));
		TextField.setForeground(Color.GRAY);
		TextField.setBounds(35, 47, 223, 40);
		panel_2.add(TextField);
		TextField.setColumns(10);

		// HACE QUE SE BORRE EL BUSCAR AL ESCRIBIR EN EL TEXTFIELD
		final String placeholder = "BUSCAR";
		TextField.addFocusListener(new FocusAdapter() {
		   
		    public void focusGained(FocusEvent e) {
		        if (TextField.getText().equals(placeholder)) {
		            TextField.setText("");
		            TextField.setForeground(Color.BLACK);
		        }
		    }
		    
		    public void focusLost(FocusEvent e) {
		        if (TextField.getText().isEmpty()) {
		            TextField.setText(placeholder);
		            TextField.setForeground(Color.GRAY);
		        }
		    }
		});

		
		JButton btnNewButton_5 = new JButton("Añadir");
		btnNewButton_5.setFont(new Font("Inter", Font.BOLD, 10));
		btnNewButton_5.setBackground(new Color(	117, 197, 188));
		btnNewButton_5.setBounds(105, 97, 85, 30);
		panel_2.add(btnNewButton_5);
		
		JLabel lblNewLabel_1 = new JLabel("Descripción");
		lblNewLabel_1.setFont(new Font("Inter", Font.BOLD, 15));
		lblNewLabel_1.setBounds(392, 36, 116, 13);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cantidad");
		lblNewLabel_2.setFont(new Font("Inter", Font.BOLD, 15));
		lblNewLabel_2.setBounds(498, 36, 85, 13);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("U.M.");
		lblNewLabel_3.setFont(new Font("Inter", Font.BOLD, 15));
		lblNewLabel_3.setBounds(588, 36, 45, 13);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Costo");
		lblNewLabel_4.setFont(new Font("Inter", Font.BOLD, 15));
		lblNewLabel_4.setBounds(643, 36, 55, 13);
		panel_2.add(lblNewLabel_4);
		
		//boton cancelar
		JButton btnNewButton_6 = new JButton("CANCELAR");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6.setFont(new Font("Inter", Font.BOLD, 9));
		btnNewButton_6.setBounds(311, 422, 85, 60);
		btnNewButton_6.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_6.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_6.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_6.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_6.setIconTextGap(1);
		ImageIcon b1 = new ImageIcon("img/cancelar.png");
		Image b2 = b1.getImage();
		Image b3 = b2.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		btnNewButton_6.setIcon(new ImageIcon(b3));
		btnNewButton_6.setFocusPainted(false);
		btnNewButton_6.setContentAreaFilled(true);
		panel_1.add(btnNewButton_6);
		
		//boton aceptar
		JButton btnNewButton_7 = new JButton("ACEPTAR");
		btnNewButton_7.setFont(new Font("Inter", Font.BOLD, 9));
		btnNewButton_7.setBounds(435, 422, 85, 60);
		btnNewButton_7.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_7.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_7.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_7.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_7.setIconTextGap(1);
		ImageIcon a1 = new ImageIcon("img/aceptar.png");
		Image a2 = a1.getImage();
		Image a3 = a2.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		btnNewButton_7.setIcon(new ImageIcon(a3));
		btnNewButton_7.setFocusPainted(false);
		btnNewButton_7.setContentAreaFilled(true);
		panel_1.add(btnNewButton_7);
		
		
	}
	public void AñadirPlatillo2() {
		try {
			UIManager.setLookAndFeel(new FlatLightLaf());
			UIManager.put("TextComponent.arc", 10);// textfield redondeadas
			UIManager.put("Buttom.arc", 700); // Esquinas redondeadas
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		JFrame	frame = new JFrame();
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

		RoundedPanel panel_1 = new RoundedPanel(20);
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(167, 108, 798, 509);
		Border borde = BorderFactory.createLineBorder(Color.BLACK, 0);
		panel_1.setBorder(borde);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("Añadir platillo");
		lblNewLabel.setFont(new Font("Inter", Font.BOLD, 20));
		lblNewLabel.setBounds(326, 21, 198, 25);
		panel_1.add(lblNewLabel);

		// segundo panel , el roundpanel espara hacer las esquinas redondas
		RoundedPanel panel_2 = new RoundedPanel(20) {
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				// Dibuja la línea en el centro de panel_2
				Graphics2D g2 = (Graphics2D) g.create();
				g2.setStroke(new BasicStroke(1));
				g2.setColor(Color.LIGHT_GRAY);
				int x = getWidth() / 2;
				g2.drawLine(x, 50, x, getHeight() - 30);
				g2.dispose();
			}
		};

		panel_2.setForeground(new Color(128, 128, 128));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(41, 76, 731, 321);
		panel_2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		panel_1.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Descripción");
		lblNewLabel_1.setFont(new Font("Inter", Font.BOLD, 15));
		lblNewLabel_1.setBounds(392, 36, 116, 13);
		panel_2.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Cantidad");
		lblNewLabel_2.setFont(new Font("Inter", Font.BOLD, 15));
		lblNewLabel_2.setBounds(498, 36, 85, 13);
		panel_2.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("U.M.");
		lblNewLabel_3.setFont(new Font("Inter", Font.BOLD, 15));
		lblNewLabel_3.setBounds(588, 36, 45, 13);
		panel_2.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Costo");
		lblNewLabel_4.setFont(new Font("Inter", Font.BOLD, 15));
		lblNewLabel_4.setBounds(643, 36, 55, 13);
		panel_2.add(lblNewLabel_4);

		// Datos y columnas
		String[] columnas = { "Código", "Descripción" };
		String[][] datos = { { "040221", "Tocino" },
				{ "043216", "Tomate" },
				{ "041555", "Salsa tabasco" },
				{ "041221", "Tomate" },
				{ "043851", "Tahini" },

		};

		// Tabla y scroll
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 76, 311, 149);
		panel_2.add(scrollPane);

		JTable table = new JTable(datos, columnas) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		table.setFont(new Font("Inter", Font.PLAIN, 14));
		table.setRowHeight(30);
		table.setShowGrid(true);
		table.setGridColor(Color.BLACK);
		table.getTableHeader().setReorderingAllowed(false);

		// Centrado de celdas
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
		for (int i = 0; i < table.getColumnCount(); i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
		}

		// Header personalizado
		JTableHeader header = table.getTableHeader();
		header.setFont(new Font("Inter", Font.BOLD, 14));
		header.setDefaultRenderer(new DefaultTableCellRenderer() {
			public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
					boolean hasFocus, int row, int column) {
				JLabel label = new JLabel(value.toString(), JLabel.CENTER);
				label.setFont(new Font("Inter", Font.BOLD, 14));
				label.setBackground(new Color(220, 220, 220));
				label.setOpaque(true);
				label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
				return label;
			}
		});

		scrollPane.setViewportView(table);

		JTextField textField = new JTextField("T");
		textField.setBackground(new Color(237, 237, 237));
		textField.setFont(new Font("Inter", Font.BOLD, 20));
		textField.setForeground(Color.BLACK);
		textField.setBounds(10, 36, 223, 40);
		panel_2.add(textField);
		textField.setColumns(10);

		// HACE QUE SE BORRE EL BUSCAR AL ESCRIBIR EN EL TEXTFIELD
		final String placeholder = "T";
		textField.addFocusListener(new FocusAdapter() {

			public void focusGained(FocusEvent e) {
				if (textField.getText().equals(placeholder)) {
					textField.setText("");
					textField.setForeground(Color.BLACK);
				}
			}

			public void focusLost(FocusEvent e) {
				if (textField.getText().isEmpty()) {
					textField.setText(placeholder);
					textField.setForeground(Color.GRAY);
				}
			}
		});

		// Botón cancelar
		JButton btnNewButton_6 = new JButton("CANCELAR");
		btnNewButton_6.setFont(new Font("Inter", Font.BOLD, 9));
		btnNewButton_6.setBounds(306, 422, 85, 60);
		btnNewButton_6.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_6.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_6.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_6.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_6.setIconTextGap(1);
		ImageIcon b1 = new ImageIcon("img/cancelar.png");
		Image b2 = b1.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		btnNewButton_6.setIcon(new ImageIcon(b2));
		btnNewButton_6.setFocusPainted(false);
		btnNewButton_6.setContentAreaFilled(true);
		panel_1.add(btnNewButton_6);

		// Botón aceptar
		JButton btnNewButton_7 = new JButton("ACEPTAR");
		btnNewButton_7.setFont(new Font("Inter", Font.BOLD, 9));
		btnNewButton_7.setBounds(421, 422, 85, 60);
		btnNewButton_7.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_7.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_7.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_7.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_7.setIconTextGap(1);
		ImageIcon a1 = new ImageIcon("img/aceptar.png");
		Image a2 = a1.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		btnNewButton_7.setIcon(new ImageIcon(a2));
		btnNewButton_7.setFocusPainted(false);
		btnNewButton_7.setContentAreaFilled(true);
		panel_1.add(btnNewButton_7);
	}
	public void AñadirPlatillo3() {
		try {
            UIManager.setLookAndFeel(new FlatLightLaf());  
            UIManager.put("TextComponent.arc", 10);//textfield redondeadas
            UIManager.put("Buttom.arc", 700); // Esquinas redondeadas
        } catch (Exception ex) {
            ex.printStackTrace();
        }
		
		JFrame	frame = new JFrame();
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
		
		
		RoundedPanel panel_1 = new RoundedPanel(20);
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(167, 108, 798, 509);
		Border borde = BorderFactory.createLineBorder(Color.BLACK, 0);
        panel_1.setBorder(borde);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Añadir platillo");
		lblNewLabel.setFont(new Font("Inter", Font.BOLD, 20));
		lblNewLabel.setBounds(326, 21, 198, 25);
		panel_1.add(lblNewLabel);
		
		//segundo panel    ,       el roundpanel espara hacer las esquinas redondas
		RoundedPanel panel_2 = new RoundedPanel(20){
        
          protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dibuja línea vertical en el centro de panel_2
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setStroke(new BasicStroke(1));
                g2.setColor(Color.LIGHT_GRAY);
                int x = getWidth() / 2;
                g2.drawLine(x, 50, x, getHeight() - 30);
                g2.dispose();
            }
        };
        panel_2.setForeground(new Color(128, 128, 128));
        panel_2.setBackground(Color.WHITE);
        panel_2.setBounds(41, 76, 731, 321);
        panel_2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
        panel_1.add(panel_2);
        panel_2.setLayout(null);
        
        JTextField TextField = new JTextField("Tocino");
		TextField.setBackground(new Color(237, 237, 237));
		TextField.setFont(new Font("Inter", Font.BOLD, 15));
		TextField.setForeground(Color.BLACK);
		TextField.setBounds(35, 47, 223, 40);
		panel_2.add(TextField);
		TextField.setColumns(10);
		
		final String placeholder = "Tocino";
		TextField.addFocusListener(new FocusAdapter() {

			public void focusGained(FocusEvent e) {
				if (TextField.getText().equals(placeholder)) {
					TextField.setText("");
					TextField.setForeground(Color.BLACK);
				}
			}

			public void focusLost(FocusEvent e) {
				if (TextField.getText().isEmpty()) {
					TextField.setText(placeholder);
					TextField.setForeground(Color.BLACK);
				}
			}
		});
		
		JButton btnNewButton_5 = new JButton("Añadir");
		btnNewButton_5.setFont(new Font("Inter", Font.BOLD, 10));
		btnNewButton_5.setBackground(new Color(	117, 197, 188));
		btnNewButton_5.setBounds(105, 97, 85, 30);
		panel_2.add(btnNewButton_5);
		
		JLabel lblNewLabel_1 = new JLabel("Descripción");
		lblNewLabel_1.setFont(new Font("Inter", Font.BOLD, 15));
		lblNewLabel_1.setBounds(392, 36, 116, 13);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cantidad");
		lblNewLabel_2.setFont(new Font("Inter", Font.BOLD, 15));
		lblNewLabel_2.setBounds(498, 36, 85, 13);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("U.M.");
		lblNewLabel_3.setFont(new Font("Inter", Font.BOLD, 15));
		lblNewLabel_3.setBounds(588, 36, 45, 13);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Costo");
		lblNewLabel_4.setFont(new Font("Inter", Font.BOLD, 15));
		lblNewLabel_4.setBounds(643, 36, 55, 13);
		panel_2.add(lblNewLabel_4);
		
		//boton cancelar
		JButton btnNewButton_6 = new JButton("CANCELAR");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6.setFont(new Font("Inter", Font.BOLD, 9));
		btnNewButton_6.setBounds(311, 422, 85, 60);
		btnNewButton_6.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_6.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_6.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_6.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_6.setIconTextGap(1);
		ImageIcon b1 = new ImageIcon("img/cancelar.png");
		Image b2 = b1.getImage();
		Image b3 = b2.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		btnNewButton_6.setIcon(new ImageIcon(b3));
		btnNewButton_6.setFocusPainted(false);
		btnNewButton_6.setContentAreaFilled(true);
		panel_1.add(btnNewButton_6);
		
		//boton aceptar
		JButton btnNewButton_7 = new JButton("ACEPTAR");
		btnNewButton_7.setFont(new Font("Inter", Font.BOLD, 9));
		btnNewButton_7.setBounds(435, 422, 85, 60);
		btnNewButton_7.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_7.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_7.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_7.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_7.setIconTextGap(1);
		ImageIcon a1 = new ImageIcon("img/aceptar.png");
		Image a2 = a1.getImage();
		Image a3 = a2.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		btnNewButton_7.setIcon(new ImageIcon(a3));
		btnNewButton_7.setFocusPainted(false);
		btnNewButton_7.setContentAreaFilled(true);
		panel_1.add(btnNewButton_7);
		
	}
	public void AñadirPlatillo4() {
		try {
            UIManager.setLookAndFeel(new FlatLightLaf());  
            UIManager.put("TextComponent.arc", 10);//textfield redondeadas
            UIManager.put("Buttom.arc", 700); // Esquinas redondeadas
        } catch (Exception ex) {
            ex.printStackTrace();
        }
		
		JFrame	frame = new JFrame();
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
		
		
		RoundedPanel panel_1 = new RoundedPanel(20);
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(167, 108, 798, 509);
		Border borde = BorderFactory.createLineBorder(Color.BLACK, 0);
        panel_1.setBorder(borde);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Añadir platillo");
		lblNewLabel.setFont(new Font("Inter", Font.BOLD, 20));
		lblNewLabel.setBounds(326, 21, 198, 25);
		panel_1.add(lblNewLabel);
		
		//segundo panel    ,       el roundpanel espara hacer las esquinas redondas
		RoundedPanel panel_2 = new RoundedPanel(20) {
        
          protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dibuja línea vertical en el centro de panel_2
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setStroke(new BasicStroke(1));
                g2.setColor(Color.LIGHT_GRAY);
                int x = getWidth() / 2;
                g2.drawLine(x, 50, x, getHeight() - 30);
                g2.dispose();
            }
        };
        panel_2.setForeground(new Color(128, 128, 128));
        panel_2.setBackground(Color.WHITE);
        panel_2.setBounds(41, 76, 731, 321);
        panel_2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
        panel_1.add(panel_2);
        panel_2.setLayout(null);
        
        JTextField TextField = new JTextField("BUSCAR");
		TextField.setBackground(new Color(237, 237, 237));
		TextField.setFont(new Font("Inter", Font.BOLD, 10));
		TextField.setForeground(Color.GRAY);
		TextField.setBounds(35, 47, 223, 40);
		panel_2.add(TextField);
		TextField.setColumns(10);

		// HACE QUE SE BORRE EL BUSCAR AL ESCRIBIR EN EL TEXTFIELD
		final String placeholder = "BUSCAR";
		TextField.addFocusListener(new FocusAdapter() {
		   
		    public void focusGained(FocusEvent e) {
		        if (TextField.getText().equals(placeholder)) {
		            TextField.setText("");
		            TextField.setForeground(Color.BLACK);
		        }
		    }
		    
		    public void focusLost(FocusEvent e) {
		        if (TextField.getText().isEmpty()) {
		            TextField.setText(placeholder);
		            TextField.setForeground(Color.GRAY);
		        }
		    }
		});

		
		JButton btnNewButton_5 = new JButton("Añadir");
		btnNewButton_5.setFont(new Font("Inter", Font.BOLD, 10));
		btnNewButton_5.setBackground(new Color(	117, 197, 188));
		btnNewButton_5.setBounds(105, 97, 85, 30);
		panel_2.add(btnNewButton_5);
		
		JLabel lblNewLabel_1 = new JLabel("Descripción");
		lblNewLabel_1.setFont(new Font("Inter", Font.BOLD, 15));
		lblNewLabel_1.setBounds(392, 36, 116, 13);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cantidad");
		lblNewLabel_2.setFont(new Font("Inter", Font.BOLD, 15));
		lblNewLabel_2.setBounds(498, 36, 85, 13);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("U.M.");
		lblNewLabel_3.setFont(new Font("Inter", Font.BOLD, 15));
		lblNewLabel_3.setBounds(588, 36, 45, 13);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Costo");
		lblNewLabel_4.setFont(new Font("Inter", Font.BOLD, 15));
		lblNewLabel_4.setBounds(643, 36, 55, 13);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Tocino");
		lblNewLabel_5.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(402, 59, 85, 13);
		panel_2.add(lblNewLabel_5);
		
		JTextField	textField = new JTextField();
		textField.setBackground(new Color(237, 237, 237));
		textField.setToolTipText("");
		textField.setText("100\r\n");
		textField.setFont(new Font("Inter", Font.PLAIN, 13));
		textField.setBounds(498, 57, 63, 19);
		textField.setHorizontalAlignment(JTextField.CENTER);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Gramos");
		lblNewLabel_6.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(578, 59, 55, 13);
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("$120");
		lblNewLabel_7.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_7.setBounds(653, 59, 31, 13);
		panel_2.add(lblNewLabel_7);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setFont(new Font("Inter", Font.PLAIN, 10));
		btnNewButton_8.setBounds(693, 51, 28, 31);
		ImageIcon c1 = new ImageIcon("img/borrar2.png");
		Image c2 = c1.getImage();
		Image c3 = c2.getScaledInstance(28, 31, Image.SCALE_SMOOTH);
		btnNewButton_8.setIcon(new ImageIcon(c3));
		btnNewButton_8.setBorderPainted(false);
		btnNewButton_8.setFocusPainted(false);
		btnNewButton_8.setContentAreaFilled(true);
		panel_2.add(btnNewButton_8);
		
		//boton cancelar
		JButton btnNewButton_6 = new JButton("CANCELAR");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6.setFont(new Font("Inter", Font.BOLD, 9));
		btnNewButton_6.setBounds(301, 422, 85, 60);
		btnNewButton_6.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_6.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_6.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_6.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_6.setIconTextGap(1);
		ImageIcon b1 = new ImageIcon("img/cancelar.png");
		Image b2 = b1.getImage();
		Image b3 = b2.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		btnNewButton_6.setIcon(new ImageIcon(b3));
		btnNewButton_6.setFocusPainted(false);
		btnNewButton_6.setContentAreaFilled(true);
		panel_1.add(btnNewButton_6);
		
		//boton aceptar
		JButton btnNewButton_7 = new JButton("ACEPTAR");
		btnNewButton_7.setFont(new Font("Inter", Font.BOLD, 9));
		btnNewButton_7.setBounds(420, 422, 85, 60);
		btnNewButton_7.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_7.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_7.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_7.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_7.setIconTextGap(1);
		ImageIcon a1 = new ImageIcon("img/aceptar.png");
		Image a2 = a1.getImage();
		Image a3 = a2.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		btnNewButton_7.setIcon(new ImageIcon(a3));
		btnNewButton_7.setFocusPainted(false);
		btnNewButton_7.setContentAreaFilled(true);
		panel_1.add(btnNewButton_7);
		
	}
	public void AñadirPlatillo5() {
		try {
			UIManager.setLookAndFeel(new FlatLightLaf());
			UIManager.put("TextComponent.arc", 10);// textfield redondeadas
			UIManager.put("Buttom.arc", 700); // Esquinas redondeadas
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	
		JFrame	frame = new JFrame();
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

		RoundedPanel panel_1 = new RoundedPanel(20);
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(167, 108, 798, 509);
		Border borde = BorderFactory.createLineBorder(Color.BLACK, 0);
		panel_1.setBorder(borde);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("Añadir platillo");
		lblNewLabel.setFont(new Font("Inter", Font.BOLD, 20));
		lblNewLabel.setBounds(326, 21, 198, 25);
		panel_1.add(lblNewLabel);

		// segundo panel , el roundpanel espara hacer las esquinas redondas
		RoundedPanel panel_2 = new RoundedPanel(20) {
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				// Dibuja la línea en el centro de panel_2
				Graphics2D g2 = (Graphics2D) g.create();
				g2.setStroke(new BasicStroke(1));
				g2.setColor(Color.LIGHT_GRAY);
				int x = getWidth() / 2;
				g2.drawLine(x, 50, x, getHeight() - 30);
				g2.dispose();
			}
		};

		panel_2.setForeground(new Color(128, 128, 128));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(41, 76, 731, 321);
		panel_2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));//crea la line del borde
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		//texto de Descripcióno
		JLabel lblNewLabel_1 = new JLabel("Descripción");
		lblNewLabel_1.setFont(new Font("Inter", Font.BOLD, 15));
		lblNewLabel_1.setBounds(392, 36, 116, 13);
		panel_2.add(lblNewLabel_1);
		
		//texto de cantidad
		JLabel lblNewLabel_2 = new JLabel("Cantidad");
		lblNewLabel_2.setFont(new Font("Inter", Font.BOLD, 15));
		lblNewLabel_2.setBounds(498, 36, 85, 13);
		panel_2.add(lblNewLabel_2);

		//texto de u.m
		JLabel lblNewLabel_3 = new JLabel("U.M.");
		lblNewLabel_3.setFont(new Font("Inter", Font.BOLD, 15));
		lblNewLabel_3.setBounds(588, 36, 45, 13);
		panel_2.add(lblNewLabel_3);

		//texto de costo
		JLabel lblNewLabel_4 = new JLabel("Costo");
		lblNewLabel_4.setFont(new Font("Inter", Font.BOLD, 15));
		lblNewLabel_4.setBounds(643, 36, 55, 13);
		panel_2.add(lblNewLabel_4);
		
		//texto de tocino
		JLabel lblNewLabel_5 = new JLabel("Tocino");
		lblNewLabel_5.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(402, 59, 85, 13);
		panel_2.add(lblNewLabel_5);
		
		//texto de la cantidad
		JTextField textField = new JTextField();
		textField.setBackground(new Color(237, 237, 237));
		textField.setToolTipText("");
		textField.setText("100\r\n");
		textField.setFont(new Font("Inter", Font.PLAIN, 13));
		textField.setBounds(498, 57, 63, 19);
		textField.setHorizontalAlignment(JTextField.CENTER);
		panel_2.add(textField);
		textField.setColumns(10);
		
		//texto del gramos
		JLabel lblNewLabel_6 = new JLabel("Gramos");
		lblNewLabel_6.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(578, 59, 55, 13);
		panel_2.add(lblNewLabel_6);
		
		//texto del precio
		JLabel lblNewLabel_7 = new JLabel("$120");
		lblNewLabel_7.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_7.setBounds(653, 59, 31, 13);
		panel_2.add(lblNewLabel_7);
		
		//boton de borrar
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setFont(new Font("Inter", Font.PLAIN, 10));
		btnNewButton_8.setBounds(693, 51, 28, 31);
		ImageIcon c1 = new ImageIcon("img/borrar2.png");
		Image c2 = c1.getImage();
		Image c3 = c2.getScaledInstance(28, 31, Image.SCALE_SMOOTH);
		btnNewButton_8.setIcon(new ImageIcon(c3));
		btnNewButton_8.setBorderPainted(false);
		btnNewButton_8.setFocusPainted(false);
		btnNewButton_8.setContentAreaFilled(true);
		panel_2.add(btnNewButton_8);

		// Datos y columnas
		String[] columnas = { "Código", "Descripción" };
		String[][] datos = { { "040221", "Tocino" },
				{ "043216", "Tomate" },
				{ "041555", "Salsa tabasco" },
				{ "041221", "Tomate" },
				{ "043851", "Tahini" },

		};

		// Tabla y scroll
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 76, 311, 149);
		panel_2.add(scrollPane);

		JTable table = new JTable(datos, columnas) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		table.setFont(new Font("Inter", Font.PLAIN, 14));
		table.setRowHeight(30);
		table.setShowGrid(true);
		table.setGridColor(Color.BLACK);
		table.getTableHeader().setReorderingAllowed(false);

		// Centrado de celdas
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
		for (int i = 0; i < table.getColumnCount(); i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
		}

		
		JTableHeader header = table.getTableHeader();
		header.setFont(new Font("Inter", Font.BOLD, 14));
		header.setDefaultRenderer(new DefaultTableCellRenderer() {
			public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
					boolean hasFocus, int row, int column) {
				JLabel label = new JLabel(value.toString(), JLabel.CENTER);
				label.setFont(new Font("Inter", Font.BOLD, 14));
				label.setBackground(new Color(220, 220, 220));
				label.setOpaque(true);
				label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
				return label;
			}
		});

		scrollPane.setViewportView(table);

		JTextField textField2 = new JTextField("T");
		textField2.setBackground(new Color(237, 237, 237));
		textField2.setFont(new Font("Inter", Font.BOLD, 20));
		textField2.setForeground(Color.BLACK);
		textField2.setBounds(10, 36, 223, 40);
		panel_2.add(textField);
		textField2.setColumns(10);

		// HACE QUE SE BORRE EL BUSCAR AL ESCRIBIR EN EL TEXTFIELD
		final String placeholder = "T";
		textField2.addFocusListener(new FocusAdapter() {

			public void focusGained(FocusEvent e) {
				if (textField2.getText().equals(placeholder)) {
					textField2.setText("");
					textField2.setForeground(Color.BLACK);
				}
			}

			public void focusLost(FocusEvent e) {
				if (textField2.getText().isEmpty()) {
					textField2.setText(placeholder);
					textField2.setForeground(Color.GRAY);
				}
			}
		});

		// Botón cancelar
		JButton btnNewButton_6 = new JButton("CANCELAR");
		btnNewButton_6.setFont(new Font("Inter", Font.BOLD, 9));
		btnNewButton_6.setBounds(306, 422, 85, 60);
		btnNewButton_6.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_6.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_6.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_6.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_6.setIconTextGap(1);
		ImageIcon b1 = new ImageIcon("img/cancelar.png");
		Image b2 = b1.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		btnNewButton_6.setIcon(new ImageIcon(b2));
		btnNewButton_6.setFocusPainted(false);
		btnNewButton_6.setContentAreaFilled(true);
		panel_1.add(btnNewButton_6);

		// Botón aceptar
		JButton btnNewButton_7 = new JButton("ACEPTAR");
		btnNewButton_7.setFont(new Font("Inter", Font.BOLD, 9));
		btnNewButton_7.setBounds(421, 422, 85, 60);
		btnNewButton_7.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_7.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_7.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_7.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_7.setIconTextGap(1);
		ImageIcon a1 = new ImageIcon("img/aceptar.png");
		Image a2 = a1.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		btnNewButton_7.setIcon(new ImageIcon(a2));
		btnNewButton_7.setFocusPainted(false);
		btnNewButton_7.setContentAreaFilled(true);
		panel_1.add(btnNewButton_7);
	}
	public void AñadirPlatillo6() {
		try {
            UIManager.setLookAndFeel(new FlatLightLaf());  
            UIManager.put("TextComponent.arc", 10);//textfield redondeadas
            UIManager.put("Buttom.arc", 700); // Esquinas redondeadas
        } catch (Exception ex) {
            ex.printStackTrace();
        }
	
		JFrame	frame = new JFrame();
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
		
		
		RoundedPanel panel_1 = new RoundedPanel(20);
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(167, 108, 798, 509);
		Border borde = BorderFactory.createLineBorder(Color.BLACK, 0);
        panel_1.setBorder(borde);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Añadir platillo");
		lblNewLabel.setFont(new Font("Inter", Font.BOLD, 20));
		lblNewLabel.setBounds(326, 21, 198, 25);
		panel_1.add(lblNewLabel);
		
		//segundo panel    ,       el roundpanel espara hacer las esquinas redondas
		RoundedPanel panel_2 = new RoundedPanel(20){
        
          protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dibuja línea vertical en el centro de panel_2
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setStroke(new BasicStroke(1));
                g2.setColor(Color.LIGHT_GRAY);
                int x = getWidth() / 2;
                g2.drawLine(x, 50, x, getHeight() - 30);
                g2.dispose();
            }
        };
        panel_2.setForeground(new Color(128, 128, 128));
        panel_2.setBackground(Color.WHITE);
        panel_2.setBounds(41, 76, 731, 321);
        panel_2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
        panel_1.add(panel_2);
        panel_2.setLayout(null);
        
        JTextField	TextField = new JTextField("Tomate");
		TextField.setBackground(new Color(237, 237, 237));
		TextField.setFont(new Font("Inter", Font.BOLD, 20));
		TextField.setForeground(Color.BLACK);
		TextField.setBounds(35, 47, 223, 40);
		panel_2.add(TextField);
		TextField.setColumns(10);

		// HACE QUE SE BORRE EL BUSCAR AL ESCRIBIR EN EL TEXTFIELD
		final String placeholder = "Tomate";
		TextField.addFocusListener(new FocusAdapter() {
		   
		    public void focusGained(FocusEvent e) {
		        if (TextField.getText().equals(placeholder)) {
		            TextField.setText("");
		            TextField.setForeground(Color.BLACK);
		        }
		    }
		    
		    public void focusLost(FocusEvent e) {
		        if (TextField.getText().isEmpty()) {
		            TextField.setText(placeholder);
		            TextField.setForeground(Color.BLACK);
		        }
		    }
		});

		
		JButton btnNewButton_5 = new JButton("Añadir");
		btnNewButton_5.setFont(new Font("Inter", Font.BOLD, 10));
		btnNewButton_5.setBackground(new Color(	117, 197, 188));
		btnNewButton_5.setBounds(105, 97, 85, 30);
		panel_2.add(btnNewButton_5);
		
		JLabel lblNewLabel_1 = new JLabel("Descripción");
		lblNewLabel_1.setFont(new Font("Inter", Font.BOLD, 15));
		lblNewLabel_1.setBounds(392, 36, 116, 13);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cantidad");
		lblNewLabel_2.setFont(new Font("Inter", Font.BOLD, 15));
		lblNewLabel_2.setBounds(498, 36, 85, 13);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("U.M.");
		lblNewLabel_3.setFont(new Font("Inter", Font.BOLD, 15));
		lblNewLabel_3.setBounds(588, 36, 45, 13);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Costo");
		lblNewLabel_4.setFont(new Font("Inter", Font.BOLD, 15));
		lblNewLabel_4.setBounds(643, 36, 55, 13);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Tocino");
		lblNewLabel_5.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(402, 59, 85, 13);
		panel_2.add(lblNewLabel_5);
		
		JTextField textField = new JTextField();
		textField.setBackground(new Color(237, 237, 237));
		textField.setToolTipText("");
		textField.setText("0.70");
		textField.setFont(new Font("Inter", Font.PLAIN, 13));
		textField.setBounds(498, 57, 63, 19);
		textField.setHorizontalAlignment(JTextField.CENTER);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("KG.");
		lblNewLabel_6.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(585, 63, 31, 13);
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("$120");
		lblNewLabel_7.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_7.setBounds(643, 63, 31, 13);
		panel_2.add(lblNewLabel_7);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setFont(new Font("Inter", Font.PLAIN, 10));
		btnNewButton_8.setBounds(693, 51, 28, 31);
		ImageIcon c1 = new ImageIcon("img/borrar2.png");
		Image c2 = c1.getImage();
		Image c3 = c2.getScaledInstance(28, 31, Image.SCALE_SMOOTH);
		btnNewButton_8.setIcon(new ImageIcon(c3));
		btnNewButton_8.setBorderPainted(false);
		btnNewButton_8.setFocusPainted(false);
		btnNewButton_8.setContentAreaFilled(true);
		panel_2.add(btnNewButton_8);
		
		JLabel lblNewLabel_8 = new JLabel("Tomate");
		lblNewLabel_8.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_8.setBounds(402, 97, 83, 13);
		panel_2.add(lblNewLabel_8);
		
		JTextField textField_1 = new JTextField();
		textField_1.setText("0.20");
		textField_1.setBackground(new Color(237, 237, 237));
		textField_1.setFont(new Font("Inter", Font.PLAIN, 13));
		textField_1.setBounds(498, 94, 63, 19);
		textField_1.setHorizontalAlignment(JTextField.CENTER);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("KG.");
		lblNewLabel_9.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_9.setBounds(588, 97, 31, 13);
		panel_2.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("$45");
		lblNewLabel_10.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_10.setBounds(643, 97, 31, 13);
		panel_2.add(lblNewLabel_10);
		
		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.setBounds(693, 85, 28, 31);
		ImageIcon d1 = new ImageIcon("img/borrar2.png");
		Image d2 = d1.getImage();
		Image d3 = d2.getScaledInstance(28, 31, Image.SCALE_SMOOTH);
		btnNewButton_9.setIcon(new ImageIcon(d3));
		btnNewButton_9.setBorderPainted(false);
		btnNewButton_9.setFocusPainted(false);
		btnNewButton_9.setContentAreaFilled(true);
		panel_2.add(btnNewButton_9);
		
		//boton cancelar
		JButton btnNewButton_6 = new JButton("CANCELAR");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6.setFont(new Font("Inter", Font.BOLD, 9));
		btnNewButton_6.setBounds(301, 422, 85, 60);
		btnNewButton_6.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_6.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_6.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_6.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_6.setIconTextGap(1);
		ImageIcon b1 = new ImageIcon("img/cancelar.png");
		Image b2 = b1.getImage();
		Image b3 = b2.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		btnNewButton_6.setIcon(new ImageIcon(b3));
		btnNewButton_6.setFocusPainted(false);
		btnNewButton_6.setContentAreaFilled(true);
		panel_1.add(btnNewButton_6);
		
		//boton aceptar
		JButton btnNewButton_7 = new JButton("ACEPTAR");
		btnNewButton_7.setFont(new Font("Inter", Font.BOLD, 9));
		btnNewButton_7.setBounds(420, 422, 85, 60);
		btnNewButton_7.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_7.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_7.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_7.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_7.setIconTextGap(1);
		ImageIcon a1 = new ImageIcon("img/aceptar.png");
		Image a2 = a1.getImage();
		Image a3 = a2.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		btnNewButton_7.setIcon(new ImageIcon(a3));
		btnNewButton_7.setFocusPainted(false);
		btnNewButton_7.setContentAreaFilled(true);
		panel_1.add(btnNewButton_7);
		
	}
	public void BuscarPorProducto() {
		try {
            UIManager.setLookAndFeel(new FlatLightLaf());  
            UIManager.put("TextComponent.arc", 20);//textfield redondeadas
            UIManager.put("Buttom.arc",550); // Esquinas redondeadas
        } catch (Exception ex) {
            ex.printStackTrace();
        }
		
		JFrame	frame = new JFrame();
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
		
		JTextField textField_2 = new JTextField();
		textField_2.setBackground(new Color(242, 255, 168));
		textField_2.setBounds(20, 21, 202, 42);
		panel.add(textField_2);
		textField_2.setColumns(10);
		 // Datos de la tabla
        String[] columnNames = {"Código", "Descripción", "Precio"};
        Object[][] data = {
            {"SKU09", "Hamburguesa clásica", "$150"},
            {"SKU10", "Hamburguesa champiñón", "$150"},
            {"SKU11", "Hamburguesa hawaiana", "$150"},
            {"SKU12", "Hamburguesa clásica combo", "$150"},
            {"SKU13", "Hamburguesa con champiñon combo", "$150"},
            {"SKU14", "Hamburguesa hawaiana combo", "$150"},
            {"SKU15", "Hamburguesa BBQ", "$150"},
        };

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable  table = new JTable(model);
        table.setFillsViewportHeight(true);
        table.setRowHeight(25);
        table.setShowGrid(true);
        table.setGridColor(Color.BLACK);
		table.getTableHeader().setReorderingAllowed(false);

     
        // ScrollPane 
        JScrollPane scrollPane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setBounds(20, 73, 500, 150);
        panel.add(scrollPane);
        
        JButton btnNewButton = new JButton("Cancelar");
        btnNewButton.setBackground(new Color(255, 0, 0));
        btnNewButton.setFont(new Font("Inter", Font.PLAIN, 10));
        btnNewButton.setBounds(10, 248, 85, 21);
        panel.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Aceptar");
        btnNewButton_1.setBackground(new Color(32, 175, 44));
        btnNewButton_1.setFont(new Font("Inter", Font.PLAIN, 10));
        btnNewButton_1.setBounds(412, 248, 85, 21);
        panel.add(btnNewButton_1);
    }

	public void ConsultaDeClientes() {
		try {
            UIManager.setLookAndFeel(new FlatLightLaf());  
            UIManager.put("TextComponent.arc", 20);//textfield redondeado
            UIManager.put("Buttom.arc", 200); // Esquinas redondeadas
        } catch (Exception ex) {
            ex.printStackTrace();
        }
		
		
		JFrame frame = new JFrame();
		frame.setResizable(true);
		frame.setAlwaysOnTop(true);
		frame.setBounds(100, 100, 1150, 799);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 215));
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
		
		JLabel lblNewLabel = new JLabel("CONSULTA DE CLIENTES");
		lblNewLabel.setBounds(441, 81, 256, 25);
		lblNewLabel.setFont(new Font("Inter", Font.BOLD, 20));
		panel.add(lblNewLabel);
		
		JButton btnNewButton_5 = new JButton("AÑADIR");
		btnNewButton_5.setFont(new Font("Inter", Font.BOLD, 10));
		btnNewButton_5.setBackground(new Color(190, 190, 190));
		btnNewButton_5.setBounds(80, 150, 85, 49);
		btnNewButton_5.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_5.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_5.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_5.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_5.setIconTextGap(1);
		btnNewButton_5.setBounds(80, 150, 85, 49);
		ImageIcon d1 =new ImageIcon("img/añadir.png");
        Image d2= d1.getImage();
        Image d3=d2.getScaledInstance(35, 35,Image.SCALE_SMOOTH);
        btnNewButton_5.setIcon(new ImageIcon(d3));
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("EDITAR");
		btnNewButton_6.setFont(new Font("Inter", Font.BOLD, 10));
		btnNewButton_6.setBackground(new Color(190, 190, 190));
		btnNewButton_6.setBounds(199, 150, 85, 49);
		btnNewButton_6.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_6.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_6.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_6.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_6.setIconTextGap(1);
		btnNewButton_6.setBounds(199, 150, 85, 49);
		ImageIcon b1 =new ImageIcon("img/lapiz.png");
        Image b2= b1.getImage();
        Image b3=b2.getScaledInstance(35, 35,Image.SCALE_SMOOTH);
        btnNewButton_6 .setIcon(new ImageIcon(b3));
		panel.add(btnNewButton_6);

		ImageIcon lupaIcon = new ImageIcon("img/lupa.png");
		Image lupaImg = lupaIcon.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);

		Lupa textField_1 = new Lupa(lupaImg);
		textField_1.setBounds(357, 150, 263, 43);
		textField_1.setBackground(new Color(190, 190, 190));
		textField_1.setFont(new Font("Inter", Font.PLAIN, 16));
		textField_1.setHorizontalAlignment(JTextField.CENTER);
		textField_1.setColumns(10);
		panel.add(textField_1);
	
		
		JButton btnNewButton_7 = new JButton("BORRAR");
		btnNewButton_7.setBackground(new Color(190, 190, 190));
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_7.setBounds(963, 150, 85, 49);
		btnNewButton_7.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_7.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_7.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_7.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_7.setIconTextGap(1);
		btnNewButton_7.setBounds(963, 150, 85, 49);
		ImageIcon c1 =new ImageIcon("img/borrar.png");
        Image c2= c1.getImage();
        Image c3=c2.getScaledInstance(35, 35,Image.SCALE_SMOOTH);
        btnNewButton_7 .setIcon(new ImageIcon(c3));
		panel.add(btnNewButton_7);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(140, 296, 795, 260);
		panel.add(scrollPane);
		

		String[] columnas = {"ID cliente", "Nombre", "RFC"};
		String[][] datos = {
			{"C7283945", "Laura Fernanda Mendoza Ruiz", "LOPR8402"},
			{"C1038472", "Esteban Ríos Calderón", "XACM7501"},
			{"C5892371", "Camila Duarte Sánchez", "RODJ9011"},
			{"C2947103", "Marcos Antonio Salgado Varela", "TEAG8010"},
			{"C6739201", "Tomás Eduardo Aguirre Morales", "FAGM8512"},
			{"C3478120", "Valeria Ponce Rodríguez", "VELD9203"},
			{"C9012843", "Rafael Ibáñez Castillo", "NOMI9302"},
			{"C7653902", "Diego Aranda Gutiérrez", "ZULM8701"}
		};

		JTable table = new JTable(datos, columnas) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		table.setFont(new Font("Inter", Font.PLAIN, 14)); //son para la fuente , mostrar las lineas , color y al
		table.setRowHeight(30);
		table.setShowGrid(true);
		table.setGridColor(Color.BLACK);
		table.getTableHeader().setReorderingAllowed(false);

		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
		for (int i = 0; i < table.getColumnCount(); i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
		}

		JTableHeader header = table.getTableHeader();
		header.setFont(new Font("Inter", Font.BOLD, 14));
		header.setDefaultRenderer(new DefaultTableCellRenderer() {
			
			public Component getTableCellRendererComponent(JTable table, Object value,
								boolean isSelected, boolean hasFocus, int row, int column) {
				JLabel label = new JLabel(value.toString(), JLabel.CENTER);
				label.setFont(new Font("Inter", Font.BOLD, 14));
				label.setBackground(new Color(220, 220, 220));
				label.setOpaque(true);
				label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
				return label;
			}
		});
		//scroll la barra
		scrollPane.setViewportView(table);
	}

}
