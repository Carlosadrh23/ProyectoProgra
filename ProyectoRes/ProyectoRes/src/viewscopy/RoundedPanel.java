package viewscopy;
					//esta clase fue para hacer el panel con esquinas redondas

	import javax.swing.*;
	import java.awt.*;

	public class RoundedPanel extends JPanel {
	    private int cornerRadius;

	    public RoundedPanel(int radius) {
	        this.cornerRadius = radius;
	        setOpaque(false); 
	    }

	  
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        Dimension arcs = new Dimension(cornerRadius, cornerRadius);
	        int width = getWidth();
	        int height = getHeight();
	        Graphics2D graphics = (Graphics2D) g;
	        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

	        // Color de fondo
	        graphics.setColor(getBackground());
	        graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);

	        // Borde 
	        graphics.setColor(getForeground());
	        graphics.drawRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);
	    }
	
}
