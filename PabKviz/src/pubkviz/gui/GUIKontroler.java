package pubkviz.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

import pubkviz.gui.admin.Dodaj_Grupu;
import pubkviz.gui.admin.Glavni_Meni;
import pubkviz.gui.admin.NapraviKviz;
import pubkviz.gui.admin.Unos_Pitanja;
import pubkviz.gui.korisnik.Glavni_Meni_Korisnik;
import pubkviz.gui.korisnik.Registracija_Grupe;
import pubkviz.gui.login.Login;

public class GUIKontroler {

	private static Glavni_Meni glavniProzor;
	private static Login pocetniProzor;
	private static Dodaj_Grupu dodajGrupu;
	private static NapraviKviz napraviKviz;
	private static Unos_Pitanja unosPitanja;
	private static Glavni_Meni_Korisnik glavniProzorKorisnik;
	private static Registracija_Grupe registracijaGrupe;

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

	public static void izmeniGrupu() {
		registracijaGrupe = new Registracija_Grupe();
		registracijaGrupe.setLocationRelativeTo(pocetniProzor);

		registracijaGrupe.setTitle("Izmenite grupu");
		registracijaGrupe.setVisible(true);
	}

	public static void otvoriRegistar() {
		registracijaGrupe = new Registracija_Grupe();
		registracijaGrupe.setLocationRelativeTo(pocetniProzor);
		registracijaGrupe.setVisible(true);
	}

	public static void ugasiAplikaciju() {
		int i = JOptionPane.showConfirmDialog(glavniProzor, "Da li zelite da zatvorite aplikaciju?", "Zatvaranje",
				JOptionPane.YES_NO_OPTION);
		if (i == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
	public static void ugasiAplikacijuKorisnik() {
		int i = JOptionPane.showConfirmDialog(glavniProzorKorisnik, "Da li zelite da zatvorite aplikaciju?", "Zatvaranje",
				JOptionPane.YES_NO_OPTION);
		if (i == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
	public static void izbrisGrupu(){
		int i = JOptionPane.showConfirmDialog(glavniProzorKorisnik, "Da li zelite da izbrisete grupu?", "Obris",
				JOptionPane.YES_NO_OPTION);
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

	public static void dodajGrupu() {
		dodajGrupu = new Dodaj_Grupu();
		dodajGrupu.setLocationRelativeTo(glavniProzor);
		dodajGrupu.setVisible(true);

	}

	public static void izaberiBrojClanova() {

		int m = Integer.valueOf((String) dodajGrupu.getCbxIzaberiteBrojClanova().getSelectedItem());

		switch (m) {
		case 2:

			dodajGrupu.getLblime_3().setVisible(false);
			dodajGrupu.getLblime_4().setVisible(false);
			dodajGrupu.getLblime_5().setVisible(false);

			dodajGrupu.getTxtIme_3().setVisible(false);
			dodajGrupu.getTxtIme_4().setVisible(false);
			dodajGrupu.getTxtIme_5().setVisible(false);

			dodajGrupu.getTxtPrezime_3().setVisible(false);
			dodajGrupu.getTxtPrezime4().setVisible(false);
			dodajGrupu.getTxtPrezime_5().setVisible(false);

			dodajGrupu.getLblprezime_3().setVisible(false);
			dodajGrupu.getLblprezime_4().setVisible(false);
			dodajGrupu.getLblprezime_5().setVisible(false);
			break;
		case 3:
			dodajGrupu.getLblime_3().setVisible(true);
			dodajGrupu.getLblime_4().setVisible(false);
			dodajGrupu.getLblime_5().setVisible(false);

			dodajGrupu.getTxtIme_3().setVisible(true);
			dodajGrupu.getTxtIme_4().setVisible(false);
			dodajGrupu.getTxtIme_5().setVisible(false);

			dodajGrupu.getTxtPrezime_3().setVisible(true);
			dodajGrupu.getTxtPrezime4().setVisible(false);
			dodajGrupu.getTxtPrezime_5().setVisible(false);

			dodajGrupu.getLblprezime_3().setVisible(true);
			dodajGrupu.getLblprezime_4().setVisible(false);
			dodajGrupu.getLblprezime_5().setVisible(false);
			break;
		case 4:
			dodajGrupu.getLblime_3().setVisible(true);
			dodajGrupu.getLblime_4().setVisible(true);
			dodajGrupu.getLblime_5().setVisible(false);

			dodajGrupu.getTxtIme_3().setVisible(true);
			dodajGrupu.getTxtIme_4().setVisible(true);
			dodajGrupu.getTxtIme_5().setVisible(false);

			dodajGrupu.getTxtPrezime_3().setVisible(true);
			dodajGrupu.getTxtPrezime4().setVisible(true);
			dodajGrupu.getTxtPrezime_5().setVisible(false);

			dodajGrupu.getLblprezime_3().setVisible(true);
			dodajGrupu.getLblprezime_4().setVisible(true);
			dodajGrupu.getLblprezime_5().setVisible(false);
			break;

		case 5:
			dodajGrupu.getLblime_3().setVisible(true);
			dodajGrupu.getLblime_4().setVisible(true);
			dodajGrupu.getLblime_5().setVisible(true);

			dodajGrupu.getTxtIme_3().setVisible(true);
			dodajGrupu.getTxtIme_4().setVisible(true);
			dodajGrupu.getTxtIme_5().setVisible(true);

			dodajGrupu.getTxtPrezime_3().setVisible(true);
			dodajGrupu.getTxtPrezime4().setVisible(true);
			dodajGrupu.getTxtPrezime_5().setVisible(true);

			dodajGrupu.getLblprezime_3().setVisible(true);
			dodajGrupu.getLblprezime_4().setVisible(true);
			dodajGrupu.getLblprezime_5().setVisible(true);
			break;
		default:
			break;
		}
	}

}
