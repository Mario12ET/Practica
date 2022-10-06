package Practicas;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AreaTriangulo {

	public JFrame frame;
	private JTextField txtBase;
	private JTextField txtAltura;
	private JTextField txtArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaTriangulo window = new AreaTriangulo();
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
	public AreaTriangulo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setTitle("AreaTriangulo");
		frame.setLocationRelativeTo(null);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(AreaTriangulo.class.getResource("/img/Icono.png")));
		frame.getContentPane().setLayout(null);
		
		JLabel lblBase = new JLabel("BASE");
		lblBase.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblBase.setBounds(10, 11, 87, 22);
		frame.getContentPane().add(lblBase);
		
		JLabel lblAltura = new JLabel("ALTURA");
		lblAltura.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblAltura.setBounds(10, 52, 87, 22);
		frame.getContentPane().add(lblAltura);
		
		JLabel lblArea = new JLabel("AREA");
		lblArea.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblArea.setBounds(10, 85, 87, 22);
		frame.getContentPane().add(lblArea);
		
		txtBase = new JTextField();
		txtBase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		txtBase.setBounds(134, 11, 86, 20);
		frame.getContentPane().add(txtBase);
		txtBase.setColumns(10);
		
		txtAltura = new JTextField();
		txtAltura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtAltura.setBounds(134, 52, 86, 20);
		frame.getContentPane().add(txtAltura);
		txtAltura.setColumns(10);
		
		txtArea = new JTextField();
		txtArea.setEditable(false);
		txtArea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtArea.setBounds(134, 85, 86, 20);
		frame.getContentPane().add(txtArea);
		txtArea.setColumns(10);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double base=Double.parseDouble(txtBase.getText());
				double altura=Double.parseDouble(txtAltura.getText());
				txtArea.setText(String.valueOf(base*altura/2));
			}
		});
		btnCalcular.setBounds(35, 145, 89, 23);
		frame.getContentPane().add(btnCalcular);
		
		JButton btnBorrar = new JButton("BORRAR");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtBase.setText("");
				txtAltura.setText("");
				txtArea.setText("");
			}
		});
		btnBorrar.setBounds(144, 145, 89, 23);
		frame.getContentPane().add(btnBorrar);
	}
}
