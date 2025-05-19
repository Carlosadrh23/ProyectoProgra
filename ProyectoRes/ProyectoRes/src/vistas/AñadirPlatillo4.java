package vistas;

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

public class AñadirPlatillo4 {

	private JFrame frame;
	private JTextField TextField;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AñadirPlatillo4 window = new AñadirPlatillo4();
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
	public AñadirPlatillo4() {
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
        
		TextField = new JTextField("BUSCAR");
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
		
		textField = new JTextField();
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
}
