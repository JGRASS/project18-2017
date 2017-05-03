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
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Login extends JFrame {

	private JPanel contentPane;
	private JLabel lblKorisnickoIme;
	private JLabel lblLozinka;
	private JTextField textKorisnicko_Ime;
	private JTextField textLozinka;
	private JButton btnPrijaviSe;
	private JButton btnRegistrujiSe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
		contentPane.add(getTextLozinka());
		contentPane.add(getBtnPrijaviSe());
		contentPane.add(getBtnRegistrujiSe());
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
			textKorisnicko_Ime.setForeground(Color.LIGHT_GRAY);
			textKorisnicko_Ime.setFont(new Font("Tahoma", Font.ITALIC, 10));
			textKorisnicko_Ime.setText("Unesite ime grupe");
			textKorisnicko_Ime.setBounds(152, 88, 136, 20);
			textKorisnicko_Ime.setColumns(10);
		}
		return textKorisnicko_Ime;
	}
	public JTextField getTextLozinka() {
		if (textLozinka == null) {
			textLozinka = new JTextField();
			textLozinka.setForeground(Color.LIGHT_GRAY);
			textLozinka.setFont(new Font("Tahoma", Font.ITALIC, 10));
			textLozinka.setText("Unesite lozinku");
			textLozinka.setColumns(10);
			textLozinka.setBounds(152, 144, 136, 20);
		}
		return textLozinka;
	}
	public JButton getBtnPrijaviSe() {
		if (btnPrijaviSe == null) {
			btnPrijaviSe = new JButton("Prijavi se");
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
	public JButton getBtnRegistrujiSe() {
		if (btnRegistrujiSe == null) {
			btnRegistrujiSe = new JButton("Registruji se");
			btnRegistrujiSe.setBounds(152, 222, 136, 23);
			btnRegistrujiSe.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					btnRegistrujiSe.setBackground(new Color(240, 248, 255));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					btnRegistrujiSe.setBackground(Color.WHITE);
				}
			});
			btnRegistrujiSe.setFont(new Font("Verdana", Font.BOLD, 11));
			btnRegistrujiSe.setFocusPainted(false);
			btnRegistrujiSe.setBorderPainted(false);
			btnRegistrujiSe.setBackground(Color.WHITE);
		
		}
		return btnRegistrujiSe;
	}
}
