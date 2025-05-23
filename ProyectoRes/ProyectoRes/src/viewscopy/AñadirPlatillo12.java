package viewscopy;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.Border;

import com.formdev.flatlaf.FlatLightLaf;

import vistas.UsuarioCerrarSesion;

public class AñadirPlatillo12 {

	private JFrame frame;
	private JTextField txtBuscar;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AñadirPlatillo12 window = new AñadirPlatillo12();
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
	public AñadirPlatillo12() {
		try {
            UIManager.setLookAndFeel(new FlatLightLaf());  
            UIManager.put("TextComponent.arc", 10);//textfield redondeadas
            UIManager.put("Buttom.arc", 700); // Esquinas redondeadas
        } catch (Exception ex) {
            ex.printStackTrace();
        }
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
				panelContenido1.add(new EnsambledeplatilloyConsultarMenu(), BorderLayout.CENTER);
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
				panelContenido.add(new HistorialyConsulta(), BorderLayout.CENTER);
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
				panelContenido2.add(new UsuarioCerrarSesion(), BorderLayout.CENTER);
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
		
		JLabel lblNewLabel = new JLabel("Editar platillo - Boneless clásicas");
		lblNewLabel.setFont(new Font("Inter", Font.BOLD, 20));
		lblNewLabel.setBounds(240, 20, 593, 25);
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
        
		txtBuscar = new JTextField("Buscar");
		txtBuscar.setBackground(new Color(237, 237, 237));
		txtBuscar.setFont(new Font("Inter", Font.BOLD, 20));
		txtBuscar.setForeground(Color.GRAY);
		txtBuscar.setBounds(35, 47, 223, 40);
		panel_2.add(txtBuscar);
		txtBuscar.setColumns(10);

		// HACE QUE SE BORRE EL BUSCAR AL ESCRIBIR EN EL TEXTFIELD
		final String placeholder = "Buscar";
		txtBuscar.addFocusListener(new FocusAdapter() {
		   
		    public void focusGained(FocusEvent e) {
		        if (txtBuscar.getText().equals(placeholder)) {
		            txtBuscar.setText("");
		            txtBuscar.setForeground(Color.GRAY);
		        }
		    }
		    
		    public void focusLost(FocusEvent e) {
		        if (txtBuscar.getText().isEmpty()) {
		            txtBuscar.setText(placeholder);
		            txtBuscar.setForeground(Color.BLACK);
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
		
		JLabel lblNewLabel_5 = new JLabel("Harina de trigo");
		lblNewLabel_5.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(392, 57, 122, 25);
		panel_2.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBackground(new Color(237, 237, 237));
		textField.setToolTipText("");
		textField.setText("100");
		textField.setFont(new Font("Inter", Font.PLAIN, 13));
		textField.setBounds(498, 57, 63, 19);
		textField.setHorizontalAlignment(JTextField.CENTER);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Gramos");
		lblNewLabel_6.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(585, 63, 63, 13);
		panel_2.add(lblNewLabel_6);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setFont(new Font("Inter", Font.PLAIN, 10));
		btnNewButton_8.setBounds(658, 47, 28, 31);
		ImageIcon a = new ImageIcon(getClass().getResource("/img/borrar2.png"));
        Image imagen = a.getImage().getScaledInstance(28, 31, Image.SCALE_SMOOTH);
        btnNewButton_8.setIcon(new ImageIcon(imagen));
		btnNewButton_8.setBorderPainted(false);
		btnNewButton_8.setFocusPainted(false);
		btnNewButton_8.setContentAreaFilled(true);
		panel_2.add(btnNewButton_8);
		
		JLabel lblNewLabel_8 = new JLabel("Huevo");
		lblNewLabel_8.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_8.setBounds(402, 97, 83, 13);
		panel_2.add(lblNewLabel_8);
		
		textField_1 = new JTextField();
		textField_1.setText("1");
		textField_1.setBackground(new Color(237, 237, 237));
		textField_1.setFont(new Font("Inter", Font.PLAIN, 13));
		textField_1.setBounds(498, 94, 63, 19);
		textField_1.setHorizontalAlignment(JTextField.CENTER);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Pieza");
		lblNewLabel_9.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_9.setBounds(585, 97, 48, 13);
		panel_2.add(lblNewLabel_9);
		
		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_9.setBounds(658, 88, 28, 31);
		ImageIcon b = new ImageIcon(getClass().getResource("/img/borrar2.png"));
        Image imagen2 = b.getImage().getScaledInstance(28, 31, Image.SCALE_SMOOTH);
        btnNewButton_9.setIcon(new ImageIcon(imagen2));
		btnNewButton_9.setBorderPainted(false);
		btnNewButton_9.setFocusPainted(false);
		btnNewButton_9.setContentAreaFilled(true);
		panel_2.add(btnNewButton_9);
		
		JLabel lblNewLabel_11 = new JLabel("Paprika");
		lblNewLabel_11.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_11.setBounds(404, 134, 83, 13);
		panel_2.add(lblNewLabel_11);
		
		textField_2 = new JTextField();
		textField_2.setText("1");
		textField_2.setFont(new Font("Inter", Font.PLAIN, 13));
		textField_2.setBackground(new Color(237, 237, 237));
		textField_2.setBounds(498, 132, 63, 19);
		textField_2.setHorizontalAlignment(JTextField.CENTER);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Gramos");
		lblNewLabel_12.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_12.setBounds(588, 134, 55, 13);
		panel_2.add(lblNewLabel_12);
		
		JLabel lblNewLabel_15 = new JLabel("Salsa");
		lblNewLabel_15.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_15.setBounds(402, 167, 83, 13);
		panel_2.add(lblNewLabel_15);
		
		textField_3 = new JTextField();
		textField_3.setText("150");
		textField_3.setFont(new Font("Inter", Font.PLAIN, 13));
		textField_3.setBackground(new Color(237, 237, 237));
		textField_3.setBounds(498, 165, 63, 19);
		textField_3.setHorizontalAlignment(JTextField.CENTER);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("MI");
		lblNewLabel_16.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_16.setBounds(588, 167, 45, 13);
		panel_2.add(lblNewLabel_16);
		
		JLabel lblNewLabel_14 = new JLabel("Pechuga");
		lblNewLabel_14.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_14.setBounds(404, 202, 83, 13);
		panel_2.add(lblNewLabel_14);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Inter", Font.PLAIN, 13));
		textField_4.setText("400");
		textField_4.setBackground(new Color(237, 237, 237));
		textField_4.setBounds(498, 200, 63, 19);
		textField_4.setHorizontalAlignment(JTextField.CENTER);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_19 = new JLabel("Gramos");
		lblNewLabel_19.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_19.setBounds(585, 203, 63, 13);
		panel_2.add(lblNewLabel_19);
		
		JButton btnNewButton_10 = new JButton("");
		btnNewButton_10.setBounds(658, 116, 28, 31);
		ImageIcon f = new ImageIcon(getClass().getResource("/img/borrar2.png"));
        Image imagen6 = f.getImage().getScaledInstance(28, 31, Image.SCALE_SMOOTH);
        btnNewButton_10.setIcon(new ImageIcon(imagen6));
        btnNewButton_10.setBorderPainted(false);
		btnNewButton_10.setFocusPainted(false);
		btnNewButton_10.setContentAreaFilled(true);
		panel_2.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_11.setBounds(658, 157, 28, 31);
		ImageIcon e = new ImageIcon(getClass().getResource("/img/borrar2.png"));
        Image imagen5 = e.getImage().getScaledInstance(28, 31, Image.SCALE_SMOOTH);
        btnNewButton_11.setIcon(new ImageIcon(imagen5));
        btnNewButton_11.setBorderPainted(false);
		btnNewButton_11.setFocusPainted(false);
		btnNewButton_11.setContentAreaFilled(true);
		panel_2.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("");
		btnNewButton_12.setBounds(658, 184, 28, 31);
		ImageIcon g = new ImageIcon(getClass().getResource("/img/borrar2.png"));
        Image imagen7 = g.getImage().getScaledInstance(28, 31, Image.SCALE_SMOOTH);
        btnNewButton_12.setIcon(new ImageIcon(imagen7));
		btnNewButton_12.setBorderPainted(false);
		btnNewButton_12.setFocusPainted(false);
		btnNewButton_12.setContentAreaFilled(true);
		panel_2.add(btnNewButton_12);
		
		JLabel lblNewLabel_4 = new JLabel("Apio");
		lblNewLabel_4.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(402, 243, 83, 13);
		panel_2.add(lblNewLabel_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Inter", Font.PLAIN, 13));
		textField_5.setText(".05");
		textField_5.setBackground(new Color(237, 237, 237));
		textField_5.setBounds(498, 241, 63, 19);
		textField_5.setHorizontalAlignment(JTextField.CENTER);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Mazo");
		lblNewLabel_7.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_7.setBounds(588, 244, 60, 13);
		panel_2.add(lblNewLabel_7);
		
		JButton btnNewButton_13 = new JButton("");
		btnNewButton_13.setBounds(658, 235, 28, 31);		
		ImageIcon h = new ImageIcon(getClass().getResource("/img/borrar2.png"));
        Image imagen8 = h.getImage().getScaledInstance(28, 31, Image.SCALE_SMOOTH);
        btnNewButton_13.setIcon(new ImageIcon(imagen8));
		btnNewButton_13.setBorderPainted(false);
        btnNewButton_13.setFocusPainted(false);
		btnNewButton_13.setContentAreaFilled(true);
		panel_2.add(btnNewButton_13);
		
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
		ImageIcon c = new ImageIcon(getClass().getResource("/img/cancelar.png"));
        Image imagen3 = c.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        btnNewButton_6.setIcon(new ImageIcon(imagen3));
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
		ImageIcon d = new ImageIcon(getClass().getResource("/img/aceptar.png"));
        Image imagen4 = d.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        btnNewButton_7.setIcon(new ImageIcon(imagen4));
		btnNewButton_7.setFocusPainted(false);
		btnNewButton_7.setContentAreaFilled(true);
		panel_1.add(btnNewButton_7);
	}

}
