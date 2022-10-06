package Practicas;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class COLORES {

	public JFrame frmColores;
	ButtonGroup grupo = new ButtonGroup();
	private JRadioButton redrojo;
	private JRadioButton redverde;
	private JRadioButton radazul;
	private JLabel lblColor;
	private JRadioButton radCyan;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					COLORES window = new COLORES();
					window.frmColores.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public COLORES() {
		initialize();
		grupo.add(radazul);
		grupo.add(redrojo);
		grupo.add(redverde);
		grupo.add(radCyan);

	}

	public void cambiarColor() {
		if (redrojo.isSelected()) {
			lblColor.setBackground(Color.red);
		} else if (redverde.isSelected()) {
			lblColor.setBackground(Color.green);
		} else if (radazul.isSelected()) {
			lblColor.setBackground(Color.blue);
		} else if (radCyan.isSelected()) {
			lblColor.setBackground(Color.CYAN);
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmColores = new JFrame();
		frmColores.setBounds(100, 100, 450, 300);
		frmColores.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmColores.setTitle("COLORES");
		frmColores.setLocationRelativeTo(null);
		frmColores.setIconImage(Toolkit.getDefaultToolkit().getImage(Calculadora.class.getResource("/img/Icono.png")));
		frmColores.getContentPane().setLayout(null);

		redrojo = new JRadioButton("rojo");
		redrojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiarColor();
			}
		});
		redrojo.setBounds(6, 46, 128, 23);
		frmColores.getContentPane().add(redrojo);

		redverde = new JRadioButton("verde");
		redverde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiarColor();
			}
		});
		redverde.setBounds(6, 85, 128, 23);
		frmColores.getContentPane().add(redverde);

		radazul = new JRadioButton("azul");
		radazul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiarColor();
			}
		});
		radazul.setBounds(6, 128, 109, 23);
		frmColores.getContentPane().add(radazul);

		lblColor = new JLabel("");
		lblColor.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblColor.setOpaque(true);
		lblColor.setBounds(151, 50, 261, 112);
		frmColores.getContentPane().add(lblColor);
		radCyan = new JRadioButton("Cyan");
		radCyan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiarColor();
			}
		});
		radCyan.setBounds(6, 167, 109, 23);
		frmColores.getContentPane().add(radCyan);
	}
}