package viewscopy;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controllers.HomeController;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Clientes {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clientes window = new Clientes();
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
	public Clientes() {
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

		// PANEL DE CONTENIDO JUSTO DEBAJO DEL BOTÓN CLIENTES
		JPanel panelContenido = new JPanel();
		panelContenido.setBounds(677, 49, 234, 65);
		panelContenido.setLayout(new BorderLayout());
		panelContenido.setVisible(false);
		panelContenido.setOpaque(false);
		panel.add(panelContenido);

		btnNewButton_3.addActionListener(e -> {
		    if (panelContenido.isVisible()) {
		        panelContenido.setVisible(false);
		        panelContenido.removeAll();
		    } else {
		        panelContenido.removeAll();
		        panelContenido.add(new HistorialyConsulta(), BorderLayout.CENTER);
		        panelContenido.setVisible(true);
		    }
		    panelContenido.revalidate();
		    panelContenido.repaint();
		});
		
		JButton btnNewButton_4 = new JButton("Usuarios");
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(50, 98, 115));
		btnNewButton_4.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton_4.setBounds(909, 0, 227, 49);
		panel.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(259, 253, 240, 192);
		ImageIcon p1 =new ImageIcon("img/cuenta.png");
        Image p2= p1.getImage();
        Image p3=p2.getScaledInstance(234, 192,Image.SCALE_SMOOTH);
        lblNewLabel .setIcon(new ImageIcon(p3));
		panel.add(lblNewLabel);
		
		JButton btnNewButton_5 = new JButton("Abrir cuenta");
		btnNewButton_5.setBackground(new Color(217, 217, 217));
		btnNewButton_5.setFont(new Font("Inter", Font.BOLD, 13));
		btnNewButton_5.setBounds(259, 447, 240, 49);
		panel.add(btnNewButton_5);
		btnNewButton_5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				HomeController cc = new HomeController();
				cc.abrirCuenta();
			}
		});
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(660, 253, 234, 192);
		ImageIcon portada1 =new ImageIcon("img/consulcuent.png");
        Image portada2= portada1.getImage();
        Image portada3=portada2.getScaledInstance(234, 192,Image.SCALE_SMOOTH);
        lblNewLabel_1 .setIcon(new ImageIcon(portada3));
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton_6 = new JButton("Consultar cuenta");
		btnNewButton_6.setBackground(new Color(217, 217, 217));
		btnNewButton_6.setFont(new Font("Inter", Font.BOLD, 13));
		btnNewButton_6.setBounds(660, 447, 234, 49);
		panel.add(btnNewButton_6);
	}
}
