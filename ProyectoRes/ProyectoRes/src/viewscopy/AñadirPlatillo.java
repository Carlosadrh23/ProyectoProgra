package viewscopy;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AñadirPlatillo {
  
	private JFrame frame;
	public JTextField TextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AñadirPlatillo window = new AñadirPlatillo();
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
	//por si da error el otro añadir platillo dentro del homeview aqui esta el anterior
	public AñadirPlatillo() {
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
				hm.abrirCuenta3();
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

		String[] columnas = { "Código", "Descripción" };
		String[][] datos = { { "040221", "Tocino" }, { "043216", "Tomate" }, { "041555", "Salsa tabasco" },
				{ "041221", "Tomate" }, { "043851", "Tahini" } };

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

		// NUEVO: Agregar MouseListener a la tabla para detectar clics
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table.rowAtPoint(e.getPoint());
				
				if (row >= 0) {
					// Obtener siempre el valor de la columna "Descripción" (columna 1)
					Object cellValue = table.getValueAt(row, 1);
					String descripcion = cellValue != null ? cellValue.toString() : "";
					
					// Limpiar el TextField si tiene el texto placeholder
					if (TextField.getText().equals("BUSCAR")) {
						TextField.setText("");
						TextField.setForeground(Color.BLACK);
					}
					
					// Agregar la descripción al TextField
					String textoActual = TextField.getText();
					if (textoActual.isEmpty()) {
						TextField.setText(descripcion);
					} else {
						TextField.setText(textoActual + " " + descripcion);
					}
					
					// Cerrar el popup después de seleccionar
					if (popupMenu.isVisible()) {
						popupMenu.setVisible(false);
					}
				}
			}
		});

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setPreferredSize(new Dimension(311, 149));

		JPopupMenu popupMenu = new JPopupMenu();
		popupMenu.add(scrollPane);

		TextField.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				if (TextField.getText().equals("BUSCAR")) {
					TextField.setText("");
					TextField.setForeground(Color.BLACK);
				}
			}

			public void focusLost(FocusEvent e) {
				if (TextField.getText().isEmpty()) {
					TextField.setText("BUSCAR");
					TextField.setForeground(Color.GRAY);
				}
			}
		});

		TextField.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				SwingUtilities.invokeLater(() -> {
					popupMenu.show(TextField, 0, TextField.getHeight());
				});
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
}
