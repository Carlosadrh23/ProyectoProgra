package vistas;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import com.formdev.flatlaf.FlatLightLaf;

import controllers.AuthController;
import controllers.HomeController;
import viewscopy.EnsambledeplatilloyConsultarMenu;


public class HomeView {
	public HomeView() {

	}
	public class EnsambledeplatilloyConsultarMenu extends JPanel {
		private JFrame ownerFrame; // Variable para guardar la referencia al JFrame

	    public EnsambledeplatilloyConsultarMenu(JFrame frame) { // Constructor modificado
	        this.ownerFrame = frame;
	        setLayout(new GridLayout(2, 1));  // 2 filas, 1 columna, que ocupa todo el panel

	        JButton btnHistorial = new JButton("Ensamble de platillos");
	        btnHistorial.setForeground(Color.WHITE);
	        btnHistorial.setBackground(new Color(170, 170, 170));
	        btnHistorial.setFont(new Font("Inter", Font.BOLD, 14));
	        btnHistorial.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
	        add(btnHistorial);

	        JButton btnConsulta = new JButton("Consultar menú");
	        btnConsulta.setForeground(Color.WHITE);
	        btnConsulta.setBackground(new Color(170, 170, 170));
	        btnConsulta.setFont(new Font("Inter", Font.BOLD, 14));
	        btnConsulta.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					frame.dispose();
					HomeController cc = new HomeController();
					cc.menu();
				}
			});
	        add(btnConsulta);
	    }
	}
	
	public class HistorialyConsulta extends JPanel {
		 private JFrame ownerFrame; // Variable para guardar la referencia al JFrame

		    public HistorialyConsulta(JFrame frame) { // Constructor modificado
		        this.ownerFrame = frame;
	    	
	        setLayout(new GridLayout(2, 1));  // 2 filas, 1 columna, que ocupa todo el panel

	        JButton btnHistorial = new JButton("Historial de factura");
	        btnHistorial.setForeground(Color.WHITE);
	        btnHistorial.setBackground(new Color(170, 170, 170));
	        btnHistorial.setFont(new Font("Inter", Font.BOLD, 14));
	        btnHistorial.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					frame.dispose();
					HomeController cc = new HomeController();
					cc.HistorialDeFacturacion();
				}
			});
	        add(btnHistorial);

	        JButton btnConsulta = new JButton("Consulta de clientes");
	        btnConsulta.setForeground(Color.WHITE); 
	        btnConsulta.setBackground(new Color(170, 170, 170));
	        btnConsulta.setFont(new Font("Inter", Font.BOLD, 14));
	        btnConsulta.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					frame.dispose();
					HomeController cc = new HomeController();
					cc.ConsultaDeClientes();
				}
			});
	        add(btnConsulta);
	    }
	}
	
	public class UsuarioCerrarSesion extends JPanel {
		private JFrame ownerFrame; // Variable para guardar la referencia al JFrame

	    public UsuarioCerrarSesion(JFrame frame) { // Constructor modificado
	        this.ownerFrame = frame;
	        setLayout(new GridLayout(1, 1));  // 1 filas, 1 columna, que ocupa todo el panel

	        JButton btnHistorial = new JButton("Cerrar sesión");
	        btnHistorial.setForeground(Color.WHITE);
	        btnHistorial.setBackground(new Color(170, 170, 170));
	        btnHistorial.setFont(new Font("Inter", Font.BOLD, 14));
	        btnHistorial.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					frame.dispose();
					AuthController app = new AuthController(); 
					app.login();
				}
			});
	        add(btnHistorial);

	    }
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
		btnNewButton.setBounds(0, 0, 234, 49);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(50, 98, 115));
		btnNewButton.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController hm = new HomeController();
				hm.abrirCuenta2();
			}
		});
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Ensamble");
		btnNewButton_1.setBounds(226, 0, 227, 49);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(50, 98, 115));
		btnNewButton_1.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_1);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN CLIENTES
		JPanel panelContenido1 = new JPanel();
		panelContenido1.setBounds(230, 49, 225, 65);
		panelContenido1.setLayout(new BorderLayout());
		panelContenido1.setVisible(false);
		panelContenido1.setOpaque(false);
		panel.add(panelContenido1);

		btnNewButton_1.addActionListener(e -> {
			if (panelContenido1.isVisible()) {
				panelContenido1.setVisible(false);
				panelContenido1.removeAll();
			} else {
				panelContenido1.removeAll();
				panelContenido1.add(new EnsambledeplatilloyConsultarMenu(frame), BorderLayout.CENTER);
				panelContenido1.setVisible(true);
			}
			panelContenido1.revalidate();
			panelContenido1.repaint();
		});

		JButton btnNewButton_2 = new JButton("Inventario");
		btnNewButton_2.setBounds(452, 0, 227, 49);
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(50, 98, 115));
		btnNewButton_2.setFont(new Font("Inter", Font.BOLD, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController cc = new HomeController();
				cc.Inventario();
			}
		});
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Clientes");
		btnNewButton_3.setBounds(677, 0, 234, 49);
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(50, 98, 115));
		btnNewButton_3.setFont(new Font("Inter", Font.BOLD, 15));
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
				panelContenido.add(new HistorialyConsulta(frame), BorderLayout.CENTER);
				panelContenido.setVisible(true);
			}
			panelContenido.revalidate();
			panelContenido.repaint();
		});

		JButton btnNewButton_4 = new JButton("Usuarios");
		btnNewButton_4.setBounds(909, 0, 227, 49);
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(50, 98, 115));
		btnNewButton_4.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_4);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN USUARIOS
		JPanel panelContenido2 = new JPanel();
		panelContenido2.setBounds(909, 49, 227, 49);
		panelContenido2.setLayout(new BorderLayout());
		panelContenido2.setVisible(false);
		panelContenido2.setOpaque(false);
		panel.add(panelContenido2);

		btnNewButton_4.addActionListener(e -> {
			if (panelContenido2.isVisible()) {
				panelContenido2.setVisible(false);
				panelContenido2.removeAll();
			} else {
				panelContenido2.removeAll();
				panelContenido2.add(new UsuarioCerrarSesion(frame), BorderLayout.CENTER);
				panelContenido2.setVisible(true);
			}
			panelContenido2.revalidate();
			panelContenido2.repaint();
		});
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(259, 253, 240, 192);
		ImageIcon p1 = new ImageIcon(getClass().getResource("/img/cuenta.png"));
        Image imagen = p1.getImage().getScaledInstance(234, 192, Image.SCALE_SMOOTH);
        lblNewLabel.setIcon(new ImageIcon(imagen));
		panel.add(lblNewLabel);

		JButton btnNewButton_5 = new JButton("Abrir cuenta");
		btnNewButton_5.setBackground(new Color(217, 217, 217));
		btnNewButton_5.setFont(new Font("Inter", Font.BOLD, 13));
		btnNewButton_5.setBounds(259, 447, 240, 49);
		btnNewButton_5.setFocusPainted(false);
		btnNewButton_5.setContentAreaFilled(true);
		panel.add(btnNewButton_5);
		btnNewButton_5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController hm = new HomeController();
				hm.abrirCuenta();
			}
		});

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(660, 253, 234, 192);
		ImageIcon p2 = new ImageIcon(getClass().getResource("/img/consulcuent.png"));
        Image imagen2 = p2.getImage().getScaledInstance(234, 192, Image.SCALE_SMOOTH);
        lblNewLabel_1.setIcon(new ImageIcon(imagen2));
		panel.add(lblNewLabel_1);

		JButton btnNewButton_6 = new JButton("Consultar cuenta");
		btnNewButton_6.setBackground(new Color(217, 217, 217));
		btnNewButton_6.setFont(new Font("Inter", Font.BOLD, 13));
		btnNewButton_6.setBounds(660, 447, 234, 49);
		btnNewButton_6.setFocusPainted(false);
		btnNewButton_6.setContentAreaFilled(true);
		btnNewButton_6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			
				frame.dispose();
				HomeController cc = new HomeController();
				cc.ConsultaDeCuenta();
			}
		});
		panel.add(btnNewButton_6);
		frame.setVisible(true);

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

		// boton de comedor
		JButton btnNewButton = new JButton("Comedor");
		btnNewButton.setBounds(0, 0, 234, 49);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(50, 98, 115));
		btnNewButton.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController hm = new HomeController();
				hm.abrirCuenta2();
			}
		});
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Ensamble");
		btnNewButton_1.setBounds(226, 0, 227, 49);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(50, 98, 115));
		btnNewButton_1.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_1);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN CLIENTES
		JPanel panelContenido1 = new JPanel();
		panelContenido1.setBounds(230, 49, 225, 65);
		panelContenido1.setLayout(new BorderLayout());
		panelContenido1.setVisible(false);
		panelContenido1.setOpaque(false);
		panel.add(panelContenido1);

		btnNewButton_1.addActionListener(e -> {
			if (panelContenido1.isVisible()) {
				panelContenido1.setVisible(false);
				panelContenido1.removeAll();
			} else {
				panelContenido1.removeAll();
				panelContenido1.add(new EnsambledeplatilloyConsultarMenu(frame), BorderLayout.CENTER);
				panelContenido1.setVisible(true);
			}
			panelContenido1.revalidate();
			panelContenido1.repaint();
		});

		JButton btnNewButton_2 = new JButton("Inventario");
		btnNewButton_2.setBounds(452, 0, 227, 49);
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(50, 98, 115));
		btnNewButton_2.setFont(new Font("Inter", Font.BOLD, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController cc = new HomeController();
				cc.Inventario();
			}
		});
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Clientes");
		btnNewButton_3.setBounds(677, 0, 234, 49);
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(50, 98, 115));
		btnNewButton_3.setFont(new Font("Inter", Font.BOLD, 15));
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
				panelContenido.add(new HistorialyConsulta(frame), BorderLayout.CENTER);
				panelContenido.setVisible(true);
			}
			panelContenido.revalidate();
			panelContenido.repaint();
		});

		JButton btnNewButton_4 = new JButton("Usuarios");
		btnNewButton_4.setBounds(909, 0, 227, 49);
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(50, 98, 115));
		btnNewButton_4.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_4);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN USUARIOS
		JPanel panelContenido2 = new JPanel();
		panelContenido2.setBounds(909, 49, 227, 49);
		panelContenido2.setLayout(new BorderLayout());
		panelContenido2.setVisible(false);
		panelContenido2.setOpaque(false);
		panel.add(panelContenido2);

		btnNewButton_4.addActionListener(e -> {
			if (panelContenido2.isVisible()) {
				panelContenido2.setVisible(false);
				panelContenido2.removeAll();
			} else {
				panelContenido2.removeAll();
				panelContenido2.add(new UsuarioCerrarSesion(frame), BorderLayout.CENTER);
				panelContenido2.setVisible(true);
			}
			panelContenido2.revalidate();
			panelContenido2.repaint();
		});

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(259, 253, 240, 192);
		ImageIcon p = new ImageIcon(getClass().getResource("/img/cuenta.png"));
        Image imagen = p.getImage().getScaledInstance(234, 192, Image.SCALE_SMOOTH);
        lblNewLabel.setIcon(new ImageIcon(imagen));
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
		ImageIcon portada1 = new ImageIcon("img/consulcuent.png");
		Image portada2 = portada1.getImage();
		Image portada3 = portada2.getScaledInstance(234, 192, Image.SCALE_SMOOTH);
		lblNewLabel_1.setIcon(new ImageIcon(portada3));
		panel.add(lblNewLabel_1);

		JButton btnNewButton_6 = new JButton("Consultar cuenta");
		btnNewButton_6.setBackground(new Color(217, 217, 217));
		btnNewButton_6.setFont(new Font("Inter", Font.BOLD, 13));
		btnNewButton_6.setBounds(660, 447, 234, 49);
		panel.add(btnNewButton_6);
		frame.setVisible(true);

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

		// boton de comedor
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
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN CLIENTES
		JPanel panelContenido1 = new JPanel();
		panelContenido1.setBounds(230, 49, 225, 65);
		panelContenido1.setLayout(new BorderLayout());
		panelContenido1.setVisible(false);
		panelContenido1.setOpaque(false);
		panel.add(panelContenido1);

		btnNewButton_1.addActionListener(e -> {
			if (panelContenido1.isVisible()) {
				panelContenido1.setVisible(false);
				panelContenido1.removeAll();
			} else {
				panelContenido1.removeAll();
				panelContenido1.add(new EnsambledeplatilloyConsultarMenu(frame), BorderLayout.CENTER);
				panelContenido1.setVisible(true);
			}
			panelContenido1.revalidate();
			panelContenido1.repaint();
		});

		JButton btnNewButton_2 = new JButton("Inventario");
		btnNewButton_2.setBounds(452, 0, 227, 49);
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(50, 98, 115));
		btnNewButton_2.setFont(new Font("Inter", Font.BOLD, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController cc = new HomeController();
				cc.Inventario();
			}
		});
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Clientes");
		btnNewButton_3.setBounds(677, 0, 234, 49);
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(50, 98, 115));
		btnNewButton_3.setFont(new Font("Inter", Font.BOLD, 15));
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
				panelContenido.add(new HistorialyConsulta(frame), BorderLayout.CENTER);
				panelContenido.setVisible(true);
			}
			panelContenido.revalidate();
			panelContenido.repaint();
		});

		JButton btnNewButton_4 = new JButton("Usuarios");
		btnNewButton_4.setBounds(909, 0, 227, 49);
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(50, 98, 115));
		btnNewButton_4.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_4);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN USUARIOS
		JPanel panelContenido2 = new JPanel();
		panelContenido2.setBounds(909, 49, 227, 49);
		panelContenido2.setLayout(new BorderLayout());
		panelContenido2.setVisible(false);
		panelContenido2.setOpaque(false);
		panel.add(panelContenido2);

		btnNewButton_4.addActionListener(e -> {
			if (panelContenido2.isVisible()) {
				panelContenido2.setVisible(false);
				panelContenido2.removeAll();
			} else {
				panelContenido2.removeAll();
				panelContenido2.add(new UsuarioCerrarSesion(frame), BorderLayout.CENTER);
				panelContenido2.setVisible(true);
			}
			panelContenido2.revalidate();
			panelContenido2.repaint();
		});

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
		textField.setBackground(new Color(237, 237, 237));
		textField.setBounds(139, 92, 46, 19);
		textField.setHorizontalAlignment(JTextField.CENTER);
		panel_1.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("No.PERSONAS:");
		lblNewLabel_2.setFont(new Font("Inter", Font.BOLD, 18));
		lblNewLabel_2.setBounds(274, 74, 153, 49);
		panel_1.add(lblNewLabel_2);

		JTextField textField_1 = new JTextField();
		textField_1.setBackground(new Color(237, 237, 237));
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
		ImageIcon p = new ImageIcon(getClass().getResource("/img/cancelar.png"));
        Image imagen = p.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        btnNewButton_5.setIcon(new ImageIcon(imagen));
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
		ImageIcon p1 = new ImageIcon(getClass().getResource("/img/aceptar.png"));
        Image imagen1 = p1.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        btnNewButton_6.setIcon(new ImageIcon(imagen1));
		panel_1.add(btnNewButton_6);
		frame.setVisible(true);
		btnNewButton_6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController hm = new HomeController();
				hm.abrirCuenta2();
			}
		});

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

		// boton de comedor
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
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN CLIENTES
		JPanel panelContenido1 = new JPanel();
		panelContenido1.setBounds(230, 49, 225, 65);
		panelContenido1.setLayout(new BorderLayout());
		panelContenido1.setVisible(false);
		panelContenido1.setOpaque(false);
		panel.add(panelContenido1);

		btnNewButton_1.addActionListener(e -> {
			if (panelContenido1.isVisible()) {
				panelContenido1.setVisible(false);
				panelContenido1.removeAll();
			} else {
				panelContenido1.removeAll();
				panelContenido1.add(new EnsambledeplatilloyConsultarMenu(frame), BorderLayout.CENTER);
				panelContenido1.setVisible(true);
			}
			panelContenido1.revalidate();
			panelContenido1.repaint();
		});

		JButton btnNewButton_2 = new JButton("Inventario");
		btnNewButton_2.setBounds(452, 0, 227, 49);
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(50, 98, 115));
		btnNewButton_2.setFont(new Font("Inter", Font.BOLD, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController cc = new HomeController();
				cc.Inventario();
			}
		});
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Clientes");
		btnNewButton_3.setBounds(677, 0, 234, 49);
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(50, 98, 115));
		btnNewButton_3.setFont(new Font("Inter", Font.BOLD, 15));
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
				panelContenido.add(new HistorialyConsulta(frame), BorderLayout.CENTER);
				panelContenido.setVisible(true);
			}
			panelContenido.revalidate();
			panelContenido.repaint();
		});

		JButton btnNewButton_4 = new JButton("Usuarios");
		btnNewButton_4.setBounds(909, 0, 227, 49);
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(50, 98, 115));
		btnNewButton_4.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_4);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN USUARIOS
		JPanel panelContenido2 = new JPanel();
		panelContenido2.setBounds(909, 49, 227, 49);
		panelContenido2.setLayout(new BorderLayout());
		panelContenido2.setVisible(false);
		panelContenido2.setOpaque(false);
		panel.add(panelContenido2);

		btnNewButton_4.addActionListener(e -> {
			if (panelContenido2.isVisible()) {
				panelContenido2.setVisible(false);
				panelContenido2.removeAll();
			} else {
				panelContenido2.removeAll();
				panelContenido2.add(new UsuarioCerrarSesion(frame), BorderLayout.CENTER);
				panelContenido2.setVisible(true);
			}
			panelContenido2.revalidate();
			panelContenido2.repaint();
		});

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
		btnNewButton_6.setBackground(new Color(179, 140, 180));
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

		RoundedPanel panel_2 = new RoundedPanel(20);
		panel_2.setBackground(new Color(217, 217, 217));
		Border borde = BorderFactory.createLineBorder(Color.BLACK, 0);
		panel_2.setBorder(borde);
		panel_2.setBounds(56, 243, 704, 338);
		panel_1.add(panel_2);
		panel_2.setLayout(null);

		JButton btnNewButton_13 = new JButton("Buscar por producto");
		btnNewButton_13.setFont(new Font("Inter", Font.BOLD, 12));
		btnNewButton_13.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton_13.setVerticalTextPosition(SwingConstants.CENTER);
		btnNewButton_13.setIconTextGap(20);
		btnNewButton_13.setBackground(new Color(217, 217, 217));
		ImageIcon p = new ImageIcon(getClass().getResource("/img/lupa.png"));
        Image imagen = p.getImage().getScaledInstance(50, 64, Image.SCALE_SMOOTH);
        btnNewButton_13.setIcon(new ImageIcon(imagen));
		btnNewButton_13.setBounds(36, 227, 227, 64);
		panel.add(btnNewButton_13);
		frame.setVisible(true);

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

		// boton de comedor
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
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN CLIENTES
		JPanel panelContenido1 = new JPanel();
		panelContenido1.setBounds(230, 49, 225, 65);
		panelContenido1.setLayout(new BorderLayout());
		panelContenido1.setVisible(false);
		panelContenido1.setOpaque(false);
		panel.add(panelContenido1);

		btnNewButton_1.addActionListener(e -> {
			if (panelContenido1.isVisible()) {
				panelContenido1.setVisible(false);
				panelContenido1.removeAll();
			} else {
				panelContenido1.removeAll();
				panelContenido1.add(new EnsambledeplatilloyConsultarMenu(frame), BorderLayout.CENTER);
				panelContenido1.setVisible(true);
			}
			panelContenido1.revalidate();
			panelContenido1.repaint();
		});

		JButton btnNewButton_2 = new JButton("Inventario");
		btnNewButton_2.setBounds(452, 0, 227, 49);
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(50, 98, 115));
		btnNewButton_2.setFont(new Font("Inter", Font.BOLD, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController cc = new HomeController();
				cc.Inventario();
			}
		});
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Clientes");
		btnNewButton_3.setBounds(677, 0, 234, 49);
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(50, 98, 115));
		btnNewButton_3.setFont(new Font("Inter", Font.BOLD, 15));
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
				panelContenido.add(new HistorialyConsulta(frame), BorderLayout.CENTER);
				panelContenido.setVisible(true);
			}
			panelContenido.revalidate();
			panelContenido.repaint();
		});

		JButton btnNewButton_4 = new JButton("Usuarios");
		btnNewButton_4.setBounds(909, 0, 227, 49);
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(50, 98, 115));
		btnNewButton_4.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_4);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN USUARIOS
		JPanel panelContenido2 = new JPanel();
		panelContenido2.setBounds(909, 49, 227, 49);
		panelContenido2.setLayout(new BorderLayout());
		panelContenido2.setVisible(false);
		panelContenido2.setOpaque(false);
		panel.add(panelContenido2);

		btnNewButton_4.addActionListener(e -> {
			if (panelContenido2.isVisible()) {
				panelContenido2.setVisible(false);
				panelContenido2.removeAll();
			} else {
				panelContenido2.removeAll();
				panelContenido2.add(new UsuarioCerrarSesion(frame), BorderLayout.CENTER);
				panelContenido2.setVisible(true);
			}
			panelContenido2.revalidate();
			panelContenido2.repaint();
		});

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
		JTable table = new JTable(modelo) {
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

		JLabel lblTotalValor = new JLabel("$150");
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
		ImageIcon p = new ImageIcon(getClass().getResource("/img/enviar.png"));
        Image imagen = p.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        btnNewButton_10.setIcon(new ImageIcon(imagen));
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
		ImageIcon a = new ImageIcon(getClass().getResource("/img/cancelar.png"));
        Image imagen1 = a.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        btnNewButton_11.setIcon(new ImageIcon(imagen1));
		btnNewButton_11.setFocusPainted(false);
		btnNewButton_11.setContentAreaFilled(true);
		panel_1.add(btnNewButton_11);
		btnNewButton_11.setFocusPainted(false);
		btnNewButton_11.setContentAreaFilled(true);

		JButton btnNewButton_12 = new JButton(
				"<html><div style='text-align:center;'>ENVIAR Y COBRAR<br><br></div></html>");
		btnNewButton_12.setFont(new Font("Inter", Font.PLAIN, 9));
		btnNewButton_12.setBackground(new Color(190, 190, 190));
		btnNewButton_12.setBounds(501, 537, 120, 44);
		btnNewButton_12.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton_12.setVerticalTextPosition(SwingConstants.CENTER);
		btnNewButton_12.setHorizontalAlignment(SwingConstants.LEFT);
		ImageIcon b = new ImageIcon(getClass().getResource("/img/enviarycobrar.png"));
        Image imagen2 = b.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        btnNewButton_12.setIcon(new ImageIcon(imagen2));
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
		ImageIcon c = new ImageIcon(getClass().getResource("/img/lupa.png"));
        Image imagen3 = c.getImage().getScaledInstance(50, 64, Image.SCALE_SMOOTH);
        btnNewButton_13.setIcon(new ImageIcon(imagen3));
		btnNewButton_13.setBounds(36, 227, 227, 64);
		panel.add(btnNewButton_13);
		btnNewButton_13.setFocusPainted(false);
		btnNewButton_13.setContentAreaFilled(true);
		frame.setVisible(true);

	}

	public void AlmacenEditar() {
		try {
			UIManager.setLookAndFeel(new FlatLightLaf());
			UIManager.put("TextComponent.arc", 30);// textfield redondeadas
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

		// boton de comedor
		JButton btnNewButton = new JButton("Comedor");
		btnNewButton.setBounds(0, 0, 234, 49);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(50, 98, 115));
		btnNewButton.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController hm = new HomeController();
				hm.abrirCuenta2();
			}
		});
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Ensamble");
		btnNewButton_1.setBounds(226, 0, 227, 49);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(50, 98, 115));
		btnNewButton_1.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_1);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN CLIENTES
		JPanel panelContenido1 = new JPanel();
		panelContenido1.setBounds(230, 49, 225, 65);
		panelContenido1.setLayout(new BorderLayout());
		panelContenido1.setVisible(false);
		panelContenido1.setOpaque(false);
		panel.add(panelContenido1);

		btnNewButton_1.addActionListener(e -> {
			if (panelContenido1.isVisible()) {
				panelContenido1.setVisible(false);
				panelContenido1.removeAll();
			} else {
				panelContenido1.removeAll();
				panelContenido1.add(new EnsambledeplatilloyConsultarMenu(frame), BorderLayout.CENTER);
				panelContenido1.setVisible(true);
			}
			panelContenido1.revalidate();
			panelContenido1.repaint();
		});

		JButton btnNewButton_2 = new JButton("Inventario");
		btnNewButton_2.setBounds(452, 0, 227, 49);
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(50, 98, 115));
		btnNewButton_2.setFont(new Font("Inter", Font.BOLD, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController cc = new HomeController();
				cc.Inventario();
			}
		});
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Clientes");
		btnNewButton_3.setBounds(677, 0, 234, 49);
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(50, 98, 115));
		btnNewButton_3.setFont(new Font("Inter", Font.BOLD, 15));
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
				panelContenido.add(new HistorialyConsulta(frame), BorderLayout.CENTER);
				panelContenido.setVisible(true);
			}
			panelContenido.revalidate();
			panelContenido.repaint();
		});

		JButton btnNewButton_4 = new JButton("Usuarios");
		btnNewButton_4.setBounds(909, 0, 227, 49);
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(50, 98, 115));
		btnNewButton_4.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_4);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN USUARIOS
		JPanel panelContenido2 = new JPanel();
		panelContenido2.setBounds(909, 49, 227, 49);
		panelContenido2.setLayout(new BorderLayout());
		panelContenido2.setVisible(false);
		panelContenido2.setOpaque(false);
		panel.add(panelContenido2);

		btnNewButton_4.addActionListener(e -> {
			if (panelContenido2.isVisible()) {
				panelContenido2.setVisible(false);
				panelContenido2.removeAll();
			} else {
				panelContenido2.removeAll();
				panelContenido2.add(new UsuarioCerrarSesion(frame), BorderLayout.CENTER);
				panelContenido2.setVisible(true);
			}
			panelContenido2.revalidate();
			panelContenido2.repaint();
		});

		JLabel lblNewLabel = new JLabel("ALMACEN");
		lblNewLabel.setBounds(517, 82, 256, 25);
		lblNewLabel.setFont(new Font("Inter", Font.BOLD, 20));
		panel.add(lblNewLabel);

		// Boton añadir
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
		ImageIcon d1 = new ImageIcon("img/añadir.png");
		Image d2 = d1.getImage();
		Image d3 = d2.getScaledInstance(35, 35, Image.SCALE_SMOOTH);
		btnNewButton_5.setIcon(new ImageIcon(d3));
		panel.add(btnNewButton_5);

		// Botton editar
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
		ImageIcon a = new ImageIcon(getClass().getResource("/img/lapiz.png"));
        Image imagen = a.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        btnNewButton_6.setIcon(new ImageIcon(imagen));
		panel.add(btnNewButton_6);

		ImageIcon lupaIcon = new ImageIcon("/img/lupa.png");
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
		
		ImageIcon b = new ImageIcon(getClass().getResource("/img/borrar.png"));
        Image imagen2 = b.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        btnNewButton_7.setIcon(new ImageIcon(imagen2));
		panel.add(btnNewButton_7);

		// crea la barra
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(140, 296, 795, 260);
		panel.add(scrollPane);

		String[] columnas = { "Código", "Descripción", "Existencia", "U.M.", "Costo" };
		String[][] datos = { { "ING001", "Carne molida de res", "43", "KG", "$105" },
				{ "ING002", "Pan para hamburguesa", "20", "paq c/8", "$75" },
				{ "ING003", "Lechuga", "90", "Pieza", "$25" }, { "ING004", "Tomate", "25", "Kg", "$35" },
				{ "ING005", "Cebolla", "25", "Kg", "$60" }, { "ING006", "Pepinillos", "15", "Kg", "$45" },
				{ "ING007", "Papa blanca", "50", "Kg", "$45" },
				{ "ING008", "Refresco Coca Cola Regular", "200", "L", "$19" } };

		// Creamos la tabla permitiendo editar solo la columna "U.M."
		JTable table = new JTable(datos, columnas) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return column == 3; // Solo se puede editar la columna "U.M."
			}
		};

		// Editor de celda tipo JComboBox para la columna "U.M."
		String[] unidades = { "Kg", "Pieza", "L", "paq c/8" };
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
			public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
					boolean hasFocus, int row, int column) {

				JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row,
						column);
				label.setHorizontalAlignment(SwingConstants.CENTER);
				label.setFont(new Font("Inter", Font.BOLD, 14));
				label.setBackground(new Color(220, 220, 220));
				label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
				return label;
			}
		});

		scrollPane.setViewportView(table);
		frame.setVisible(true);

	}

	public void AñadirPlatillo() {
		try {
			UIManager.setLookAndFeel(new FlatLightLaf());
			UIManager.put("TextComponent.arc", 10);// textfield redondeadas
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

		// boton de comedor
		JButton btnNewButton = new JButton("Comedor");
		btnNewButton.setBounds(0, 0, 234, 49);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(50, 98, 115));
		btnNewButton.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController hm = new HomeController();
				hm.abrirCuenta2();
			}
		});
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Ensamble");
		btnNewButton_1.setBounds(226, 0, 227, 49);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(50, 98, 115));
		btnNewButton_1.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_1);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN CLIENTES
		JPanel panelContenido1 = new JPanel();
		panelContenido1.setBounds(230, 49, 225, 65);
		panelContenido1.setLayout(new BorderLayout());
		panelContenido1.setVisible(false);
		panelContenido1.setOpaque(false);
		panel.add(panelContenido1);

		btnNewButton_1.addActionListener(e -> {
			if (panelContenido1.isVisible()) {
				panelContenido1.setVisible(false);
				panelContenido1.removeAll();
			} else {
				panelContenido1.removeAll();
				panelContenido1.add(new EnsambledeplatilloyConsultarMenu(frame), BorderLayout.CENTER);
				panelContenido1.setVisible(true);
			}
			panelContenido1.revalidate();
			panelContenido1.repaint();
		});

		JButton btnNewButton_2 = new JButton("Inventario");
		btnNewButton_2.setBounds(452, 0, 227, 49);
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(50, 98, 115));
		btnNewButton_2.setFont(new Font("Inter", Font.BOLD, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController cc = new HomeController();
				cc.Inventario();
			}
		});
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Clientes");
		btnNewButton_3.setBounds(677, 0, 234, 49);
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(50, 98, 115));
		btnNewButton_3.setFont(new Font("Inter", Font.BOLD, 15));
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
				panelContenido.add(new HistorialyConsulta(frame), BorderLayout.CENTER);
				panelContenido.setVisible(true);
			}
			panelContenido.revalidate();
			panelContenido.repaint();
		});

		JButton btnNewButton_4 = new JButton("Usuarios");
		btnNewButton_4.setBounds(909, 0, 227, 49);
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(50, 98, 115));
		btnNewButton_4.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_4);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN USUARIOS
		JPanel panelContenido2 = new JPanel();
		panelContenido2.setBounds(909, 49, 227, 49);
		panelContenido2.setLayout(new BorderLayout());
		panelContenido2.setVisible(false);
		panelContenido2.setOpaque(false);
		panel.add(panelContenido2);

		btnNewButton_4.addActionListener(e -> {
			if (panelContenido2.isVisible()) {
				panelContenido2.setVisible(false);
				panelContenido2.removeAll();
			} else {
				panelContenido2.removeAll();
				panelContenido2.add(new UsuarioCerrarSesion(frame), BorderLayout.CENTER);
				panelContenido2.setVisible(true);
			}
			panelContenido2.revalidate();
			panelContenido2.repaint();
		});

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
		btnNewButton_5.setBackground(new Color(117, 197, 188));
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

		// boton cancelar
		JButton btnNewButton_6 = new JButton("CANCELAR");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				HomeController cc = new HomeController();
				cc.menu(); 
			}
		});
		btnNewButton_6.setFont(new Font("Inter", Font.BOLD, 9));
		btnNewButton_6.setBounds(311, 422, 85, 60);
		btnNewButton_6.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_6.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_6.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_6.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_6.setIconTextGap(1);		
		ImageIcon a = new ImageIcon(getClass().getResource("/img/cancelar.png"));
        Image imagen = a.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        btnNewButton_6.setIcon(new ImageIcon(imagen));
		btnNewButton_6.setFocusPainted(false);
		btnNewButton_6.setContentAreaFilled(true);
		panel_1.add(btnNewButton_6);

		// boton aceptar
		JButton btnNewButton_7 = new JButton("ACEPTAR");
		btnNewButton_7.setFont(new Font("Inter", Font.BOLD, 9));
		btnNewButton_7.setBounds(435, 422, 85, 60);
		btnNewButton_7.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_7.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_7.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_7.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_7.setIconTextGap(1);
		ImageIcon b = new ImageIcon(getClass().getResource("/img/aceptar.png"));
        Image imagen1 = b.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        btnNewButton_7.setIcon(new ImageIcon(imagen1));
		btnNewButton_7.setFocusPainted(false);
		btnNewButton_7.setContentAreaFilled(true);
		panel_1.add(btnNewButton_7);
		frame.setVisible(true);

	}

	public void AñadirPlatillo2() {
		try {
			UIManager.setLookAndFeel(new FlatLightLaf());
			UIManager.put("TextComponent.arc", 10);// textfield redondeadas
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

		// boton de comedor
		JButton btnNewButton = new JButton("Comedor");
		btnNewButton.setBounds(0, 0, 234, 49);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(50, 98, 115));
		btnNewButton.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController hm = new HomeController();
				hm.abrirCuenta2();
			}
		});
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Ensamble");
		btnNewButton_1.setBounds(226, 0, 227, 49);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(50, 98, 115));
		btnNewButton_1.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_1);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN CLIENTES
		JPanel panelContenido1 = new JPanel();
		panelContenido1.setBounds(230, 49, 225, 65);
		panelContenido1.setLayout(new BorderLayout());
		panelContenido1.setVisible(false);
		panelContenido1.setOpaque(false);
		panel.add(panelContenido1);

		btnNewButton_1.addActionListener(e -> {
			if (panelContenido1.isVisible()) {
				panelContenido1.setVisible(false);
				panelContenido1.removeAll();
			} else {
				panelContenido1.removeAll();
				panelContenido1.add(new EnsambledeplatilloyConsultarMenu(frame), BorderLayout.CENTER);
				panelContenido1.setVisible(true);
			}
			panelContenido1.revalidate();
			panelContenido1.repaint();
		});

		JButton btnNewButton_2 = new JButton("Inventario");
		btnNewButton_2.setBounds(452, 0, 227, 49);
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(50, 98, 115));
		btnNewButton_2.setFont(new Font("Inter", Font.BOLD, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController cc = new HomeController();
				cc.Inventario();
			}
		});
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Clientes");
		btnNewButton_3.setBounds(677, 0, 234, 49);
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(50, 98, 115));
		btnNewButton_3.setFont(new Font("Inter", Font.BOLD, 15));
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
				panelContenido.add(new HistorialyConsulta(frame), BorderLayout.CENTER);
				panelContenido.setVisible(true);
			}
			panelContenido.revalidate();
			panelContenido.repaint();
		});

		JButton btnNewButton_4 = new JButton("Usuarios");
		btnNewButton_4.setBounds(909, 0, 227, 49);
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(50, 98, 115));
		btnNewButton_4.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_4);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN USUARIOS
		JPanel panelContenido2 = new JPanel();
		panelContenido2.setBounds(909, 49, 227, 49);
		panelContenido2.setLayout(new BorderLayout());
		panelContenido2.setVisible(false);
		panelContenido2.setOpaque(false);
		panel.add(panelContenido2);

		btnNewButton_4.addActionListener(e -> {
			if (panelContenido2.isVisible()) {
				panelContenido2.setVisible(false);
				panelContenido2.removeAll();
			} else {
				panelContenido2.removeAll();
				panelContenido2.add(new UsuarioCerrarSesion(frame), BorderLayout.CENTER);
				panelContenido2.setVisible(true);
			}
			panelContenido2.revalidate();
			panelContenido2.repaint();
		});

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
		String[][] datos = { { "040221", "Tocino" }, { "043216", "Tomate" }, { "041555", "Salsa tabasco" },
				{ "041221", "Tomate" }, { "043851", "Tahini" },

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
		ImageIcon a = new ImageIcon(getClass().getResource("/img/cancelar.png"));
        Image imagen = a.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        btnNewButton_6.setIcon(new ImageIcon(imagen));
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
		ImageIcon b = new ImageIcon(getClass().getResource("/img/aceptar.png"));
        Image imagen2 = b.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        btnNewButton_7.setIcon(new ImageIcon(imagen2));
		btnNewButton_7.setFocusPainted(false);
		btnNewButton_7.setContentAreaFilled(true);
		panel_1.add(btnNewButton_7);
		frame.setVisible(true);

	}

	public void AñadirPlatillo3() {
		try {
			UIManager.setLookAndFeel(new FlatLightLaf());
			UIManager.put("TextComponent.arc", 10);// textfield redondeadas
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

		// boton de comedor
		JButton btnNewButton = new JButton("Comedor");
		btnNewButton.setBounds(0, 0, 234, 49);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(50, 98, 115));
		btnNewButton.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController hm = new HomeController();
				hm.abrirCuenta2();
			}
		});
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Ensamble");
		btnNewButton_1.setBounds(226, 0, 227, 49);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(50, 98, 115));
		btnNewButton_1.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_1);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN CLIENTES
		JPanel panelContenido1 = new JPanel();
		panelContenido1.setBounds(230, 49, 225, 65);
		panelContenido1.setLayout(new BorderLayout());
		panelContenido1.setVisible(false);
		panelContenido1.setOpaque(false);
		panel.add(panelContenido1);

		btnNewButton_1.addActionListener(e -> {
			if (panelContenido1.isVisible()) {
				panelContenido1.setVisible(false);
				panelContenido1.removeAll();
			} else {
				panelContenido1.removeAll();
				panelContenido1.add(new EnsambledeplatilloyConsultarMenu(frame), BorderLayout.CENTER);
				panelContenido1.setVisible(true);
			}
			panelContenido1.revalidate();
			panelContenido1.repaint();
		});

		JButton btnNewButton_2 = new JButton("Inventario");
		btnNewButton_2.setBounds(452, 0, 227, 49);
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(50, 98, 115));
		btnNewButton_2.setFont(new Font("Inter", Font.BOLD, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController cc = new HomeController();
				cc.Inventario();
			}
		});
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Clientes");
		btnNewButton_3.setBounds(677, 0, 234, 49);
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(50, 98, 115));
		btnNewButton_3.setFont(new Font("Inter", Font.BOLD, 15));
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
				panelContenido.add(new HistorialyConsulta(frame), BorderLayout.CENTER);
				panelContenido.setVisible(true);
			}
			panelContenido.revalidate();
			panelContenido.repaint();
		});

		JButton btnNewButton_4 = new JButton("Usuarios");
		btnNewButton_4.setBounds(909, 0, 227, 49);
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(50, 98, 115));
		btnNewButton_4.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_4);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN USUARIOS
		JPanel panelContenido2 = new JPanel();
		panelContenido2.setBounds(909, 49, 227, 49);
		panelContenido2.setLayout(new BorderLayout());
		panelContenido2.setVisible(false);
		panelContenido2.setOpaque(false);
		panel.add(panelContenido2);

		btnNewButton_4.addActionListener(e -> {
			if (panelContenido2.isVisible()) {
				panelContenido2.setVisible(false);
				panelContenido2.removeAll();
			} else {
				panelContenido2.removeAll();
				panelContenido2.add(new UsuarioCerrarSesion(frame), BorderLayout.CENTER);
				panelContenido2.setVisible(true);
			}
			panelContenido2.revalidate();
			panelContenido2.repaint();
		});

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
		btnNewButton_5.setBackground(new Color(117, 197, 188));
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

		// boton cancelar
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
		ImageIcon a = new ImageIcon(getClass().getResource("/img/cancelar.png"));
        Image imagen = a.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        btnNewButton_6.setIcon(new ImageIcon(imagen));
		btnNewButton_6.setFocusPainted(false);
		btnNewButton_6.setContentAreaFilled(true);
		panel_1.add(btnNewButton_6);

		// boton aceptar
		JButton btnNewButton_7 = new JButton("ACEPTAR");
		btnNewButton_7.setFont(new Font("Inter", Font.BOLD, 9));
		btnNewButton_7.setBounds(435, 422, 85, 60);
		btnNewButton_7.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_7.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_7.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_7.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_7.setIconTextGap(1);		
		ImageIcon b = new ImageIcon(getClass().getResource("/img/aceptar.png"));
        Image imagen2 = b.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        btnNewButton_7.setIcon(new ImageIcon(imagen2));
		btnNewButton_7.setFocusPainted(false);
		btnNewButton_7.setContentAreaFilled(true);
		panel_1.add(btnNewButton_7);
		frame.setVisible(true);

	}

	public void AñadirPlatillo4() {
		try {
			UIManager.setLookAndFeel(new FlatLightLaf());
			UIManager.put("TextComponent.arc", 10);// textfield redondeadas
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

		// boton de comedor
		JButton btnNewButton = new JButton("Comedor");
		btnNewButton.setBounds(0, 0, 234, 49);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(50, 98, 115));
		btnNewButton.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController hm = new HomeController();
				hm.abrirCuenta2();
			}
		});
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Ensamble");
		btnNewButton_1.setBounds(226, 0, 227, 49);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(50, 98, 115));
		btnNewButton_1.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_1);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN CLIENTES
		JPanel panelContenido1 = new JPanel();
		panelContenido1.setBounds(230, 49, 225, 65);
		panelContenido1.setLayout(new BorderLayout());
		panelContenido1.setVisible(false);
		panelContenido1.setOpaque(false);
		panel.add(panelContenido1);

		btnNewButton_1.addActionListener(e -> {
			if (panelContenido1.isVisible()) {
				panelContenido1.setVisible(false);
				panelContenido1.removeAll();
			} else {
				panelContenido1.removeAll();
				panelContenido1.add(new EnsambledeplatilloyConsultarMenu(frame), BorderLayout.CENTER);
				panelContenido1.setVisible(true);
			}
			panelContenido1.revalidate();
			panelContenido1.repaint();
		});

		JButton btnNewButton_2 = new JButton("Inventario");
		btnNewButton_2.setBounds(452, 0, 227, 49);
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(50, 98, 115));
		btnNewButton_2.setFont(new Font("Inter", Font.BOLD, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController cc = new HomeController();
				cc.Inventario();
			}
		});
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Clientes");
		btnNewButton_3.setBounds(677, 0, 234, 49);
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(50, 98, 115));
		btnNewButton_3.setFont(new Font("Inter", Font.BOLD, 15));
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
				panelContenido.add(new HistorialyConsulta(frame), BorderLayout.CENTER);
				panelContenido.setVisible(true);
			}
			panelContenido.revalidate();
			panelContenido.repaint();
		});

		JButton btnNewButton_4 = new JButton("Usuarios");
		btnNewButton_4.setBounds(909, 0, 227, 49);
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(50, 98, 115));
		btnNewButton_4.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_4);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN USUARIOS
		JPanel panelContenido2 = new JPanel();
		panelContenido2.setBounds(909, 49, 227, 49);
		panelContenido2.setLayout(new BorderLayout());
		panelContenido2.setVisible(false);
		panelContenido2.setOpaque(false);
		panel.add(panelContenido2);

		btnNewButton_4.addActionListener(e -> {
			if (panelContenido2.isVisible()) {
				panelContenido2.setVisible(false);
				panelContenido2.removeAll();
			} else {
				panelContenido2.removeAll();
				panelContenido2.add(new UsuarioCerrarSesion(frame), BorderLayout.CENTER);
				panelContenido2.setVisible(true);
			}
			panelContenido2.revalidate();
			panelContenido2.repaint();
		});

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
		btnNewButton_5.setBackground(new Color(117, 197, 188));
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
		ImageIcon a = new ImageIcon(getClass().getResource("/img/borrar2.png"));
        Image imagen = a.getImage().getScaledInstance(28, 31, Image.SCALE_SMOOTH);
        btnNewButton_8.setIcon(new ImageIcon(imagen));
        btnNewButton_8.setBorderPainted(false);
		btnNewButton_8.setFocusPainted(false);
		btnNewButton_8.setContentAreaFilled(true);
		panel_2.add(btnNewButton_8);

		// boton cancelar
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
		ImageIcon b = new ImageIcon(getClass().getResource("/img/cancelar.png"));
        Image imagen2 = b.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        btnNewButton_6.setIcon(new ImageIcon(imagen2));		
		btnNewButton_6.setFocusPainted(false);
		btnNewButton_6.setContentAreaFilled(true);
		panel_1.add(btnNewButton_6);

		// boton aceptar
		JButton btnNewButton_7 = new JButton("ACEPTAR");
		btnNewButton_7.setFont(new Font("Inter", Font.BOLD, 9));
		btnNewButton_7.setBounds(420, 422, 85, 60);
		btnNewButton_7.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_7.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_7.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_7.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_7.setIconTextGap(1);	
		ImageIcon c = new ImageIcon(getClass().getResource("/img/aceptar.png"));
        Image imagen3 = c.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        btnNewButton_7.setIcon(new ImageIcon(imagen3));
		btnNewButton_7.setFocusPainted(false);
		btnNewButton_7.setContentAreaFilled(true);
		panel_1.add(btnNewButton_7);
		frame.setVisible(true);

	}

	public void AñadirPlatillo5() {
		try {
			UIManager.setLookAndFeel(new FlatLightLaf());
			UIManager.put("TextComponent.arc", 10);// textfield redondeadas
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

		// boton de comedor
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
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN CLIENTES
		JPanel panelContenido1 = new JPanel();
		panelContenido1.setBounds(230, 49, 225, 65);
		panelContenido1.setLayout(new BorderLayout());
		panelContenido1.setVisible(false);
		panelContenido1.setOpaque(false);
		panel.add(panelContenido1);

		btnNewButton_1.addActionListener(e -> {
			if (panelContenido1.isVisible()) {
				panelContenido1.setVisible(false);
				panelContenido1.removeAll();
			} else {
				panelContenido1.removeAll();
				panelContenido1.add(new EnsambledeplatilloyConsultarMenu(frame), BorderLayout.CENTER);
				panelContenido1.setVisible(true);
			}
			panelContenido1.revalidate();
			panelContenido1.repaint();
		});

		JButton btnNewButton_2 = new JButton("Inventario");
		btnNewButton_2.setBounds(452, 0, 227, 49);
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(50, 98, 115));
		btnNewButton_2.setFont(new Font("Inter", Font.BOLD, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController cc = new HomeController();
				cc.Inventario();
			}
		});
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Clientes");
		btnNewButton_3.setBounds(677, 0, 234, 49);
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(50, 98, 115));
		btnNewButton_3.setFont(new Font("Inter", Font.BOLD, 15));
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
				panelContenido.add(new HistorialyConsulta(frame), BorderLayout.CENTER);
				panelContenido.setVisible(true);
			}
			panelContenido.revalidate();
			panelContenido.repaint();
		});

		JButton btnNewButton_4 = new JButton("Usuarios");
		btnNewButton_4.setBounds(909, 0, 227, 49);
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(50, 98, 115));
		btnNewButton_4.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_4);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN USUARIOS
		JPanel panelContenido2 = new JPanel();
		panelContenido2.setBounds(909, 49, 227, 49);
		panelContenido2.setLayout(new BorderLayout());
		panelContenido2.setVisible(false);
		panelContenido2.setOpaque(false);
		panel.add(panelContenido2);

		btnNewButton_4.addActionListener(e -> {
			if (panelContenido2.isVisible()) {
				panelContenido2.setVisible(false);
				panelContenido2.removeAll();
			} else {
				panelContenido2.removeAll();
				panelContenido2.add(new UsuarioCerrarSesion(frame), BorderLayout.CENTER);
				panelContenido2.setVisible(true);
			}
			panelContenido2.revalidate();
			panelContenido2.repaint();
		});

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
		panel_2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));// crea la line del borde
		panel_1.add(panel_2);
		panel_2.setLayout(null);

		// texto de Descripcióno
		JLabel lblNewLabel_1 = new JLabel("Descripción");
		lblNewLabel_1.setFont(new Font("Inter", Font.BOLD, 15));
		lblNewLabel_1.setBounds(392, 36, 116, 13);
		panel_2.add(lblNewLabel_1);

		// texto de cantidad
		JLabel lblNewLabel_2 = new JLabel("Cantidad");
		lblNewLabel_2.setFont(new Font("Inter", Font.BOLD, 15));
		lblNewLabel_2.setBounds(498, 36, 85, 13);
		panel_2.add(lblNewLabel_2);

		// texto de u.m
		JLabel lblNewLabel_3 = new JLabel("U.M.");
		lblNewLabel_3.setFont(new Font("Inter", Font.BOLD, 15));
		lblNewLabel_3.setBounds(588, 36, 45, 13);
		panel_2.add(lblNewLabel_3);

		// texto de costo
		JLabel lblNewLabel_4 = new JLabel("Costo");
		lblNewLabel_4.setFont(new Font("Inter", Font.BOLD, 15));
		lblNewLabel_4.setBounds(643, 36, 55, 13);
		panel_2.add(lblNewLabel_4);

		// texto de tocino
		JLabel lblNewLabel_5 = new JLabel("Tocino");
		lblNewLabel_5.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(402, 59, 85, 13);
		panel_2.add(lblNewLabel_5);

		// texto de la cantidad
		JTextField textField = new JTextField();
		textField.setBackground(new Color(237, 237, 237));
		textField.setToolTipText("");
		textField.setText("100\r\n");
		textField.setFont(new Font("Inter", Font.PLAIN, 13));
		textField.setBounds(498, 57, 63, 19);
		textField.setHorizontalAlignment(JTextField.CENTER);
		panel_2.add(textField);
		textField.setColumns(10);

		// texto del gramos
		JLabel lblNewLabel_6 = new JLabel("Gramos");
		lblNewLabel_6.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(578, 59, 55, 13);
		panel_2.add(lblNewLabel_6);

		// texto del precio
		JLabel lblNewLabel_7 = new JLabel("$120");
		lblNewLabel_7.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_7.setBounds(653, 59, 31, 13);
		panel_2.add(lblNewLabel_7);

		// boton de borrar
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setFont(new Font("Inter", Font.PLAIN, 10));
		btnNewButton_8.setBounds(693, 51, 28, 31);		
		ImageIcon a = new ImageIcon(getClass().getResource("/img/borrar2.png"));
        Image imagen = a.getImage().getScaledInstance(28, 31, Image.SCALE_SMOOTH);
        btnNewButton_8.setIcon(new ImageIcon(imagen));		
		btnNewButton_8.setBorderPainted(false);
		btnNewButton_8.setFocusPainted(false);
		btnNewButton_8.setContentAreaFilled(true);
		panel_2.add(btnNewButton_8);

		// Datos y columnas
		String[] columnas = { "Código", "Descripción" };
		String[][] datos = { { "040221", "Tocino" }, { "043216", "Tomate" }, { "041555", "Salsa tabasco" },
				{ "041221", "Tomate" }, { "043851", "Tahini" },

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
		ImageIcon b = new ImageIcon(getClass().getResource("/img/cancelar.png"));
        Image imagen2 = b.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        btnNewButton_6.setIcon(new ImageIcon(imagen2));	
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
		ImageIcon c = new ImageIcon(getClass().getResource("/img/aceptar.png"));
        Image imagen3 = c.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        btnNewButton_7.setIcon(new ImageIcon(imagen3));	
		btnNewButton_7.setFocusPainted(false);
		btnNewButton_7.setContentAreaFilled(true);
		panel_1.add(btnNewButton_7);
		frame.setVisible(true);

	}

	public void AñadirPlatillo6() {
		try {
			UIManager.setLookAndFeel(new FlatLightLaf());
			UIManager.put("TextComponent.arc", 10);// textfield redondeadas
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

		// boton de comedor
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
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN CLIENTES
		JPanel panelContenido1 = new JPanel();
		panelContenido1.setBounds(230, 49, 225, 65);
		panelContenido1.setLayout(new BorderLayout());
		panelContenido1.setVisible(false);
		panelContenido1.setOpaque(false);
		panel.add(panelContenido1);

		btnNewButton_1.addActionListener(e -> {
			if (panelContenido1.isVisible()) {
				panelContenido1.setVisible(false);
				panelContenido1.removeAll();
			} else {
				panelContenido1.removeAll();
				panelContenido1.add(new EnsambledeplatilloyConsultarMenu(frame), BorderLayout.CENTER);
				panelContenido1.setVisible(true);
			}
			panelContenido1.revalidate();
			panelContenido1.repaint();
		});

		JButton btnNewButton_2 = new JButton("Inventario");
		btnNewButton_2.setBounds(452, 0, 227, 49);
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(50, 98, 115));
		btnNewButton_2.setFont(new Font("Inter", Font.BOLD, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController cc = new HomeController();
				cc.Inventario();
			}
		});
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Clientes");
		btnNewButton_3.setBounds(677, 0, 234, 49);
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(50, 98, 115));
		btnNewButton_3.setFont(new Font("Inter", Font.BOLD, 15));
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
				panelContenido.add(new HistorialyConsulta(frame), BorderLayout.CENTER);
				panelContenido.setVisible(true);
			}
			panelContenido.revalidate();
			panelContenido.repaint();
		});

		JButton btnNewButton_4 = new JButton("Usuarios");
		btnNewButton_4.setBounds(909, 0, 227, 49);
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(50, 98, 115));
		btnNewButton_4.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_4);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN USUARIOS
		JPanel panelContenido2 = new JPanel();
		panelContenido2.setBounds(909, 49, 227, 49);
		panelContenido2.setLayout(new BorderLayout());
		panelContenido2.setVisible(false);
		panelContenido2.setOpaque(false);
		panel.add(panelContenido2);

		btnNewButton_4.addActionListener(e -> {
			if (panelContenido2.isVisible()) {
				panelContenido2.setVisible(false);
				panelContenido2.removeAll();
			} else {
				panelContenido2.removeAll();
				panelContenido2.add(new UsuarioCerrarSesion(frame), BorderLayout.CENTER);
				panelContenido2.setVisible(true);
			}
			panelContenido2.revalidate();
			panelContenido2.repaint();
		});

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

		JTextField TextField = new JTextField("Tomate");
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
		btnNewButton_5.setBackground(new Color(117, 197, 188));
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
		ImageIcon a = new ImageIcon(getClass().getResource("/img/borrar2.png"));
        Image imagen = a.getImage().getScaledInstance(28, 31, Image.SCALE_SMOOTH);
        btnNewButton_8.setIcon(new ImageIcon(imagen));	
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
		ImageIcon b = new ImageIcon(getClass().getResource("/img/borrar2.png"));
        Image imagen2 = b.getImage().getScaledInstance(28, 31, Image.SCALE_SMOOTH);
        btnNewButton_9.setIcon(new ImageIcon(imagen2));	
		btnNewButton_9.setBorderPainted(false);
		btnNewButton_9.setFocusPainted(false);
		btnNewButton_9.setContentAreaFilled(true);
		panel_2.add(btnNewButton_9);

		// boton cancelar
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

		// boton aceptar
		JButton btnNewButton_7 = new JButton("ACEPTAR");
		btnNewButton_7.setFont(new Font("Inter", Font.BOLD, 9));
		btnNewButton_7.setBounds(420, 422, 85, 60);
		btnNewButton_7.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_7.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_7.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_7.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_7.setIconTextGap(1);		
		ImageIcon c = new ImageIcon(getClass().getResource("/img/aceptar.png"));
        Image imagen3 = c.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        btnNewButton_7.setIcon(new ImageIcon(imagen3));	
		btnNewButton_7.setFocusPainted(false);
		btnNewButton_7.setContentAreaFilled(true);
		panel_1.add(btnNewButton_7);

	}

	public void BuscarPorProducto() {
		try {
			UIManager.setLookAndFeel(new FlatLightLaf());
			UIManager.put("TextComponent.arc", 20);// textfield redondeadas
			UIManager.put("Buttom.arc", 550); // Esquinas redondeadas
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		JFrame frame = new JFrame();
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
		String[] columnNames = { "Código", "Descripción", "Precio" };
		Object[][] data = { { "SKU09", "Hamburguesa clásica", "$150" }, { "SKU10", "Hamburguesa champiñón", "$150" },
				{ "SKU11", "Hamburguesa hawaiana", "$150" }, { "SKU12", "Hamburguesa clásica combo", "$150" },
				{ "SKU13", "Hamburguesa con champiñon combo", "$150" },
				{ "SKU14", "Hamburguesa hawaiana combo", "$150" }, { "SKU15", "Hamburguesa BBQ", "$150" }, };

		DefaultTableModel model = new DefaultTableModel(data, columnNames);
		JTable table = new JTable(model);
		table.setFillsViewportHeight(true);
		table.setRowHeight(25);
		table.setShowGrid(true);
		table.setGridColor(Color.BLACK);
		table.getTableHeader().setReorderingAllowed(false);

		// ScrollPane
		JScrollPane scrollPane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
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
			UIManager.put("TextComponent.arc", 20);// textfield redondeado
			UIManager.put("Buttom.arc", 200); // Esquinas redondeadas
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		JFrame frame = new JFrame();
		frame.setResizable(true);
		frame.setAlwaysOnTop(true);
		frame.setBounds(100, 100, 1150, 799);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 215));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		// boton de comedor
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
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN CLIENTES
		JPanel panelContenido1 = new JPanel();
		panelContenido1.setBounds(230, 49, 225, 65);
		panelContenido1.setLayout(new BorderLayout());
		panelContenido1.setVisible(false);
		panelContenido1.setOpaque(false);
		panel.add(panelContenido1);

		btnNewButton_1.addActionListener(e -> {
			if (panelContenido1.isVisible()) {
				panelContenido1.setVisible(false);
				panelContenido1.removeAll();
			} else {
				panelContenido1.removeAll();
				panelContenido1.add(new EnsambledeplatilloyConsultarMenu(frame), BorderLayout.CENTER);
				panelContenido1.setVisible(true);
			}
			panelContenido1.revalidate();
			panelContenido1.repaint();
		});

		JButton btnNewButton_2 = new JButton("Inventario");
		btnNewButton_2.setBounds(452, 0, 227, 49);
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(50, 98, 115));
		btnNewButton_2.setFont(new Font("Inter", Font.BOLD, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController cc = new HomeController();
				cc.Inventario();
			}
		});
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Clientes");
		btnNewButton_3.setBounds(677, 0, 234, 49);
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(50, 98, 115));
		btnNewButton_3.setFont(new Font("Inter", Font.BOLD, 15));
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
				panelContenido.add(new HistorialyConsulta(frame), BorderLayout.CENTER);
				panelContenido.setVisible(true);
			}
			panelContenido.revalidate();
			panelContenido.repaint();
		});

		JButton btnNewButton_4 = new JButton("Usuarios");
		btnNewButton_4.setBounds(909, 0, 227, 49);
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(50, 98, 115));
		btnNewButton_4.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_4);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN USUARIOS
		JPanel panelContenido2 = new JPanel();
		panelContenido2.setBounds(909, 49, 227, 49);
		panelContenido2.setLayout(new BorderLayout());
		panelContenido2.setVisible(false);
		panelContenido2.setOpaque(false);
		panel.add(panelContenido2);

		btnNewButton_4.addActionListener(e -> {
			if (panelContenido2.isVisible()) {
				panelContenido2.setVisible(false);
				panelContenido2.removeAll();
			} else {
				panelContenido2.removeAll();
				panelContenido2.add(new UsuarioCerrarSesion(frame), BorderLayout.CENTER);
				panelContenido2.setVisible(true);
			}
			panelContenido2.revalidate();
			panelContenido2.repaint();
		});

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
		ImageIcon a = new ImageIcon(getClass().getResource("/img/añadir.png"));
        Image imagen = a.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        btnNewButton_5.setIcon(new ImageIcon(imagen));
        
        btnNewButton_5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController cc = new HomeController();
				cc.AltaDeClientes();
			}
		});
        
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
		ImageIcon b = new ImageIcon(getClass().getResource("/img/lapiz.png"));
        Image imagen2 = b.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        btnNewButton_6.setIcon(new ImageIcon(imagen2));	
        
        btnNewButton_6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController cc = new HomeController();
				cc.EditarCliente();
			}
		});
        
		panel.add(btnNewButton_6);

		ImageIcon lupaIcon = new ImageIcon("/img/lupa.png");
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
		ImageIcon c = new ImageIcon(getClass().getResource("/img/borrar.png"));
        Image imagen3 = c.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        btnNewButton_7.setIcon(new ImageIcon(imagen3));	
		panel.add(btnNewButton_7);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(140, 296, 795, 260);
		panel.add(scrollPane);

		String[] columnas = { "ID cliente", "Nombre", "RFC" };
		String[][] datos = { { "C7283945", "Laura Fernanda Mendoza Ruiz", "LOPR8402" },
				{ "C1038472", "Esteban Ríos Calderón", "XACM7501" },
				{ "C5892371", "Camila Duarte Sánchez", "RODJ9011" },
				{ "C2947103", "Marcos Antonio Salgado Varela", "TEAG8010" },
				{ "C6739201", "Tomás Eduardo Aguirre Morales", "FAGM8512" },
				{ "C3478120", "Valeria Ponce Rodríguez", "VELD9203" },
				{ "C9012843", "Rafael Ibáñez Castillo", "NOMI9302" },
				{ "C7653902", "Diego Aranda Gutiérrez", "ZULM8701" } };

		JTable table = new JTable(datos, columnas) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		table.setFont(new Font("Inter", Font.PLAIN, 14)); // son para la fuente , mostrar las lineas , color y al
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
		// scroll la barra
		scrollPane.setViewportView(table);
	}

	public void ConsultaDeCuenta() {

		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(false);
		frame.setResizable(false);
		frame.setBounds(100, 100, 1150, 799);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		// boton de comedor
		JButton btnNewButton = new JButton("Comedor");
		btnNewButton.setBounds(0, 0, 234, 49);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(50, 98, 115));
		btnNewButton.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController hm = new HomeController();
				hm.abrirCuenta2();
			}
		});
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Ensamble");
		btnNewButton_1.setBounds(226, 0, 227, 49);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(50, 98, 115));
		btnNewButton_1.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_1);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN CLIENTES
		JPanel panelContenido1 = new JPanel();
		panelContenido1.setBounds(230, 49, 225, 65);
		panelContenido1.setLayout(new BorderLayout());
		panelContenido1.setVisible(false);
		panelContenido1.setOpaque(false);
		panel.add(panelContenido1);

		btnNewButton_1.addActionListener(e -> {
			if (panelContenido1.isVisible()) {
				panelContenido1.setVisible(false);
				panelContenido1.removeAll();
			} else {
				panelContenido1.removeAll();
				panelContenido1.add(new EnsambledeplatilloyConsultarMenu(frame), BorderLayout.CENTER);
				panelContenido1.setVisible(true);
			}
			panelContenido1.revalidate();
			panelContenido1.repaint();
		});

		JButton btnNewButton_2 = new JButton("Inventario");
		btnNewButton_2.setBounds(452, 0, 227, 49);
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(50, 98, 115));
		btnNewButton_2.setFont(new Font("Inter", Font.BOLD, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController cc = new HomeController();
				cc.Inventario();
			}
		});
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Clientes");
		btnNewButton_3.setBounds(677, 0, 234, 49);
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(50, 98, 115));
		btnNewButton_3.setFont(new Font("Inter", Font.BOLD, 15));
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
				panelContenido.add(new HistorialyConsulta(frame), BorderLayout.CENTER);
				panelContenido.setVisible(true);
			}
			panelContenido.revalidate();
			panelContenido.repaint();
		});

		JButton btnNewButton_4 = new JButton("Usuarios");
		btnNewButton_4.setBounds(909, 0, 227, 49);
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(50, 98, 115));
		btnNewButton_4.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_4);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN USUARIOS
		JPanel panelContenido2 = new JPanel();
		panelContenido2.setBounds(909, 49, 227, 49);
		panelContenido2.setLayout(new BorderLayout());
		panelContenido2.setVisible(false);
		panelContenido2.setOpaque(false);
		panel.add(panelContenido2);

		btnNewButton_4.addActionListener(e -> {
			if (panelContenido2.isVisible()) {
				panelContenido2.setVisible(false);
				panelContenido2.removeAll();
			} else {
				panelContenido2.removeAll();
				panelContenido2.add(new UsuarioCerrarSesion(frame), BorderLayout.CENTER);
				panelContenido2.setVisible(true);
			}
			panelContenido2.revalidate();
			panelContenido2.repaint();
		});

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
		ImageIcon a = new ImageIcon(getClass().getResource("/img/mesa.png"));
        Image imagen = a.getImage().getScaledInstance(160, 140, Image.SCALE_SMOOTH);
        btnNewButton_5.setIcon(new ImageIcon(imagen));
        
        btnNewButton_5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController hm = new HomeController();
				hm.IngresarnuevaCuenta();
			}
		});
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
		ImageIcon b = new ImageIcon(getClass().getResource("/img/mesa.png"));
        Image imagen2 = b.getImage().getScaledInstance(160, 140, Image.SCALE_SMOOTH);
        btnNewButton_6.setIcon(new ImageIcon(imagen2));
        
        btnNewButton_6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController hm = new HomeController();
				hm.IngresarnuevaCuenta();
			}
		});
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
		ImageIcon c = new ImageIcon(getClass().getResource("/img/mesa.png"));
        Image imagen3 = c.getImage().getScaledInstance(160, 140, Image.SCALE_SMOOTH);
        btnNewButton_6.setIcon(new ImageIcon(imagen3));
        
        btnNewButton_7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController hm = new HomeController();
				hm.IngresarnuevaCuenta();
			}
		});
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
		ImageIcon d = new ImageIcon(getClass().getResource("/img/mesa.png"));
        Image imagen4 = d.getImage().getScaledInstance(160, 140, Image.SCALE_SMOOTH);
        btnNewButton_8.setIcon(new ImageIcon(imagen4));
        
        btnNewButton_8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController hm = new HomeController();
				hm.IngresarnuevaCuenta();
			}
		});
		panel.add(btnNewButton_8);
	}

	public void AltaDeClientes() {
		try {
			UIManager.setLookAndFeel(new FlatLightLaf());
			UIManager.put("TextComponent.arc", 5);// textfield redondeadas
			UIManager.put("Buttom.arc", 700); // Esquinas redondeadas
			UIManager.put("CheckBox.arc", 25);
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

		// boton de comedor
		JButton btnNewButton = new JButton("Comedor");
		btnNewButton.setBounds(0, 0, 234, 49);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(50, 98, 115));
		btnNewButton.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController hm = new HomeController();
				hm.abrirCuenta2();
			}
		});
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Ensamble");
		btnNewButton_1.setBounds(226, 0, 227, 49);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(50, 98, 115));
		btnNewButton_1.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_1);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN CLIENTES
		JPanel panelContenido1 = new JPanel();
		panelContenido1.setBounds(230, 49, 225, 65);
		panelContenido1.setLayout(new BorderLayout());
		panelContenido1.setVisible(false);
		panelContenido1.setOpaque(false);
		panel.add(panelContenido1);

		btnNewButton_1.addActionListener(e -> {
			if (panelContenido1.isVisible()) {
				panelContenido1.setVisible(false);
				panelContenido1.removeAll();
			} else {
				panelContenido1.removeAll();
				panelContenido1.add(new EnsambledeplatilloyConsultarMenu(frame), BorderLayout.CENTER);
				panelContenido1.setVisible(true);
			}
			panelContenido1.revalidate();
			panelContenido1.repaint();
		});

		JButton btnNewButton_2 = new JButton("Inventario");
		btnNewButton_2.setBounds(452, 0, 227, 49);
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(50, 98, 115));
		btnNewButton_2.setFont(new Font("Inter", Font.BOLD, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController cc = new HomeController();
				cc.Inventario();
			}
		});
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Clientes");
		btnNewButton_3.setBounds(677, 0, 234, 49);
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(50, 98, 115));
		btnNewButton_3.setFont(new Font("Inter", Font.BOLD, 15));
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
				panelContenido.add(new HistorialyConsulta(frame), BorderLayout.CENTER);
				panelContenido.setVisible(true);
			}
			panelContenido.revalidate();
			panelContenido.repaint();
		});

		JButton btnNewButton_4 = new JButton("Usuarios");
		btnNewButton_4.setBounds(909, 0, 227, 49);
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(50, 98, 115));
		btnNewButton_4.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_4);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN USUARIOS
		JPanel panelContenido2 = new JPanel();
		panelContenido2.setBounds(909, 49, 227, 49);
		panelContenido2.setLayout(new BorderLayout());
		panelContenido2.setVisible(false);
		panelContenido2.setOpaque(false);
		panel.add(panelContenido2);

		btnNewButton_4.addActionListener(e -> {
			if (panelContenido2.isVisible()) {
				panelContenido2.setVisible(false);
				panelContenido2.removeAll();
			} else {
				panelContenido2.removeAll();
				panelContenido2.add(new UsuarioCerrarSesion(frame), BorderLayout.CENTER);
				panelContenido2.setVisible(true);
			}
			panelContenido2.revalidate();
			panelContenido2.repaint();
		});

		RoundedPanel panel_1 = new RoundedPanel(10);
		panel_1.setForeground(new Color(128, 128, 128));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(176, 97, 807, 583);
		panel_1.setBorder(BorderFactory.createLineBorder(Color.GRAY, 0));// crea la line del borde
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("Alta de clientes");
		lblNewLabel.setFont(new Font("Inter", Font.BOLD, 20));
		lblNewLabel.setBounds(333, 10, 235, 25);
		panel_1.add(lblNewLabel);

		RoundedPanel panel_2 = new RoundedPanel(10);
		panel_2.setForeground(new Color(128, 128, 128));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(41, 45, 297, 283);
		panel_2.setBorder(BorderFactory.createLineBorder(Color.GRAY, 0));// crea la linea del borde
		panel_1.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Información básica");
		lblNewLabel_1.setFont(new Font("Inter", Font.BOLD, 16));
		lblNewLabel_1.setBounds(71, 0, 151, 21);
		panel_2.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Primer nombre:");
		lblNewLabel_2.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 41, 118, 21);
		panel_2.add(lblNewLabel_2);

		JTextField txtAlejandro = new JTextField();
		txtAlejandro.setText("Erick");
		txtAlejandro.setFont(new Font("Inter", Font.PLAIN, 14));
		txtAlejandro.setBackground(new Color(237, 237, 237));
		txtAlejandro.setBounds(154, 41, 96, 21);
		panel_2.add(txtAlejandro);
		txtAlejandro.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Segundo nombre:");
		lblNewLabel_3.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 88, 135, 24);
		panel_2.add(lblNewLabel_3);

		JTextField txtDaniel = new JTextField();
		txtDaniel.setText("Daniel");
		txtDaniel.setFont(new Font("Inter", Font.PLAIN, 14));
		txtDaniel.setBackground(new Color(237, 237, 237));
		txtDaniel.setBounds(154, 92, 96, 21);
		panel_2.add(txtDaniel);
		txtDaniel.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Primer apellido: ");
		lblNewLabel_4.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_4.setBounds(10, 150, 135, 19);
		panel_2.add(lblNewLabel_4);

		JTextField txtGonzales = new JTextField();
		txtGonzales.setText("González");
		txtGonzales.setBackground(new Color(237, 237, 237));
		txtGonzales.setFont(new Font("Inter", Font.PLAIN, 14));
		txtGonzales.setBounds(154, 151, 96, 21);
		panel_2.add(txtGonzales);
		txtGonzales.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Segundo apellido:");
		lblNewLabel_5.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_5.setBounds(10, 208, 128, 21);
		panel_2.add(lblNewLabel_5);

		JTextField txtHernndez = new JTextField();
		txtHernndez.setText("Martínez");
		txtHernndez.setFont(new Font("Inter", Font.PLAIN, 14));
		txtHernndez.setBackground(new Color(237, 237, 237));
		txtHernndez.setBounds(154, 209, 96, 21);
		panel_2.add(txtHernndez);
		txtHernndez.setColumns(10);

		RoundedPanel panel_3 = new RoundedPanel(10);
		panel_3.setForeground(new Color(128, 128, 128));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(41, 359, 297, 86);
		panel_3.setBorder(BorderFactory.createLineBorder(Color.GRAY, 0));// crea la line del borde
		panel_1.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblNewLabel_6 = new JLabel("Fecha de nacimiento");
		lblNewLabel_6.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(80, 0, 150, 13);
		panel_3.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("Día:");
		lblNewLabel_7.setFont(new Font("Inter", Font.BOLD, 12));
		lblNewLabel_7.setBounds(10, 32, 45, 13);
		panel_3.add(lblNewLabel_7);

		JTextField textField_1 = new JTextField();
		textField_1.setText("24");
		textField_1.setBackground(new Color(237, 237, 237));
		textField_1.setFont(new Font("Inter", Font.PLAIN, 11));
		textField_1.setBounds(42, 30, 34, 19);
		panel_3.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_8 = new JLabel("Mes:");
		lblNewLabel_8.setFont(new Font("Inter", Font.BOLD, 12));
		lblNewLabel_8.setBounds(90, 32, 45, 13);
		panel_3.add(lblNewLabel_8);

		JTextField textField_2 = new JTextField();
		textField_2.setText("11");
		textField_2.setFont(new Font("Inter", Font.PLAIN, 11));
		textField_2.setBackground(new Color(237, 237, 237));
		textField_2.setBounds(124, 30, 34, 19);
		panel_3.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_9 = new JLabel("Año:");
		lblNewLabel_9.setFont(new Font("Inter", Font.BOLD, 12));
		lblNewLabel_9.setBounds(185, 33, 34, 13);
		panel_3.add(lblNewLabel_9);

		JTextField textField_3 = new JTextField();
		textField_3.setText("1998");
		textField_3.setFont(new Font("Inter", Font.PLAIN, 11));
		textField_3.setBackground(new Color(237, 237, 237));
		textField_3.setBounds(220, 30, 45, 19);
		panel_3.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblNewLabel_10 = new JLabel("Sexo:");
		lblNewLabel_10.setFont(new Font("Inter", Font.BOLD, 16));
		lblNewLabel_10.setBounds(51, 455, 43, 25);
		panel_1.add(lblNewLabel_10);

		RoundedPanel panel_4 = new RoundedPanel(10);
		panel_4.setForeground(new Color(128, 128, 128));
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(466, 45, 297, 283);
		panel_4.setBorder(BorderFactory.createLineBorder(Color.GRAY, 0));// crea la line del borde
		panel_1.add(panel_4);
		panel_4.setLayout(null);

		JLabel lblNewLabel_11 = new JLabel("Dirección");
		lblNewLabel_11.setFont(new Font("Inter", Font.BOLD, 16));
		lblNewLabel_11.setBounds(110, 0, 96, 13);
		panel_4.add(lblNewLabel_11);

		JLabel lblNewLabel_12 = new JLabel("Calle:");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_12.setBounds(10, 30, 45, 26);
		panel_4.add(lblNewLabel_12);

		JTextField txtCalleTeotihuacn = new JTextField();
		txtCalleTeotihuacn.setBackground(new Color(237, 237, 237));
		txtCalleTeotihuacn.setBackground(new Color(237, 237, 237));
		txtCalleTeotihuacn.setText("Calle Teotihuacán");
		txtCalleTeotihuacn.setBackground(new Color(237, 237, 237));
		txtCalleTeotihuacn.setFont(new Font("Inter", Font.PLAIN, 14));
		txtCalleTeotihuacn.setBounds(79, 30, 208, 26);
		panel_4.add(txtCalleTeotihuacn);
		txtCalleTeotihuacn.setColumns(10);

		JLabel lblNewLabel_13 = new JLabel("No.");
		lblNewLabel_13.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_13.setBounds(10, 93, 45, 18);
		panel_4.add(lblNewLabel_13);

		JTextField textField_5 = new JTextField();
		textField_5.setText("1946");
		textField_5.setBackground(new Color(237, 237, 237));
		textField_5.setFont(new Font("Inter", Font.PLAIN, 14));
		textField_5.setBounds(39, 88, 62, 26);
		panel_4.add(textField_5);
		textField_5.setColumns(10);

		JLabel lblNewLabel_14 = new JLabel("C.P.");
		lblNewLabel_14.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_14.setBounds(154, 93, 45, 18);
		panel_4.add(lblNewLabel_14);

		JTextField textField_6 = new JTextField();
		textField_6.setText("21095");
		textField_6.setBackground(new Color(237, 237, 237));
		textField_6.setFont(new Font("Inter", Font.PLAIN, 14));
		textField_6.setBounds(190, 89, 62, 26);
		panel_4.add(textField_6);
		textField_6.setColumns(10);

		JLabel lblNewLabel_15 = new JLabel("Colonia");
		lblNewLabel_15.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_15.setBounds(10, 152, 69, 26);
		panel_4.add(lblNewLabel_15);

		JTextField txtLosOlivares = new JTextField();
		txtLosOlivares.setText("Los olivos");
		txtLosOlivares.setBackground(new Color(237, 237, 237));
		txtLosOlivares.setFont(new Font("Inter", Font.PLAIN, 14));
		txtLosOlivares.setBounds(79, 150, 208, 26);
		panel_4.add(txtLosOlivares);
		txtLosOlivares.setColumns(10);

		JLabel lblNewLabel_16 = new JLabel("Ciudad");
		lblNewLabel_16.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_16.setBounds(10, 219, 69, 26);
		panel_4.add(lblNewLabel_16);

		JTextField txtLaPaz = new JTextField();
		txtLaPaz.setBackground(new Color(237, 237, 237));
		txtLaPaz.setFont(new Font("Inter", Font.PLAIN, 14));
		txtLaPaz.setText("La paz");
		txtLaPaz.setBounds(67, 219, 62, 26);
		panel_4.add(txtLaPaz);
		txtLaPaz.setColumns(10);

		JLabel lblNewLabel_17 = new JLabel("Estado");
		lblNewLabel_17.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_17.setBounds(154, 219, 52, 26);
		panel_4.add(lblNewLabel_17);

		JTextField textField_4 = new JTextField();
		textField_4.setFont(new Font("Inter", Font.PLAIN, 14));
		textField_4.setBackground(new Color(237, 237, 237));
		textField_4.setBounds(205, 221, 62, 26);
		panel_4.add(textField_4);
		textField_4.setColumns(10);

		RoundedPanel panel_5 = new RoundedPanel(10);
		panel_5.setForeground(new Color(128, 128, 128));
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(466, 353, 297, 117);
		panel_5.setBorder(BorderFactory.createLineBorder(Color.GRAY, 0));// crea la line del borde
		panel_1.add(panel_5);
		panel_5.setLayout(null);

		JLabel lblNewLabel_18 = new JLabel("Datos de contacto");
		lblNewLabel_18.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_18.setBounds(92, 0, 149, 13);
		panel_5.add(lblNewLabel_18);

		JLabel lblNewLabel_19 = new JLabel("Correo");
		lblNewLabel_19.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_19.setBounds(10, 32, 61, 13);
		panel_5.add(lblNewLabel_19);

		JTextField txtErickuabcsmx = new JTextField();
		txtErickuabcsmx.setBackground(new Color(237, 237, 237));
		txtErickuabcsmx.setFont(new Font("Inter", Font.PLAIN, 14));
		txtErickuabcsmx.setText("erick@uabcs.mx");
		txtErickuabcsmx.setBounds(77, 30, 191, 19);
		panel_5.add(txtErickuabcsmx);
		txtErickuabcsmx.setColumns(10);

		JLabel lblNewLabel_20 = new JLabel("Teléfono");
		lblNewLabel_20.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_20.setBounds(10, 77, 73, 13);
		panel_5.add(lblNewLabel_20);

		JTextField textField_7 = new JTextField();
		textField_7.setBackground(new Color(237, 237, 237));
		textField_7.setText("6121659613");
		textField_7.setFont(new Font("Inter", Font.PLAIN, 14));
		textField_7.setBounds(77, 75, 191, 19);
		panel_5.add(textField_7);
		textField_7.setColumns(10);
		JButton btnNewButton_6 = new JButton("CANCELAR");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				HomeController cc = new HomeController();
				cc.ConsultaDeClientes();
			}
		});
		btnNewButton_6.setFont(new Font("Inter", Font.BOLD, 9));
		btnNewButton_6.setBounds(303, 486, 85, 60);
		btnNewButton_6.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_6.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_6.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_6.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_6.setIconTextGap(1);
		ImageIcon a = new ImageIcon(getClass().getResource("/img/cancelar.png"));
        Image imagen = a.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        btnNewButton_6.setIcon(new ImageIcon(imagen));
		btnNewButton_6.setFocusPainted(false);
		btnNewButton_6.setContentAreaFilled(true);
		panel_1.add(btnNewButton_6);

		// boton aceptar
		JButton btnNewButton_7 = new JButton("ACEPTAR");
		btnNewButton_7.setFont(new Font("Inter", Font.BOLD, 9));
		btnNewButton_7.setBounds(419, 486, 85, 60);
		btnNewButton_7.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_7.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_7.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_7.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_7.setIconTextGap(1);
		ImageIcon b = new ImageIcon(getClass().getResource("/img/aceptar.png"));
        Image imagen2 = b.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        btnNewButton_7.setIcon(new ImageIcon(imagen2));
		btnNewButton_7.setFocusPainted(false);
		btnNewButton_7.setContentAreaFilled(true);
		panel_1.add(btnNewButton_7);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Masculino");
		chckbxNewCheckBox.setFont(new Font("Inter", Font.BOLD, 12));
		chckbxNewCheckBox.setBounds(105, 458, 93, 21);
		panel_1.add(chckbxNewCheckBox);

		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Femenino");
		chckbxNewCheckBox_1.setFont(new Font("Inter", Font.BOLD, 12));
		chckbxNewCheckBox_1.setBounds(232, 458, 93, 21);
		panel_1.add(chckbxNewCheckBox_1);

		frame.setVisible(true);

	}

	public void EditarCliente() {
		try {
			UIManager.setLookAndFeel(new FlatLightLaf());
			UIManager.put("TextComponent.arc", 5);// textfield redondeadas
			UIManager.put("Buttom.arc", 700); // Esquinas redondeadas
			UIManager.put("CheckBox.arc", 25);
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

		// boton de comedor
		JButton btnNewButton = new JButton("Comedor");
		btnNewButton.setBounds(0, 0, 234, 49);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(50, 98, 115));
		btnNewButton.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController hm = new HomeController();
				hm.abrirCuenta2();
			}
		});
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Ensamble");
		btnNewButton_1.setBounds(226, 0, 227, 49);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(50, 98, 115));
		btnNewButton_1.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_1);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN CLIENTES
		JPanel panelContenido1 = new JPanel();
		panelContenido1.setBounds(230, 49, 225, 65);
		panelContenido1.setLayout(new BorderLayout());
		panelContenido1.setVisible(false);
		panelContenido1.setOpaque(false);
		panel.add(panelContenido1);

		btnNewButton_1.addActionListener(e -> {
			if (panelContenido1.isVisible()) {
				panelContenido1.setVisible(false);
				panelContenido1.removeAll();
			} else {
				panelContenido1.removeAll();
				panelContenido1.add(new EnsambledeplatilloyConsultarMenu(frame), BorderLayout.CENTER);
				panelContenido1.setVisible(true);
			}
			panelContenido1.revalidate();
			panelContenido1.repaint();
		});

		JButton btnNewButton_2 = new JButton("Inventario");
		btnNewButton_2.setBounds(452, 0, 227, 49);
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(50, 98, 115));
		btnNewButton_2.setFont(new Font("Inter", Font.BOLD, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController cc = new HomeController();
				cc.Inventario();
			}
		});
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Clientes");
		btnNewButton_3.setBounds(677, 0, 234, 49);
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(50, 98, 115));
		btnNewButton_3.setFont(new Font("Inter", Font.BOLD, 15));
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
				panelContenido.add(new HistorialyConsulta(frame), BorderLayout.CENTER);
				panelContenido.setVisible(true);
			}
			panelContenido.revalidate();
			panelContenido.repaint();
		});

		JButton btnNewButton_4 = new JButton("Usuarios");
		btnNewButton_4.setBounds(909, 0, 227, 49);
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(50, 98, 115));
		btnNewButton_4.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_4);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN USUARIOS
		JPanel panelContenido2 = new JPanel();
		panelContenido2.setBounds(909, 49, 227, 49);
		panelContenido2.setLayout(new BorderLayout());
		panelContenido2.setVisible(false);
		panelContenido2.setOpaque(false);
		panel.add(panelContenido2);

		btnNewButton_4.addActionListener(e -> {
			if (panelContenido2.isVisible()) {
				panelContenido2.setVisible(false);
				panelContenido2.removeAll();
			} else {
				panelContenido2.removeAll();
				panelContenido2.add(new UsuarioCerrarSesion(frame), BorderLayout.CENTER);
				panelContenido2.setVisible(true);
			}
			panelContenido2.revalidate();
			panelContenido2.repaint();
		});

		RoundedPanel panel_1 = new RoundedPanel(10);
		panel_1.setForeground(new Color(128, 128, 128));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(176, 97, 807, 583);
		panel_1.setBorder(BorderFactory.createLineBorder(Color.GRAY, 0));// crea la line del borde
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("Editar cliente");
		lblNewLabel.setFont(new Font("Inter", Font.BOLD, 20));
		lblNewLabel.setBounds(333, 10, 235, 25);
		panel_1.add(lblNewLabel);

		RoundedPanel panel_2 = new RoundedPanel(10);
		panel_2.setForeground(new Color(128, 128, 128));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(41, 45, 297, 283);
		panel_2.setBorder(BorderFactory.createLineBorder(Color.GRAY, 0));// crea la line del borde
		panel_1.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Información básica");
		lblNewLabel_1.setFont(new Font("Inter", Font.BOLD, 16));
		lblNewLabel_1.setBounds(71, 0, 151, 21);
		panel_2.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Primer nombre:");
		lblNewLabel_2.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 41, 118, 21);
		panel_2.add(lblNewLabel_2);

		JTextField txtAlejandro = new JTextField();
		txtAlejandro.setText("Erick");
		txtAlejandro.setFont(new Font("Inter", Font.PLAIN, 14));
		txtAlejandro.setBackground(new Color(237, 237, 237));
		txtAlejandro.setBounds(154, 41, 96, 21);
		panel_2.add(txtAlejandro);
		txtAlejandro.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Segundo nombre:");
		lblNewLabel_3.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 88, 135, 24);
		panel_2.add(lblNewLabel_3);

		JTextField txtDaniel = new JTextField();
		txtDaniel.setText("Daniel");
		txtDaniel.setFont(new Font("Inter", Font.PLAIN, 14));
		txtDaniel.setBackground(new Color(237, 237, 237));
		txtDaniel.setBounds(154, 92, 96, 21);
		panel_2.add(txtDaniel);
		txtDaniel.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Primer apellido: ");
		lblNewLabel_4.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_4.setBounds(10, 150, 135, 19);
		panel_2.add(lblNewLabel_4);

		JTextField txtGonzales = new JTextField();
		txtGonzales.setText("González");
		txtGonzales.setBackground(new Color(237, 237, 237));
		txtGonzales.setFont(new Font("Inter", Font.PLAIN, 14));
		txtGonzales.setBounds(154, 151, 96, 21);
		panel_2.add(txtGonzales);
		txtGonzales.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Segundo apellido:");
		lblNewLabel_5.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_5.setBounds(10, 208, 128, 21);
		panel_2.add(lblNewLabel_5);

		JTextField txtHernndez = new JTextField();
		txtHernndez.setText("Martínez");
		txtHernndez.setFont(new Font("Inter", Font.PLAIN, 14));
		txtHernndez.setBackground(new Color(237, 237, 237));
		txtHernndez.setBounds(154, 209, 96, 21);
		panel_2.add(txtHernndez);
		txtHernndez.setColumns(10);

		RoundedPanel panel_3 = new RoundedPanel(10);
		panel_3.setForeground(new Color(128, 128, 128));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(41, 359, 297, 86);
		panel_3.setBorder(BorderFactory.createLineBorder(Color.GRAY, 0));// crea la line del borde
		panel_1.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblNewLabel_6 = new JLabel("Fecha de nacimiento");
		lblNewLabel_6.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(80, 0, 150, 13);
		panel_3.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("Día:");
		lblNewLabel_7.setFont(new Font("Inter", Font.BOLD, 12));
		lblNewLabel_7.setBounds(10, 32, 45, 13);
		panel_3.add(lblNewLabel_7);

		JTextField textField_1 = new JTextField();
		textField_1.setText("24");
		textField_1.setBackground(new Color(237, 237, 237));
		textField_1.setFont(new Font("Inter", Font.PLAIN, 11));
		textField_1.setBounds(42, 30, 34, 19);
		panel_3.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_8 = new JLabel("Mes:");
		lblNewLabel_8.setFont(new Font("Inter", Font.BOLD, 12));
		lblNewLabel_8.setBounds(90, 32, 45, 13);
		panel_3.add(lblNewLabel_8);

		JTextField textField_2 = new JTextField();
		textField_2.setText("11");
		textField_2.setFont(new Font("Inter", Font.PLAIN, 11));
		textField_2.setBackground(new Color(237, 237, 237));
		textField_2.setBounds(124, 30, 34, 19);
		panel_3.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_9 = new JLabel("Año:");
		lblNewLabel_9.setFont(new Font("Inter", Font.BOLD, 12));
		lblNewLabel_9.setBounds(185, 33, 34, 13);
		panel_3.add(lblNewLabel_9);

		JTextField textField_3 = new JTextField();
		textField_3.setText("1998");
		textField_3.setFont(new Font("Inter", Font.PLAIN, 11));
		textField_3.setBackground(new Color(237, 237, 237));
		textField_3.setBounds(220, 30, 45, 19);
		panel_3.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblNewLabel_10 = new JLabel("RFC:");
		lblNewLabel_10.setFont(new Font("Inter", Font.BOLD, 16));
		lblNewLabel_10.setBounds(51, 455, 69, 25);
		panel_1.add(lblNewLabel_10);

		JTextField txtEdgmhc = new JTextField();
		txtEdgmhc.setText("EDGM119824HC1");
		txtEdgmhc.setBackground(new Color(237, 237, 237));
		txtEdgmhc.setFont(new Font("Inter", Font.PLAIN, 14));
		txtEdgmhc.setBounds(91, 455, 174, 22);
		txtEdgmhc.setHorizontalAlignment(JTextField.CENTER);
		panel_1.add(txtEdgmhc);
		txtEdgmhc.setColumns(10);

		RoundedPanel panel_4 = new RoundedPanel(10);
		panel_4.setForeground(new Color(128, 128, 128));
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(466, 45, 297, 283);
		panel_4.setBorder(BorderFactory.createLineBorder(Color.GRAY, 0));// crea la linea del borde
		panel_1.add(panel_4);
		panel_4.setLayout(null);

		JLabel lblNewLabel_11 = new JLabel("Dirección");
		lblNewLabel_11.setFont(new Font("Inter", Font.BOLD, 16));
		lblNewLabel_11.setBounds(110, 0, 96, 13);
		panel_4.add(lblNewLabel_11);

		JLabel lblNewLabel_12 = new JLabel("Calle:");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_12.setBounds(10, 30, 45, 26);
		panel_4.add(lblNewLabel_12);

		JTextField txtCalleTeotihuacn = new JTextField();
		txtCalleTeotihuacn.setBackground(new Color(237, 237, 237));
		txtCalleTeotihuacn.setBackground(new Color(237, 237, 237));
		txtCalleTeotihuacn.setText("Calle Oro");
		txtCalleTeotihuacn.setBackground(new Color(237, 237, 237));
		txtCalleTeotihuacn.setFont(new Font("Inter", Font.PLAIN, 14));
		txtCalleTeotihuacn.setBounds(79, 30, 208, 26);
		panel_4.add(txtCalleTeotihuacn);
		txtCalleTeotihuacn.setColumns(10);

		JLabel lblNewLabel_13 = new JLabel("No.");
		lblNewLabel_13.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_13.setBounds(10, 93, 45, 18);
		panel_4.add(lblNewLabel_13);

		JTextField textField_5 = new JTextField();
		textField_5.setText("1946");
		textField_5.setBackground(new Color(237, 237, 237));
		textField_5.setFont(new Font("Inter", Font.PLAIN, 14));
		textField_5.setBounds(39, 88, 62, 26);
		panel_4.add(textField_5);
		textField_5.setColumns(10);

		JLabel lblNewLabel_14 = new JLabel("C.P.");
		lblNewLabel_14.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_14.setBounds(154, 93, 45, 18);
		panel_4.add(lblNewLabel_14);

		JTextField textField_6 = new JTextField();
		textField_6.setText("23795");
		textField_6.setBackground(new Color(237, 237, 237));
		textField_6.setFont(new Font("Inter", Font.PLAIN, 14));
		textField_6.setBounds(190, 89, 62, 26);
		panel_4.add(textField_6);
		textField_6.setColumns(10);

		JLabel lblNewLabel_15 = new JLabel("Colonia");
		lblNewLabel_15.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_15.setBounds(10, 152, 69, 26);
		panel_4.add(lblNewLabel_15);

		JTextField txtLosOlivares = new JTextField();
		txtLosOlivares.setText("Camino real");
		txtLosOlivares.setBackground(new Color(237, 237, 237));
		txtLosOlivares.setFont(new Font("Inter", Font.PLAIN, 14));
		txtLosOlivares.setBounds(79, 150, 208, 26);
		panel_4.add(txtLosOlivares);
		txtLosOlivares.setColumns(10);

		JLabel lblNewLabel_16 = new JLabel("Ciudad");
		lblNewLabel_16.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_16.setBounds(10, 219, 69, 26);
		panel_4.add(lblNewLabel_16);

		JTextField txtLaPaz = new JTextField();
		txtLaPaz.setBackground(new Color(237, 237, 237));
		txtLaPaz.setFont(new Font("Inter", Font.PLAIN, 14));
		txtLaPaz.setText("La paz");
		txtLaPaz.setBounds(67, 219, 62, 26);
		panel_4.add(txtLaPaz);
		txtLaPaz.setColumns(10);

		JLabel lblNewLabel_17 = new JLabel("Estado");
		lblNewLabel_17.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_17.setBounds(154, 219, 52, 26);
		panel_4.add(lblNewLabel_17);

		JTextField textField_4 = new JTextField();
		textField_4.setFont(new Font("Inter", Font.PLAIN, 14));
		textField_4.setBackground(new Color(237, 237, 237));
		textField_4.setBounds(205, 221, 62, 26);
		panel_4.add(textField_4);
		textField_4.setColumns(10);

		RoundedPanel panel_5 = new RoundedPanel(10);
		panel_5.setForeground(new Color(128, 128, 128));
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(466, 353, 297, 117);
		panel_5.setBorder(BorderFactory.createLineBorder(Color.GRAY, 0));// crea la line del borde
		panel_1.add(panel_5);
		panel_5.setLayout(null);

		JLabel lblNewLabel_18 = new JLabel("Datos de contacto");
		lblNewLabel_18.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_18.setBounds(92, 0, 149, 13);
		panel_5.add(lblNewLabel_18);

		JLabel lblNewLabel_19 = new JLabel("Correo");
		lblNewLabel_19.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_19.setBounds(10, 32, 61, 13);
		panel_5.add(lblNewLabel_19);

		JTextField txtErickuabcsmx = new JTextField();
		txtErickuabcsmx.setBackground(new Color(237, 237, 237));
		txtErickuabcsmx.setFont(new Font("Inter", Font.PLAIN, 14));
		txtErickuabcsmx.setText("erick_11@uabcs.mx");
		txtErickuabcsmx.setBounds(77, 30, 191, 19);
		panel_5.add(txtErickuabcsmx);
		txtErickuabcsmx.setColumns(10);

		JLabel lblNewLabel_20 = new JLabel("Teléfono");
		lblNewLabel_20.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_20.setBounds(10, 77, 73, 13);
		panel_5.add(lblNewLabel_20);

		JTextField textField_7 = new JTextField();
		textField_7.setBackground(new Color(237, 237, 237));
		textField_7.setText("6121887645");
		textField_7.setFont(new Font("Inter", Font.PLAIN, 14));
		textField_7.setBounds(77, 75, 191, 19);
		panel_5.add(textField_7);
		textField_7.setColumns(10);

		JButton btnNewButton_6 = new JButton("CANCELAR");
		btnNewButton_6.setFont(new Font("Inter", Font.BOLD, 9));
		btnNewButton_6.setBounds(303, 486, 85, 60);
		btnNewButton_6.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_6.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_6.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_6.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_6.setIconTextGap(1);
		ImageIcon a = new ImageIcon(getClass().getResource("/img/cancelar.png"));
        Image imagen = a.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        btnNewButton_6.setIcon(new ImageIcon(imagen));
		btnNewButton_6.setFocusPainted(false);
		btnNewButton_6.setContentAreaFilled(true);
		
		btnNewButton_6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController cc = new HomeController();
				cc.ConsultaDeClientes();
			}
		});
		
		panel_1.add(btnNewButton_6);

		// boton aceptar
		JButton btnNewButton_7 = new JButton("ACEPTAR");
		btnNewButton_7.setFont(new Font("Inter", Font.BOLD, 9));
		btnNewButton_7.setBounds(419, 486, 85, 60);
		btnNewButton_7.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_7.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_7.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_7.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_7.setIconTextGap(1);
		ImageIcon b = new ImageIcon(getClass().getResource("/img/aceptar.png"));
        Image imagen2 = b.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        btnNewButton_7.setIcon(new ImageIcon(imagen2));
		btnNewButton_7.setFocusPainted(false);
		btnNewButton_7.setContentAreaFilled(true);
		panel_1.add(btnNewButton_7);
		frame.setVisible(true);

	}

	public void EliminarCliente() {
		try {
			UIManager.setLookAndFeel(new FlatLightLaf());
			UIManager.put("TextComponent.arc", 5);// textfield redondeadas
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

		// boton de comedor
		JButton btnNewButton = new JButton("Comedor");
		btnNewButton.setBounds(0, 0, 234, 49);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(50, 98, 115));
		btnNewButton.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController hm = new HomeController();
				hm.abrirCuenta2();
			}
		});
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Ensamble");
		btnNewButton_1.setBounds(226, 0, 227, 49);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(50, 98, 115));
		btnNewButton_1.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_1);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN CLIENTES
		JPanel panelContenido1 = new JPanel();
		panelContenido1.setBounds(230, 49, 225, 65);
		panelContenido1.setLayout(new BorderLayout());
		panelContenido1.setVisible(false);
		panelContenido1.setOpaque(false);
		panel.add(panelContenido1);

		btnNewButton_1.addActionListener(e -> {
			if (panelContenido1.isVisible()) {
				panelContenido1.setVisible(false);
				panelContenido1.removeAll();
			} else {
				panelContenido1.removeAll();
				panelContenido1.add(new EnsambledeplatilloyConsultarMenu(frame), BorderLayout.CENTER);
				panelContenido1.setVisible(true);
			}
			panelContenido1.revalidate();
			panelContenido1.repaint();
		});

		JButton btnNewButton_2 = new JButton("Inventario");
		btnNewButton_2.setBounds(452, 0, 227, 49);
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(50, 98, 115));
		btnNewButton_2.setFont(new Font("Inter", Font.BOLD, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController cc = new HomeController();
				cc.Inventario();
			}
		});
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Clientes");
		btnNewButton_3.setBounds(677, 0, 234, 49);
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(50, 98, 115));
		btnNewButton_3.setFont(new Font("Inter", Font.BOLD, 15));
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
				panelContenido.add(new HistorialyConsulta(frame), BorderLayout.CENTER);
				panelContenido.setVisible(true);
			}
			panelContenido.revalidate();
			panelContenido.repaint();
		});

		JButton btnNewButton_4 = new JButton("Usuarios");
		btnNewButton_4.setBounds(909, 0, 227, 49);
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(50, 98, 115));
		btnNewButton_4.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_4);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN USUARIOS
		JPanel panelContenido2 = new JPanel();
		panelContenido2.setBounds(909, 49, 227, 49);
		panelContenido2.setLayout(new BorderLayout());
		panelContenido2.setVisible(false);
		panelContenido2.setOpaque(false);
		panel.add(panelContenido2);

		btnNewButton_4.addActionListener(e -> {
			if (panelContenido2.isVisible()) {
				panelContenido2.setVisible(false);
				panelContenido2.removeAll();
			} else {
				panelContenido2.removeAll();
				panelContenido2.add(new UsuarioCerrarSesion(frame), BorderLayout.CENTER);
				panelContenido2.setVisible(true);
			}
			panelContenido2.revalidate();
			panelContenido2.repaint();
		});

		RoundedPanel panel_1 = new RoundedPanel(10);
		panel_1.setForeground(new Color(128, 128, 128));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(176, 97, 807, 583);
		panel_1.setBorder(BorderFactory.createLineBorder(Color.GRAY, 0));// crea la line del borde
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("Eliminar cliente");
		lblNewLabel.setFont(new Font("Inter", Font.BOLD, 20));
		lblNewLabel.setBounds(333, 10, 235, 25);
		panel_1.add(lblNewLabel);

		RoundedPanel panel_2 = new RoundedPanel(10);
		panel_2.setForeground(new Color(128, 128, 128));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(41, 45, 297, 283);
		panel_2.setBorder(BorderFactory.createLineBorder(Color.GRAY, 0));// crea la line del borde
		panel_1.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Información básica");
		lblNewLabel_1.setFont(new Font("Inter", Font.BOLD, 16));
		lblNewLabel_1.setBounds(71, 0, 151, 21);
		panel_2.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Primer nombre:");
		lblNewLabel_2.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 41, 118, 21);
		panel_2.add(lblNewLabel_2);

		JTextField txtAlejandro = new JTextField();
		txtAlejandro.setText("Alejandro");
		txtAlejandro.setFont(new Font("Inter", Font.PLAIN, 14));
		txtAlejandro.setBackground(new Color(237, 237, 237));
		txtAlejandro.setBounds(154, 41, 96, 21);
		panel_2.add(txtAlejandro);
		txtAlejandro.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Segundo nombre:");
		lblNewLabel_3.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 88, 135, 24);
		panel_2.add(lblNewLabel_3);

		JTextField textField = new JTextField();
		textField.setFont(new Font("Inter", Font.PLAIN, 14));
		textField.setBackground(new Color(237, 237, 237));
		textField.setBounds(154, 92, 96, 21);
		panel_2.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Primer apellido: ");
		lblNewLabel_4.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_4.setBounds(10, 150, 135, 19);
		panel_2.add(lblNewLabel_4);

		JTextField txtGonzales = new JTextField();
		txtGonzales.setText("González");
		txtGonzales.setBackground(new Color(237, 237, 237));
		txtGonzales.setFont(new Font("Inter", Font.PLAIN, 14));
		txtGonzales.setBounds(154, 151, 96, 21);
		panel_2.add(txtGonzales);
		txtGonzales.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Segundo apellido:");
		lblNewLabel_5.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_5.setBounds(10, 208, 128, 21);
		panel_2.add(lblNewLabel_5);

		JTextField txtHernndez = new JTextField();
		txtHernndez.setText("Hernandez");
		txtHernndez.setFont(new Font("Inter", Font.PLAIN, 14));
		txtHernndez.setBackground(new Color(237, 237, 237));
		txtHernndez.setBounds(154, 209, 96, 21);
		panel_2.add(txtHernndez);
		txtHernndez.setColumns(10);

		RoundedPanel panel_3 = new RoundedPanel(10);
		panel_3.setForeground(new Color(128, 128, 128));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(41, 359, 297, 86);
		panel_3.setBorder(BorderFactory.createLineBorder(Color.GRAY, 0));// crea la line del borde
		panel_1.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblNewLabel_6 = new JLabel("Fecha de nacimiento");
		lblNewLabel_6.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(80, 0, 150, 13);
		panel_3.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("Día:");
		lblNewLabel_7.setFont(new Font("Inter", Font.BOLD, 12));
		lblNewLabel_7.setBounds(10, 32, 45, 13);
		panel_3.add(lblNewLabel_7);

		JTextField textField_1 = new JTextField();
		textField_1.setText("24");
		textField_1.setBackground(new Color(237, 237, 237));
		textField_1.setFont(new Font("Inter", Font.PLAIN, 11));
		textField_1.setBounds(42, 30, 34, 19);
		panel_3.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_8 = new JLabel("Mes:");
		lblNewLabel_8.setFont(new Font("Inter", Font.BOLD, 12));
		lblNewLabel_8.setBounds(90, 32, 45, 13);
		panel_3.add(lblNewLabel_8);

		JTextField textField_2 = new JTextField();
		textField_2.setText("11");
		textField_2.setFont(new Font("Inter", Font.PLAIN, 11));
		textField_2.setBackground(new Color(237, 237, 237));
		textField_2.setBounds(124, 30, 34, 19);
		panel_3.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_9 = new JLabel("Año:");
		lblNewLabel_9.setFont(new Font("Inter", Font.BOLD, 12));
		lblNewLabel_9.setBounds(185, 33, 34, 13);
		panel_3.add(lblNewLabel_9);

		JTextField textField_3 = new JTextField();
		textField_3.setText("1998");
		textField_3.setFont(new Font("Inter", Font.PLAIN, 11));
		textField_3.setBackground(new Color(237, 237, 237));
		textField_3.setBounds(220, 30, 45, 19);
		panel_3.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblNewLabel_10 = new JLabel("RFC:");
		lblNewLabel_10.setFont(new Font("Inter", Font.BOLD, 16));
		lblNewLabel_10.setBounds(51, 455, 69, 25);
		panel_1.add(lblNewLabel_10);

		JTextField txtEdgmhc = new JTextField();
		txtEdgmhc.setText("EDGM119824HC1");
		txtEdgmhc.setBackground(new Color(237, 237, 237));
		txtEdgmhc.setFont(new Font("Inter", Font.PLAIN, 14));
		txtEdgmhc.setBounds(91, 455, 174, 22);
		txtEdgmhc.setHorizontalAlignment(JTextField.CENTER);
		panel_1.add(txtEdgmhc);
		txtEdgmhc.setColumns(10);

		RoundedPanel panel_4 = new RoundedPanel(10);
		panel_4.setForeground(new Color(128, 128, 128));
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(466, 45, 297, 283);
		panel_4.setBorder(BorderFactory.createLineBorder(Color.GRAY, 0));// crea la line del borde
		panel_1.add(panel_4);
		panel_4.setLayout(null);

		JLabel lblNewLabel_11 = new JLabel("Dirección");
		lblNewLabel_11.setFont(new Font("Inter", Font.BOLD, 16));
		lblNewLabel_11.setBounds(110, 0, 96, 13);
		panel_4.add(lblNewLabel_11);

		JLabel lblNewLabel_12 = new JLabel("Calle:");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_12.setBounds(10, 30, 45, 26);
		panel_4.add(lblNewLabel_12);

		JTextField txtCalleTeotihuacn = new JTextField();
		txtCalleTeotihuacn.setBackground(new Color(237, 237, 237));
		txtCalleTeotihuacn.setBackground(new Color(237, 237, 237));
		txtCalleTeotihuacn.setText("Calle Teotihuacán");
		txtCalleTeotihuacn.setBackground(new Color(237, 237, 237));
		txtCalleTeotihuacn.setFont(new Font("Inter", Font.PLAIN, 14));
		txtCalleTeotihuacn.setBounds(79, 30, 208, 26);
		panel_4.add(txtCalleTeotihuacn);
		txtCalleTeotihuacn.setColumns(10);

		JLabel lblNewLabel_13 = new JLabel("No.");
		lblNewLabel_13.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_13.setBounds(10, 93, 45, 18);
		panel_4.add(lblNewLabel_13);

		JTextField textField_5 = new JTextField();
		textField_5.setText("1946");
		textField_5.setBackground(new Color(237, 237, 237));
		textField_5.setFont(new Font("Inter", Font.PLAIN, 14));
		textField_5.setBounds(39, 88, 62, 26);
		panel_4.add(textField_5);
		textField_5.setColumns(10);

		JLabel lblNewLabel_14 = new JLabel("C.P.");
		lblNewLabel_14.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_14.setBounds(154, 93, 45, 18);
		panel_4.add(lblNewLabel_14);

		JTextField textField_6 = new JTextField();
		textField_6.setText("21095");
		textField_6.setBackground(new Color(237, 237, 237));
		textField_6.setFont(new Font("Inter", Font.PLAIN, 14));
		textField_6.setBounds(190, 89, 62, 26);
		panel_4.add(textField_6);
		textField_6.setColumns(10);

		JLabel lblNewLabel_15 = new JLabel("Colonia");
		lblNewLabel_15.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_15.setBounds(10, 152, 69, 26);
		panel_4.add(lblNewLabel_15);

		JTextField txtLosOlivares = new JTextField();
		txtLosOlivares.setText("Los olivos");
		txtLosOlivares.setBackground(new Color(237, 237, 237));
		txtLosOlivares.setFont(new Font("Inter", Font.PLAIN, 14));
		txtLosOlivares.setBounds(79, 150, 208, 26);
		panel_4.add(txtLosOlivares);
		txtLosOlivares.setColumns(10);

		JLabel lblNewLabel_16 = new JLabel("Ciudad");
		lblNewLabel_16.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_16.setBounds(10, 219, 69, 26);
		panel_4.add(lblNewLabel_16);

		JTextField txtLaPaz = new JTextField();
		txtLaPaz.setBackground(new Color(237, 237, 237));
		txtLaPaz.setFont(new Font("Inter", Font.PLAIN, 14));
		txtLaPaz.setText("La paz");
		txtLaPaz.setBounds(67, 219, 62, 26);
		panel_4.add(txtLaPaz);
		txtLaPaz.setColumns(10);

		JLabel lblNewLabel_17 = new JLabel("Estado");
		lblNewLabel_17.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_17.setBounds(154, 219, 52, 26);
		panel_4.add(lblNewLabel_17);

		JTextField textField_4 = new JTextField();
		textField_4.setFont(new Font("Inter", Font.PLAIN, 14));
		textField_4.setBackground(new Color(237, 237, 237));
		textField_4.setBounds(205, 221, 62, 26);
		panel_4.add(textField_4);
		textField_4.setColumns(10);

		RoundedPanel panel_5 = new RoundedPanel(10);
		panel_5.setForeground(new Color(128, 128, 128));
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(466, 353, 297, 117);
		panel_5.setBorder(BorderFactory.createLineBorder(Color.GRAY, 0));// crea la line del borde
		panel_1.add(panel_5);
		panel_5.setLayout(null);

		JLabel lblNewLabel_18 = new JLabel("Datos de contacto");
		lblNewLabel_18.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_18.setBounds(92, 0, 149, 13);
		panel_5.add(lblNewLabel_18);

		JLabel lblNewLabel_19 = new JLabel("Correo");
		lblNewLabel_19.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_19.setBounds(10, 32, 61, 13);
		panel_5.add(lblNewLabel_19);

		JTextField txtErickuabcsmx = new JTextField();
		txtErickuabcsmx.setBackground(new Color(237, 237, 237));
		txtErickuabcsmx.setFont(new Font("Inter", Font.PLAIN, 14));
		txtErickuabcsmx.setText("erick@uabcs.mx");
		txtErickuabcsmx.setBounds(77, 30, 191, 19);
		panel_5.add(txtErickuabcsmx);
		txtErickuabcsmx.setColumns(10);

		JLabel lblNewLabel_20 = new JLabel("Teléfono");
		lblNewLabel_20.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_20.setBounds(10, 77, 73, 13);
		panel_5.add(lblNewLabel_20);

		JTextField textField_7 = new JTextField();
		textField_7.setBackground(new Color(237, 237, 237));
		textField_7.setText("6121659613");
		textField_7.setFont(new Font("Inter", Font.PLAIN, 14));
		textField_7.setBounds(77, 75, 191, 19);
		panel_5.add(textField_7);
		textField_7.setColumns(10);
		JButton btnNewButton_6 = new JButton("CANCELAR");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6.setFont(new Font("Inter", Font.BOLD, 9));
		btnNewButton_6.setBounds(303, 486, 85, 60);
		btnNewButton_6.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_6.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_6.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_6.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_6.setIconTextGap(1);
		ImageIcon a = new ImageIcon(getClass().getResource("/img/cancelar.png"));
        Image imagen = a.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        btnNewButton_6.setIcon(new ImageIcon(imagen));
		btnNewButton_6.setFocusPainted(false);
		btnNewButton_6.setContentAreaFilled(true);
		panel_1.add(btnNewButton_6);

		// boton aceptar
		JButton btnNewButton_7 = new JButton("ACEPTAR");
		btnNewButton_7.setFont(new Font("Inter", Font.BOLD, 9));
		btnNewButton_7.setBounds(419, 486, 85, 60);
		btnNewButton_7.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_7.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_7.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_7.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_7.setIconTextGap(1);
		ImageIcon b = new ImageIcon(getClass().getResource("/img/aceptar.png"));
        Image imagen2 = b.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        btnNewButton_7.setIcon(new ImageIcon(imagen2));
		btnNewButton_7.setFocusPainted(false);
		btnNewButton_7.setContentAreaFilled(true);
		panel_1.add(btnNewButton_7);
		frame.setVisible(true);

	}

	public void EliminarCliente2() {
		try {
			UIManager.setLookAndFeel(new FlatLightLaf());
			UIManager.put("TextComponent.arc", 5);// textfield redondeadas
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

		// boton de comedor
		JButton btnNewButton = new JButton("Comedor");
		btnNewButton.setBounds(0, 0, 234, 49);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(50, 98, 115));
		btnNewButton.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController hm = new HomeController();
				hm.abrirCuenta2();
			}
		});
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Ensamble");
		btnNewButton_1.setBounds(226, 0, 227, 49);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(50, 98, 115));
		btnNewButton_1.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_1);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN CLIENTES
		JPanel panelContenido1 = new JPanel();
		panelContenido1.setBounds(230, 49, 225, 65);
		panelContenido1.setLayout(new BorderLayout());
		panelContenido1.setVisible(false);
		panelContenido1.setOpaque(false);
		panel.add(panelContenido1);

		btnNewButton_1.addActionListener(e -> {
			if (panelContenido1.isVisible()) {
				panelContenido1.setVisible(false);
				panelContenido1.removeAll();
			} else {
				panelContenido1.removeAll();
				panelContenido1.add(new EnsambledeplatilloyConsultarMenu(frame), BorderLayout.CENTER);
				panelContenido1.setVisible(true);
			}
			panelContenido1.revalidate();
			panelContenido1.repaint();
		});

		JButton btnNewButton_2 = new JButton("Inventario");
		btnNewButton_2.setBounds(452, 0, 227, 49);
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(50, 98, 115));
		btnNewButton_2.setFont(new Font("Inter", Font.BOLD, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController cc = new HomeController();
				cc.Inventario();
			}
		});
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Clientes");
		btnNewButton_3.setBounds(677, 0, 234, 49);
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(50, 98, 115));
		btnNewButton_3.setFont(new Font("Inter", Font.BOLD, 15));
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
				panelContenido.add(new HistorialyConsulta(frame), BorderLayout.CENTER);
				panelContenido.setVisible(true);
			}
			panelContenido.revalidate();
			panelContenido.repaint();
		});

		JButton btnNewButton_4 = new JButton("Usuarios");
		btnNewButton_4.setBounds(909, 0, 227, 49);
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(50, 98, 115));
		btnNewButton_4.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_4);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN USUARIOS
		JPanel panelContenido2 = new JPanel();
		panelContenido2.setBounds(909, 49, 227, 49);
		panelContenido2.setLayout(new BorderLayout());
		panelContenido2.setVisible(false);
		panelContenido2.setOpaque(false);
		panel.add(panelContenido2);

		btnNewButton_4.addActionListener(e -> {
			if (panelContenido2.isVisible()) {
				panelContenido2.setVisible(false);
				panelContenido2.removeAll();
			} else {
				panelContenido2.removeAll();
				panelContenido2.add(new UsuarioCerrarSesion(frame), BorderLayout.CENTER);
				panelContenido2.setVisible(true);
			}
			panelContenido2.revalidate();
			panelContenido2.repaint();
		});

		RoundedPanel panel_1 = new RoundedPanel(10);
		panel_1.setForeground(new Color(128, 128, 128));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(286, 96, 807, 583);
		panel_1.setBorder(BorderFactory.createLineBorder(Color.GRAY, 0));// crea la line del borde
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("Eliminar cliente");
		lblNewLabel.setFont(new Font("Inter", Font.BOLD, 20));
		lblNewLabel.setBounds(333, 10, 235, 25);
		panel_1.add(lblNewLabel);

		RoundedPanel panel_2 = new RoundedPanel(10);
		panel_2.setForeground(new Color(0, 0, 0));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(41, 45, 297, 283);
		panel_2.setBorder(BorderFactory.createLineBorder(Color.GRAY, 0));// crea la line del borde
		panel_1.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Información básica");
		lblNewLabel_1.setFont(new Font("Inter", Font.BOLD, 16));
		lblNewLabel_1.setBounds(71, 0, 151, 21);
		panel_2.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Primer nombre:");
		lblNewLabel_2.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 41, 118, 21);
		panel_2.add(lblNewLabel_2);

		JTextField txtAlejandro = new JTextField();
		txtAlejandro.setText("Alejandro");
		txtAlejandro.setFont(new Font("Inter", Font.PLAIN, 14));
		txtAlejandro.setBackground(new Color(237, 237, 237));
		txtAlejandro.setBounds(154, 41, 96, 21);
		panel_2.add(txtAlejandro);
		txtAlejandro.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Segundo nombre:");
		lblNewLabel_3.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 88, 135, 24);
		panel_2.add(lblNewLabel_3);

		JTextField textField = new JTextField();
		textField.setFont(new Font("Inter", Font.PLAIN, 14));
		textField.setBackground(new Color(237, 237, 237));
		textField.setBounds(154, 92, 96, 21);
		panel_2.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Primer apellido: ");
		lblNewLabel_4.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_4.setBounds(10, 150, 135, 19);
		panel_2.add(lblNewLabel_4);

		JTextField txtGonzales = new JTextField();
		txtGonzales.setText("González");
		txtGonzales.setBackground(new Color(237, 237, 237));
		txtGonzales.setFont(new Font("Inter", Font.PLAIN, 14));
		txtGonzales.setBounds(154, 151, 96, 21);
		panel_2.add(txtGonzales);
		txtGonzales.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Segundo apellido:");
		lblNewLabel_5.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_5.setBounds(10, 208, 128, 21);
		panel_2.add(lblNewLabel_5);

		JTextField txtHernndez = new JTextField();
		txtHernndez.setText("Hernandez");
		txtHernndez.setFont(new Font("Inter", Font.PLAIN, 14));
		txtHernndez.setBackground(new Color(237, 237, 237));
		txtHernndez.setBounds(154, 209, 96, 21);
		panel_2.add(txtHernndez);
		txtHernndez.setColumns(10);

		RoundedPanel panel_3 = new RoundedPanel(10);
		panel_3.setForeground(new Color(0, 0, 0));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(41, 359, 297, 86);
		panel_3.setBorder(BorderFactory.createLineBorder(Color.GRAY, 0));// crea la line del borde
		panel_1.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblNewLabel_6 = new JLabel("Fecha de nacimiento");
		lblNewLabel_6.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(80, 0, 150, 13);
		panel_3.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("Día:");
		lblNewLabel_7.setFont(new Font("Inter", Font.BOLD, 12));
		lblNewLabel_7.setBounds(10, 32, 45, 13);
		panel_3.add(lblNewLabel_7);

		JTextField textField_1 = new JTextField();
		textField_1.setText("24");
		textField_1.setBackground(new Color(237, 237, 237));
		textField_1.setFont(new Font("Inter", Font.PLAIN, 11));
		textField_1.setBounds(42, 30, 34, 19);
		panel_3.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_8 = new JLabel("Mes:");
		lblNewLabel_8.setFont(new Font("Inter", Font.BOLD, 12));
		lblNewLabel_8.setBounds(90, 32, 45, 13);
		panel_3.add(lblNewLabel_8);

		JTextField textField_2 = new JTextField();
		textField_2.setText("11");
		textField_2.setFont(new Font("Inter", Font.PLAIN, 11));
		textField_2.setBackground(new Color(237, 237, 237));
		textField_2.setBounds(124, 30, 34, 19);
		panel_3.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_9 = new JLabel("Año:");
		lblNewLabel_9.setFont(new Font("Inter", Font.BOLD, 12));
		lblNewLabel_9.setBounds(185, 33, 34, 13);
		panel_3.add(lblNewLabel_9);

		JTextField textField_3 = new JTextField();
		textField_3.setText("1998");
		textField_3.setFont(new Font("Inter", Font.PLAIN, 11));
		textField_3.setBackground(new Color(237, 237, 237));
		textField_3.setBounds(220, 30, 45, 19);
		panel_3.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblNewLabel_10 = new JLabel("RFC:");
		lblNewLabel_10.setFont(new Font("Inter", Font.BOLD, 16));
		lblNewLabel_10.setBounds(51, 455, 69, 25);
		panel_1.add(lblNewLabel_10);

		JTextField txtEdgmhc = new JTextField();
		txtEdgmhc.setText("EDGM119824HC1");
		txtEdgmhc.setBackground(new Color(237, 237, 237));
		txtEdgmhc.setFont(new Font("Inter", Font.PLAIN, 14));
		txtEdgmhc.setBounds(91, 455, 174, 22);
		txtEdgmhc.setHorizontalAlignment(JTextField.CENTER);
		panel_1.add(txtEdgmhc);
		txtEdgmhc.setColumns(10);

		RoundedPanel panel_4 = new RoundedPanel(10);
		panel_4.setForeground(new Color(0, 0, 0));
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(466, 45, 297, 283);
		panel_4.setBorder(BorderFactory.createLineBorder(Color.GRAY, 0));// crea la line del borde
		panel_1.add(panel_4);
		panel_4.setLayout(null);

		JLabel lblNewLabel_11 = new JLabel("Dirección");
		lblNewLabel_11.setFont(new Font("Inter", Font.BOLD, 16));
		lblNewLabel_11.setBounds(110, 0, 96, 13);
		panel_4.add(lblNewLabel_11);

		JLabel lblNewLabel_12 = new JLabel("Calle:");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_12.setBounds(10, 30, 45, 26);
		panel_4.add(lblNewLabel_12);

		JTextField txtCalleTeotihuacn = new JTextField();
		txtCalleTeotihuacn.setBackground(new Color(237, 237, 237));
		txtCalleTeotihuacn.setBackground(new Color(237, 237, 237));
		txtCalleTeotihuacn.setText("Calle Teotihuacán");
		txtCalleTeotihuacn.setBackground(new Color(237, 237, 237));
		txtCalleTeotihuacn.setFont(new Font("Inter", Font.PLAIN, 14));
		txtCalleTeotihuacn.setBounds(79, 30, 208, 26);
		panel_4.add(txtCalleTeotihuacn);
		txtCalleTeotihuacn.setColumns(10);

		JLabel lblNewLabel_13 = new JLabel("No.");
		lblNewLabel_13.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_13.setBounds(10, 93, 45, 18);
		panel_4.add(lblNewLabel_13);

		JTextField textField_5 = new JTextField();
		textField_5.setText("1946");
		textField_5.setBackground(new Color(237, 237, 237));
		textField_5.setFont(new Font("Inter", Font.PLAIN, 14));
		textField_5.setBounds(39, 88, 62, 26);
		panel_4.add(textField_5);
		textField_5.setColumns(10);

		JLabel lblNewLabel_14 = new JLabel("C.P.");
		lblNewLabel_14.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_14.setBounds(154, 93, 45, 18);
		panel_4.add(lblNewLabel_14);

		JTextField textField_6 = new JTextField();
		textField_6.setText("21095");
		textField_6.setBackground(new Color(237, 237, 237));
		textField_6.setFont(new Font("Inter", Font.PLAIN, 14));
		textField_6.setBounds(190, 89, 62, 26);
		panel_4.add(textField_6);
		textField_6.setColumns(10);

		JLabel lblNewLabel_15 = new JLabel("Colonia");
		lblNewLabel_15.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_15.setBounds(10, 152, 69, 26);
		panel_4.add(lblNewLabel_15);

		JTextField txtLosOlivares = new JTextField();
		txtLosOlivares.setText("Los olivos");
		txtLosOlivares.setBackground(new Color(237, 237, 237));
		txtLosOlivares.setFont(new Font("Inter", Font.PLAIN, 14));
		txtLosOlivares.setBounds(79, 150, 208, 26);
		panel_4.add(txtLosOlivares);
		txtLosOlivares.setColumns(10);

		JLabel lblNewLabel_16 = new JLabel("Ciudad");
		lblNewLabel_16.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_16.setBounds(10, 219, 69, 26);
		panel_4.add(lblNewLabel_16);

		JTextField txtLaPaz = new JTextField();
		txtLaPaz.setBackground(new Color(237, 237, 237));
		txtLaPaz.setFont(new Font("Inter", Font.PLAIN, 14));
		txtLaPaz.setText("La paz");
		txtLaPaz.setBounds(67, 219, 62, 26);
		panel_4.add(txtLaPaz);
		txtLaPaz.setColumns(10);

		JLabel lblNewLabel_17 = new JLabel("Estado");
		lblNewLabel_17.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_17.setBounds(154, 219, 52, 26);
		panel_4.add(lblNewLabel_17);

		JTextField textField_4 = new JTextField();
		textField_4.setFont(new Font("Inter", Font.PLAIN, 14));
		textField_4.setBackground(new Color(237, 237, 237));
		textField_4.setBounds(205, 221, 62, 26);
		panel_4.add(textField_4);
		textField_4.setColumns(10);

		RoundedPanel panel_5 = new RoundedPanel(10);
		panel_5.setForeground(new Color(0, 0, 0));
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(466, 353, 297, 117);
		panel_5.setBorder(BorderFactory.createLineBorder(Color.GRAY, 0));// crea la line del borde
		panel_1.add(panel_5);
		panel_5.setLayout(null);

		JLabel lblNewLabel_18 = new JLabel("Datos de contacto");
		lblNewLabel_18.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_18.setBounds(92, 0, 149, 13);
		panel_5.add(lblNewLabel_18);

		JLabel lblNewLabel_19 = new JLabel("Correo");
		lblNewLabel_19.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_19.setBounds(10, 32, 61, 13);
		panel_5.add(lblNewLabel_19);

		JTextField txtErickuabcsmx = new JTextField();
		txtErickuabcsmx.setBackground(new Color(237, 237, 237));
		txtErickuabcsmx.setFont(new Font("Inter", Font.PLAIN, 14));
		txtErickuabcsmx.setText("erick@uabcs.mx");
		txtErickuabcsmx.setBounds(77, 30, 191, 19);
		panel_5.add(txtErickuabcsmx);
		txtErickuabcsmx.setColumns(10);

		JLabel lblNewLabel_20 = new JLabel("Teléfono");
		lblNewLabel_20.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_20.setBounds(10, 77, 73, 13);
		panel_5.add(lblNewLabel_20);

		JTextField textField_7 = new JTextField();
		textField_7.setBackground(new Color(237, 237, 237));
		textField_7.setText("6121659613");
		textField_7.setFont(new Font("Inter", Font.PLAIN, 14));
		textField_7.setBounds(77, 75, 191, 19);
		panel_5.add(textField_7);
		textField_7.setColumns(10);
		JButton btnNewButton_6 = new JButton("CANCELAR");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6.setFont(new Font("Inter", Font.BOLD, 9));
		btnNewButton_6.setBounds(303, 486, 85, 60);
		btnNewButton_6.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_6.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_6.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_6.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_6.setIconTextGap(1);
		ImageIcon a = new ImageIcon(getClass().getResource("/img/cancelar.png"));
        Image imagen = a.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        btnNewButton_6.setIcon(new ImageIcon(imagen));
		btnNewButton_6.setFocusPainted(false);
		btnNewButton_6.setContentAreaFilled(true);
		panel_1.add(btnNewButton_6);

		// boton aceptar
		JButton btnNewButton_7 = new JButton("ACEPTAR");
		btnNewButton_7.setFont(new Font("Inter", Font.BOLD, 9));
		btnNewButton_7.setBounds(419, 486, 85, 60);
		btnNewButton_7.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_7.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_7.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_7.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_7.setIconTextGap(1);
		ImageIcon b = new ImageIcon(getClass().getResource("/img/aceptar.png"));
        Image imagen2 = b.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        btnNewButton_7.setIcon(new ImageIcon(imagen2));
		btnNewButton_7.setFocusPainted(false);
		btnNewButton_7.setContentAreaFilled(true);
		panel_1.add(btnNewButton_7);

		JButton btnNewButton_5 = new JButton("Buscar cliente");
		btnNewButton_5.setBounds(56, 300, 178, 49);
		btnNewButton_5.setBackground(new Color(217, 217, 217));
		btnNewButton_5.setFont(new Font("Inter", Font.BOLD, 12));
		btnNewButton_5.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_5.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton_5.setVerticalTextPosition(SwingConstants.CENTER);
		btnNewButton_5.setIconTextGap(10);
		ImageIcon c = new ImageIcon(getClass().getResource("/img/lupa.png"));
        Image imagen3 = c.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        btnNewButton_5.setIcon(new ImageIcon(imagen3));
		btnNewButton_5.setFocusPainted(false);
		btnNewButton_5.setContentAreaFilled(true);
		panel.add(btnNewButton_5);
		frame.setVisible(true);

	}

	public void EliminarCuenta() {
		try {
			UIManager.setLookAndFeel(new FlatLightLaf());
			UIManager.put("Buttom.arc", 700); // Esquinas redondeadas
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(false);
		frame.setResizable(false);
		frame.setBounds(100, 100, 1150, 799);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		// boton de comedor
		JButton btnNewButton = new JButton("Comedor");
		btnNewButton.setBounds(0, 0, 234, 49);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(50, 98, 115));
		btnNewButton.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController hm = new HomeController();
				hm.abrirCuenta2();
			}
		});
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Ensamble");
		btnNewButton_1.setBounds(226, 0, 227, 49);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(50, 98, 115));
		btnNewButton_1.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_1);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN CLIENTES
		JPanel panelContenido1 = new JPanel();
		panelContenido1.setBounds(230, 49, 225, 65);
		panelContenido1.setLayout(new BorderLayout());
		panelContenido1.setVisible(false);
		panelContenido1.setOpaque(false);
		panel.add(panelContenido1);

		btnNewButton_1.addActionListener(e -> {
			if (panelContenido1.isVisible()) {
				panelContenido1.setVisible(false);
				panelContenido1.removeAll();
			} else {
				panelContenido1.removeAll();
				panelContenido1.add(new EnsambledeplatilloyConsultarMenu(frame), BorderLayout.CENTER);
				panelContenido1.setVisible(true);
			}
			panelContenido1.revalidate();
			panelContenido1.repaint();
		});

		JButton btnNewButton_2 = new JButton("Inventario");
		btnNewButton_2.setBounds(452, 0, 227, 49);
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(50, 98, 115));
		btnNewButton_2.setFont(new Font("Inter", Font.BOLD, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController cc = new HomeController();
				cc.Inventario();
			}
		});
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Clientes");
		btnNewButton_3.setBounds(677, 0, 234, 49);
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(50, 98, 115));
		btnNewButton_3.setFont(new Font("Inter", Font.BOLD, 15));
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
				panelContenido.add(new HistorialyConsulta(frame), BorderLayout.CENTER);
				panelContenido.setVisible(true);
			}
			panelContenido.revalidate();
			panelContenido.repaint();
		});

		JButton btnNewButton_4 = new JButton("Usuarios");
		btnNewButton_4.setBounds(909, 0, 227, 49);
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(50, 98, 115));
		btnNewButton_4.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_4);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN USUARIOS
		JPanel panelContenido2 = new JPanel();
		panelContenido2.setBounds(909, 49, 227, 49);
		panelContenido2.setLayout(new BorderLayout());
		panelContenido2.setVisible(false);
		panelContenido2.setOpaque(false);
		panel.add(panelContenido2);

		btnNewButton_4.addActionListener(e -> {
			if (panelContenido2.isVisible()) {
				panelContenido2.setVisible(false);
				panelContenido2.removeAll();
			} else {
				panelContenido2.removeAll();
				panelContenido2.add(new UsuarioCerrarSesion(frame), BorderLayout.CENTER);
				panelContenido2.setVisible(true);
			}
			panelContenido2.revalidate();
			panelContenido2.repaint();
		});

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(332, 94, 819, 658);
		panel.add(panel_1);
		panel_1.setLayout(null);

		Border cellBorder1 = BorderFactory.createLineBorder(Color.BLACK);

		JLabel lblNewLabel = new JLabel("MESA");
		lblNewLabel.setFont(new Font("Inter", Font.BOLD, 17));
		lblNewLabel.setBounds(41, 26, 84, 27);
		lblNewLabel.setBorder(cellBorder1);
		lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
		panel_1.add(lblNewLabel);

		JTextField textField = new JTextField();
		textField.setFont(new Font("Inter", Font.BOLD, 17));
		textField.setBounds(125, 26, 59, 27);
		textField.setHorizontalAlignment(JTextField.CENTER);
		textField.setColumns(10);
		textField.setBorder(cellBorder1);
		panel_1.add(textField);

		// Columnas y modelo de la tabla
		String[] columnas = { "Cantidad", "Código", "Descripción", "Precio" };
		DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
		JTable table = new JTable(modelo) {
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

		// Centrar contenido
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
		for (int i = 0; i < table.getColumnCount(); i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
		}

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

		// ScrollPane y ubicación
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(41, 82, 719, 420); // altura ajustada para dejar espacio al total
		panel_1.add(scrollPane);

		modelo.addRow(new Object[] { "1", "SKU09", "Hamburguesa clásica combo CH", "$150" });

		Border cellBorder = BorderFactory.createLineBorder(Color.BLACK);

		// para que aperzca el total y el precio en la parte de abajo
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBackground(new Color(190, 190, 190));
		lblTotal.setFont(new Font("Inter", Font.BOLD, 15));
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setOpaque(true);
		lblTotal.setBounds(41, 501, 521, 39);
		lblTotal.setBorder(cellBorder);
		panel_1.add(lblTotal);

		// Valor del total
		JLabel lblTotalValor = new JLabel("$150");
		lblTotalValor.setBackground(new Color(190, 190, 190));
		lblTotalValor.setFont(new Font("Inter", Font.BOLD, 15));
		lblTotalValor.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalValor.setBounds(560, 501, 200, 39);
		lblTotalValor.setOpaque(true);
		lblTotalValor.setBorder(cellBorder);
		panel_1.add(lblTotalValor);

		JButton btnNewButton_5 = new JButton("Eliminar cuenta");
		btnNewButton_5.setBackground(new Color(233, 75, 75));
		btnNewButton_5.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton_5.setBounds(55, 219, 201, 67);
		btnNewButton_5.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_5.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton_5.setVerticalTextPosition(SwingConstants.CENTER);
		btnNewButton_5.setIconTextGap(10);
		ImageIcon a = new ImageIcon(getClass().getResource("/img/cancelar2.png"));
        Image imagen = a.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        btnNewButton_5.setIcon(new ImageIcon(imagen));
		btnNewButton_5.setFocusPainted(false);
		btnNewButton_5.setContentAreaFilled(true);
		btnNewButton_5.setFocusPainted(false);
		btnNewButton_5.setContentAreaFilled(true);
		panel.add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton(
				"<html><div style='text-align:left;'>Ingresar nueva<br>orden</div></html>");
		btnNewButton_6.setBackground(new Color(101, 206, 189));
		btnNewButton_6.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton_6.setBounds(55, 329, 201, 67);
		btnNewButton_6.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_6.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton_6.setVerticalTextPosition(SwingConstants.CENTER);
		btnNewButton_6.setIconTextGap(10);
		ImageIcon b = new ImageIcon(getClass().getResource("/img/lupa.png"));
        Image imagen2 = b.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        btnNewButton_6.setIcon(new ImageIcon(imagen2));
		btnNewButton_6.setFocusPainted(false);
		btnNewButton_6.setContentAreaFilled(true);
		panel.add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("Imprimir cuenta");
		btnNewButton_7.setBackground(new Color(203, 145, 196));
		btnNewButton_7.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton_7.setBounds(55, 436, 201, 67);
		btnNewButton_7.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_7.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton_7.setVerticalTextPosition(SwingConstants.CENTER);
		btnNewButton_7.setIconTextGap(10);
		ImageIcon c = new ImageIcon(getClass().getResource("/img/impresora.png"));
        Image imagen3 = c.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        btnNewButton_7.setIcon(new ImageIcon(imagen3));	
		btnNewButton_7.setFocusPainted(false);
		btnNewButton_7.setContentAreaFilled(true);
		btnNewButton_7.setFocusPainted(false);
		btnNewButton_7.setContentAreaFilled(true);
		panel.add(btnNewButton_7);
		frame.setVisible(true);

	}

	public void Ensamble() {

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
		btnNewButton.setBounds(0, 0, 234, 49);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(50, 98, 115));
		btnNewButton.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController hm = new HomeController();
				hm.abrirCuenta2();
			}
		});
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Ensamble");
		btnNewButton_1.setBounds(226, 0, 227, 49);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(50, 98, 115));
		btnNewButton_1.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_1);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN CLIENTES
		JPanel panelContenido1 = new JPanel();
		panelContenido1.setBounds(230, 49, 225, 65);
		panelContenido1.setLayout(new BorderLayout());
		panelContenido1.setVisible(false);
		panelContenido1.setOpaque(false);
		panel.add(panelContenido1);

		btnNewButton_1.addActionListener(e -> {
			if (panelContenido1.isVisible()) {
				panelContenido1.setVisible(false);
				panelContenido1.removeAll();
			} else {
				panelContenido1.removeAll();
				panelContenido1.add(new EnsambledeplatilloyConsultarMenu(frame), BorderLayout.CENTER);
				panelContenido1.setVisible(true);
			}
			panelContenido1.revalidate();
			panelContenido1.repaint();
		});

		JButton btnNewButton_2 = new JButton("Inventario");
		btnNewButton_2.setBounds(452, 0, 227, 49);
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(50, 98, 115));
		btnNewButton_2.setFont(new Font("Inter", Font.BOLD, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController cc = new HomeController();
				cc.Inventario();
			}
		});
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Clientes");
		btnNewButton_3.setBounds(677, 0, 234, 49);
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(50, 98, 115));
		btnNewButton_3.setFont(new Font("Inter", Font.BOLD, 15));
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
				panelContenido.add(new HistorialyConsulta(frame), BorderLayout.CENTER);
				panelContenido.setVisible(true);
			}
			panelContenido.revalidate();
			panelContenido.repaint();
		});

		JButton btnNewButton_4 = new JButton("Usuarios");
		btnNewButton_4.setBounds(909, 0, 227, 49);
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(50, 98, 115));
		btnNewButton_4.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_4);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN USUARIOS
		JPanel panelContenido2 = new JPanel();
		panelContenido2.setBounds(909, 49, 227, 49);
		panelContenido2.setLayout(new BorderLayout());
		panelContenido2.setVisible(false);
		panelContenido2.setOpaque(false);
		panel.add(panelContenido2);

		btnNewButton_4.addActionListener(e -> {
			if (panelContenido2.isVisible()) {
				panelContenido2.setVisible(false);
				panelContenido2.removeAll();
			} else {
				panelContenido2.removeAll();
				panelContenido2.add(new UsuarioCerrarSesion(frame), BorderLayout.CENTER);
				panelContenido2.setVisible(true);
			}
			panelContenido2.revalidate();
			panelContenido2.repaint();
		});

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(259, 253, 240, 192);
		ImageIcon a = new ImageIcon(getClass().getResource("/img/cuenta.png"));
        Image imagen = a.getImage().getScaledInstance(234, 192, Image.SCALE_SMOOTH);
        lblNewLabel.setIcon(new ImageIcon(imagen));
		panel.add(lblNewLabel);

		JButton btnNewButton_5 = new JButton("Abrir cuenta");
		btnNewButton_5.setBackground(new Color(217, 217, 217));
		btnNewButton_5.setFont(new Font("Inter", Font.BOLD, 13));
		btnNewButton_5.setBounds(259, 447, 240, 49);
		panel.add(btnNewButton_5);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(660, 253, 234, 192);
		ImageIcon b = new ImageIcon(getClass().getResource("/img/consulcuent.png"));
        Image imagen2 = b.getImage().getScaledInstance(234, 192, Image.SCALE_SMOOTH);
        lblNewLabel_1.setIcon(new ImageIcon(imagen2));
		panel.add(lblNewLabel_1);

		JButton btnNewButton_6 = new JButton("Consultar cuenta");
		btnNewButton_6.setBackground(new Color(217, 217, 217));
		btnNewButton_6.setFont(new Font("Inter", Font.BOLD, 13));
		btnNewButton_6.setBounds(660, 447, 234, 49);
		panel.add(btnNewButton_6);
		frame.setVisible(true);

	}

	

	public void HistorialDeFacturacion() {
		try {
			UIManager.setLookAndFeel(new FlatLightLaf());
			UIManager.put("TextComponent.arc", 50);// textfield redondeadas
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
		// boton de comedor
		JButton btnNewButton = new JButton("Comedor");
		btnNewButton.setBounds(0, 0, 234, 49);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(50, 98, 115));
		btnNewButton.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController hm = new HomeController();
				hm.abrirCuenta2();
			}
		});
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Ensamble");
		btnNewButton_1.setBounds(226, 0, 227, 49);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(50, 98, 115));
		btnNewButton_1.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_1);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN CLIENTES
		JPanel panelContenido1 = new JPanel();
		panelContenido1.setBounds(230, 49, 225, 65);
		panelContenido1.setLayout(new BorderLayout());
		panelContenido1.setVisible(false);
		panelContenido1.setOpaque(false);
		panel.add(panelContenido1);

		btnNewButton_1.addActionListener(e -> {
			if (panelContenido1.isVisible()) {
				panelContenido1.setVisible(false);
				panelContenido1.removeAll();
			} else {
				panelContenido1.removeAll();
				panelContenido1.add(new EnsambledeplatilloyConsultarMenu(frame), BorderLayout.CENTER);
				panelContenido1.setVisible(true);
			}
			panelContenido1.revalidate();
			panelContenido1.repaint();
		});

		JButton btnNewButton_2 = new JButton("Inventario");
		btnNewButton_2.setBounds(452, 0, 227, 49);
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(50, 98, 115));
		btnNewButton_2.setFont(new Font("Inter", Font.BOLD, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController cc = new HomeController();
				cc.Inventario();
			}
		});
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Clientes");
		btnNewButton_3.setBounds(677, 0, 234, 49);
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(50, 98, 115));
		btnNewButton_3.setFont(new Font("Inter", Font.BOLD, 15));
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
				panelContenido.add(new HistorialyConsulta(frame), BorderLayout.CENTER);
				panelContenido.setVisible(true);
			}
			panelContenido.revalidate();
			panelContenido.repaint();
		});

		JButton btnNewButton_4 = new JButton("Usuarios");
		btnNewButton_4.setBounds(909, 0, 227, 49);
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(50, 98, 115));
		btnNewButton_4.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_4);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN USUARIOS
		JPanel panelContenido2 = new JPanel();
		panelContenido2.setBounds(909, 49, 227, 49);
		panelContenido2.setLayout(new BorderLayout());
		panelContenido2.setVisible(false);
		panelContenido2.setOpaque(false);
		panel.add(panelContenido2);

		btnNewButton_4.addActionListener(e -> {
			if (panelContenido2.isVisible()) {
				panelContenido2.setVisible(false);
				panelContenido2.removeAll();
			} else {
				panelContenido2.removeAll();
				panelContenido2.add(new UsuarioCerrarSesion(frame), BorderLayout.CENTER);
				panelContenido2.setVisible(true);
			}
			panelContenido2.revalidate();
			panelContenido2.repaint();
		});

		JLabel lblNewLabel = new JLabel("HISTORIAL DE FACTURACIÓN");
		lblNewLabel.setBounds(413, 82, 325, 25);
		lblNewLabel.setFont(new Font("Inter", Font.BOLD, 20));
		panel.add(lblNewLabel);

		// Boton añadir
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
		ImageIcon a = new ImageIcon(getClass().getResource("/img/añadir.png"));
        Image imagen = a.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        btnNewButton_5.setIcon(new ImageIcon(imagen));
		panel.add(btnNewButton_5);

		// Botton editar
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
		ImageIcon b = new ImageIcon(getClass().getResource("/img/lapiz.png"));
        Image imagen2 = b.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        btnNewButton_6.setIcon(new ImageIcon(imagen2));
		panel.add(btnNewButton_6);

		ImageIcon lupaIcon = new ImageIcon("/img/lupa.png");
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
		ImageIcon c = new ImageIcon(getClass().getResource("/img/borrar.png"));
        Image imagen3 = c.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        btnNewButton_7.setIcon(new ImageIcon(imagen3));
		panel.add(btnNewButton_7);

		String[] columnas = { "RFC", "NOMBRE", "IMPORTE" };
		String[][] datos = { { "LOPR8402", "Laura Fernanda Mendoza Ruiz", "$155" },
				{ "XACM7501", "Esteban Ríos Calderón", "$189" }, { "RODJ9011", "Camila Duarte Sánchez", "$200" },
				{ "TEAG8010", "Marcos Antonio Salgado Varela", "$550" },
				{ "FAGM8512", "Tomás Eduardo Aguirre Morales", "$978" },
				{ "VELD9203", "Valeria Ponce Rodríguez", "$1200" }, { "NOMI9302", "Rafael Ibáñez Castillo", "$1555" },
				{ "ZULM8701", "Diego Aranda Gutiérrez", "$1625" } };

		JTable table = new JTable(datos, columnas) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		table.setFont(new Font("Inter", Font.PLAIN, 14));
		table.setRowHeight(30);
		table.setShowGrid(true);
		table.setGridColor(Color.LIGHT_GRAY);
		table.getTableHeader().setReorderingAllowed(false);
		table.setSelectionBackground(new Color(200, 200, 255)); // Color suave para selección

		// Centramos todo el contenido
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
		for (int i = 0; i < table.getColumnCount(); i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
		}

		// Estilo personalizado para el encabezado
		JTableHeader header = table.getTableHeader();
		header.setPreferredSize(new Dimension(header.getWidth(), 35));
		header.setDefaultRenderer(new DefaultTableCellRenderer() {
			@Override
			public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
					boolean hasFocus, int row, int column) {
				JLabel label = new JLabel(value.toString(), JLabel.CENTER);
				label.setFont(new Font("Inter", Font.BOLD, 14));
				label.setBackground(new Color(230, 230, 230)); // Gris claro
				label.setOpaque(true);
				label.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY));
				return label;
			}
		});

		// Scroll pane
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(167, 224, 744, 270); // ajusta dimensiones según tu layout
		panel.add(scrollPane);
		frame.setVisible(true);

	}

	

	public void IngresarNuevaOrden() {
		try {
			UIManager.setLookAndFeel(new FlatLightLaf());
			UIManager.put("TextComponent.arc", 20);// textfield redondeadas
			UIManager.put("Buttom.arc", 550); // Esquinas redondeadas
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(false);
		frame.setResizable(false);
		frame.setBounds(100, 100, 1150, 799);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		// boton de comedor
		JButton btnNewButton = new JButton("Comedor");
		btnNewButton.setBounds(0, 0, 234, 49);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(50, 98, 115));
		btnNewButton.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController hm = new HomeController();
				hm.abrirCuenta2();
			}
		});
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Ensamble");
		btnNewButton_1.setBounds(226, 0, 227, 49);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(50, 98, 115));
		btnNewButton_1.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_1);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN CLIENTES
		JPanel panelContenido1 = new JPanel();
		panelContenido1.setBounds(230, 49, 225, 65);
		panelContenido1.setLayout(new BorderLayout());
		panelContenido1.setVisible(false);
		panelContenido1.setOpaque(false);
		panel.add(panelContenido1);

		btnNewButton_1.addActionListener(e -> {
			if (panelContenido1.isVisible()) {
				panelContenido1.setVisible(false);
				panelContenido1.removeAll();
			} else {
				panelContenido1.removeAll();
				panelContenido1.add(new EnsambledeplatilloyConsultarMenu(frame), BorderLayout.CENTER);
				panelContenido1.setVisible(true);
			}
			panelContenido1.revalidate();
			panelContenido1.repaint();
		});

		JButton btnNewButton_2 = new JButton("Inventario");
		btnNewButton_2.setBounds(452, 0, 227, 49);
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(50, 98, 115));
		btnNewButton_2.setFont(new Font("Inter", Font.BOLD, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController cc = new HomeController();
				cc.Inventario();
			}
		});
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Clientes");
		btnNewButton_3.setBounds(677, 0, 234, 49);
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(50, 98, 115));
		btnNewButton_3.setFont(new Font("Inter", Font.BOLD, 15));
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
				panelContenido.add(new HistorialyConsulta(frame), BorderLayout.CENTER);
				panelContenido.setVisible(true);
			}
			panelContenido.revalidate();
			panelContenido.repaint();
		});

		JButton btnNewButton_4 = new JButton("Usuarios");
		btnNewButton_4.setBounds(909, 0, 227, 49);
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(50, 98, 115));
		btnNewButton_4.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_4);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN USUARIOS
		JPanel panelContenido2 = new JPanel();
		panelContenido2.setBounds(909, 49, 227, 49);
		panelContenido2.setLayout(new BorderLayout());
		panelContenido2.setVisible(false);
		panelContenido2.setOpaque(false);
		panel.add(panelContenido2);

		btnNewButton_4.addActionListener(e -> {
			if (panelContenido2.isVisible()) {
				panelContenido2.setVisible(false);
				panelContenido2.removeAll();
			} else {
				panelContenido2.removeAll();
				panelContenido2.add(new UsuarioCerrarSesion(frame), BorderLayout.CENTER);
				panelContenido2.setVisible(true);
			}
			panelContenido2.revalidate();
			panelContenido2.repaint();
		});

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(332, 94, 819, 658);
		panel.add(panel_1);
		panel_1.setLayout(null);

		Border cellBorder1 = BorderFactory.createLineBorder(Color.BLACK);

		JLabel lblNewLabel = new JLabel("MESA");
		lblNewLabel.setFont(new Font("Inter", Font.BOLD, 17));
		lblNewLabel.setBounds(41, 26, 84, 27);
		lblNewLabel.setBorder(cellBorder1);
		lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
		panel_1.add(lblNewLabel);

		JTextField textField = new JTextField();
		textField.setFont(new Font("Inter", Font.BOLD, 17));
		textField.setBounds(125, 26, 59, 27);
		textField.setHorizontalAlignment(JTextField.CENTER);
		textField.setColumns(10);
		textField.setBorder(cellBorder1);
		panel_1.add(textField);

		// Columnas y modelo de la tabla
		String[] columnas = { "Cantidad", "Código", "Descripción", "Precio" };
		DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
		JTable table = new JTable(modelo) {
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

		// Centrar contenido
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
		for (int i = 0; i < table.getColumnCount(); i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
		}

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

		// ScrollPane y ubicación
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(41, 82, 719, 420); // altura ajustada para dejar espacio al total
		panel_1.add(scrollPane);

		modelo.addRow(new Object[] { "1", "SKU09", "Hamburguesa clásica combo CH", "$150" });
		modelo.addRow(new Object[] { "1", "SKU10", "Hamburguesa clásica combo MD", "$185" });

		Border cellBorder = BorderFactory.createLineBorder(Color.BLACK);

		// para que aperzca el total y el precio en la parte de abajo
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBackground(new Color(190, 190, 190));
		lblTotal.setFont(new Font("Inter", Font.BOLD, 15));
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setOpaque(true);
		lblTotal.setBounds(41, 501, 521, 39);
		lblTotal.setBorder(cellBorder);
		panel_1.add(lblTotal);

		// Valor del total
		JLabel lblTotalValor = new JLabel("$335");
		lblTotalValor.setBackground(new Color(190, 190, 190));
		lblTotalValor.setFont(new Font("Inter", Font.BOLD, 15));
		lblTotalValor.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalValor.setBounds(560, 501, 200, 39);
		lblTotalValor.setOpaque(true);
		lblTotalValor.setBorder(cellBorder);
		panel_1.add(lblTotalValor);

		JButton btnNewButton_5 = new JButton("Eliminar cuenta");
		btnNewButton_5.setBackground(new Color(233, 75, 75));
		btnNewButton_5.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton_5.setBounds(55, 219, 201, 67);
		btnNewButton_5.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_5.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton_5.setVerticalTextPosition(SwingConstants.CENTER);
		btnNewButton_5.setIconTextGap(10);
		ImageIcon a = new ImageIcon(getClass().getResource("/img/cancelar2.png"));
        Image imagen = a.getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH);
        btnNewButton_5.setIcon(new ImageIcon(imagen));
		btnNewButton_5.setFocusPainted(false);
		btnNewButton_5.setContentAreaFilled(true);
		btnNewButton_5.setFocusPainted(false);
		btnNewButton_5.setContentAreaFilled(true);
		panel.add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton(
				"<html><div style='text-align:left;'>Ingresar nueva<br>orden</div></html>");
		btnNewButton_6.setBackground(new Color(101, 206, 189));
		btnNewButton_6.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton_6.setBounds(55, 329, 201, 67);
		btnNewButton_6.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_6.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton_6.setVerticalTextPosition(SwingConstants.CENTER);
		btnNewButton_6.setIconTextGap(10);
		ImageIcon b = new ImageIcon(getClass().getResource("/img/lupa.png"));
        Image imagen2 = b.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        btnNewButton_6.setIcon(new ImageIcon(imagen2));
		btnNewButton_6.setFocusPainted(false);
		btnNewButton_6.setContentAreaFilled(true);
		panel.add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("Imprimir cuenta");
		btnNewButton_7.setBackground(new Color(203, 145, 196));
		btnNewButton_7.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton_7.setBounds(55, 436, 201, 67);
		btnNewButton_7.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_7.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton_7.setVerticalTextPosition(SwingConstants.CENTER);
		btnNewButton_7.setIconTextGap(10);
		ImageIcon c = new ImageIcon(getClass().getResource("/img/impresora.png"));
        Image imagen3 = c.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        btnNewButton_7.setIcon(new ImageIcon(imagen3));
		btnNewButton_7.setFocusPainted(false);
		btnNewButton_7.setContentAreaFilled(true);
		btnNewButton_7.setFocusPainted(false);
		btnNewButton_7.setContentAreaFilled(true);
		panel.add(btnNewButton_7);
		frame.setVisible(true);

	}

	public void Inventario() {
		try {
			UIManager.setLookAndFeel(new FlatLightLaf());
			UIManager.put("TextComponent.arc", 50);// textfield redondeadas
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
		// boton de comedor
		JButton btnNewButton = new JButton("Comedor");
		btnNewButton.setBounds(0, 0, 234, 49);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(50, 98, 115));
		btnNewButton.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController hm = new HomeController();
				hm.abrirCuenta2();
			}
		});
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Ensamble");
		btnNewButton_1.setBounds(226, 0, 227, 49);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(50, 98, 115));
		btnNewButton_1.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_1);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN CLIENTES
		JPanel panelContenido1 = new JPanel();
		panelContenido1.setBounds(230, 49, 225, 65);
		panelContenido1.setLayout(new BorderLayout());
		panelContenido1.setVisible(false);
		panelContenido1.setOpaque(false);
		panel.add(panelContenido1);

		btnNewButton_1.addActionListener(e -> {
			if (panelContenido1.isVisible()) {
				panelContenido1.setVisible(false);
				panelContenido1.removeAll();
			} else {
				panelContenido1.removeAll();
				panelContenido1.add(new EnsambledeplatilloyConsultarMenu(frame), BorderLayout.CENTER);
				panelContenido1.setVisible(true);
			}
			panelContenido1.revalidate();
			panelContenido1.repaint();
		});

		JButton btnNewButton_2 = new JButton("Inventario");
		btnNewButton_2.setBounds(452, 0, 227, 49);
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(50, 98, 115));
		btnNewButton_2.setFont(new Font("Inter", Font.BOLD, 14));
		
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Clientes");
		btnNewButton_3.setBounds(677, 0, 234, 49);
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(50, 98, 115));
		btnNewButton_3.setFont(new Font("Inter", Font.BOLD, 15));
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
				panelContenido.add(new HistorialyConsulta(frame), BorderLayout.CENTER);
				panelContenido.setVisible(true);
			}
			panelContenido.revalidate();
			panelContenido.repaint();
		});

		JButton btnNewButton_4 = new JButton("Usuarios");
		btnNewButton_4.setBounds(909, 0, 227, 49);
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(50, 98, 115));
		btnNewButton_4.setFont(new Font("Inter", Font.BOLD, 15));
		panel.add(btnNewButton_4);
		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN USUARIOS
		JPanel panelContenido2 = new JPanel();
		panelContenido2.setBounds(909, 49, 227, 49);
		panelContenido2.setLayout(new BorderLayout());
		panelContenido2.setVisible(false);
		panelContenido2.setOpaque(false);
		panel.add(panelContenido2);

		btnNewButton_4.addActionListener(e -> {
			if (panelContenido2.isVisible()) {
				panelContenido2.setVisible(false);
				panelContenido2.removeAll();
			} else {
				panelContenido2.removeAll();
				panelContenido2.add(new UsuarioCerrarSesion(frame), BorderLayout.CENTER);
				panelContenido2.setVisible(true);
			}
			panelContenido2.revalidate();
			panelContenido2.repaint();
		});

		JLabel lblNewLabel = new JLabel("ALMACEN");
		lblNewLabel.setBounds(517, 82, 256, 25);
		lblNewLabel.setFont(new Font("Inter", Font.BOLD, 20));
		panel.add(lblNewLabel);

		// Boton añadir
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
		ImageIcon a = new ImageIcon(getClass().getResource("/img/añadir.png"));
        Image imagen = a.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        btnNewButton_5.setIcon(new ImageIcon(imagen));
		panel.add(btnNewButton_5);

		// Botton editar
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
		ImageIcon b = new ImageIcon(getClass().getResource("/img/lapiz.png"));
        Image imagen2 = b.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        btnNewButton_6.setIcon(new ImageIcon(imagen2));
		panel.add(btnNewButton_6);

		ImageIcon lupaIcon = new ImageIcon("/img/lupa.png");
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
		ImageIcon c = new ImageIcon(getClass().getResource("/img/borrar.png"));
        Image imagen3 = c.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        btnNewButton_7.setIcon(new ImageIcon(imagen3));
		panel.add(btnNewButton_7);

		// crea la barra
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(140, 296, 795, 260);
		panel.add(scrollPane);

		String[] columnas = { "Código", "Descripción", "Existencia", "U.M.", "Costo" };
		String[][] datos = { { "ING001", "Carne molida de res", "43", "KG", "$105" },
				{ "ING002", "Pan para hamburguesa", "20", "paq c/8", "$75" },
				{ "ING003", "Lechuga", "90", "Pieza", "$25" }, { "ING004", "Tomate", "25", "Kg", "$35" },
				{ "ING005", "Cebolla", "25", "Kg", "$60" }, { "ING006", "Pepinillos", "15", "Kg", "$45" },
				{ "ING007", "Papa blanca", "50", "Kg", "$45" },
				{ "ING008", "Refresco Coca Cola Regular", "200", "L", "$19" } };
		JTable table = new JTable(datos, columnas) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		table.setFont(new Font("Inter", Font.PLAIN, 14)); // son para la fuente , mostrar las lineas , color y al
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
		// scroll la barra
		scrollPane.setViewportView(table);
		frame.setVisible(true);

	}

	public void menu() {
		try {
			UIManager.setLookAndFeel(new FlatLightLaf());
			UIManager.put("TextComponent.arc", 20);// textfield redondeado
			UIManager.put("Buttom.arc", 200); // Esquinas redondeadas
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

		// boton de comedor
				JButton btnNewButton = new JButton("Comedor");
				btnNewButton.setBounds(0, 0, 234, 49);
				btnNewButton.setForeground(new Color(255, 255, 255));
				btnNewButton.setBackground(new Color(50, 98, 115));
				btnNewButton.setFont(new Font("Inter", Font.BOLD, 15));
				btnNewButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						frame.dispose();
						HomeController hm = new HomeController();
						hm.abrirCuenta2();
					}
				});
				panel.add(btnNewButton);
				
				JButton btnNewButton_1 = new JButton("Ensamble");
				btnNewButton_1.setBounds(226, 0, 227, 49);
				btnNewButton_1.setForeground(new Color(255, 255, 255));
				btnNewButton_1.setBackground(new Color(50, 98, 115));
				btnNewButton_1.setFont(new Font("Inter", Font.BOLD, 15));
				panel.add(btnNewButton_1);
				// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN CLIENTES
						JPanel panelContenido1 = new JPanel();
						panelContenido1.setBounds(230, 49, 225, 65);
						panelContenido1.setLayout(new BorderLayout());
						panelContenido1.setVisible(false);
						panelContenido1.setOpaque(false);
						panel.add(panelContenido1);

						btnNewButton_1.addActionListener(e -> {
						    if (panelContenido1.isVisible()) {
						        panelContenido1.setVisible(false);
						        panelContenido1.removeAll();
						    } else {
						        panelContenido1.removeAll();
						        panelContenido1.add(new EnsambledeplatilloyConsultarMenu(frame), BorderLayout.CENTER);
						        panelContenido1.setVisible(true);
						    }
						    panelContenido1.revalidate();
						    panelContenido1.repaint();
						});

				
				JButton btnNewButton_2 = new JButton("Inventario");
				btnNewButton_2.setBounds(452, 0, 227, 49);
				btnNewButton_2.setForeground(new Color(255, 255, 255));
				btnNewButton_2.setBackground(new Color(50, 98, 115));
				btnNewButton_2.setFont(new Font("Inter", Font.BOLD, 14));
				btnNewButton_2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						frame.dispose();
						HomeController cc = new HomeController();
						cc.Inventario();
					}
				});
				panel.add(btnNewButton_2);
				
				JButton btnNewButton_3 = new JButton("Clientes");
				btnNewButton_3.setBounds(677, 0, 234, 49);
				btnNewButton_3.setForeground(new Color(255, 255, 255));
				btnNewButton_3.setBackground(new Color(50, 98, 115));
				btnNewButton_3.setFont(new Font("Inter", Font.BOLD, 15));
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
						        panelContenido.add(new HistorialyConsulta(frame), BorderLayout.CENTER);
						        panelContenido.setVisible(true);
						    }
						    panelContenido.revalidate();
						    panelContenido.repaint();
						});

				JButton btnNewButton_4 = new JButton("Usuarios");
				btnNewButton_4.setBounds(909, 0, 227, 49);
				btnNewButton_4.setForeground(new Color(255, 255, 255));
				btnNewButton_4.setBackground(new Color(50, 98, 115));
				btnNewButton_4.setFont(new Font("Inter", Font.BOLD, 15));
				panel.add(btnNewButton_4);
				// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN USUARIOS
						JPanel panelContenido2 = new JPanel();
						panelContenido2.setBounds(909, 49, 227, 49);
						panelContenido2.setLayout(new BorderLayout());
						panelContenido2.setVisible(false);
						panelContenido2.setOpaque(false);
						panel.add(panelContenido2);

						btnNewButton_4.addActionListener(e -> {
							if (panelContenido2.isVisible()) {
								panelContenido2.setVisible(false);
								panelContenido2.removeAll();
							} else {
								panelContenido2.removeAll();
								panelContenido2.add(new UsuarioCerrarSesion(frame), BorderLayout.CENTER);
								panelContenido2.setVisible(true);
							}
							panelContenido2.revalidate();
							panelContenido2.repaint();
						});

		JLabel lblNewLabel = new JLabel("MENÚ");
		lblNewLabel.setBounds(530, 82, 256, 25);
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
		ImageIcon a = new ImageIcon(getClass().getResource("/img/añadir.png"));
        Image imagen = a.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        btnNewButton_5.setIcon(new ImageIcon(imagen));
        
        btnNewButton_5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				HomeController cc = new HomeController();
				cc.Añadirplatillo();
			}
		});
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
		ImageIcon b = new ImageIcon(getClass().getResource("/img/lapiz.png"));
        Image imagen2 = b.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        btnNewButton_6.setIcon(new ImageIcon(imagen2));
		panel.add(btnNewButton_6);

		ImageIcon lupaIcon = new ImageIcon("/img/lupa.png");
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
		ImageIcon c = new ImageIcon(getClass().getResource("/img/borrar.png"));
        Image imagen3 = c.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        btnNewButton_7.setIcon(new ImageIcon(imagen3));
		panel.add(btnNewButton_7);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(140, 296, 795, 260);
		panel.add(scrollPane);

		String[] columnas = { "ID paltillo", "Descripción", "Precio" };
		String[][] datos = { { "SKU08726", "Boneless sencillas", "$90" }, { "SKU08243", "Boneless combo ", "$130" },
				{ "SKU08108", "Papas fritas sencillas", "$50" }, { "SKU00782", "Papas fritas especiales", "$110" },
				{ "SKU00345", "Hamburguesa clásica", "$100" }, { "SKU02023", "Hamburguesa boneless", "$110" },
				{ "SKU03108", "Hamburguesa clásica combo", "$150" },
				{ "C7653902", "Hamburguesa boneless combo", "$170" } };

		JTable table = new JTable(datos, columnas) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		table.setFont(new Font("Inter", Font.PLAIN, 14)); // son para la fuente , mostrar las lineas , color y al
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
		// scroll la barra
		scrollPane.setViewportView(table);
		frame.setVisible(true);

	}

	class RoundedPanel extends JPanel {
		private int cornerRadius;

		public RoundedPanel(int radius) {
			this.cornerRadius = radius;
			setOpaque(false);
		}

		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Dimension arcs = new Dimension(cornerRadius, cornerRadius);
			int width = getWidth();
			int height = getHeight();
			Graphics2D graphics = (Graphics2D) g;
			graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

			// Color de fondo
			graphics.setColor(getBackground());
			graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);

			// Borde
			graphics.setColor(getForeground());
			graphics.drawRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);
		}
	}

	public void SeleccionDeBebida() {

		JFrame frame = new JFrame();
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
		ImageIcon a = new ImageIcon(getClass().getResource("/img/CocaColaLogo.png"));
        Image imagen = a.getImage().getScaledInstance(68, 59, Image.SCALE_SMOOTH);
        btnNewButton.setIcon(new ImageIcon(imagen));
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(235, 117, 68, 59);
		ImageIcon b = new ImageIcon(getClass().getResource("/img/SpriteLogo.png"));
        Image imagen2 = b.getImage().getScaledInstance(68, 59, Image.SCALE_SMOOTH);
        btnNewButton_1.setIcon(new ImageIcon(imagen2));
		panel.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.setBounds(406, 117, 68, 59);
		ImageIcon c = new ImageIcon(getClass().getResource("/img/MundetLogo.png"));
        Image imagen3 = c.getImage().getScaledInstance(68, 59, Image.SCALE_SMOOTH);
        btnNewButton_2.setIcon(new ImageIcon(imagen3));
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("CANCELAR");
		btnNewButton_3.setBackground(new Color(255, 255, 255));
		btnNewButton_3.setFont(new Font("Inter", Font.BOLD, 10));
		btnNewButton_3.setVerticalTextPosition(SwingConstants.BOTTOM); // ESTE ES PARA PONER EL TEXTO EN LA PARTE DE
																		// ABAJO de la imagen
		btnNewButton_3.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_3.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_3.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_3.setIconTextGap(1);
		btnNewButton_3.setBounds(146, 224, 92, 49);
		ImageIcon d = new ImageIcon(getClass().getResource("/img/cancelar.png"));
        Image imagen4 = d.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        btnNewButton_3.setIcon(new ImageIcon(imagen4));
		panel.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("ACEPTAR");
		btnNewButton_4.setBackground(new Color(255, 255, 255));
		btnNewButton_4.setFont(new Font("Inter", Font.BOLD, 9));
		btnNewButton_4.setVerticalTextPosition(SwingConstants.BOTTOM); // ESTE ES PARA PONER EL TEXTO EN LA PARTE DE
																		// ABAJO de la imagen
		btnNewButton_4.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_4.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_4.setIconTextGap(1);
		btnNewButton_4.setBounds(295, 224, 92, 49);
		ImageIcon e = new ImageIcon(getClass().getResource("/img/aceptar.png"));
        Image imagen5 = e.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        btnNewButton_4.setIcon(new ImageIcon(imagen5));
		panel.add(btnNewButton_4);
		frame.setVisible(true);

	}

	public void SeleccionDeCantidad() {

		JFrame frame = new JFrame();
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
		// boton -
		JButton btnNewButton = new JButton("-");
		btnNewButton.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(67, 117, 68, 59);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setContentAreaFilled(true);
		panel.add(btnNewButton);
		// boton de la cantidad
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(235, 117, 68, 59);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setContentAreaFilled(true);
		panel.add(btnNewButton_1);
		// boton *+*
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
		// QUITA las lineas que salen al picarle al boton
		btnNewButton_3.setFocusPainted(false);
		btnNewButton_3.setContentAreaFilled(true);
		// TEXTO ABAJO DE LA IMAGEN
		btnNewButton_3.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_3.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_3.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_3.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_3.setIconTextGap(1);
		btnNewButton_3.setBounds(146, 224, 92, 49);
		// imagen
		ImageIcon a = new ImageIcon(getClass().getResource("/img/cancelar.png"));
        Image imagen = a.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        btnNewButton_3.setIcon(new ImageIcon(imagen));
		panel.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("ACEPTAR");
		btnNewButton_4.setBackground(new Color(255, 255, 255));
		btnNewButton_4.setFont(new Font("Inter", Font.BOLD, 9));
		// QUITA las lineas que salen al picarle al boton
		btnNewButton_4.setFocusPainted(false);
		btnNewButton_4.setContentAreaFilled(true);
		// TEXTO ABAJO DE LA IMAGEN
		btnNewButton_4.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_4.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_4.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_4.setIconTextGap(1);
		btnNewButton_4.setBounds(295, 224, 92, 49);
		// IMAGEN
		ImageIcon b = new ImageIcon(getClass().getResource("/img/aceptar.png"));
        Image imagen2 = b.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        btnNewButton_4.setIcon(new ImageIcon(imagen2));
		panel.add(btnNewButton_4);
		frame.setVisible(true);

	}

	public void Ticket() {

		JFrame frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 404, 630);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(150, 0, 71, 88);
		ImageIcon a = new ImageIcon(getClass().getResource("/img/logo2.png"));
        Image imagen = a.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        lblNewLabel.setIcon(new ImageIcon(imagen));
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("PUNTO Y COMIDA");
		lblNewLabel_1.setFont(new Font("Inter", Font.BOLD, 20));
		lblNewLabel_1.setBounds(105, 90, 212, 25);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("RFC: PCOM867609H7O");
		lblNewLabel_2.setFont(new Font("Inter", Font.PLAIN, 10));
		lblNewLabel_2.setBounds(20, 147, 146, 13);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Calle Oro 2648, Col. Diana Laura. C.P 21021.");
		lblNewLabel_3.setFont(new Font("Inter", Font.PLAIN, 10));
		lblNewLabel_3.setBounds(20, 170, 226, 13);
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("La Paz, Baja Califoria Sur.");
		lblNewLabel_4.setFont(new Font("Inter", Font.PLAIN, 10));
		lblNewLabel_4.setBounds(20, 197, 132, 13);
		panel.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("612-130-2456.");
		lblNewLabel_5.setFont(new Font("Inter", Font.PLAIN, 10));
		lblNewLabel_5.setBounds(20, 220, 85, 13);
		panel.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel(
				"--------------------------------------------------------------------------------");
		lblNewLabel_6.setBounds(27, 253, 353, 13);
		panel.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("Fecha: 09/05/2025 - 07:00 pm");
		lblNewLabel_7.setFont(new Font("Inter", Font.PLAIN, 10));
		lblNewLabel_7.setBounds(20, 296, 159, 13);
		panel.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("# ticket: 12935");
		lblNewLabel_8.setFont(new Font("Inter", Font.PLAIN, 10));
		lblNewLabel_8.setBounds(20, 319, 85, 13);
		panel.add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("Cant");
		lblNewLabel_9.setFont(new Font("Inter", Font.BOLD, 12));
		lblNewLabel_9.setBounds(27, 361, 45, 13);
		panel.add(lblNewLabel_9);

		JLabel lblNewLabel_10 = new JLabel("1");
		lblNewLabel_10.setFont(new Font("Inter", Font.PLAIN, 10));
		lblNewLabel_10.setBounds(20, 397, 45, 13);
		lblNewLabel_10.setHorizontalAlignment(JLabel.CENTER);
		panel.add(lblNewLabel_10);

		JLabel lblNewLabel_11 = new JLabel("Código");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_11.setBounds(82, 362, 45, 13);
		panel.add(lblNewLabel_11);

		JLabel lblNewLabel_12 = new JLabel("Descripción");
		lblNewLabel_12.setFont(new Font("Inter", Font.BOLD, 12));
		lblNewLabel_12.setBounds(150, 362, 85, 13);
		lblNewLabel_12.setHorizontalAlignment(JLabel.CENTER);
		panel.add(lblNewLabel_12);

		JLabel lblNewLabel_13 = new JLabel("1");
		lblNewLabel_13.setFont(new Font("Inter", Font.PLAIN, 10));
		lblNewLabel_13.setBounds(20, 420, 45, 13);
		lblNewLabel_13.setHorizontalAlignment(JLabel.CENTER);
		panel.add(lblNewLabel_13);

		JLabel lblNewLabel_14 = new JLabel("SKU09");
		lblNewLabel_14.setFont(new Font("Inter", Font.PLAIN, 10));
		lblNewLabel_14.setBounds(75, 397, 45, 13);
		lblNewLabel_14.setHorizontalAlignment(JLabel.CENTER);
		panel.add(lblNewLabel_14);

		JLabel lblNewLabel_15 = new JLabel("SKU10");
		lblNewLabel_15.setFont(new Font("Inter", Font.PLAIN, 10));
		lblNewLabel_15.setBounds(75, 420, 45, 13);
		lblNewLabel_15.setHorizontalAlignment(JLabel.CENTER);
		panel.add(lblNewLabel_15);

		JLabel lblNewLabel_16 = new JLabel("Hamburguesa clásica combo CH");
		lblNewLabel_16.setFont(new Font("Inter", Font.PLAIN, 10));
		lblNewLabel_16.setBounds(130, 397, 174, 13);
		panel.add(lblNewLabel_16);

		JLabel lblNewLabel_17 = new JLabel("Hamburguesa clásica combo MED");
		lblNewLabel_17.setFont(new Font("Inter", Font.PLAIN, 10));
		lblNewLabel_17.setBounds(130, 420, 187, 13);
		panel.add(lblNewLabel_17);

		JLabel lblNewLabel_18 = new JLabel("Precio");
		lblNewLabel_18.setFont(new Font("Inter", Font.BOLD, 12));
		lblNewLabel_18.setBounds(324, 362, 45, 13);
		panel.add(lblNewLabel_18);

		JLabel lblNewLabel_19 = new JLabel("$150");
		lblNewLabel_19.setFont(new Font("Inter", Font.PLAIN, 10));
		lblNewLabel_19.setBounds(324, 397, 45, 13);
		lblNewLabel_19.setHorizontalAlignment(JLabel.CENTER);
		panel.add(lblNewLabel_19);

		JLabel lblNewLabel_20 = new JLabel("$185");
		lblNewLabel_20.setFont(new Font("Inter", Font.PLAIN, 10));
		lblNewLabel_20.setBounds(324, 420, 45, 13);
		lblNewLabel_20.setHorizontalAlignment(JLabel.CENTER);
		panel.add(lblNewLabel_20);

		JLabel lblNewLabel_21 = new JLabel("Subtotal");
		lblNewLabel_21.setFont(new Font("Inter", Font.BOLD, 10));
		lblNewLabel_21.setBounds(259, 489, 45, 13);
		lblNewLabel_21.setHorizontalAlignment(JLabel.CENTER);
		panel.add(lblNewLabel_21);

		JLabel lblNewLabel_22 = new JLabel("$335");
		lblNewLabel_22.setFont(new Font("Inter", Font.PLAIN, 10));
		lblNewLabel_22.setBounds(335, 489, 45, 13);
		lblNewLabel_22.setHorizontalAlignment(JLabel.CENTER);
		panel.add(lblNewLabel_22);

		JLabel lblNewLabel_23 = new JLabel("IVA");
		lblNewLabel_23.setFont(new Font("Inter", Font.BOLD, 10));
		lblNewLabel_23.setBounds(259, 512, 45, 13);
		lblNewLabel_23.setHorizontalAlignment(JLabel.CENTER);
		panel.add(lblNewLabel_23);

		JLabel lblNewLabel_24 = new JLabel("Total");
		lblNewLabel_24.setFont(new Font("Inter", Font.BOLD, 10));
		lblNewLabel_24.setBounds(259, 535, 45, 13);
		lblNewLabel_24.setHorizontalAlignment(JLabel.CENTER);
		panel.add(lblNewLabel_24);

		JLabel lblNewLabel_25 = new JLabel("$26");
		lblNewLabel_25.setFont(new Font("Inter", Font.PLAIN, 10));
		lblNewLabel_25.setBounds(335, 512, 45, 13);
		lblNewLabel_25.setHorizontalAlignment(JLabel.CENTER);
		panel.add(lblNewLabel_25);

		JLabel lblNewLabel_26 = new JLabel("$26");
		lblNewLabel_26.setFont(new Font("Inter", Font.PLAIN, 10));
		lblNewLabel_26.setBounds(335, 535, 45, 13);
		lblNewLabel_26.setHorizontalAlignment(JLabel.CENTER);
		panel.add(lblNewLabel_26);
		frame.setVisible(true);

	}

	public void AlertaAutorizacion() {

		JFrame frame = new JFrame();
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

		JLabel lblNewLabel = new JLabel("Autorización para modificar almacén");
		lblNewLabel.setFont(new Font("Inter", Font.BOLD, 16));
		lblNewLabel.setBounds(130, 30, 346, 30);
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
		ImageIcon a = new ImageIcon(getClass().getResource("/img/cancelar.png"));
        Image imagen = a.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        btnNewButton.setIcon(new ImageIcon(imagen));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setContentAreaFilled(true);
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
		ImageIcon b = new ImageIcon(getClass().getResource("/img/aceptar.png"));
        Image imagen2 = b.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        btnNewButton_1.setIcon(new ImageIcon(imagen2));
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setContentAreaFilled(true);
		panel.add(btnNewButton_1);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(162, 106, 44, 25);
		ImageIcon c = new ImageIcon(getClass().getResource("/img/admin4.png"));
        Image imagen3 = c.getImage().getScaledInstance(44, 25, Image.SCALE_SMOOTH);
        lblNewLabel_2.setIcon(new ImageIcon(imagen3));
		panel.add(lblNewLabel_2);

		JTextField textField = new JTextField("Administrador");
		textField.setFont(new Font("Inter", Font.BOLD, 12));
		textField.setBackground(new Color(242, 255, 168));
		textField.setBounds(153, 106, 243, 25);
		panel.add(textField);
		textField.setEditable(false);
		textField.setHorizontalAlignment(JTextField.CENTER);
		textField.setColumns(10);
		textField.setBorder(BorderFactory.createEmptyBorder());
		textField.setOpaque(true);
		textField.setFocusable(false);

		JLabel lblNewLabel_1 = new JLabel(""); // imagen del candado
		lblNewLabel_1.setBounds(161, 165, 45, 30);
		ImageIcon d = new ImageIcon(getClass().getResource("/img/candado_1.png"));
        Image imagen4 = d.getImage().getScaledInstance(44, 30, Image.SCALE_SMOOTH);
        lblNewLabel_1.setIcon(new ImageIcon(imagen4));
		panel.add(lblNewLabel_1);

		JTextField textField_1 = new JTextField();
		textField_1.setFont(new Font("Inter", Font.PLAIN, 12));
		textField_1.setBackground(new Color(242, 255, 168));
		textField_1.setBounds(153, 165, 243, 30);
		textField_1.setColumns(10);
		textField_1.setHorizontalAlignment(JTextField.CENTER);
		panel.add(textField_1);
		frame.setVisible(true);

	}

	public void AlertaAutorizacionEliminarCuenta() {

		JFrame frame = new JFrame();
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

		JLabel lblNewLabel = new JLabel("Autorización para eliminar cuenta");
		lblNewLabel.setFont(new Font("Inter", Font.BOLD, 16));
		lblNewLabel.setBounds(130, 30, 346, 30);
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
		ImageIcon a = new ImageIcon(getClass().getResource("/img/cancelar.png"));
        Image imagen = a.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        btnNewButton.setIcon(new ImageIcon(imagen));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setContentAreaFilled(true);
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
		ImageIcon b = new ImageIcon(getClass().getResource("/img/aceptar.png"));
        Image imagen2 = b.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        btnNewButton_1.setIcon(new ImageIcon(imagen2));
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setContentAreaFilled(true);
		panel.add(btnNewButton_1);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(162, 106, 44, 25);
		ImageIcon c = new ImageIcon(getClass().getResource("/img/admin4.png"));
        Image imagen3 = c.getImage().getScaledInstance(44, 25, Image.SCALE_SMOOTH);
        lblNewLabel_2.setIcon(new ImageIcon(imagen3));
		panel.add(lblNewLabel_2);

		JTextField textField = new JTextField("Administrador");
		textField.setFont(new Font("Inter", Font.BOLD, 12));
		textField.setBackground(new Color(242, 255, 168));
		textField.setBounds(153, 106, 243, 25);
		panel.add(textField);
		textField.setEditable(false);
		textField.setHorizontalAlignment(JTextField.CENTER);
		textField.setColumns(10);
		textField.setBorder(BorderFactory.createEmptyBorder());
		textField.setOpaque(true);
		textField.setFocusable(false);

		JLabel lblNewLabel_1 = new JLabel(""); // imagen del candado
		lblNewLabel_1.setBounds(161, 165, 45, 30);
		ImageIcon d = new ImageIcon(getClass().getResource("/img/candado_1.png"));
        Image imagen4 = d.getImage().getScaledInstance(44, 30, Image.SCALE_SMOOTH);
        lblNewLabel_1.setIcon(new ImageIcon(imagen4));
		panel.add(lblNewLabel_1);

		JTextField textField_1 = new JTextField();
		textField_1.setFont(new Font("Inter", Font.PLAIN, 12));
		textField_1.setBackground(new Color(242, 255, 168));
		textField_1.setBounds(153, 165, 243, 30);
		textField_1.setColumns(10);
		textField_1.setHorizontalAlignment(JTextField.CENTER);
		panel.add(textField_1);
		frame.setVisible(true);

	}

	public void AlertaCambiosGuardados() {

		JFrame frame = new JFrame();
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
		ImageIcon a = new ImageIcon(getClass().getResource("/img/guardado.png"));
        Image imagen = a.getImage().getScaledInstance(103, 72, Image.SCALE_SMOOTH);
        lblNewLabel.setIcon(new ImageIcon(imagen));
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Cambios guardados con éxito");
		lblNewLabel_1.setFont(new Font("Inter", Font.BOLD, 13));
		lblNewLabel_1.setBounds(170, 158, 201, 23);
		panel.add(lblNewLabel_1);
		frame.setVisible(true);

	}

	public void AlertaCuentaEliminada() {

		JFrame frame = new JFrame();
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

		JLabel lblNewLabel = new JLabel("¡Cuenta eliminada!");
		lblNewLabel.setFont(new Font("Inter", Font.BOLD, 18));
		lblNewLabel.setBounds(181, 28, 197, 30);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(222, 68, 128, 97);
		ImageIcon a = new ImageIcon(getClass().getResource("/img/borrar2.png"));
        Image imagen = a.getImage().getScaledInstance(80, 120, Image.SCALE_SMOOTH);
        lblNewLabel_1.setIcon(new ImageIcon(imagen));
		panel.add(lblNewLabel_1);
		frame.setVisible(true);

	}

	public void AlertaMenuAdmin() {

		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		frame.setResizable(false);
		frame.setBounds(198, 76, 526, 320);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 526, 291);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JButton btnNewButton = new JButton("CANCELAR");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Inter", Font.BOLD, 9));
		btnNewButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton.setIconTextGap(1);
		btnNewButton.setBounds(153, 224, 92, 49);
		ImageIcon a = new ImageIcon(getClass().getResource("/img/cancelar.png"));
        Image imagen = a.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        btnNewButton.setIcon(new ImageIcon(imagen));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setContentAreaFilled(true);
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
		ImageIcon b = new ImageIcon(getClass().getResource("/img/aceptar.png"));
        Image imagen2 = b.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        btnNewButton_1.setIcon(new ImageIcon(imagen2));
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setContentAreaFilled(true);
		panel.add(btnNewButton_1);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(162, 106, 44, 25);
		ImageIcon c = new ImageIcon(getClass().getResource("/img/admin4.png"));
        Image imagen3 = c.getImage().getScaledInstance(44, 25, Image.SCALE_SMOOTH);
        lblNewLabel_2.setIcon(new ImageIcon(imagen3));
		panel.add(lblNewLabel_2);

		JTextField textField = new JTextField("Administrador");
		textField.setFont(new Font("Inter", Font.BOLD, 12));
		textField.setBackground(new Color(242, 255, 168));
		textField.setBounds(153, 106, 243, 25);
		panel.add(textField);
		textField.setEditable(false);
		textField.setHorizontalAlignment(JTextField.CENTER);
		textField.setColumns(10);
		textField.setBorder(BorderFactory.createEmptyBorder());
		textField.setOpaque(true);
		textField.setFocusable(false);

		JLabel lblNewLabel_1 = new JLabel(""); // imagen del candado
		lblNewLabel_1.setBounds(161, 165, 45, 30);
		ImageIcon d = new ImageIcon(getClass().getResource("/img/candado_1.png"));
        Image imagen4 = d.getImage().getScaledInstance(44, 30, Image.SCALE_SMOOTH);
        lblNewLabel_1.setIcon(new ImageIcon(imagen4));
		panel.add(lblNewLabel_1);

		JTextField textField_1 = new JTextField();
		textField_1.setFont(new Font("Inter", Font.PLAIN, 12));
		textField_1.setBackground(new Color(242, 255, 168));
		textField_1.setBounds(153, 165, 243, 30);
		textField_1.setColumns(10);
		textField_1.setHorizontalAlignment(JTextField.CENTER);
		panel.add(textField_1);
		frame.setVisible(true);

	}

	public void AlertaSeAgotaronExistencias() {

		JFrame frame = new JFrame();
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
		ImageIcon a = new ImageIcon(getClass().getResource("/img/alerta.png"));
        Image imagen = a.getImage().getScaledInstance(103, 72, Image.SCALE_SMOOTH);
        lblNewLabel.setIcon(new ImageIcon(imagen));
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
		ImageIcon b = new ImageIcon(getClass().getResource("/img/cancelar.png"));
        Image imagen2 = b.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        btnNewButton.setIcon(new ImageIcon(imagen2));
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
		ImageIcon c = new ImageIcon(getClass().getResource("/img/aceptar.png"));
        Image imagen3 = c.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        btnNewButton_1.setIcon(new ImageIcon(imagen3));
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
		frame.setVisible(true);

	}

	public void AvisoDeFaltadeExistencia() {

		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		frame.setResizable(false);
		frame.setBounds(198, 76, 526, 320);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 526, 291);
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
		ImageIcon a = new ImageIcon(getClass().getResource("/img/cancelar.png"));
        Image imagen = a.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        btnNewButton.setIcon(new ImageIcon(imagen));
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
		ImageIcon b = new ImageIcon(getClass().getResource("/img/aceptar.png"));
        Image imagen2 = b.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        btnNewButton_1.setIcon(new ImageIcon(imagen2));
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
		ImageIcon c = new ImageIcon(getClass().getResource("/img/alerta.png"));
        Image imagen3 = c.getImage().getScaledInstance(75, 70, Image.SCALE_SMOOTH);
        lblNewLabel_1.setIcon(new ImageIcon(imagen3));
		panel.add(lblNewLabel_1);
		frame.setVisible(true);

	}
}
