package Practicas;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Signo {

	private static final String RAWTYPES = "rawtypes";
	public JFrame frame;
	@SuppressWarnings("rawtypes")
	private JComboBox cboMes;
	@SuppressWarnings("rawtypes")
	private JComboBox cboDia;
	private JLabel lblFecha;
	private JLabel lblSigno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signo window = new Signo();
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
	public Signo() {
		initialize();
		CalcularSigno();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void CalcularSigno() {
		int dia=Integer.parseInt(cboDia.getSelectedItem().toString());
		String mes=cboMes.getSelectedItem().toString();
		lblFecha.setText(dia + " de "+mes);				
		
		Image capricornio=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/capricornio.JPG"));
		Image aries=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/aries.JPG"));
		Image piscis=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/pisis.JPG"));
		Image acuario=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/aries.JPG"));
		Image tauro=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/tauro.JPG"));
		Image geminis=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/geminis.jpg"));
		Image cancer=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/cancer.JPG"));
		Image leo=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/leo.JPG"));
		Image virgo=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/virgo.JPG"));
		Image libra=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/libra.JPG"));
		Image escorpio=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/escorpio.jpg"));
		Image sagitario=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/sagitario.JPG"));
		
		
		int ancho = lblSigno.getWidth();
		int alto = lblSigno.getWidth();
		
		switch(mes) {
		
		case "ENERO":
			if(dia<=21) {
				lblSigno.setIcon(new ImageIcon(capricornio.getScaledInstance(ancho,alto,Image.SCALE_SMOOTH)));
			}else {
				lblSigno.setIcon(new ImageIcon(acuario.getScaledInstance(ancho,alto,Image.SCALE_SMOOTH)));
			}
			break;
		case "FEBRERO":
			if(dia<=21) {
				lblSigno.setIcon(new ImageIcon(acuario.getScaledInstance(ancho,alto,Image.SCALE_SMOOTH)));
			}else {
				lblSigno.setIcon(new ImageIcon(piscis.getScaledInstance(ancho,alto,Image.SCALE_SMOOTH)));
			}
			break;
		case "ABRIL":
			if(dia<=22) {
				lblSigno.setIcon(new ImageIcon(piscis.getScaledInstance(ancho,alto,Image.SCALE_SMOOTH)));
			}else {
				lblSigno.setIcon(new ImageIcon(aries.getScaledInstance(ancho,alto,Image.SCALE_SMOOTH)));
			}
			break;
		case "MARZO":
			if(dia<=24) {
				lblSigno.setIcon((Icon)new ImageIcon(aries.getScaledInstance(ancho,alto,Image.SCALE_SMOOTH)));
			}else {
				lblSigno.setIcon((Icon)new ImageIcon(tauro.getScaledInstance(ancho,alto,Image.SCALE_SMOOTH)));
			}
			break;
		case "MAYO":
			if(dia<=20) {
				lblSigno.setIcon(new ImageIcon(tauro.getScaledInstance(ancho,alto,Image.SCALE_SMOOTH)));
			}else {
				lblSigno.setIcon(new ImageIcon(geminis.getScaledInstance(ancho,alto,Image.SCALE_SMOOTH)));
			}
			break;
		case "JUNIO":
			if(dia<=23) {
				lblSigno.setIcon(new ImageIcon(geminis.getScaledInstance(ancho,alto,Image.SCALE_SMOOTH)));
			}else {
				lblSigno.setIcon(new ImageIcon(cancer.getScaledInstance(ancho,alto,Image.SCALE_SMOOTH)));
			}
			break;
		case "JULIO":
			if(dia<=22) {
				lblSigno.setIcon(new ImageIcon(cancer.getScaledInstance(ancho,alto,Image.SCALE_SMOOTH)));
			}else {
				lblSigno.setIcon(new ImageIcon(leo.getScaledInstance(ancho,alto,Image.SCALE_SMOOTH)));
			}
			break;
		case "AGOSTO":
			if(dia<=22) {
				lblSigno.setIcon(new ImageIcon(leo.getScaledInstance(ancho,alto,Image.SCALE_SMOOTH)));
			}else {
				lblSigno.setIcon(new ImageIcon(virgo.getScaledInstance(ancho,alto,Image.SCALE_SMOOTH)));
			}
			break;
		case "SEPTIEMBRE":
			if(dia<=24) {
				lblSigno.setIcon(new ImageIcon(virgo.getScaledInstance(ancho,alto,Image.SCALE_SMOOTH)));
			}else {
				lblSigno.setIcon(new ImageIcon(libra.getScaledInstance(ancho,alto,Image.SCALE_SMOOTH)));
			}
			break;
		case "OCTUBRE":
			if(dia<=23) {
				lblSigno.setIcon(new ImageIcon(libra.getScaledInstance(ancho,alto,Image.SCALE_SMOOTH)));
			}else {
				lblSigno.setIcon(new ImageIcon(escorpio.getScaledInstance(ancho,alto,Image.SCALE_SMOOTH)));
			}
			break;
		case "NOVIEMBRE":
			if(dia<=23) {
				lblSigno.setIcon(new ImageIcon(escorpio.getScaledInstance(ancho,alto,Image.SCALE_SMOOTH)));
			}else {
				lblSigno.setIcon(new ImageIcon(sagitario.getScaledInstance(ancho,alto,Image.SCALE_SMOOTH)));
			}
			break;
		case "DICIEMBRE":
			if(dia<=22) {
				lblSigno.setIcon(new ImageIcon(sagitario.getScaledInstance(ancho,alto,Image.SCALE_SMOOTH)));
			}else {
				lblSigno.setIcon(new ImageIcon(capricornio.getScaledInstance(ancho,alto,Image.SCALE_SMOOTH)));
			}
		}
	}	

	@SuppressWarnings({ "unchecked", RAWTYPES })
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);	
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Calculadora.class.getResource("/img/Icono.png")));
		frame.setTitle("Zodiaco");
		
		JLabel w = new JLabel("Dia");
		w.setBounds(10, 11, 31, 22);
		frame.getContentPane().add(w);
		
		JLabel lblNewLabel = new JLabel("Mes");
		lblNewLabel.setBounds(10, 44, 31, 17);
		frame.getContentPane().add(lblNewLabel);
		
		cboDia = new JComboBox();
		cboDia.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				CalcularSigno();
			}
		}
);
		cboDia.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		cboDia.setBounds(51, 11, 116, 22);
		frame.getContentPane().add(cboDia);
		
		cboMes = new JComboBox();
		cboMes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				CalcularSigno();
			}
		});
		cboMes.setModel(new DefaultComboBoxModel(new String[] {"ENERO", "FEBREO", "ABRIL", "MARZO", "MAYO ", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE ", "OCTUBRE ", "NOVIEMBRE", "DICIEMBRE"}));
		cboMes.setBounds(51, 44, 116, 22);
		frame.getContentPane().add(cboMes);
		lblFecha = new JLabel("Fecha: ");
		lblFecha.setBounds(200, -1, 116, 46);
		frame.getContentPane().add(lblFecha);
		
		lblSigno = new JLabel("");
		lblSigno.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblSigno.setBounds(0, 83, 434, 178);
		frame.getContentPane().add(lblSigno);
	}
		}

