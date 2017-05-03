package pubkviz.gui.korisnik;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.RenderingHints;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
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

public class Registracija_Grupe extends JFrame {

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
	private JLabel lblime_4;
	private JLabel lblime_2;
	private JLabel lblime_1;
	private JTextField txtIme_1;
	private JTextField textIme_2;
	private JTextField textIme_3;
	private JTextField textIme_4;
	private JTextField textIme_5;
	private JLabel lblprezime;
	private JLabel lblprezime_2;
	private JLabel lblprezime_1;
	private JLabel lblprezime_3;
	private JLabel lblprezime_4;
	private JTextField textPrezime_1;
	private JTextField textPrezime_2;
	private JTextField textPrezime_3;
	private JTextField textPrezime_4;
	private JTextField textPrezime_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registracija_Grupe frame = new Registracija_Grupe();
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
	public Registracija_Grupe() {
		setTitle("Registruji Grupu");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 423, 495);
		contentPane = new JPanel(){
	        @Override
	        protected void paintComponent(Graphics grphcs) {
	            super.paintComponent(grphcs);
	            Graphics2D g2d = (Graphics2D) grphcs;
	            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
	                    RenderingHints.VALUE_ANTIALIAS_ON);
	            GradientPaint gp = new GradientPaint(0, 340,
						getBackground().brighter().brighter(), 1000, getHeight(),
	                    getBackground().darker());
	            g2d.setPaint(gp);
	            g2d.fillRect( 0,0,getWidth(),  getHeight()); 

	        }

	    };
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
			panel_2.add(getLblime_4());
			panel_2.add(getLblime_2());
			panel_2.add(getLblime_1());
			panel_2.add(getTxtIme_1());
			panel_2.add(getTextIme_2());
			panel_2.add(getTextIme_3());
			panel_2.add(getTextIme_4());
			panel_2.add(getTextIme_5());
			panel_2.add(getLblprezime());
			panel_2.add(getLblprezime_2());
			panel_2.add(getLblprezime_1());
			panel_2.add(getLblprezime_3());
			panel_2.add(getLblprezime_4());
			panel_2.add(getTextPrezime_1());
			panel_2.add(getTextPrezime_2());
			panel_2.add(getTextPrezime_3());
			panel_2.add(getTextPrezime_4());
			panel_2.add(getTextPrezime_5());
		}
		return panel_2;
	}
	public JComboBox getCbxIzaberiteBrojClanova() {
		if (cbxIzaberiteBrojClanova == null) {
			cbxIzaberiteBrojClanova = new JComboBox();
			cbxIzaberiteBrojClanova.setBackground(new Color(255,255,255));
			cbxIzaberiteBrojClanova.setModel(new DefaultComboBoxModel(new String[] {"2", "3", "4", "5"}));
			cbxIzaberiteBrojClanova.setBounds(0, 11, 53, 27);
		}
		return cbxIzaberiteBrojClanova;
	}
	public JButton getBtnSacuvaj() {
		if (btnSacuvaj == null) {
			btnSacuvaj = new JButton("Sacuvaj");
			btnSacuvaj.setEnabled(false);
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
	public JLabel getLblime_4() {
		if (lblime_4 == null) {
			lblime_4 = new JLabel("2.Ime");
			lblime_4.setBounds(0, 115, 46, 14);
		}
		return lblime_4;
	}
	public JLabel getLblime_2() {
		if (lblime_2 == null) {
			lblime_2 = new JLabel("4.Ime");
			lblime_2.setBounds(0, 227, 46, 14);
		}
		return lblime_2;
	}
	public JLabel getLblime_1() {
		if (lblime_1 == null) {
			lblime_1 = new JLabel("5.Ime");
			lblime_1.setBounds(0, 283, 46, 14);
		}
		return lblime_1;
	}
	public JTextField getTxtIme_1() {
		if (txtIme_1 == null) {
			txtIme_1 = new JTextField();
			txtIme_1.setBounds(0, 84, 196, 20);
			txtIme_1.setColumns(10);
		}
		return txtIme_1;
	}
	public JTextField getTextIme_2() {
		if (textIme_2 == null) {
			textIme_2 = new JTextField();
			textIme_2.setBounds(0, 140, 196, 20);
			textIme_2.setColumns(10);
		}
		return textIme_2;
	}
	public JTextField getTextIme_3() {
		if (textIme_3 == null) {
			textIme_3 = new JTextField();
			textIme_3.setColumns(10);
			textIme_3.setBounds(0, 196, 196, 20);
		}
		return textIme_3;
	}
	public JTextField getTextIme_4() {
		if (textIme_4 == null) {
			textIme_4 = new JTextField();
			textIme_4.setBounds(0, 252, 196, 20);
			textIme_4.setColumns(10);
		}
		return textIme_4;
	}
	public JTextField getTextIme_5() {
		if (textIme_5 == null) {
			textIme_5 = new JTextField();
			textIme_5.setBounds(0, 308, 196, 20);
			textIme_5.setColumns(10);
		}
		return textIme_5;
	}
	public JLabel getLblprezime() {
		if (lblprezime == null) {
			lblprezime = new JLabel("1.Prezime");
			lblprezime.setBounds(210, 59, 79, 14);
		}
		return lblprezime;
	}
	public JLabel getLblprezime_2() {
		if (lblprezime_2 == null) {
			lblprezime_2 = new JLabel("3.Prezime");
			lblprezime_2.setBounds(210, 171, 79, 14);
		}
		return lblprezime_2;
	}
	public JLabel getLblprezime_1() {
		if (lblprezime_1 == null) {
			lblprezime_1 = new JLabel("2.Prezime");
			lblprezime_1.setBounds(210, 115, 79, 14);
		}
		return lblprezime_1;
	}
	public JLabel getLblprezime_3() {
		if (lblprezime_3 == null) {
			lblprezime_3 = new JLabel("4.Prezime");
			lblprezime_3.setBounds(210, 227, 79, 14);
		}
		return lblprezime_3;
	}
	public JLabel getLblprezime_4() {
		if (lblprezime_4 == null) {
			lblprezime_4 = new JLabel("5.Prezime");
			lblprezime_4.setBounds(210, 283, 79, 14);
		}
		return lblprezime_4;
	}
	public JTextField getTextPrezime_1() {
		if (textPrezime_1 == null) {
			textPrezime_1 = new JTextField();
			textPrezime_1.setColumns(10);
			textPrezime_1.setBounds(210, 84, 196, 20);
		}
		return textPrezime_1;
	}
	public JTextField getTextPrezime_2() {
		if (textPrezime_2 == null) {
			textPrezime_2 = new JTextField();
			textPrezime_2.setColumns(10);
			textPrezime_2.setBounds(210, 140, 196, 20);
		}
		return textPrezime_2;
	}
	public JTextField getTextPrezime_3() {
		if (textPrezime_3 == null) {
			textPrezime_3 = new JTextField();
			textPrezime_3.setColumns(10);
			textPrezime_3.setBounds(210, 196, 196, 20);
		}
		return textPrezime_3;
	}
	public JTextField getTextPrezime_4() {
		if (textPrezime_4 == null) {
			textPrezime_4 = new JTextField();
			textPrezime_4.setColumns(10);
			textPrezime_4.setBounds(210, 252, 196, 20);
		}
		return textPrezime_4;
	}
	public JTextField getTextPrezime_5() {
		if (textPrezime_5 == null) {
			textPrezime_5 = new JTextField();
			textPrezime_5.setColumns(10);
			textPrezime_5.setBounds(210, 308, 196, 20);
		}
		return textPrezime_5;
	}
}
