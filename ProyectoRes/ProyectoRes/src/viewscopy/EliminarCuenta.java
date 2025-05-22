package viewscopy;

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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EliminarCuenta {

	private JFrame frame;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EliminarCuenta window = new EliminarCuenta();
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
	public EliminarCuenta() {
		try {
            UIManager.setLookAndFeel(new FlatLightLaf()); 
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
		
		textField = new JTextField();
		textField.setFont(new Font("Inter", Font.BOLD, 17));
		textField.setBounds(125, 26, 59, 27);
		textField.setHorizontalAlignment(JTextField.CENTER);
		textField.setColumns(10);
		textField.setBorder(cellBorder1);
		panel_1.add(textField);
		
		
		// Columnas y modelo de la tabla
		String[] columnas = {"Cantidad", "Código", "Descripción", "Precio"};
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

		// ScrollPane y ubicación
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(41, 82, 719, 420); // altura ajustada para dejar espacio al total
		panel_1.add(scrollPane);

		
		modelo.addRow(new Object[]{"1", "SKU09", "Hamburguesa clásica combo CH", "$150"});
		
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
		ImageIcon a1 = new ImageIcon("img/cancelar2.png");
		Image a2 = a1.getImage();
		Image a3 = a2.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		btnNewButton_5.setIcon(new ImageIcon(a3));
		btnNewButton_5.setFocusPainted(false);
		btnNewButton_5.setContentAreaFilled(true);
		btnNewButton_5.setFocusPainted(false);
		btnNewButton_5.setContentAreaFilled(true);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("<html><div style='text-align:left;'>Ingresar nueva<br>orden</div></html>");
		btnNewButton_6.setBackground(new Color(101, 206, 189));
		btnNewButton_6.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton_6.setBounds(55, 329, 201, 67);
		btnNewButton_6.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_6.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton_6.setVerticalTextPosition(SwingConstants.CENTER);
		btnNewButton_6.setIconTextGap(10);
		ImageIcon b1 = new ImageIcon("img/lupa.png");
		Image b2 = b1.getImage();
		Image b3 = b2.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		btnNewButton_6.setIcon(new ImageIcon(b3));
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
		ImageIcon c1 = new ImageIcon("img/impresora.png");
		Image c2 = c1.getImage();
		Image c3 = c2.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		btnNewButton_7.setIcon(new ImageIcon(c3));
		btnNewButton_7.setFocusPainted(false);
		btnNewButton_7.setContentAreaFilled(true);
		btnNewButton_7.setFocusPainted(false);
		btnNewButton_7.setContentAreaFilled(true);
		panel.add(btnNewButton_7);

	}
}
