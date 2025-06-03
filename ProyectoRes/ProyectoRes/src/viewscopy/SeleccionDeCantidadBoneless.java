package viewscopy;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class SeleccionDeCantidadBoneless {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeleccionDeCantidadBoneless window = new SeleccionDeCantidadBoneless();
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
	public SeleccionDeCantidadBoneless() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JDialog frame = new JDialog();
		frame.setAlwaysOnTop(true);
		frame.setResizable(false);
		frame.setBounds(0, 0, 545, 320);
		frame.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		frame.getContentPane();
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 545, 320);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Orden de Boneless");
		lblNewLabel.setFont(new Font("Inter", Font.BOLD, 18));
		lblNewLabel.setBounds(193, 0, 262, 49);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Seleccióna la cantidad");
		lblNewLabel_1.setFont(new Font("Inter", Font.BOLD, 14));
		lblNewLabel_1.setBounds(193, 63, 161, 13);
		panel.add(lblNewLabel_1);
		
		
		final int[] cantidad = {1};

		
		
		// label de cantidad
		JLabel lblCantidad = new JLabel("1", SwingConstants.CENTER); // Centra el texto
		lblCantidad.setFont(new Font("Inter", Font.BOLD, 15));
		lblCantidad.setOpaque(true); 
		lblCantidad.setBackground(new Color(255, 255, 255));
		lblCantidad.setBounds(235, 117, 68, 59);
		panel.add(lblCantidad);
		
		// boton -
		JButton btnNewButton = new JButton("-");
		btnNewButton.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(67, 117, 68, 59);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setContentAreaFilled(true);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(cantidad[0] > 1) {
				    cantidad[0]--;
				    lblCantidad.setText(String.valueOf(cantidad[0]));
				}
			}
		});
		panel.add(btnNewButton);
		
		// boton *+*
		JButton btnNewButton_2 = new JButton("+");
		btnNewButton_2.setFont(new Font("Inter", Font.BOLD, 15));
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.setBounds(406, 117, 68, 59);
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setContentAreaFilled(true);
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			    cantidad[0]++;
			    lblCantidad.setText(String.valueOf(cantidad[0]));
			}
		});
		panel.add(btnNewButton_2);

		  JButton btnCancelar = new JButton("CANCELAR");
		    btnCancelar.setBackground(new Color(255, 255, 255));
		    btnCancelar.setFont(new Font("Inter", Font.BOLD, 9));
		    btnCancelar.setFocusPainted(false);
		    btnCancelar.setContentAreaFilled(true);
		    btnCancelar.setVerticalTextPosition(SwingConstants.BOTTOM);
		    btnCancelar.setHorizontalTextPosition(SwingConstants.CENTER);
		    btnCancelar.setHorizontalAlignment(SwingConstants.CENTER);
		    btnCancelar.setVerticalAlignment(SwingConstants.CENTER);
		    btnCancelar.setIconTextGap(1);
		    btnCancelar.setBounds(146, 224, 92, 49);
		    btnCancelar.addActionListener(new ActionListener() {
			    @Override
			    public void actionPerformed(ActionEvent e) {
			        frame.dispose(); 
			    }
			});
		
		// imagen
		ImageIcon a = new ImageIcon(getClass().getResource("/img/cancelar.png"));
		Image imagen = a.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
		btnCancelar.setIcon(new ImageIcon(imagen));
		panel.add(btnCancelar);

		JButton btnNewButton_4 = new JButton("ACEPTAR");
		btnNewButton_4.setBackground(new Color(255, 255, 255));
		btnNewButton_4.setFont(new Font("Inter", Font.BOLD, 9));
		// QUITA las lineas que salen al picarle al boton
		btnNewButton_4.setFocusPainted(false);
		btnNewButton_4.setContentAreaFilled(true);
		// TEXTO ABAJO DE LA IMAGEN
		btnNewButton_4.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_4.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_4.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_4.setIconTextGap(1);
		btnNewButton_4.setBounds(295, 224, 92, 49);
		// IMAGEN
		ImageIcon b = new ImageIcon(getClass().getResource("/img/aceptar.png"));
		Image imagen2 = b.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
		btnNewButton_4.setIcon(new ImageIcon(imagen2));
		panel.add(btnNewButton_4);
		frame.getContentPane().add(panel);
	    frame.setVisible(true);
	}

}
