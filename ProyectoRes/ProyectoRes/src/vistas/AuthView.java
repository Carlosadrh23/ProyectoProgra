package vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

import com.formdev.flatlaf.FlatLightLaf;

import controllers.HomeController;
import models.AuthModel;
import viewscopy.RoundedPanel;

public class AuthView {

public void Login() {
		
		try {
            UIManager.setLookAndFeel(new FlatLightLaf());  
            UIManager.put("TextComponent.arc", 20);//textfield redondeadas
            UIManager.put("Buttom.arc", 700); // Esquinas redondeadas
        } catch (Exception ex) {
            ex.printStackTrace();
        }
		
		
		
		
		JFrame	frame = new JFrame();
		JPasswordField passwordField;
		frame.setResizable(false);
		frame.setBounds(100, 100, 1150, 799);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PUNTO Y COMIDA");
		lblNewLabel.setFont(new Font("Inter", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(130, 48, 56));
		lblNewLabel.setBounds(472, 200, 279, 61);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(515, 21, 91, 137);
		ImageIcon icon2 = new ImageIcon(getClass().getResource("/img/botella.png"));
        Image imagen2 = icon2.getImage().getScaledInstance(91, 137, Image.SCALE_SMOOTH);
        lblNewLabel_1.setIcon(new ImageIcon(imagen2));
		panel.add(lblNewLabel_1);
	
		
		RoundedPanel panel_1 = new RoundedPanel(15);//redondeado de esquina
		panel_1.setBackground(new Color(130, 48, 56));
		panel_1.setBounds(333, 296, 454, 411);
		panel.add(panel_1);
		panel_1.setLayout(null);

        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setBounds(68, 76, 56, 34);
		ImageIcon icon1 = new ImageIcon(getClass().getResource("/img/admin4.png"));
        Image imagen1 = icon1.getImage().getScaledInstance(56, 34, Image.SCALE_SMOOTH);
        lblNewLabel_2.setIcon(new ImageIcon(imagen1));
		panel_1.add(lblNewLabel_2);
		
		JTextField	txtAdministrador = new JTextField();
		txtAdministrador.setBounds(50, 67, 353, 50);
		txtAdministrador.setFont(new Font("Inter", Font.PLAIN, 16));
		txtAdministrador.setBackground(new Color(242, 255, 168));
		panel_1.add(txtAdministrador);
		txtAdministrador.setHorizontalAlignment(JTextField.CENTER);
		txtAdministrador.setColumns(10);
		txtAdministrador.setBorder(BorderFactory.createEmptyBorder());
		
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(68, 184, 65, 41);
		ImageIcon icon3 = new ImageIcon(getClass().getResource("/img/candado_1.png"));
        Image imagen3 = icon3.getImage().getScaledInstance(65, 41, Image.SCALE_SMOOTH);
        lblNewLabel_3.setIcon(new ImageIcon(imagen3));
		panel_1.add(lblNewLabel_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(50, 179, 353, 50);
		passwordField.setBackground(new Color(242, 255, 168));
		passwordField.setFont(new Font("Inter", Font.PLAIN, 16));
		passwordField.setHorizontalAlignment(JTextField.CENTER);
		panel_1.add(passwordField);
		passwordField.setColumns(10);
		
		JButton btnNewButton = new JButton("Iniciar sesión");
		btnNewButton.setBounds(168, 280, 109, 50);
		btnNewButton.setFont(new Font("Inter", Font.PLAIN, 12));
		btnNewButton.setForeground(new Color(242, 255, 168));
		btnNewButton.setBackground(new Color(32, 175, 44));
		panel_1.add(btnNewButton);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String passText = new String(passwordField.getPassword());
				Boolean flag1 = false, flag2 = false;
				
				
				if( passText.equals("")  ) {
					
					passwordField.setBorder(BorderFactory.createLineBorder(Color.red,2));
					
				}else {
					
					passwordField.setBorder(BorderFactory.createLineBorder(Color.green,2));
					flag1 = true;
				}
				if(txtAdministrador.getText().equals("")) {
					txtAdministrador.setBorder(BorderFactory.createLineBorder(Color.red,2));
				}else {
					
					txtAdministrador.setBorder(BorderFactory.createLineBorder(Color.red,2));
					flag2 = true;
				}

				if(flag1  && flag2) {
					
					AuthModel am = new AuthModel();
					boolean is_login = am.login(txtAdministrador.getText(),passText);
					
					if(is_login) {
						JOptionPane.showMessageDialog(null, "Bienvenido.");
						
						frame.dispose();
						HomeController hc = new HomeController();
						
						hc.comedor();
						
					}else {
						passwordField.setBorder(BorderFactory.createLineBorder(Color.red,2));
						JOptionPane.showMessageDialog(null, "Error al acceder","verifique su información",JOptionPane.WARNING_MESSAGE);

					}
					
					
				}
				
			}
		});
		frame.setVisible(true);

	}

/*
	public void Register() {
	
	try {
        UIManager.setLookAndFeel(new FlatLightLaf());  
        UIManager.put("TextComponent.arc", 20);//textfield redondeadas
        UIManager.put("Buttom.arc", 700); // Esquinas redondeadas
    } catch (Exception ex) {
        ex.printStackTrace();
    }
	JFrame	frame = new JFrame();
	JPasswordField passwordField;
	frame.setResizable(false);
	frame.setBounds(100, 100, 1150, 799);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JPanel panel = new JPanel();
	frame.getContentPane().add(panel, BorderLayout.CENTER);
	panel.setLayout(null);
	
	JLabel lblNewLabel = new JLabel("PUNTO Y COMIDA");
	lblNewLabel.setFont(new Font("Inter", Font.BOLD, 20));
	lblNewLabel.setForeground(new Color(130, 48, 56));
	lblNewLabel.setBounds(472, 200, 279, 61);
	panel.add(lblNewLabel);
	
	JLabel lblNewLabel_1 = new JLabel("");
	lblNewLabel_1.setBounds(515, 21, 91, 137);
	ImageIcon icon2 = new ImageIcon(getClass().getResource("/img/botella.png"));
    Image imagen2 = icon2.getImage().getScaledInstance(91, 137, Image.SCALE_SMOOTH);
    lblNewLabel_1.setIcon(new ImageIcon(imagen2));
	panel.add(lblNewLabel_1);

	
	RoundedPanel panel_1 = new RoundedPanel(15);//redondeado de esquina
	panel_1.setBackground(new Color(130, 48, 56));
	panel_1.setBounds(333, 296, 454, 411);
	panel.add(panel_1);
	panel_1.setLayout(null);

    JLabel lblNewLabel_2 = new JLabel("");
    lblNewLabel_2.setBounds(68, 76, 56, 34);
	ImageIcon icon1 = new ImageIcon(getClass().getResource("/img/admin4.png"));
    Image imagen1 = icon1.getImage().getScaledInstance(56, 34, Image.SCALE_SMOOTH);
    lblNewLabel_2.setIcon(new ImageIcon(imagen1));
	panel_1.add(lblNewLabel_2);
	
	JTextField	txtAdministrador = new JTextField("Administrador");
	txtAdministrador.setBounds(50, 67, 353, 50);
	txtAdministrador.setFont(new Font("Inter", Font.PLAIN, 16));
	txtAdministrador.setBackground(new Color(242, 255, 168));
	panel_1.add(txtAdministrador);
	txtAdministrador.setEditable(false);
	txtAdministrador.setHorizontalAlignment(JTextField.CENTER);
	txtAdministrador.setColumns(10);
	txtAdministrador.setBorder(BorderFactory.createEmptyBorder());
	txtAdministrador.setOpaque(true);
	txtAdministrador.setFocusable(false);
	
	JLabel lblNewLabel_3 = new JLabel("");
	lblNewLabel_3.setBounds(68, 184, 65, 41);
	ImageIcon icon3 = new ImageIcon(getClass().getResource("/img/candado_1.png"));
    Image imagen3 = icon3.getImage().getScaledInstance(65, 41, Image.SCALE_SMOOTH);
    lblNewLabel_3.setIcon(new ImageIcon(imagen3));
	panel_1.add(lblNewLabel_3);
	
	passwordField = new JPasswordField();
	passwordField.setBounds(50, 179, 353, 50);
	passwordField.setBackground(new Color(242, 255, 168));
	passwordField.setFont(new Font("Inter", Font.PLAIN, 16));
	passwordField.setHorizontalAlignment(JTextField.CENTER);
	panel_1.add(passwordField);
	passwordField.setColumns(10);
	
	JButton btnNewButton = new JButton("Iniciar sesión");
	btnNewButton.setBounds(168, 280, 109, 50);
	btnNewButton.setFont(new Font("Inter", Font.PLAIN, 12));
	btnNewButton.setForeground(new Color(242, 255, 168));
	btnNewButton.setBackground(new Color(32, 175, 44));
	panel_1.add(btnNewButton);
	
	
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			String passText = new String(passwordField.getPassword());
			Boolean flag1 = false;
			
			
			if( passText.equals("")  ) {
				
				passwordField.setBorder(BorderFactory.createLineBorder(Color.red,2));
				
			}else {
				
				passwordField.setBorder(BorderFactory.createLineBorder(Color.green,2));
				flag1 = true;
			}

			if(flag1) {
				
				AuthModel am = new AuthModel();
				boolean is_login = am.login(passText);
				
				if(is_login) {
					JOptionPane.showMessageDialog(null, "Bienvenido.");
					
					frame.dispose();
					HomeController hc = new HomeController();
					
					hc.comedor();
					
				}else {
					passwordField.setBorder(BorderFactory.createLineBorder(Color.red,2));
					JOptionPane.showMessageDialog(null, "Error al acceder","verifique su información",JOptionPane.WARNING_MESSAGE);

				}
				
				
			}
			
		}
	});
	frame.setVisible(true);

}
*/
}
