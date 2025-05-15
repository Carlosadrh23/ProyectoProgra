/*package vistas;

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

	
	public HistorialyConsulta() {
		initialize();
		
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1150, 799);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(619, 10, 236, 62);
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
}*/

package vistas;

import javax.swing.*;
import java.awt.*;

import javax.swing.*;
import java.awt.*;

public class HistorialyConsulta extends JPanel {
    public HistorialyConsulta() {
        setLayout(new GridLayout(2, 1));  // 2 filas, 1 columna, que ocupa todo el panel

        JButton btnHistorial = new JButton("Historial de factura");
        btnHistorial.setForeground(Color.WHITE);
        btnHistorial.setBackground(new Color(170, 170, 170));
        btnHistorial.setFont(new Font("Inter", Font.BOLD, 14));
        add(btnHistorial);

        JButton btnConsulta = new JButton("Consulta de cuenta");
        btnConsulta.setForeground(Color.WHITE);
        btnConsulta.setBackground(new Color(170, 170, 170));
        btnConsulta.setFont(new Font("Inter", Font.BOLD, 14));
        add(btnConsulta);
    }
}

