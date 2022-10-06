package Practicas;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
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
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setTitle("CALCULADORA");
		frame.setLocationRelativeTo(null);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Calculadora.class.getResource("/img/Icono.png")));
		frame.getContentPane().setLayout(null);
		
		JLabel lblSuma = new JLabel("");
		lblSuma.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblSuma.setHorizontalAlignment(SwingConstants.TRAILING);
		lblSuma.setBounds(165, 11, 97, 19);
		frame.getContentPane().add(lblSuma);
		
		JLabel lblres = new JLabel("");
		lblres.setHorizontalAlignment(SwingConstants.TRAILING);
		lblres.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblres.setBounds(165, 41, 97, 22);
		frame.getContentPane().add(lblres);
		
		JLabel lblmul = new JLabel("");
		lblmul.setHorizontalAlignment(SwingConstants.TRAILING);
		lblmul.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblmul.setBounds(165, 74, 97, 22);
		frame.getContentPane().add(lblmul);
		
		JLabel lbldiv = new JLabel("");
		lbldiv.setHorizontalAlignment(SwingConstants.TRAILING);
		lbldiv.setBorder(new LineBorder(new Color(0, 0, 0)));
		lbldiv.setBounds(165, 107, 97, 22);
		frame.getContentPane().add(lbldiv);
		
		JLabel lblresi = new JLabel("");
		lblresi.setHorizontalAlignment(SwingConstants.TRAILING);
		lblresi.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblresi.setBounds(165, 140, 97, 23);
		frame.getContentPane().add(lblresi);
		
		JButton btnSuma = new JButton("SUMA");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero 1:"));
				int b = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero 2:"));
				int suma = a + b;
				JOptionPane.showMessageDialog(null,"La Suma: "+suma);
				lblSuma.setText("La Suma es: "+suma);
			}
		});
		btnSuma.setBounds(0, 11, 89, 23);
		frame.getContentPane().add(btnSuma);
		
		JButton btnres = new JButton("RESTA");
		btnres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero 1:"));
				int b = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero 2:"));
				int Resta = a - b;
				JOptionPane.showMessageDialog(null,"La Resta: "+Resta);
				lblres.setText("La Resta es: "+Resta);
			}
		});
		btnres.setBounds(0, 41, 89, 23);
		frame.getContentPane().add(btnres);
		
		JButton btnmul = new JButton("MULTIPLICACION");
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero 1:"));
				int b = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero 2:"));
				int Multiplicacion = a*b;
				JOptionPane.showMessageDialog(null,"La Multiplicacion: "+Multiplicacion);
				lblmul.setText("La Multiplicacion es: "+Multiplicacion);
			}
		});
		btnmul.setBounds(0, 71, 89, 23);
		frame.getContentPane().add(btnmul);
		
		JButton btndiv = new JButton("DIVISION");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero 1:"));
				int b = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero 2:"));
				int Division = a/b;
				JOptionPane.showMessageDialog(null,"La Division: "+Division);
				lbldiv.setText("La Division es: "+Division);
			}
		});
		btndiv.setBounds(0, 107, 89, 23);
		frame.getContentPane().add(btndiv);
		
		JButton btnresi = new JButton("RESIDUO");
		btnresi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero 1:"));
				int b = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero 2:"));
				int Residuo = a%b;
				JOptionPane.showMessageDialog(null,"El Residuo: "+Residuo);
				lblresi.setText("El Residuo: "+Residuo);
			}
		});
		btnresi.setBounds(0, 140, 89, 23);
		frame.getContentPane().add(btnresi);
		
		JButton btnBorrar = new JButton("BORRAR");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblSuma.setText("");
				lblres.setText("");
				lbldiv.setText("");
				lblmul.setText("");
				lblresi.setText("");
			}
		});
		btnBorrar.setBounds(120, 195, 126, 35);
		frame.getContentPane().add(btnBorrar);
	}

}
