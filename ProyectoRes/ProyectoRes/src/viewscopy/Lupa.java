package viewscopy;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.JTextField;

class Lupa extends JTextField {
    private Image icono;

    public Lupa(Image icono) {
        this.icono = icono;
        setBorder(BorderFactory.createEmptyBorder(0, 40, 0, 0)); 
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (icono != null) {
            g.drawImage(icono, 10, (getHeight() - 30) / 2, 30, 30, this); // posición y tamaño del icono
        }
    }
}
