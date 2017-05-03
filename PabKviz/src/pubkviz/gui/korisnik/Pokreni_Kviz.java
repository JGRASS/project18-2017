package pubkviz.gui.korisnik;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JScrollPane;

public class Pokreni_Kviz extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblPitanjegornje;
	private JTextArea textArea;
	private JLabel lblNewLabel;
	private JTextPane textPane;
	private JLabel lblPitanjedonje;
	private JLabel label_1;
	private JTextPane textPane_1;
	private JButton btnSledecaStrana;
	private JButton btnPrethodnaStrana;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JTextArea textArea_1;
	private JLabel lblPitanjesrednje;
	private JScrollPane scrollPane_2;
	private JLabel label;
	private JTextPane textPane_2;
	private JTextArea textArea_2;


	/**
	 * Create the frame.
	 */
	public Pokreni_Kviz() {
		setResizable(false);
		setTitle("Pokreni kviz");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 536);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanel(), BorderLayout.CENTER);
	}

	public JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(Color.LIGHT_GRAY);
			panel.setLayout(null);
			panel.add(getLblPitanjegornje());
			panel.add(getLblNewLabel());
			panel.add(getTextPane());
			panel.add(getLblPitanjedonje());
			panel.add(getLabel_1());
			panel.add(getTextPane_1());
			panel.add(getBtnSledecaStrana());
			panel.add(getBtnPrethodnaStrana());
			panel.add(getScrollPane());
			panel.add(getScrollPane_1());
			panel.add(getLblPitanjesrednje());
			panel.add(getScrollPane_2());
			panel.add(getLabel_2());
			panel.add(getTextPane_2());
		}
		return panel;
	}
	public JLabel getLblPitanjegornje() {
		if (lblPitanjegornje == null) {
			lblPitanjegornje = new JLabel("PitanjeGornje");
			lblPitanjegornje.setBounds(10, 11, 156, 21);
		}
		return lblPitanjegornje;
	}
	public JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setEditable(false);
		}
		return textArea;
	}
	public JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Odgovor");
			lblNewLabel.setBounds(10, 113, 46, 14);
		}
		return lblNewLabel;
	}
	public JTextPane getTextPane() {
		if (textPane == null) {
			textPane = new JTextPane();
			textPane.setBounds(10, 138, 412, 14);
		}
		return textPane;
	}
	public JLabel getLblPitanjedonje() {
		if (lblPitanjedonje == null) {
			lblPitanjedonje = new JLabel("PitanjeDonje");
			lblPitanjedonje.setBounds(10, 311, 156, 21);
		}
		return lblPitanjedonje;
	}
	public JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("Odgovor");
			label_1.setBounds(10, 413, 46, 14);
		}
		return label_1;
	}
	public JTextPane getTextPane_1() {
		if (textPane_1 == null) {
			textPane_1 = new JTextPane();
			textPane_1.setBounds(10, 438, 412, 14);
		}
		return textPane_1;
	}
	public JButton getBtnSledecaStrana() {
		if (btnSledecaStrana == null) {
			btnSledecaStrana = new JButton("Sledeca strana");
			btnSledecaStrana.setBounds(310, 463, 112, 23);
		}
		return btnSledecaStrana;
	}
	public JButton getBtnPrethodnaStrana() {
		if (btnPrethodnaStrana == null) {
			btnPrethodnaStrana = new JButton("Prethodna strana");
			btnPrethodnaStrana.setBounds(10, 463, 134, 23);
		}
		return btnPrethodnaStrana;
	}
	public JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 43, 412, 59);
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}
	public JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(10, 343, 412, 59);
			scrollPane_1.setViewportView(getTextArea_1());
		}
		return scrollPane_1;
	}
	public JTextArea getTextArea_1() {
		if (textArea_1 == null) {
			textArea_1 = new JTextArea();
			textArea_1.setEditable(false);
		}
		return textArea_1;
	}
	public JLabel getLblPitanjesrednje() {
		if (lblPitanjesrednje == null) {
			lblPitanjesrednje = new JLabel("PitanjeSrednje");
			lblPitanjesrednje.setBounds(10, 163, 156, 21);
		}
		return lblPitanjesrednje;
	}
	public JScrollPane getScrollPane_2() {
		if (scrollPane_2 == null) {
			scrollPane_2 = new JScrollPane();
			scrollPane_2.setBounds(10, 195, 412, 59);
			scrollPane_2.setViewportView(getTextArea_2());
		}
		return scrollPane_2;
	}
	public JLabel getLabel_2() {
		if (label == null) {
			label = new JLabel("Odgovor");
			label.setBounds(10, 265, 46, 14);
		}
		return label;
	}
	public JTextPane getTextPane_2() {
		if (textPane_2 == null) {
			textPane_2 = new JTextPane();
			textPane_2.setBounds(10, 290, 412, 14);
		}
		return textPane_2;
	}
	public JTextArea getTextArea_2() {
		if (textArea_2 == null) {
			textArea_2 = new JTextArea();
		}
		return textArea_2;
	}
}
