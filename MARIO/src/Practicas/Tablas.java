package Practicas;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tablas {

	public JFrame frame;
	private JTextArea txtTablas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tablas window = new Tablas();
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
	public Tablas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame =   new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setTitle("TABLAS DE MULTIPLICAR");
		frame.setLocationRelativeTo(null);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Tablas.class.getResource("/img/Icono.png")));
		frame.getContentPane().setLayout(null);
		
		JSpinner spnTablas = new JSpinner();
		spnTablas.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int numero=Integer.parseInt(spnTablas.getValue().toString());
				String tabla="";
				for(int i=1;i<=10;i++) {
					tabla+=numero+" X "+i+" = "+(numero*i)+"\n";
				}
			txtTablas.setText(tabla);
			}
		});
		spnTablas.setBounds(154, 11, 71, 20);
		frame.getContentPane().add(spnTablas);
		
		txtTablas = new JTextArea();
		txtTablas.setEditable(false);
		txtTablas.setBounds(61, 85, 268, 165);
		frame.getContentPane().add(txtTablas);
		
		JButton btnNewButton = new JButton("BORRAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				spnTablas.setValue(1);
				txtTablas.setText("");
			}
		});
		btnNewButton.setBounds(339, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
