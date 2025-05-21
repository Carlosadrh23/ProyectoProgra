package vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.JTable;
import javax.swing.JTextField;

public class AbrirCuenta3 {

	private JFrame frame;
	private JTable table;
	private JLabel lblTotalValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AbrirCuenta3 window = new AbrirCuenta3();
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
	public AbrirCuenta3() {
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
		table = new JTable(modelo) {
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

		// AGREGAR FILA
		modelo.addRow(new Object[] { "1", "SKU09", "Hamburguesa clásica combo CH", "$150" });

		// Ttotal debajo de la tabla
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Inter", Font.BOLD, 15));
		lblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotal.setBounds(57, 464, 524, 30); // Alineado con columna de descripción
		lblTotal.setHorizontalAlignment(JLabel.CENTER);
		lblTotal.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lblTotal.setOpaque(true);
		lblTotal.setBackground(new Color(220, 220, 220));
		panel_1.add(lblTotal);

		lblTotalValor = new JLabel("$150");
		lblTotalValor.setFont(new Font("Inter", Font.BOLD, 15));
		lblTotalValor.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalValor.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lblTotalValor.setOpaque(true);
		lblTotalValor.setBackground(new Color(220, 220, 220));
		lblTotalValor.setBounds(580, 464, 180, 30); // Abarca la última celda como en la imagen
		panel_1.add(lblTotalValor);

		JButton btnNewButton_10 = new JButton("<html><div style='text-align:left;'>ENVIAR<br>PEDIDO</div></html>");
		btnNewButton_10.setFont(new Font("Inter", Font.PLAIN, 10));
		btnNewButton_10.setBackground(new Color(190, 190, 190));
		btnNewButton_10.setBounds(215, 537, 120, 44);
		// Ajustes para imagen a la izquierda y texto a la derecha
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
}
