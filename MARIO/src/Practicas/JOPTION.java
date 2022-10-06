package Practicas;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class JOPTION{

	public JFrame frmJoption;
	private JLabel lblDesicion;
	private JButton btnNewButton;
	private JLabel lblDes;
	private JButton btn1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JOPTION window = new JOPTION();
					window.frmJoption.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JOPTION() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJoption = new JFrame();
		frmJoption.setTitle("JOPTION");
		frmJoption.setBounds(100, 100, 450, 300);
		frmJoption.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmJoption.setIconImage(Toolkit.getDefaultToolkit().getImage(JOPTION.class.getResource("/img/Icono.png")));
		frmJoption.getContentPane().setLayout(null);
		frmJoption.setLocationRelativeTo(null);
		
		btn1 = new JButton("JOPTION1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"JOPTION DE MENSAJE");
			}
		});
		btn1.setBounds(10, 11, 89, 23);
		frmJoption.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("JOPTION2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input=JOptionPane.showInputDialog("INTRODUCE ALGO");
				System.out.println(""+input);
				lblDesicion.setText(input);
			}
		});
		btn2.setBounds(10, 60, 89, 23);
		frmJoption.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("JOPTION3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x=JOptionPane.showConfirmDialog(null,"SI O NO??");
				System.out.println(""+x);
				if(x==0)lblDes.setText("SI");
				if(x==1)lblDes.setText("NO");
				if(x==2)lblDes.setText("CANCELAR");
			}
		});
		btn3.setBounds(10, 107, 89, 23);
		frmJoption.getContentPane().add(btn3);
		
		lblDesicion = new JLabel("");
		lblDesicion.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblDesicion.setBounds(120, 60, 89, 23);
		frmJoption.getContentPane().add(lblDesicion);
		
		lblDes = new JLabel("");
		lblDes.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblDes.setBounds(120, 111, 89, 23);
		frmJoption.getContentPane().add(lblDes);
		
		btnNewButton = new JButton("BORRAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblDesicion.setText("");
				
				
			}
		});
		btnNewButton.setBounds(71, 162, 89, 23);
		frmJoption.getContentPane().add(btnNewButton);
	}
}
