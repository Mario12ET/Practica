package Practicas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;

public class CECYTEM {

	public JFrame frmChecbox;
	private JCheckBox chkUniforme, chkCredencial, chkCubrebocas;
	JLabel lblQueTrae, lblCumple;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CECYTEM window = new CECYTEM();
					window.frmChecbox.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CECYTEM() {
		initialize();
	}

	public void checarAlumno() {
		String quetrae = "";
		if (chkUniforme.isSelected()) {
			quetrae += "Si uniforme";
		} else {
			quetrae += "NO uniforme";
		}
		if (chkCredencial.isSelected()) {
			quetrae += " Si Credencial";
		} else {
			quetrae += " NO Credencial";
		}
		if (chkCubrebocas.isSelected()) {
			quetrae += " Si Cubrebocas";
		} else {
			quetrae += " NO Cubrebocas";
		}
		lblQueTrae.setText(quetrae);
		if (chkUniforme.isSelected() && chkCredencial.isSelected() && chkCubrebocas.isSelected()) {
			lblCumple.setText("Si cumple y pasa");
		} else {
			lblCumple.setText("No cumple y no pasa");
		}

	}

	private void initialize() {
		frmChecbox = new JFrame();
		frmChecbox.setBounds(100, 100, 450, 300);
		frmChecbox.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmChecbox.setTitle("CECYTEM");
		frmChecbox.setLocationRelativeTo(null);
		frmChecbox.setIconImage(Toolkit.getDefaultToolkit().getImage(Calculadora.class.getResource("/img/Icono.png")));
		frmChecbox.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Rescrisitos para CECYTEM");
		lblNewLabel.setBounds(57, 28, 196, 14);
		frmChecbox.getContentPane().add(lblNewLabel);

		chkUniforme = new JCheckBox("Uniforme");
		chkUniforme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checarAlumno();
			}
		});
		chkUniforme.setBounds(34, 76, 97, 23);
		frmChecbox.getContentPane().add(chkUniforme);

		chkCredencial = new JCheckBox("Credencial");
		chkCredencial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checarAlumno();
			}
		});
		chkCredencial.setBounds(34, 119, 97, 23);
		frmChecbox.getContentPane().add(chkCredencial);

		chkCubrebocas = new JCheckBox("cubrebocas");
		chkCubrebocas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checarAlumno();
			}
		});
		chkCubrebocas.setBounds(34, 165, 97, 23);
		frmChecbox.getContentPane().add(chkCubrebocas);

		lblQueTrae = new JLabel("");
		lblQueTrae.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblQueTrae.setBackground(Color.RED);
		lblQueTrae.setBounds(10, 195, 414, 30);
		frmChecbox.getContentPane().add(lblQueTrae);

		lblCumple = new JLabel("");
		lblCumple.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblCumple.setBackground(Color.RED);
		lblCumple.setBounds(99, 236, 218, 26);
		frmChecbox.getContentPane().add(lblCumple);
	}
}