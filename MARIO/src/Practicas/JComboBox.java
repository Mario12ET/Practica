package Practicas;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JComboBox {

	public JFrame frame;
	@SuppressWarnings("rawtypes")
	private javax.swing.JComboBox cboDia;
	@SuppressWarnings("rawtypes")
	private javax.swing.JComboBox cboMes;
	private JLabel lblDia;
	private JLabel lblMes;
	private JLabel lblResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JComboBox window = new JComboBox();
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
	public JComboBox() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setTitle("JComboBOX");
		frame.setLocationRelativeTo(null);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Calculadora.class.getResource("/img/Icono.png")));
		frame.getContentPane().setLayout(null);
		
		lblDia = new JLabel("Dia");
		lblDia.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblDia.setBounds(38, 11, 75, 23);
		frame.getContentPane().add(lblDia);
		
		lblMes = new JLabel("Mes");
		lblMes.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblMes.setBounds(38, 45, 75, 23);
		frame.getContentPane().add(lblMes);
		
		cboDia = new javax.swing.JComboBox();
		cboDia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblResultado.setText(cboDia.getSelectedItem().toString());
			}
		});
		cboDia.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		cboDia.setBounds(123, 11, 119, 22);
		frame.getContentPane().add(cboDia);
		
		cboMes = new javax.swing.JComboBox();
		cboMes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblResultado.setText(cboDia.getSelectedItem().toString()+(" ")+cboMes.getSelectedItem().toString());
			}
		});
		cboMes.setModel(new DefaultComboBoxModel(new String[] {"ENERO", "FEBRERO", "MARZO ", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE ", "DICIEMBRE"}));
		cboMes.setBounds(123, 45, 119, 22);
		frame.getContentPane().add(cboMes);
		
		JLabel lblfecha = new JLabel("Fecha"); 
		lblfecha.setBounds(49, 121, 193, 14);
		frame.getContentPane().add(lblfecha);
		
		lblResultado = new JLabel("");
		lblResultado.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblResultado.setBounds(38, 146, 301, 104);
		frame.getContentPane().add(lblResultado);
	}
}
