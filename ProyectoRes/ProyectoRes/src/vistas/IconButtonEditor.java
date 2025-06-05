package vistas;

import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;

import javax.swing.AbstractCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.CellEditorListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;

class IconButtonEditor extends AbstractCellEditor implements TableCellEditor {
    protected JButton button;
    private JTable table;
    private DefaultTableModel model;

    public IconButtonEditor(DefaultTableModel model, JTable table) {

        this.model = model;
        this.table = table;

        button = new JButton();
		ImageIcon c = new ImageIcon(getClass().getResource("/img/borrar2.png"));
		Image imagen3 = c.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		button.setIcon(new ImageIcon(imagen3));
        button.setBorderPainted(false);


        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fireEditingStopped(); // Finaliza la edición
                int fila = table.getSelectedRow();

                if (fila != -1) {
                    int confirm = JOptionPane.showConfirmDialog(
                        table,
                        "¿Estás seguro de que quieres eliminar esta fila?",
                        "Confirmación",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE
                    );

                    if (confirm == JOptionPane.YES_OPTION) {
                        model.removeRow(fila);
                    }
                }
            }
        });
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value,
            boolean isSelected, int row, int column) {
        return button;
    }

    @Override
    public Object getCellEditorValue() {
        return null;
    }
}
