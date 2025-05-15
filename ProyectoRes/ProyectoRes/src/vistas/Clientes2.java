package vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JTable;

public class Clientes2 {

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
					Clientes2 window = new Clientes2();
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
	public Clientes2() {
		initialize();
		/*try {
            UIManager.setLookAndFeel(new FlatLightLaf());  
            UIManager.put("TextComponent.arc", 20);//textfield redondeadas
            UIManager.put("Buttom.arc", 700); // Esquinas redondeadas
        } catch (Exception ex) {
            ex.printStackTrace();
        }
		*/
		
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
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(190, 190, 190));
		textField_1.setBounds(357, 150, 263, 43);
		panel.add(textField_1);
		textField_1.setFont(new Font("Inter", Font.PLAIN, 16));
		textField_1.setHorizontalAlignment(JTextField.CENTER);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(371, 150, 45, 43);
		ImageIcon a1 =new ImageIcon("img/lupa.png");
        Image a2= a1.getImage();
        Image a3=a2.getScaledInstance(123, 200,Image.SCALE_SMOOTH);
		panel.add(lblNewLabel_1);
		
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
		
		table = new JTable();
		table.setToolTipText("");
		table.setSurrendersFocusOnKeystroke(true);
		table.setBounds(80, 249, 968, 439);
		panel.add(table);
		
		
		
	}
}
