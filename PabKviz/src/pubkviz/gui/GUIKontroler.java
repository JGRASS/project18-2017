package pubkviz.gui;

import java.awt.Color;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;


import pubkviz.gui.admin.Glavni_Meni;
import pubkviz.gui.admin.Izmeni;
import pubkviz.gui.admin.NapraviKviz;
import pubkviz.gui.admin.Unos_Pitanja;
import pubkviz.gui.korisnik.Glavni_Meni_Korisnik;
import pubkviz.gui.admin.Obrisi_Pitanje;
import pubkviz.gui.korisnik.Registracija;
import pubkviz.gui.korisnik.Pokreni_Kviz;
import pubkviz.gui.login.Login;

public class GUIKontroler {

	private static Glavni_Meni glavniProzor;
	private static Login pocetniProzor;
	
	private static NapraviKviz napraviKviz;
	private static Unos_Pitanja unosPitanja;
	private static Glavni_Meni_Korisnik glavniProzorKorisnik;
	private static Pokreni_Kviz kviz;
	private static Obrisi_Pitanje obrisiPitanje;
	private static Izmeni izmena;
	private static Registracija registar;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pocetniProzor = new Login();
					pocetniProzor.setVisible(true);
					pocetniProzor.setLocationRelativeTo(null);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void obrisiPoljeZaIme() {
		if (pocetniProzor.getTextKorisnicko_Ime().getText() != null) {
			String text = pocetniProzor.getTextKorisnicko_Ime().getText();

			if (text.equals("Unesite ime grupe")) {
				pocetniProzor.getTextKorisnicko_Ime().setText("");
			}
		}
	}

	public static void promeniFont() {
		pocetniProzor.getTextKorisnicko_Ime().setFont(new Font("Tahoma", Font.PLAIN, 12));
		pocetniProzor.getTextKorisnicko_Ime().setForeground(Color.BLACK);
	}

	public static String vratiKorisnickoIme() {
		return pocetniProzor.getTextKorisnicko_Ime().getText();
	}

	public static String vratiLozinku() {
		return String.valueOf(pocetniProzor.getPasswordField().getPassword());

	}

	public static void prijaviSe() {
		if (vratiKorisnickoIme().equals("admin") && vratiLozinku().equals("admin")) {
			glavniProzor = new Glavni_Meni();
			glavniProzor.setVisible(true);
			glavniProzor.setLocationRelativeTo(null);
			pocetniProzor.setEnabled(false);
		}
	}

	public static void prijaviSePrekoEntera(int enter) {
		if (vratiKorisnickoIme().equals("admin") && vratiLozinku().equals("admin") && enter == 10) {
			glavniProzor = new Glavni_Meni();
			glavniProzor.setLocationRelativeTo(null);
			glavniProzor.setVisible(true);
			pocetniProzor.dispose();
			glavniProzor.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					ugasiAplikaciju();
				}
			});

		} else if (vratiKorisnickoIme().equals("") && vratiLozinku().equals("") && enter == 10) {
			glavniProzorKorisnik = new Glavni_Meni_Korisnik();
			glavniProzorKorisnik.setLocationRelativeTo(null);
			glavniProzorKorisnik.setVisible(true);
			pocetniProzor.dispose();
			glavniProzorKorisnik.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					ugasiAplikacijuKorisnik();
				}
			});

		}
	}


	public static void otvoriRegistar() {
		registar = new Registracija();
		registar.setLocationRelativeTo(glavniProzor);
		registar.setVisible(true);

	}

	public static void ugasiAplikaciju() {
		int i = JOptionPane.showConfirmDialog(glavniProzor, "Da li zelite da zatvorite aplikaciju?", "Zatvaranje",
				JOptionPane.YES_NO_OPTION);
		if (i == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}

	public static void ugasiAplikacijuKorisnik() {
		int i = JOptionPane.showConfirmDialog(glavniProzorKorisnik, "Da li zelite da zatvorite aplikaciju?",
				"Zatvaranje", JOptionPane.YES_NO_OPTION);
		if (i == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}



	public static void napraviKviz() {
		napraviKviz = new NapraviKviz();
		napraviKviz.setLocationRelativeTo(glavniProzor);
		napraviKviz.setVisible(true);

	}

	public static void unosPitanja() {
		napraviKviz.setVisible(false);
		unosPitanja = new Unos_Pitanja();
		unosPitanja.setLocationRelativeTo(glavniProzor);
		napraviKviz.setModal(false);
		unosPitanja.setVisible(true);

	}

	public static void unosPitanjaZatvaranje() {
		unosPitanja.dispose();
		napraviKviz.setModal(true);
		napraviKviz.setVisible(true);

	}



	public static void pokreniKviz() {
		kviz = new Pokreni_Kviz();
		kviz.setLocationRelativeTo(glavniProzorKorisnik);
		kviz.setVisible(true);

	}

	public static void obrisiPitanje() {
		obrisiPitanje = new Obrisi_Pitanje();
		obrisiPitanje.setLocationRelativeTo(glavniProzor);
		obrisiPitanje.setVisible(true);

	}

	public static void pogledajTest() {
		kviz = new Pokreni_Kviz();
		napraviKviz.setModal(false);
		kviz.setLocationRelativeTo(glavniProzor);
		kviz.setVisible(true);

	}

	public static void pogledajTestZatvaranje() {
		kviz.dispose();

		napraviKviz.setModal(true);
		napraviKviz.setVisible(true);

	}

	public static void otvoriIzmenjivac() {
		izmena = new Izmeni();
		izmena.setLocationRelativeTo(glavniProzor);
		izmena.setVisible(true);

	}
	
	



	
	public static void izaberiBrojClanovaRegi() {

		int m = Integer.valueOf((String) registar.getCbxIzaberiteBrojClanova().getSelectedItem());

		switch (m) {
		case 2:

			registar.getLblime_3().setVisible(false);
			registar.getLblime_4().setVisible(false);
			registar.getLblime_5().setVisible(false);

			registar.getTxtIme_3().setVisible(false);
			registar.getTxtIme_4().setVisible(false);
			registar.getTxtIme_5().setVisible(false);

			registar.getTxtPrezime_3().setVisible(false);
			registar.getTxtPrezime4().setVisible(false);
			registar.getTxtPrezime_5().setVisible(false);

			registar.getLblprezime_3().setVisible(false);
			registar.getLblprezime_4().setVisible(false);
			registar.getLblprezime_5().setVisible(false);
			break;
		case 3:
			registar.getLblime_3().setVisible(true);
			registar.getLblime_4().setVisible(false);
			registar.getLblime_5().setVisible(false);

			registar.getTxtIme_3().setVisible(true);
			registar.getTxtIme_4().setVisible(false);
			registar.getTxtIme_5().setVisible(false);

			registar.getTxtPrezime_3().setVisible(true);
			registar.getTxtPrezime4().setVisible(false);
			registar.getTxtPrezime_5().setVisible(false);

			registar.getLblprezime_3().setVisible(true);
			registar.getLblprezime_4().setVisible(false);
			registar.getLblprezime_5().setVisible(false);
			break;
		case 4:
			registar.getLblime_3().setVisible(true);
			registar.getLblime_4().setVisible(true);
			registar.getLblime_5().setVisible(false);

			registar.getTxtIme_3().setVisible(true);
			registar.getTxtIme_4().setVisible(true);
			registar.getTxtIme_5().setVisible(false);

			registar.getTxtPrezime_3().setVisible(true);
			registar.getTxtPrezime4().setVisible(true);
			registar.getTxtPrezime_5().setVisible(false);

			registar.getLblprezime_3().setVisible(true);
			registar.getLblprezime_4().setVisible(true);
			registar.getLblprezime_5().setVisible(false);
			break;

		case 5:
			registar.getLblime_3().setVisible(true);
			registar.getLblime_4().setVisible(true);
			registar.getLblime_5().setVisible(true);

			registar.getTxtIme_3().setVisible(true);
			registar.getTxtIme_4().setVisible(true);
			registar.getTxtIme_5().setVisible(true);

			registar.getTxtPrezime_3().setVisible(true);
			registar.getTxtPrezime4().setVisible(true);
			registar.getTxtPrezime_5().setVisible(true);

			registar.getLblprezime_3().setVisible(true);
			registar.getLblprezime_4().setVisible(true);
			registar.getLblprezime_5().setVisible(true);
			break;
		default:
			break;
		}
	}

}
