package Practicas;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class idiomaF {

	private JFrame frame;
	private JTextArea txtTraduccion;
	private JTextArea txtTexto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					idiomaF window = new idiomaF();
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
	public idiomaF() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(idiomaF.class.getResource("/img/Icono.png")));
		frame.setTitle("IDIOMA DE LA F");
		
		JLabel lblNewLabel = new JLabel("Idioma De La F");
		lblNewLabel.setBorder(null);
		lblNewLabel.setBounds(147, 0, 172, 28);
		frame.getContentPane().add(lblNewLabel);
		
		txtTexto = new JTextArea();
		txtTexto.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String texto=txtTexto.getText()	.toString()	;
				texto=texto.replace("a","afa");
				texto=texto.replace("e","efe");
				texto=texto.replace("i","ifi");
				texto=texto.replace("o","ofo");
				texto=texto.replace("u","ufu");
				texto=texto.replace("A","AFA");
				texto=texto.replace("E","EFE");
				texto=texto.replace("I","IFI");
				texto=texto.replace("O","OFO");
				texto=texto.replace("U","UFU");
				txtTraduccion.setText(texto);
				
			}
		});
		txtTexto.setBounds(0, 49, 194, 171);
		frame.getContentPane().add(txtTexto);
		
		txtTraduccion = new JTextArea();
		txtTraduccion.setEditable(false);
		txtTraduccion.setBounds(230, 49, 194, 171);
		frame.getContentPane().add(txtTraduccion);
		
		JButton btnNewButton = new JButton("BORRAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTraduccion.setText("");
				txtTexto.setText("");
			}
		});
		btnNewButton.setBounds(123, 231, 159, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
