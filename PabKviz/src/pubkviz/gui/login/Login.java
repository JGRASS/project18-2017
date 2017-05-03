package pubkviz.gui.login;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import pubkviz.gui.GUIKontroler;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JLabel lblKorisnickoIme;
	private JLabel lblLozinka;
	private JTextField textKorisnicko_Ime;
	private JButton btnPrijaviSe;
	private JButton btnRegistrujSe;
	private JPasswordField passwordField;



	/**
	 * Create the frame.
	 */
	public Login() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblKorisnickoIme());
		contentPane.add(getLblLozinka());
		contentPane.add(getTextKorisnicko_Ime());
		contentPane.add(getBtnPrijaviSe());
		contentPane.add(getBtnRegistrujSe());
		contentPane.add(getPasswordField());
	}
	public JLabel getLblKorisnickoIme() {
		if (lblKorisnickoIme == null) {
			lblKorisnickoIme = new JLabel("Korisnicko ime");
			lblKorisnickoIme.setBounds(152, 64, 109, 14);
		}
		return lblKorisnickoIme;
	}
	public JLabel getLblLozinka() {
		if (lblLozinka == null) {
			lblLozinka = new JLabel("Lozinka");
			lblLozinka.setBounds(152, 119, 109, 14);
		}
		return lblLozinka;
	}
	public JTextField getTextKorisnicko_Ime() {
		if (textKorisnicko_Ime == null) {
			textKorisnicko_Ime = new JTextField();
			textKorisnicko_Ime.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					GUIKontroler.obrisiPoljeZaIme();
					GUIKontroler.promeniFont();
				}
			});
	
			textKorisnicko_Ime.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					GUIKontroler.obrisiPoljeZaIme();
					GUIKontroler.promeniFont();
				}
			});
			textKorisnicko_Ime.setText("Unesite ime grupe");
		
	
			textKorisnicko_Ime.setForeground(Color.LIGHT_GRAY);
			textKorisnicko_Ime.setFont(new Font("Tahoma", Font.ITALIC, 10));
		
			textKorisnicko_Ime.setBounds(152, 88, 136, 20);
			textKorisnicko_Ime.setColumns(10);
		}
		return textKorisnicko_Ime;
	}
	public JButton getBtnPrijaviSe() {
		if (btnPrijaviSe == null) {
			btnPrijaviSe = new JButton("Prijavi se");
			btnPrijaviSe.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIKontroler.prijaviSe();
				}
			});
			btnPrijaviSe.setBounds(152, 183, 136, 23);
			btnPrijaviSe.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					btnPrijaviSe.setBackground(new Color(240, 248, 255));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					btnPrijaviSe.setBackground(Color.WHITE);
				}
			});
			btnPrijaviSe.setFont(new Font("Verdana", Font.BOLD, 11));
			btnPrijaviSe.setFocusPainted(false);
			btnPrijaviSe.setBorderPainted(false);
			btnPrijaviSe.setBackground(Color.WHITE);
		}
		return btnPrijaviSe;
	}
	public JButton getBtnRegistrujSe() {
		if (btnRegistrujSe == null) {
			btnRegistrujSe = new JButton("Registruj se");
			btnRegistrujSe.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.otvoriRegistar();
				}
			});
			btnRegistrujSe.setBounds(152, 222, 136, 23);
			btnRegistrujSe.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					btnRegistrujSe.setBackground(new Color(240, 248, 255));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					btnRegistrujSe.setBackground(Color.WHITE);
				}
			});
			btnRegistrujSe.setFont(new Font("Verdana", Font.BOLD, 11));
			btnRegistrujSe.setFocusPainted(false);
			btnRegistrujSe.setBorderPainted(false);
			btnRegistrujSe.setBackground(Color.WHITE);
		
		}
		return btnRegistrujSe;
	}
	public JPasswordField getPasswordField() {
		if (passwordField == null) {
			passwordField = new JPasswordField();
			passwordField.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					GUIKontroler.prijaviSePrekoEntera(e.getKeyCode());
				}
			});
			passwordField.setBounds(152, 144, 136, 20);
		}
		return passwordField;
	}
}
