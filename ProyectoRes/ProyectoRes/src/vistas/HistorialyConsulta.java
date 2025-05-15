package vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HistorialyConsulta {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HistorialyConsulta window = new HistorialyConsulta();
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
	public HistorialyConsulta() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1150, 799);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 235, 62);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Historial de factura");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(170, 170, 170));
		btnNewButton.setFont(new Font("Inter", Font.BOLD, 14));
		btnNewButton.setBounds(0, 0, 235, 31);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Consulta de cuenta");	
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(170, 170, 170));
		btnNewButton_1.setFont(new Font("Inter", Font.BOLD, 14));
		btnNewButton_1.setBounds(0, 29, 235, 31);
		panel.add(btnNewButton_1);
		
	
	}
}
/*
 * package vistas;
								mire que para llamar a esta clase la tenia que convertir a jpanel 
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class HistorialyConsulta extends JPanel {

    public HistorialyConsulta() {
        setLayout(null);
        setBounds(0, 50, 1150, 749); 

        JPanel panel = new JPanel();
        panel.setBounds(10, 10, 235, 62);
        add(panel);
        panel.setLayout(null);

        JButton btnNewButton = new JButton("Historial de factura");
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setBackground(new Color(170, 170, 170));
        btnNewButton.setFont(new Font("Inter", Font.BOLD, 14));
        btnNewButton.setBounds(0, 0, 235, 31);
        panel.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Consulta de cuenta");
        btnNewButton_1.setForeground(new Color(255, 255, 255));
        btnNewButton_1.setBackground(new Color(170, 170, 170));
        btnNewButton_1.setFont(new Font("Inter", Font.BOLD, 14));
        btnNewButton_1.setBounds(0, 29, 235, 31);
        panel.add(btnNewButton_1);
    }
}*/
