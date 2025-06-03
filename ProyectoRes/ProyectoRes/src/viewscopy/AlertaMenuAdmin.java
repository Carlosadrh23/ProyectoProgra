package viewscopy;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AlertaMenuAdmin {


	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlertaMenuAdmin window = new AlertaMenuAdmin();
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
	public AlertaMenuAdmin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setAlwaysOnTop(true);
		frame.setResizable(false);
		frame.setBounds(0, 0, 502, 273);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 502, 273);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JButton btnNewButton = new JButton("CANCELAR");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Inter", Font.BOLD, 9));
		btnNewButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton.setIconTextGap(1);
		btnNewButton.setBounds(138, 168, 92, 49);
		ImageIcon a = new ImageIcon(getClass().getResource("/img/cancelar.png"));
		Image imagen = a.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
		btnNewButton.setIcon(new ImageIcon(imagen));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setContentAreaFilled(true);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("ACEPTAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Inter", Font.BOLD, 10));
		btnNewButton_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_1.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_1.setIconTextGap(1);
		btnNewButton_1.setBounds(270, 167, 92, 49);
		ImageIcon b = new ImageIcon(getClass().getResource("/img/aceptar.png"));
		Image imagen2 = b.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
		btnNewButton_1.setIcon(new ImageIcon(imagen2));
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setContentAreaFilled(true);
		panel.add(btnNewButton_1);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(123, 49, 44, 25);
		ImageIcon c = new ImageIcon(getClass().getResource("/img/admin4.png"));
		Image imagen3 = c.getImage().getScaledInstance(44, 25, Image.SCALE_SMOOTH);
		lblNewLabel_2.setIcon(new ImageIcon(imagen3));
		panel.add(lblNewLabel_2);

		JTextField textField = new JTextField("Administrador");
		textField.setFont(new Font("Inter", Font.BOLD, 12));
		textField.setBackground(new Color(242, 255, 168));
		textField.setBounds(110, 39, 273, 43);
		panel.add(textField);
		textField.setEditable(false);
		textField.setHorizontalAlignment(JTextField.CENTER);
		textField.setColumns(10);
		textField.setBorder(BorderFactory.createEmptyBorder());
		textField.setOpaque(true);
		textField.setFocusable(false);

		JLabel lblNewLabel_1 = new JLabel(""); // imagen del candado
		lblNewLabel_1.setBounds(123, 102, 45, 43);
		ImageIcon d = new ImageIcon(getClass().getResource("/img/candado_1.png"));
		Image imagen4 = d.getImage().getScaledInstance(44, 30, Image.SCALE_SMOOTH);
		lblNewLabel_1.setIcon(new ImageIcon(imagen4));
		panel.add(lblNewLabel_1);

		JTextField textField_1 = new JTextField();
		textField_1.setFont(new Font("Inter", Font.PLAIN, 12));
		textField_1.setBackground(new Color(242, 255, 168));
		textField_1.setBounds(110, 102, 273, 43);
		textField_1.setColumns(10);
		textField_1.setHorizontalAlignment(JTextField.CENTER);
		panel.add(textField_1);
		frame.setVisible(true);
	}

}
