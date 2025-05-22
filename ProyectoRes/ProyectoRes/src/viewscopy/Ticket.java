package viewscopy;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;

public class Ticket {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticket window = new Ticket();
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
	public Ticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 404, 630);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(150, 0, 71, 88);
		ImageIcon a1 = new ImageIcon("img/logo2.png");
		Image a2 = a1.getImage();
		Image a3 = a2.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		lblNewLabel.setIcon(new ImageIcon(a3));
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
		
		JLabel lblNewLabel_6 = new JLabel("--------------------------------------------------------------------------------");
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
	}
}
