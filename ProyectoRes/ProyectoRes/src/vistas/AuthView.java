package vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
import javax.swing.border.Border;

import com.formdev.flatlaf.FlatLightLaf;

import controllers.AuthController;
import controllers.HomeController;
import models.AuthModel;
import models.UsersModel;
import viewscopy.RoundedPanel;

public class AuthView {

	public void Login() {

		try {
			UIManager.setLookAndFeel(new FlatLightLaf());
			UIManager.put("TextComponent.arc", 20);// textfield redondeadas
			UIManager.put("Buttom.arc", 20); // Esquinas redondeadas
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		JFrame frame = new JFrame();
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

		RoundedPanel panel_1 = new RoundedPanel(15);// redondeado de esquina
		panel_1.setBackground(new Color(130, 48, 56));
		panel_1.setBounds(333, 296, 454, 411);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		

		JLabel lblNewLabel_5 = new JLabel("Iniciar sesión");
		lblNewLabel_5.setForeground(new Color(242, 255, 168));
		lblNewLabel_5.setBackground(new Color(242, 255, 168));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_5.setBounds(116, 10, 235, 28);
		lblNewLabel_5.setHorizontalAlignment(JTextField.CENTER);
		panel_1.add(lblNewLabel_5);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(68, 76, 56, 34);
		ImageIcon icon1 = new ImageIcon(getClass().getResource("/img/admin4.png"));
		Image imagen1 = icon1.getImage().getScaledInstance(56, 34, Image.SCALE_SMOOTH);
		lblNewLabel_2.setIcon(new ImageIcon(imagen1));
		panel_1.add(lblNewLabel_2);

		JTextField txtAdministrador = new JTextField();
		txtAdministrador.setBounds(50, 67, 353, 50);
		txtAdministrador.setFont(new Font("Inter", Font.PLAIN, 16));
		txtAdministrador.setBackground(new Color(242, 255, 168));
		txtAdministrador.setHorizontalAlignment(JTextField.CENTER);
		txtAdministrador.setColumns(10);
		panel_1.add(txtAdministrador);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(65, 184, 65, 41);
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
		
		// aqui es para guardar el borde y que se pueda resablecer cuando se vuelve a seleccionar el textfield y no se quede el color fijo
		Border defaultBorder = txtAdministrador.getBorder();  
		Border defaultBorderPass = passwordField.getBorder();  
		
		txtAdministrador.addFocusListener(new FocusAdapter() {
		    @Override
		    public void focusGained(FocusEvent e) {
		        // Restaura el borde original si había un error
		        txtAdministrador.setBorder(defaultBorder);
		    }
		});

		passwordField.addFocusListener(new FocusAdapter() {
		    @Override
		    public void focusGained(FocusEvent e) {
		        // Restaura el borde original si había un error
		        passwordField.setBorder(defaultBorder);
		    }
		});

		JButton btnNewButton = new JButton("Iniciar sesión");
		btnNewButton.setBounds(168, 280, 109, 50);
		btnNewButton.setFont(new Font("Inter", Font.PLAIN, 12));
		btnNewButton.setForeground(new Color(242, 255, 168));
		btnNewButton.setBackground(new Color(32, 175, 44));
		panel_1.add(btnNewButton);

		JLabel lblNewLabel_4 = new JLabel("¿Aún no tienes cuenta?");
		lblNewLabel_4.setBounds(138, 350, 152, 16);
		panel_1.add(lblNewLabel_4);

		JLabel enlace = new JLabel("<html><a href=''>Registrate</a></html>");
		enlace.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		enlace.setBounds(265, 350, 152, 16);
		// Acción al hacer clic
		enlace.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				AuthController ac = new AuthController();

				ac.register();
			}
		});
		panel_1.add(enlace);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String passText = new String(passwordField.getPassword());
				Boolean flag1 = false, flag2 = false;

				if (passText.equals("")) {

					passwordField.setBorder(BorderFactory.createLineBorder(Color.red, 2));

				} else {

					passwordField.setBorder(BorderFactory.createLineBorder(Color.green, 2));
					flag1 = true;
				}
				if (txtAdministrador.getText().equals("")) {
					txtAdministrador.setBorder(BorderFactory.createLineBorder(Color.red, 2));
				} else {

					txtAdministrador.setBorder(BorderFactory.createLineBorder(Color.green, 2));
					flag2 = true;
				}

				if (flag1 && flag2) {

					AuthModel am = new AuthModel();
					boolean is_login = am.login(txtAdministrador.getText(), passText);

					if (is_login) {
						JOptionPane.showMessageDialog(null, "Bienvenido.");

						frame.dispose();
						HomeController hc = new HomeController();

						hc.comedor();

					} else {
						passwordField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
						JOptionPane.showMessageDialog(null, "Error al acceder", "verifique su información",
								JOptionPane.WARNING_MESSAGE);

					}

				}

			}
		});
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}

	public void Register() {

		try {
			UIManager.setLookAndFeel(new FlatLightLaf());
			UIManager.put("TextComponent.arc", 20);// textfield redondeadas
			UIManager.put("Buttom.arc", 700); // Esquinas redondeadas
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		JFrame frame = new JFrame();

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

		RoundedPanel panel_1 = new RoundedPanel(15);// redondeado de esquina
		panel_1.setBackground(new Color(130, 48, 56));
		panel_1.setBounds(333, 296, 454, 411);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(68, 66, 56, 54);
		ImageIcon icon1 = new ImageIcon(getClass().getResource("/img/admin4.png"));
		Image imagen1 = icon1.getImage().getScaledInstance(56, 34, Image.SCALE_SMOOTH);
		lblNewLabel_2.setIcon(new ImageIcon(imagen1));
		panel_1.add(lblNewLabel_2);

		JTextField nombreField = new JTextField("Username");
		nombreField.setBounds(50, 66, 353, 50);
		nombreField.setForeground(new Color(192, 192, 192));
		nombreField.setFont(new Font("Inter", Font.PLAIN, 16));
		nombreField.setBackground(new Color(242, 255, 168));
		nombreField.setHorizontalAlignment(JTextField.CENTER);
		nombreField.setColumns(10);
		panel_1.add(nombreField);

		// HACE QUE SE BORRE EL BUSCAR AL ESCRIBIR EN EL TEXTFIELD
		final String placeholder = "Username";
		nombreField.addFocusListener(new FocusAdapter() {

			public void focusGained(FocusEvent e) {
				if (nombreField.getText().equals(placeholder)) {
					nombreField.setText("");
					nombreField.setForeground(Color.BLACK);
				}
			}

			public void focusLost(FocusEvent e) {
				if (nombreField.getText().isEmpty()) {
					nombreField.setText(placeholder);
					nombreField.setForeground(Color.GRAY);
				}
			}
		});

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(68, 145, 56, 41);
		panel_1.add(lblNewLabel_3);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		ImageIcon icon6 = new ImageIcon(getClass().getResource("/img/admin4.png"));
		Image imagen6 = icon6.getImage().getScaledInstance(56, 34, Image.SCALE_SMOOTH);
		lblNewLabel_3.setIcon(new ImageIcon(imagen6));

		JTextField emailField = new JTextField("Email");
		emailField.setBounds(50, 136, 353, 50);
		emailField.setForeground(new Color(192, 192, 192));
		emailField.setFont(new Font("Inter", Font.PLAIN, 16));
		emailField.setBackground(new Color(242, 255, 168));
		panel_1.add(emailField);
		emailField.setHorizontalAlignment(JTextField.CENTER);
		emailField.setColumns(10);

		// HACE QUE SE BORRE EL BUSCAR AL ESCRIBIR EN EL TEXTFIELD
		final String placeholder2 = "Email";
		emailField.addFocusListener(new FocusAdapter() {

			public void focusGained(FocusEvent e) {
				if (emailField.getText().equals(placeholder2)) {
					emailField.setText("");
					emailField.setForeground(Color.BLACK);
				}
			}

			public void focusLost(FocusEvent e) {
				if (emailField.getText().isEmpty()) {
					emailField.setText(placeholder2);
					emailField.setForeground(Color.GRAY);
				}
			}
		});

		JLabel lblCandado1 = new JLabel("");
		lblCandado1.setBounds(68, 210, 65, 41);
		ImageIcon icon3 = new ImageIcon(getClass().getResource("/img/candado_1.png"));
		Image imagen3 = icon3.getImage().getScaledInstance(65, 41, Image.SCALE_SMOOTH);
		lblCandado1.setIcon(new ImageIcon(imagen3));
		panel_1.add(lblCandado1);

		JLabel lblCandado2 = new JLabel("");
		lblCandado2.setBounds(68, 278, 65, 41);
		icon3 = new ImageIcon(getClass().getResource("/img/candado_1.png"));
		imagen3 = icon3.getImage().getScaledInstance(65, 41, Image.SCALE_SMOOTH);
		lblCandado2.setIcon(new ImageIcon(imagen3));
		panel_1.add(lblCandado2);

		JPasswordField passwordField1 = new JPasswordField("");
		passwordField1.setBounds(50, 201, 353, 50);
		passwordField1.setBackground(new Color(242, 255, 168));
		passwordField1.setFont(new Font("Inter", Font.PLAIN, 16));
		passwordField1.setHorizontalAlignment(JTextField.CENTER);
		panel_1.add(passwordField1);
		passwordField1.setColumns(10);

		JPasswordField cfrmPassField = new JPasswordField("");
		cfrmPassField.setBounds(50, 269, 353, 50);
		cfrmPassField.setBackground(new Color(242, 255, 168));
		cfrmPassField.setFont(new Font("Inter", Font.PLAIN, 16));
		cfrmPassField.setHorizontalAlignment(JTextField.CENTER);
		panel_1.add(cfrmPassField);
		cfrmPassField.setColumns(10);

		JButton btnNewButton = new JButton("Registrate");
		btnNewButton.setBounds(168, 342, 107, 41);
		btnNewButton.setFont(new Font("Inter", Font.PLAIN, 12));
		btnNewButton.setForeground(new Color(242, 255, 168));
		btnNewButton.setBackground(new Color(32, 175, 44));
		panel_1.add(btnNewButton);

		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String passText = new String(passwordField1.getPassword());
				String passCfrmText = new String(cfrmPassField.getPassword());

				Boolean nombreValido = false, emailValido = false;
				Boolean passwordValido = false;

				// Validación del nombre
				if (nombreField.getText().equals("") || nombreField.getText().equals("Username")) {
					nombreField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
				} else {
					nombreField.setBorder(BorderFactory.createLineBorder(Color.green, 2));
					nombreValido = true;
				}

				// Validación del apellido
				if (emailField.getText().equals("") || emailField.getText().equals("Email")) {
					emailField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
				} else {
					emailField.setBorder(BorderFactory.createLineBorder(Color.green, 2));
					emailValido = true;
				}

				// Validación del contraseña
				if (passText.equals("") || !passText.equals(passCfrmText)) {
					passwordField1.setBorder(BorderFactory.createLineBorder(Color.red, 2));
					cfrmPassField.setBorder(BorderFactory.createLineBorder(Color.red, 2));

				} else {
					passwordField1.setBorder(BorderFactory.createLineBorder(Color.green, 2));
					cfrmPassField.setBorder(BorderFactory.createLineBorder(Color.green, 2));
					passwordValido = true;
				}

				// Si todos los campos son válidos
				if (nombreValido && emailValido && passwordValido) {
					// Aquí iría el código para guardar el usuario en la base de datos

					UsersModel um = new UsersModel();
					um.addUser(nombreField.getText().toString(), emailField.getText(), passText);

					JOptionPane.showMessageDialog(null, "Usuario registrado correctamente");

					frame.dispose();

					AuthController ac = new AuthController();
					ac.login();
				}

			}
		});
		JLabel lblNewLabel_4 = new JLabel("¿Ya tienes una cuenta?");
		lblNewLabel_4.setBounds(168, 385, 152, 16);
		panel_1.add(lblNewLabel_4);

		JLabel enlace = new JLabel("<html><a href=''>Inicia sesión</a></html>");
		enlace.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		enlace.setBounds(295, 385, 152, 16);
		// Acción al hacer clic
		enlace.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				AuthController ac = new AuthController();

				ac.login();
			}
		});
		panel_1.add(enlace);
		JLabel lblRegistro = new JLabel("Registro");
		lblRegistro.setBackground(new Color(242, 255, 168));
		lblRegistro.setBounds(178, -5, 164, 61);
		panel_1.add(lblRegistro);
		lblRegistro.setForeground(new Color(242, 255, 168));
		lblRegistro.setFont(new Font("Inter", Font.BOLD, 25));

	}
}
