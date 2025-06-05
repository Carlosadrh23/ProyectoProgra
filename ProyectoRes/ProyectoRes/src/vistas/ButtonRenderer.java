package vistas;

import java.awt.Component;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

class ButtonRenderer extends JButton implements TableCellRenderer {

    public ButtonRenderer() {
		ImageIcon c = new ImageIcon(getClass().getResource("/img/borrar2.png"));
        Image imagen3 = c.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        setIcon(new ImageIcon(imagen3)); 
        setBorderPainted(false);
        setContentAreaFilled(false);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        return this;
    }
}
