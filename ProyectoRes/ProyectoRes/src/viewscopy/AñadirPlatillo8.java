package viewscopy;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.Border;

import com.formdev.flatlaf.FlatLightLaf;

import vistas.UsuarioCerrarSesion;

public class AñadirPlatillo8 {

	private JFrame frame;
	private JTextField txtTocinoAhumado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AñadirPlatillo8 window = new AñadirPlatillo8();
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
	public AñadirPlatillo8() {
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
		
		JLabel lblNewLabel = new JLabel("Añadir platillo");
		lblNewLabel.setFont(new Font("Inter", Font.BOLD, 20));
		lblNewLabel.setBounds(334, 23, 198, 25);
		panel_1.add(lblNewLabel);
		

		RoundedPanel panel_2 = new RoundedPanel(20);
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(50, 73, 691, 318);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Código de platillo:");
		lblNewLabel_1.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(22, 31, 130, 22);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("SKU08991");
		lblNewLabel_2.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(151, 31, 100, 22);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("IVA 16%");
		lblNewLabel_3.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(392, 31, 53, 19);
		panel_2.add(lblNewLabel_3);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBackground(new Color(255, 255, 255));
		chckbxNewCheckBox.setBounds(451, 33, 21, 21);
		panel_2.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_4 = new JLabel("IEPS");
		lblNewLabel_4.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(488, 31, 53, 22);
		panel_2.add(lblNewLabel_4);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("");
		chckbxNewCheckBox_1.setBackground(new Color(255, 255, 255));
		chckbxNewCheckBox_1.setBounds(525, 33, 26, 21);
		panel_2.add(chckbxNewCheckBox_1);
		
		JLabel lblNewLabel_5 = new JLabel("Exenta IVA");
		lblNewLabel_5.setFont(new Font("Inter", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(557, 33, 65, 20);
		panel_2.add(lblNewLabel_5);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("");
		chckbxNewCheckBox_2.setBackground(new Color(255, 255, 255));
		chckbxNewCheckBox_2.setBounds(628, 33, 26, 21);
		panel_2.add(chckbxNewCheckBox_2);
		
		JLabel lblNewLabel_6 = new JLabel("Descripción:");
		lblNewLabel_6.setFont(new Font("Inter", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(22, 82, 117, 13);
		panel_2.add(lblNewLabel_6);
		
		txtTocinoAhumado = new JTextField();
		txtTocinoAhumado.setText("Hotdog sencillo");
		txtTocinoAhumado.setFont(new Font("Inter", Font.PLAIN, 13));
		txtTocinoAhumado.setBackground(new Color(237, 237, 237));
		txtTocinoAhumado.setBounds(124, 78, 207, 22);
		txtTocinoAhumado.setHorizontalAlignment(JTextField.CENTER);
		panel_2.add(txtTocinoAhumado);
		txtTocinoAhumado.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Ensamble:");
		lblNewLabel_7.setBackground(new Color(255, 255, 255));
		lblNewLabel_7.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_7.setBounds(557, 85, 97, 20);
		panel_2.add(lblNewLabel_7);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("");
		chckbxNewCheckBox_3.setBounds(628, 84, 26, 21);
		panel_2.add(chckbxNewCheckBox_3);
		
		JLabel lblNewLabel_8 = new JLabel("Costo:");
		lblNewLabel_8.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_8.setBounds(36, 140, 65, 28);
		panel_2.add(lblNewLabel_8);
		
		
	
		
		JLabel lblNewLabel_9 = new JLabel("<html><div style='text-align:center;'>Precio de venta:<br><br></div></html>");
		lblNewLabel_9.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_9.setBounds(235, 122, 53, 74);
		panel_2.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("25.02");
		lblNewLabel_10.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_10.setBounds(88, 143, 51, 22);
		panel_2.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("$35.00");
		lblNewLabel_11.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_11.setBounds(298, 139, 62, 31);
		panel_2.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("% Utilidad:");
		lblNewLabel_12.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_12.setBounds(422, 149, 83, 13);
		panel_2.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("28.5142");
		lblNewLabel_13.setFont(new Font("Inter", Font.PLAIN, 13));
		lblNewLabel_13.setBounds(501, 149, 83, 13);
		panel_2.add(lblNewLabel_13);
        

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
