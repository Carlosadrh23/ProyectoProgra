package vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

	
	public class UsuarioCerrarSesion extends JPanel {
	    public UsuarioCerrarSesion() {
	        setLayout(new GridLayout(1, 1));  // 1 filas, 1 columna, que ocupa todo el panel

	        JButton btnHistorial = new JButton("Cerrar sesión");
	        btnHistorial.setForeground(Color.WHITE);
	        btnHistorial.setBackground(new Color(170, 170, 170));
	        btnHistorial.setFont(new Font("Inter", Font.BOLD, 14));
	        add(btnHistorial);

	    }
	}
