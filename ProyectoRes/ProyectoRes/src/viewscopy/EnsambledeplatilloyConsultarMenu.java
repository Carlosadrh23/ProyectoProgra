package viewscopy;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controllers.HomeController;


	public class EnsambledeplatilloyConsultarMenu extends JPanel {
	    public EnsambledeplatilloyConsultarMenu() {
	        setLayout(new GridLayout(2, 1));  // 2 filas, 1 columna, que ocupa todo el panel

	        JButton btnHistorial = new JButton("Ensamble de platillos");
	        btnHistorial.setForeground(Color.WHITE);
	        btnHistorial.setBackground(new Color(170, 170, 170));
	        btnHistorial.setFont(new Font("Inter", Font.BOLD, 14));
	        add(btnHistorial);

	        JButton btnConsulta = new JButton("Consultar menú");
	        btnConsulta.setForeground(Color.WHITE);
	        btnConsulta.setBackground(new Color(170, 170, 170));
	        btnConsulta.setFont(new Font("Inter", Font.BOLD, 14));
	        add(btnConsulta);
	    }
	}

