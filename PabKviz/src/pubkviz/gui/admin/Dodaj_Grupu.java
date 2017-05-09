package pubkviz.gui.admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import pubkviz.gui.GUIKontroler;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.RenderingHints;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Dodaj_Grupu extends JDialog {

	private JPanel contentPane;
	private JLabel lblUnesiteImeGrupe;
	private JPanel panel;
	private JTextField txtUnesiteImeGrupe;
	private JPanel panel_1;
	private JLabel lblIzaberiteBrojClanova;
	private JPanel panel_2;
	private JComboBox cbxIzaberiteBrojClanova;
	private JButton btnSacuvaj;
	private JButton btnOdustani;
	private JLabel lblime;
	private JLabel lblime_3;
	private JLabel lblime_2;
	private JLabel lblime_4;
	private JLabel lblime_5;
	private JTextField txtIme;
	private JTextField txtIme_2;
	private JTextField txtIme_3;
	private JTextField txtIme_4;
	private JTextField txtIme_5;
	private JLabel lblprezime;
	private JLabel lblprezime_3;
	private JLabel lblprezime_2;
	private JLabel lblprezime_4;
	private JLabel lblprezime_5;
	private JTextField txtPrezime;
	private JTextField txtPrezime_2;
	private JTextField txtPrezime_3;
	private JTextField txtPrezime4;
	private JTextField txtPrezime_5;


	/**
	 * Create the frame.
	 */
	public Dodaj_Grupu() {
		setModal(true);
		setTitle("Dodaj grupu");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 423, 495);
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
			lblUnesiteImeGrupe.setFont(new Font("Calibri", Font.BOLD, 16));
		}
		return lblUnesiteImeGrupe;
	}
	public JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(new BorderLayout(0, 0));
			panel.add(getTxtUnesiteImeGrupe(), BorderLayout.NORTH);
			panel.add(getPanel_1(), BorderLayout.CENTER);
		}
		return panel;
	}
	public JTextField getTxtUnesiteImeGrupe() {
		if (txtUnesiteImeGrupe == null) {
			txtUnesiteImeGrupe = new JTextField();
			txtUnesiteImeGrupe.setText("");
			txtUnesiteImeGrupe.setColumns(10);
		}
		return txtUnesiteImeGrupe;
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
			lblIzaberiteBrojClanova.setFont(new Font("Calibri", Font.BOLD, 16));
		}
		return lblIzaberiteBrojClanova;
	}
	public JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setLayout(null);
			panel_2.setBackground(Color.WHITE);
			panel_2.add(getCbxIzaberiteBrojClanova());
			panel_2.add(getBtnOdustani());
			panel_2.add(getBtnSacuvaj());
			panel_2.add(getLblime());
			panel_2.add(getLblime_3());
			panel_2.add(getLblime_2());
			panel_2.add(getLblime_4());
			panel_2.add(getLblime_5());
			panel_2.add(getTxtIme());
			panel_2.add(getTxtIme_2());
			panel_2.add(getTxtIme_3());
			panel_2.add(getTxtIme_4());
			panel_2.add(getTxtIme_5());
			panel_2.add(getLblprezime());
			panel_2.add(getLblprezime_3());
			panel_2.add(getLblprezime_2());
			panel_2.add(getLblprezime_4());
			panel_2.add(getLblprezime_5());
			panel_2.add(getTxtPrezime());
			panel_2.add(getTxtPrezime_2());
			panel_2.add(getTxtPrezime_3());
			panel_2.add(getTxtPrezime4());
			panel_2.add(getTxtPrezime_5());
		}
		return panel_2;
	}
	public JComboBox getCbxIzaberiteBrojClanova() {
		if (cbxIzaberiteBrojClanova == null) {
			cbxIzaberiteBrojClanova = new JComboBox();
			cbxIzaberiteBrojClanova.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent arg0) {
					
					GUIKontroler.izaberiBrojClanova();
				}
			});
			cbxIzaberiteBrojClanova.setBackground(new Color(255,255,255));
			cbxIzaberiteBrojClanova.setModel(new DefaultComboBoxModel(new String[] {"5", "4", "3", "2"}));
			cbxIzaberiteBrojClanova.setBounds(0, 11, 53, 27);
		}
		return cbxIzaberiteBrojClanova;
	}
	public JButton getBtnSacuvaj() {
		if (btnSacuvaj == null) {
			btnSacuvaj = new JButton("Sacuvaj");
			btnSacuvaj.setBounds(0, 362, 89, 23);
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
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setBounds(317, 362, 89, 23);
			
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
	public JLabel getLblime() {
		if (lblime == null) {
			lblime = new JLabel("1.Ime");
			lblime.setBounds(0, 59, 46, 14);
		}
		return lblime;
	}
	public JLabel getLblime_3() {
		if (lblime_3 == null) {
			lblime_3 = new JLabel("3.Ime");
			lblime_3.setBounds(0, 171, 46, 14);
		}
		return lblime_3;
	}
	public JLabel getLblime_2() {
		if (lblime_2 == null) {
			lblime_2 = new JLabel("2.Ime");
			lblime_2.setBounds(0, 115, 46, 14);
		}
		return lblime_2;
	}
	public JLabel getLblime_4() {
		if (lblime_4 == null) {
			lblime_4 = new JLabel("4.Ime");
			lblime_4.setBounds(0, 227, 46, 14);
		}
		return lblime_4;
	}
	public JLabel getLblime_5() {
		if (lblime_5 == null) {
			lblime_5 = new JLabel("5.Ime");
			lblime_5.setBounds(0, 283, 46, 14);
		}
		return lblime_5;
	}
	public JTextField getTxtIme() {
		if (txtIme == null) {
			txtIme = new JTextField();
			txtIme.setBounds(0, 84, 196, 20);
			txtIme.setColumns(10);
		}
		return txtIme;
	}
	public JTextField getTxtIme_2() {
		if (txtIme_2 == null) {
			txtIme_2 = new JTextField();
			txtIme_2.setBounds(0, 140, 196, 20);
			txtIme_2.setColumns(10);
		}
		return txtIme_2;
	}
	public JTextField getTxtIme_3() {
		if (txtIme_3 == null) {
			txtIme_3 = new JTextField();
			txtIme_3.setColumns(10);
			txtIme_3.setBounds(0, 196, 196, 20);
		}
		return txtIme_3;
	}
	public JTextField getTxtIme_4() {
		if (txtIme_4 == null) {
			txtIme_4 = new JTextField();
			txtIme_4.setBounds(0, 252, 196, 20);
			txtIme_4.setColumns(10);
		}
		return txtIme_4;
	}
	public JTextField getTxtIme_5() {
		if (txtIme_5 == null) {
			txtIme_5 = new JTextField();
			txtIme_5.setBounds(0, 308, 196, 20);
			txtIme_5.setColumns(10);
		}
		return txtIme_5;
	}
	public JLabel getLblprezime() {
		if (lblprezime == null) {
			lblprezime = new JLabel("1.Prezime");
			lblprezime.setBounds(210, 59, 79, 14);
		}
		return lblprezime;
	}
	public JLabel getLblprezime_3() {
		if (lblprezime_3 == null) {
			lblprezime_3 = new JLabel("3.Prezime");
			lblprezime_3.setBounds(210, 171, 79, 14);
		}
		return lblprezime_3;
	}
	public JLabel getLblprezime_2() {
		if (lblprezime_2 == null) {
			lblprezime_2 = new JLabel("2.Prezime");
			lblprezime_2.setBounds(210, 115, 79, 14);
		}
		return lblprezime_2;
	}
	public JLabel getLblprezime_4() {
		if (lblprezime_4 == null) {
			lblprezime_4 = new JLabel("4.Prezime");
			lblprezime_4.setBounds(210, 227, 79, 14);
		}
		return lblprezime_4;
	}
	public JLabel getLblprezime_5() {
		if (lblprezime_5 == null) {
			lblprezime_5 = new JLabel("5.Prezime");
			lblprezime_5.setBounds(210, 283, 79, 14);
		}
		return lblprezime_5;
	}
	public JTextField getTxtPrezime() {
		if (txtPrezime == null) {
			txtPrezime = new JTextField();
			txtPrezime.setColumns(10);
			txtPrezime.setBounds(210, 84, 196, 20);
		}
		return txtPrezime;
	}
	public JTextField getTxtPrezime_2() {
		if (txtPrezime_2 == null) {
			txtPrezime_2 = new JTextField();
			txtPrezime_2.setColumns(10);
			txtPrezime_2.setBounds(210, 140, 196, 20);
		}
		return txtPrezime_2;
	}
	public JTextField getTxtPrezime_3() {
		if (txtPrezime_3 == null) {
			txtPrezime_3 = new JTextField();
			txtPrezime_3.setColumns(10);
			txtPrezime_3.setBounds(210, 196, 196, 20);
		}
		return txtPrezime_3;
	}
	public JTextField getTxtPrezime4() {
		if (txtPrezime4 == null) {
			txtPrezime4 = new JTextField();
			txtPrezime4.setColumns(10);
			txtPrezime4.setBounds(210, 252, 196, 20);
		}
		return txtPrezime4;
	}
	public JTextField getTxtPrezime_5() {
		if (txtPrezime_5 == null) {
			txtPrezime_5 = new JTextField();
			txtPrezime_5.setColumns(10);
			txtPrezime_5.setBounds(210, 308, 196, 20);
		}
		return txtPrezime_5;
	}
}
