package Practicas;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu {

	private JFrame frame;
	private JButton btnCalculadora;
	private JButton btnArea;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
    Calculadora ca=new Calculadora();
    AreaTriangulo Area=new AreaTriangulo();
    Tablas T=new Tablas();
    Chicharronera CH=new Chicharronera();
    CECYTEM CECY=new CECYTEM();
    JOPTION JP=new JOPTION();
    COLORES CO=new COLORES();
    JComboBox jp=new JComboBox();
    
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setTitle("MENU");
		frame.setLocationRelativeTo(null);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Menu.class.getResource("/img/Icono.png")));
		frame.getContentPane().setLayout(null);
		
		btnCalculadora = new JButton("CALCULADORA");
		btnCalculadora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ca.frame.setVisible(true);
			}
		});
		btnCalculadora.setBounds(0, 11, 126, 23);
		frame.getContentPane().add(btnCalculadora);
		
		btnArea = new JButton("AREA TRIANGULO");
		btnArea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Area.frame.setVisible(true);			
			}
		});
		btnArea.setBounds(129, 11, 134, 23);
		frame.getContentPane().add(btnArea);
		
		btnNewButton = new JButton("CECYTEM");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CECY.frmChecbox.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(273, 11, 139, 23);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("JOPTION");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JP.frmJoption.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(0, 45, 126, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("TABLAS");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				T.frame.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(129, 45, 134, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("CHICHARRONERA");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CH.frmChicharronera.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(273, 45, 139, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("COLORES");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CO.frmColores.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(129, 79, 134, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnbox = new JButton("Mes y Dia");
		btnbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jp.frame.setVisible(true);
			}
		});
		btnbox.setBounds(0, 79, 126, 23);
		frame.getContentPane().add(btnbox);
	}
}