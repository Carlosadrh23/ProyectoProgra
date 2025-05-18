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
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

import com.formdev.flatlaf.FlatLightLaf;

public class AlmacenEditar {
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlmacenEditar window = new AlmacenEditar();
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
	public AlmacenEditar() {
		try {
            UIManager.setLookAndFeel(new FlatLightLaf());  
            UIManager.put("TextComponent.arc", 30);//textfield redondeadas
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

		textField_1 = new Lupa(lupaImg);
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
		table = new JTable(datos, columnas) {
		    @Override
		    public boolean isCellEditable(int row, int column) {
		        return false;
		    }
		};
		table.setAutoCreateRowSorter(true); 

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
}
