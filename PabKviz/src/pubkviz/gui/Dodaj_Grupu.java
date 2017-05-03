package pubkviz.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Dodaj_Grupu extends JFrame {

	private JPanel contentPane;
	private JLabel lblUnesiteImeGrupe;
	private JPanel panel;
	private JTextField textField;
	private JPanel panel_1;
	private JLabel lblIzaberiteBrojClanova;
	private JPanel panel_2;
	private JComboBox comboBox;
	private JButton btnSacuvaj;
	private JButton btnOdustani;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dodaj_Grupu frame = new Dodaj_Grupu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Dodaj_Grupu() {
		setTitle("Dodaj grupu");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getLblUnesiteImeGrupe(), BorderLayout.NORTH);
		contentPane.add(getPanel(), BorderLayout.CENTER);
	}

	public JLabel getLblUnesiteImeGrupe() {
		if (lblUnesiteImeGrupe == null) {
			lblUnesiteImeGrupe = new JLabel("Unesite ime grupe");
			lblUnesiteImeGrupe.setFont(new Font("Calibri", Font.PLAIN, 16));
		}
		return lblUnesiteImeGrupe;
	}
	public JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(new BorderLayout(0, 0));
			panel.add(getTextField(), BorderLayout.NORTH);
			panel.add(getPanel_1(), BorderLayout.CENTER);
		}
		return panel;
	}
	public JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setText("");
			textField.setColumns(10);
		}
		return textField;
	}
	public JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBackground(Color.WHITE);
			panel_1.setLayout(new BorderLayout(0, 0));
			panel_1.add(getLblIzaberiteBrojClanova(), BorderLayout.NORTH);
			panel_1.add(getPanel_2(), BorderLayout.CENTER);
		}
		return panel_1;
	}
	public JLabel getLblIzaberiteBrojClanova() {
		if (lblIzaberiteBrojClanova == null) {
			lblIzaberiteBrojClanova = new JLabel("Izaberite broj clanova:");
			lblIzaberiteBrojClanova.setFont(new Font("Calibri", Font.PLAIN, 16));
		}
		return lblIzaberiteBrojClanova;
	}
	public JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setLayout(null);
			panel_2.setBackground(Color.WHITE);
			panel_2.add(getComboBox());
			panel_2.add(getBtnOdustani());
			panel_2.add(getTextArea());
			panel_2.add(getBtnSacuvaj());
		}
		return panel_2;
	}
	public JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBackground(new Color(255,255,255));
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"2", "3", "4", "5", "6", "7"}));
			comboBox.setBounds(0, 11, 53, 27);
		}
		return comboBox;
	}
	public JButton getBtnSacuvaj() {
		if (btnSacuvaj == null) {
			btnSacuvaj = new JButton("Sacuvaj");
			btnSacuvaj.setBounds(0, 157, 89, 23);
			btnSacuvaj.setFocusPainted(false);
			btnSacuvaj.setBorderPainted(false);
			btnSacuvaj.setBackground(Color.WHITE);
			
			btnSacuvaj.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					btnSacuvaj.setBackground(new Color(240, 248, 255));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					btnSacuvaj.setBackground(Color.WHITE);
				}
			});
			
		}
		return btnSacuvaj;
	}
	public JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.setBounds(345, 157, 89, 23);
			
			btnOdustani.setFocusPainted(false);
			btnOdustani.setBorderPainted(false);
			btnOdustani.setBackground(Color.WHITE);
			btnOdustani.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					btnOdustani.setBackground(new Color(240, 128, 125));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					btnOdustani.setBackground(Color.WHITE);
				}
			});
		
		}
		return btnOdustani;
	}
	public JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setEditable(false);
			textArea.setBounds(10, 49, 414, 97);
		}
		return textArea;
	}
}
