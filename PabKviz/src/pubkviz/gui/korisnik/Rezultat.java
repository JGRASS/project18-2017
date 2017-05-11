package pubkviz.gui.korisnik;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import pubkviz.gui.GUIKontroler;

import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JProgressBar;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Component;
import java.awt.Dialog.ModalityType;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.border.MatteBorder;

public class Rezultat extends JDialog {

	private JPanel contentPane;
	private JButton btnIzadji;
	private JPanel panel_1;
	private JProgressBar progressBar;
	private JPanel panel_2;
	private JLabel lblCestitamo;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the frame.
	 */
	public Rezultat() {
		setModal(true);
		setTitle("Rezultat");
		setResizable(false);
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 330, 168);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanel_2(), BorderLayout.CENTER);
	}

	public JButton getBtnIzadji() {
		if (btnIzadji == null) {
			btnIzadji = new JButton("Ok");
			btnIzadji.setBounds(90, 93, 125, 25);
			btnIzadji.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.zatvoriKviz();
					dispose();
				}
			});
			btnIzadji.setPreferredSize(new Dimension(125, 25));
			btnIzadji.setFont(new Font("Verdana", Font.BOLD, 11));
			btnIzadji.setFocusPainted(false);
			btnIzadji.setBorderPainted(false);
			btnIzadji.setBackground(Color.WHITE);
			btnIzadji.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					btnIzadji.setBackground(new Color(124,252,0));
				}

				@Override
				public void mouseExited(MouseEvent e) {
					btnIzadji.setBackground(Color.WHITE);
				}
			});

		}
		return btnIzadji;
	}

	public JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setBackground(Color.WHITE);
			panel_2.setLayout(null);
			panel_2.add(getBtnIzadji());
			panel_2.add(getLblCestitamo());
			panel_2.add(getTextField());
			panel_2.add(getTextField_1());
		}
		return panel_2;
	}
	public JLabel getLblCestitamo() {
		if (lblCestitamo == null) {
			lblCestitamo = new JLabel("Broj osvojenih bodova:");
			lblCestitamo.setBounds(10, 11, 139, 14);
		}
		return lblCestitamo;
	}
	public JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBorder(null);
			textField.setFocusable(false);
			textField.setBackground(Color.WHITE);
			textField.setEditable(false);
			textField.setBounds(159, 8, 32, 20);
			textField.setColumns(10);
		}
		return textField;
	}
	public JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBackground(Color.WHITE);
			textField_1.setEditable(false);
			textField_1.setFocusable(false);
			textField_1.setForeground(Color.BLACK);
			textField_1.setFont(new Font("Verdana", Font.PLAIN, 12));
			textField_1.setColumns(10);
			textField_1.setBorder(null);
			textField_1.setBounds(10, 62, 294, 20);
		}
		return textField_1;
	}
}
