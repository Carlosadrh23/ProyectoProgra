
package viewscopy;

import javax.swing.*;
import java.awt.*;

import javax.swing.*;
import java.awt.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
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

