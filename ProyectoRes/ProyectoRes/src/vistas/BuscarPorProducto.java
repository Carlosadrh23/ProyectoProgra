package vistas;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Font;

public class BuscarPorProducto {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JButton btnNewButton;
	private JButton btnNewButton_1;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuscarPorProducto window = new BuscarPorProducto();
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
	public BuscarPorProducto() {
		try {
            UIManager.setLookAndFeel(new FlatLightLaf());  
            UIManager.put("TextComponent.arc", 20);//textfield redondeadas
            UIManager.put("Buttom.arc",550); // Esquinas redondeadas
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
		
		textField_2 = new JTextField();
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
        table = new JTable(model);
        table.setFillsViewportHeight(true);
        table.setRowHeight(25);
        table.setShowGrid(true);
        table.setGridColor(Color.BLACK);
		table.getTableHeader().setReorderingAllowed(false);

     
        // ScrollPane 
        JScrollPane scrollPane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setBounds(20, 73, 500, 150);
        panel.add(scrollPane);
        
        btnNewButton = new JButton("Cancelar");
        btnNewButton.setBackground(new Color(255, 0, 0));
        btnNewButton.setFont(new Font("Inter", Font.PLAIN, 10));
        btnNewButton.setBounds(10, 248, 85, 21);
        panel.add(btnNewButton);
        
        btnNewButton_1 = new JButton("Aceptar");
        btnNewButton_1.setBackground(new Color(32, 175, 44));
        btnNewButton_1.setFont(new Font("Inter", Font.PLAIN, 10));
        btnNewButton_1.setBounds(412, 248, 85, 21);
        panel.add(btnNewButton_1);
    }
}
