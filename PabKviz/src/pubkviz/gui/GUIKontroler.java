package pubkviz.gui;

import java.awt.Color;
import pubkviz.sistemski_kontroler.SistemskiKontroler;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import modeli.Kviz;
import pubkviz.gui.admin.Glavni_Meni;
import pubkviz.gui.admin.Izmeni;
import pubkviz.gui.admin.NapraviKviz;
import pubkviz.gui.admin.Unos_Pitanja;
import pubkviz.gui.korisnik.Glavni_Meni_Korisnik;
import pubkviz.gui.admin.Obrisi_Pitanje;
import pubkviz.gui.korisnik.Registracija;
import pubkviz.gui.korisnik.Rezultat;
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
	private static int iterator;
	private static int iteratorGornji;
	private static int iteratorDonji;
	private static Rezultat rezultat;
	private static String so = "1IU*PKqEu8vP@B7Cm7#mjQNx6N0CB)39zntI13P5Jsr1^(s(E4yF%2Q8smu$RHCi";

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
			pocetniProzor.dispose();
			glavniProzor.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					ugasiAplikacijuKorisnik();
				}
			});
		} else if (SistemskiKontroler.prijaviSe(vratiKorisnickoIme(), vratiLozinku() + so)) {
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
		Kviz.pitanja.clear();
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

		try {
			kviz = new Pokreni_Kviz();

			SistemskiKontroler.ucitajKviz();

			iteratorDonji = 1;
			iteratorGornji = 0;

			if (SistemskiKontroler.vratiPitanje(iteratorGornji) != null) {
				kviz.getTxtGornjePitanje().setText(SistemskiKontroler.vratiPitanje(iteratorGornji).getTekst());
				kviz.getTxtPrviGornjiOdgovor()
						.setText(SistemskiKontroler.vratiPitanje(iteratorGornji).getPrviOdgovor());
				kviz.getTxtDrugiGornjiOdgovor()
						.setText(SistemskiKontroler.vratiPitanje(iteratorGornji).getDrugiOdgovor());
				kviz.getTxtTreciGornjiOdgovor()
						.setText(SistemskiKontroler.vratiPitanje(iteratorGornji).getTreciOdgovor());
				kviz.getLblGornjePitanje().setText(iteratorGornji + 1 + ". pitanje");
			}
			if (SistemskiKontroler.vratiPitanje(iteratorDonji) != null) {
				kviz.getTxtDonjePitanje().setText(SistemskiKontroler.vratiPitanje(iteratorDonji).getTekst());
				kviz.getTxtPrviDonjiOdgovor().setText(SistemskiKontroler.vratiPitanje(iteratorDonji).getPrviOdgovor());
				kviz.getTxtDrugiDonjiOdgovor()
						.setText(SistemskiKontroler.vratiPitanje(iteratorDonji).getDrugiOdgovor());
				kviz.getTxtTreciDonjiOdgovor()
						.setText(SistemskiKontroler.vratiPitanje(iteratorDonji).getTreciOdgovor());
				kviz.getLblDonjePitanje().setText(iteratorDonji + 1 + ". pitanje");
			} else if (SistemskiKontroler.vratiPitanje(iteratorDonji) == null) {
				kviz.getTxtDonjePitanje().setVisible(false);
				kviz.getTxtPrviDonjiOdgovor().setVisible(false);
				kviz.getTxtTreciDonjiOdgovor().setVisible(false);
				kviz.getTxtDrugiDonjiOdgovor().setVisible(false);
				kviz.getLblDonjePitanje().setVisible(false);
				kviz.getRadioButton_4().setVisible(false);
				kviz.getRadioButton_5().setVisible(false);
				kviz.getRadioButton_6().setVisible(false);
				kviz.getRadioButton_7().setVisible(false);
				kviz.getLblDonjiOdgovor().setVisible(false);
				kviz.getTxtNeZnamDonjiOdgovor().setVisible(false);
				kviz.getTxtDonjePitanje().setVisible(false);
				kviz.getScrollPane_2_1().setVisible(false);
			}

			kviz.setLocationRelativeTo(glavniProzorKorisnik);
			kviz.setVisible(true);
		} catch (Exception e) {
			zatvoriKviz();
			System.out.println("Greska: " + e.getMessage());
		}

	}

	public static void sacuvajNastavi() {
		if ((iteratorDonji + 1 >= Kviz.pitanja.size()) && (iteratorDonji + 2 >= Kviz.pitanja.size())) {
			kviz.getBtnSledecaStrana().setText("Zavrsi");
			return;
		}

		iteratorDonji += 2;
		iteratorGornji += 2;

		if (SistemskiKontroler.vratiPitanje(iteratorGornji) != null) {
			sacuvajOdgovorNaPitanjeGornje();
			kviz.getTxtGornjePitanje().setText(SistemskiKontroler.vratiPitanje(iteratorGornji).getTekst());
			kviz.getTxtPrviGornjiOdgovor().setText(SistemskiKontroler.vratiPitanje(iteratorGornji).getPrviOdgovor());
			kviz.getTxtDrugiGornjiOdgovor().setText(SistemskiKontroler.vratiPitanje(iteratorGornji).getDrugiOdgovor());
			kviz.getTxtTreciGornjiOdgovor().setText(SistemskiKontroler.vratiPitanje(iteratorGornji).getTreciOdgovor());
			kviz.getLblGornjePitanje().setText(iteratorGornji + 1 + ". pitanje");
		} else if (SistemskiKontroler.vratiPitanje(iteratorGornji) == null) {
			sacuvajOdgovorNaPitanjeGornje();
			kviz.getTxtGornjePitanje().setVisible(false);
			kviz.getTxtPrviGornjiOdgovor().setVisible(false);
			kviz.getTxtDrugiGornjiOdgovor().setVisible(false);
			kviz.getTxtTreciGornjiOdgovor().setVisible(false);
			kviz.getLblGornjePitanje().setVisible(false);
			kviz.getRadioButton().setVisible(false);
			kviz.getRadioButton_1().setVisible(false);
			kviz.getRadioButton_2().setVisible(false);
			kviz.getRadioButton_3().setVisible(false);
			kviz.getLblGornjiOdgovor().setVisible(false);
			kviz.getTxtNeZnamGornjiOdgovor().setVisible(false);
			kviz.getTxtGornjePitanje().setVisible(false);
			kviz.getScrollPane_1().setVisible(false);

		}
		if (SistemskiKontroler.vratiPitanje(iteratorDonji) != null) {
			sacuvajOdgovorNaPitanjeDonje();
			kviz.getTxtDonjePitanje().setText(SistemskiKontroler.vratiPitanje(iteratorDonji).getTekst());
			kviz.getTxtPrviDonjiOdgovor().setText(SistemskiKontroler.vratiPitanje(iteratorDonji).getPrviOdgovor());
			kviz.getTxtDrugiDonjiOdgovor().setText(SistemskiKontroler.vratiPitanje(iteratorDonji).getDrugiOdgovor());
			kviz.getTxtTreciDonjiOdgovor().setText(SistemskiKontroler.vratiPitanje(iteratorDonji).getTreciOdgovor());
			kviz.getLblDonjePitanje().setText(iteratorDonji + 1 + ". pitanje");
		} else if (SistemskiKontroler.vratiPitanje(iteratorDonji) == null) {
			sacuvajOdgovorNaPitanjeDonje();
			kviz.getTxtDonjePitanje().setVisible(false);
			kviz.getTxtPrviDonjiOdgovor().setVisible(false);
			kviz.getTxtTreciDonjiOdgovor().setVisible(false);
			kviz.getTxtDrugiDonjiOdgovor().setVisible(false);
			kviz.getLblDonjePitanje().setVisible(false);
			kviz.getRadioButton_4().setVisible(false);
			kviz.getRadioButton_5().setVisible(false);
			kviz.getRadioButton_6().setVisible(false);
			kviz.getRadioButton_7().setVisible(false);
			kviz.getLblDonjiOdgovor().setVisible(false);
			kviz.getTxtNeZnamDonjiOdgovor().setVisible(false);
			kviz.getTxtDonjePitanje().setVisible(false);
			kviz.getScrollPane_2_1().setVisible(false);
		}

	}

	public static void sacuvajOdgovorNaPitanjeGornje() {

		String izabranik = izaberiOdgovor();

		SistemskiKontroler.primiOdgovorNaPitanje(kviz.getTxtGornjePitanje().getText(),
				kviz.getTxtPrviGornjiOdgovor().getText(), kviz.getTxtDrugiDonjiOdgovor().getText(),
				kviz.getTxtTreciGornjiOdgovor().getText(), izabranik);
	}

	private static String izaberiOdgovor() {
		if (kviz.getRadioButton().isSelected()) {
			return kviz.getTxtPrviGornjiOdgovor().getText();
		}
		if (kviz.getRadioButton_1().isSelected()) {
			return kviz.getTxtDrugiGornjiOdgovor().getText();
		}
		if (kviz.getRadioButton_2().isSelected()) {
			return kviz.getTxtTreciGornjiOdgovor().getText();
		}
		return kviz.getTxtNeZnamGornjiOdgovor().getText();

	}

	public static void sacuvajOdgovorNaPitanjeDonje() {

		String izabranik = izaberiOdgovorDonji();

		SistemskiKontroler.primiOdgovorNaPitanje(kviz.getTxtGornjePitanje().getText(),
				kviz.getTxtPrviGornjiOdgovor().getText(), kviz.getTxtDrugiDonjiOdgovor().getText(),
				kviz.getTxtTreciGornjiOdgovor().getText(), izabranik);
	}

	private static String izaberiOdgovorDonji() {
		if (kviz.getRadioButton_4().isSelected()) {
			return kviz.getTxtPrviDonjiOdgovor().getText();
		}
		if (kviz.getRadioButton_5().isSelected()) {
			return kviz.getTxtDrugiDonjiOdgovor().getText();
		}
		if (kviz.getRadioButton_6().isSelected()) {
			return kviz.getTxtTreciDonjiOdgovor().getText();
		}
		return kviz.getTxtNeZnamGornjiOdgovor().getText();

	}

	public static void pogledajTestZatvaranje() {
		kviz.dispose();

		napraviKviz.setModal(true);
		napraviKviz.setVisible(true);

	}

	public static void otvoriBrisac() {
		obrisiPitanje = new Obrisi_Pitanje();

		iterator = 0;
		if (SistemskiKontroler.vratiPitanje(iterator) != null) {
			obrisiPitanje.getTextPane_1().setText(SistemskiKontroler.vratiPitanje(iterator).getTekst());
			obrisiPitanje.getTxtPrviOdgovor().setText(SistemskiKontroler.vratiPitanje(iterator).getPrviOdgovor());
			obrisiPitanje.getTxtDrugiOdgovor().setText(SistemskiKontroler.vratiPitanje(iterator).getDrugiOdgovor());
			obrisiPitanje.getTxtTreciOdgovor().setText(SistemskiKontroler.vratiPitanje(iterator).getTreciOdgovor());
			vratiSelektovanoDugmeObrisa().setSelected(true);
		}
		obrisiPitanje.setLocationRelativeTo(glavniProzor);
		obrisiPitanje.setVisible(true);

	}

	public static void sledecePitanjeObrisa() {
		if (iterator == Kviz.pitanja.size() - 1) {
			return;
		}
		iterator++;
		if (SistemskiKontroler.vratiPitanje(iterator) != null) {
			obrisiPitanje.getTextPane_1().setText(SistemskiKontroler.vratiPitanje(iterator).getTekst());
			obrisiPitanje.getTxtPrviOdgovor().setText(SistemskiKontroler.vratiPitanje(iterator).getPrviOdgovor());
			obrisiPitanje.getTxtDrugiOdgovor().setText(SistemskiKontroler.vratiPitanje(iterator).getDrugiOdgovor());
			obrisiPitanje.getTxtTreciOdgovor().setText(SistemskiKontroler.vratiPitanje(iterator).getTreciOdgovor());
			vratiSelektovanoDugmeObrisa().setSelected(true);
		} else {
			iterator--;
		}

	}

	private static AbstractButton vratiSelektovanoDugmeObrisa() {
		String tacanOdgovor = SistemskiKontroler.vratiPitanje(iterator).getTacanOdgovor();

		if (obrisiPitanje.getTxtPrviOdgovor().getText().equals(tacanOdgovor)) {
			return obrisiPitanje.getRdbtnPrviOdgovor();
		}
		if (obrisiPitanje.getTxtDrugiOdgovor().getText().equals(tacanOdgovor)) {
			return obrisiPitanje.getRdbtnDrugiOdgovor();
		}
		if (obrisiPitanje.getTxtTreciOdgovor().getText().equals(tacanOdgovor)) {
			return obrisiPitanje.getRdbtnTreciOdgovor();
		}
		return null;
	}

	public static void prethodnoPitanjeObrisa() {
		if (iterator == 0) {
			return;
		}
		iterator--;
		if (SistemskiKontroler.vratiPitanje(iterator) != null) {
			obrisiPitanje.getTextPane_1().setText(SistemskiKontroler.vratiPitanje(iterator).getTekst());
			obrisiPitanje.getTxtPrviOdgovor().setText(SistemskiKontroler.vratiPitanje(iterator).getPrviOdgovor());
			obrisiPitanje.getTxtDrugiOdgovor().setText(SistemskiKontroler.vratiPitanje(iterator).getDrugiOdgovor());
			obrisiPitanje.getTxtTreciOdgovor().setText(SistemskiKontroler.vratiPitanje(iterator).getTreciOdgovor());
			vratiSelektovanoDugmeObrisa().setSelected(true);
		} else {
			iterator++;
		}

	}

	public static void otvoriIzmenjivac() {
		izmena = new Izmeni();

		iterator = 0;

		if (SistemskiKontroler.vratiPitanje(iterator) != null) {
			izmena.getTextPane_1().setText(SistemskiKontroler.vratiPitanje(iterator).getTekst());
			izmena.getTxtPrviOdgovor().setText(SistemskiKontroler.vratiPitanje(iterator).getPrviOdgovor());
			izmena.getTxtDrugiOdgovor().setText(SistemskiKontroler.vratiPitanje(iterator).getDrugiOdgovor());
			izmena.getTxtTreciOdgovor().setText(SistemskiKontroler.vratiPitanje(iterator).getTreciOdgovor());
			vratiSelektovanoDugme().setSelected(true);
		}
		izmena.setLocationRelativeTo(glavniProzor);
		izmena.setVisible(true);
	}

	public static void sledecePitanje() {
		if (iterator == Kviz.pitanja.size() - 1) {
			return;
		}
		iterator++;
		if (SistemskiKontroler.vratiPitanje(iterator) != null) {
			izmena.getTextPane_1().setText(SistemskiKontroler.vratiPitanje(iterator).getTekst());
			izmena.getTxtPrviOdgovor().setText(SistemskiKontroler.vratiPitanje(iterator).getPrviOdgovor());
			izmena.getTxtDrugiOdgovor().setText(SistemskiKontroler.vratiPitanje(iterator).getDrugiOdgovor());
			izmena.getTxtTreciOdgovor().setText(SistemskiKontroler.vratiPitanje(iterator).getTreciOdgovor());
			vratiSelektovanoDugme().setSelected(true);
		} else {
			iterator--;
		}

	}

	public static void prethodnoPitanje() {
		if (iterator == 0) {
			return;
		}
		iterator--;
		if (SistemskiKontroler.vratiPitanje(iterator) != null) {
			izmena.getTextPane_1().setText(SistemskiKontroler.vratiPitanje(iterator).getTekst());
			izmena.getTxtPrviOdgovor().setText(SistemskiKontroler.vratiPitanje(iterator).getPrviOdgovor());
			izmena.getTxtDrugiOdgovor().setText(SistemskiKontroler.vratiPitanje(iterator).getDrugiOdgovor());
			izmena.getTxtTreciOdgovor().setText(SistemskiKontroler.vratiPitanje(iterator).getTreciOdgovor());
			vratiSelektovanoDugme().setSelected(true);
		} else {
			iterator++;
		}

	}

	public static JRadioButton vratiSelektovanoDugme() {
		String tacanOdgovor = SistemskiKontroler.vratiPitanje(iterator).getTacanOdgovor();

		if (izmena.getTxtPrviOdgovor().getText().equals(tacanOdgovor)) {
			return izmena.getRdbtnPrviOdgovor();
		}
		if (izmena.getTxtDrugiOdgovor().getText().equals(tacanOdgovor)) {
			return izmena.getRdbtnDrugiOdgovor();
		}
		if (izmena.getTxtTreciOdgovor().getText().equals(tacanOdgovor)) {
			return izmena.getRdbtnTreciOdgovor();
		}
		return null;

	}

	public static void unesiPodatkeZaGrupu() {
		try {
			if (vratiPassword() == null) {
				return;
			}
			SistemskiKontroler.dodajGrupu(registar.getTxtUnesiteImeGrupe().getText(),
					SistemskiKontroler.napraviListuClanova(napraviNizImena(), napraviNizPrezimena(),
							Integer.valueOf((String) registar.getCbxIzaberiteBrojClanova().getSelectedItem()),
							registar.getTxtUnesiteImeGrupe().getText()),
					vratiPassword());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static String[] napraviNizImena() {
		String[] imena = new String[5];
		if (registar.getTxtIme().isVisible()) {
			imena[0] = registar.getTxtIme().getText();
		}
		if (registar.getTxtIme_2().isVisible()) {
			imena[1] = registar.getTxtIme_2().getText();
		}
		if (registar.getTxtIme_3().isVisible()) {
			imena[2] = registar.getTxtIme_3().getText();
		}
		if (registar.getTxtIme_4().isVisible()) {
			imena[3] = registar.getTxtIme_4().getText();
		}
		if (registar.getTxtIme_5().isVisible()) {
			imena[4] = registar.getTxtIme_5().getText();
		}
		return imena;

	}

	public static String[] napraviNizPrezimena() {
		String[] pimena = new String[5];
		if (registar.getTxtPrezime().isVisible()) {
			pimena[0] = registar.getTxtPrezime().getText();
		}
		if (registar.getTxtPrezime_2().isVisible()) {
			pimena[1] = registar.getTxtPrezime_2().getText();
		}
		if (registar.getTxtPrezime_3().isVisible()) {
			pimena[2] = registar.getTxtPrezime_3().getText();
		}
		if (registar.getTxtPrezime4().isVisible()) {
			pimena[3] = registar.getTxtPrezime4().getText();
		}
		if (registar.getTxtPrezime_5().isVisible()) {
			pimena[4] = registar.getTxtPrezime_5().getText();
		}
		return pimena;

	}

	public static String vratiPassword() {
		String passwordOriginal = String.valueOf(registar.getPasswordField().getPassword());
		String passwordPonovljeni = String.valueOf(registar.getPasswordField_1().getPassword());
		if (!(passwordOriginal.equals(passwordPonovljeni))) {
			registar.getTxtStatus().setText("Unesite sifru ponovo");
			registar.getPasswordField().setText(null);
			registar.getPasswordField_1().setText(null);
			return null;
		}
		passwordOriginal = SistemskiKontroler.enkripcija(passwordOriginal + so);
		registar.dispose();
		return passwordOriginal;
	}

	public static void unesiPitanje() {

		String tacanOdgvor = vratiTacanOdgovor();

		SistemskiKontroler.primiPitanje(unosPitanja.getTextPane_1().getText(),
				unosPitanja.getTxtPrviOdgovor().getText(), unosPitanja.getTxtDrugiOdgovor().getText(),
				unosPitanja.getTxtTreciOdgovor().getText(), tacanOdgvor);
		unosPitanja.dispose();

		napraviKviz.getBtnIzmeniPitanje().setEnabled(true);
		napraviKviz.getBtnObrisiPitanje().setEnabled(true);
	}

	private static String vratiTacanOdgovor() {
		if (unosPitanja.getRdbtnPrviOdgovor().isSelected()) {
			return unosPitanja.getTxtPrviOdgovor().getText();
		}
		if (unosPitanja.getRdbtnDrugiOdgovor().isSelected()) {
			return unosPitanja.getTxtDrugiOdgovor().getText();
		}
		if (unosPitanja.getRdbtnTreciOdgovor().isSelected()) {
			return unosPitanja.getTxtTreciOdgovor().getText();
		}
		return null;
	}

	public static void sacuvajIzmenu() {
		String tacanOdgvor = vratiTacanOdgovorIzmena();

		SistemskiKontroler.sacuvajIzmenu(iterator, izmena.getTextPane_1().getText(),
				izmena.getTxtPrviOdgovor().getText(), izmena.getTxtDrugiOdgovor().getText(),
				izmena.getTxtTreciOdgovor().getText(), tacanOdgvor);
		izmena.dispose();

	}

	public static void izbrisiPitanje() {
		SistemskiKontroler.obrisiPitanje(iterator);
		if (Kviz.pitanja.isEmpty()) {
			napraviKviz.getBtnIzmeniPitanje().setEnabled(false);
			napraviKviz.getBtnObrisiPitanje().setEnabled(false);
		}
		obrisiPitanje.dispose();
	}

	private static String vratiTacanOdgovorIzmena() {
		if (izmena.getRdbtnPrviOdgovor().isSelected()) {
			return izmena.getTxtPrviOdgovor().getText();
		}
		if (izmena.getRdbtnTreciOdgovor().isSelected()) {
			return izmena.getTxtTreciOdgovor().getText();
		}
		if (izmena.getRdbtnDrugiOdgovor().isSelected()) {
			return izmena.getTxtDrugiOdgovor().getText();
		}
		return null;
	}

	public static void sacuvajKviz() {
		SistemskiKontroler.serijalizujKviz(Kviz.pitanja);
	}

	public static void vratiRezultat() {

		if (kviz.getBtnSledecaStrana().getText().equals("Zavrsi")) {
			String[] komentar = { "Srednje zalosno", "Eksponencijalno dobro!", "Moze i bolje", "Avangardan rezultat",
					"Nije toliko lose" };

			sacuvajOdgovorNaPitanjeGornje();
			if ((Kviz.pitanja.size()) % 2 == 0) {
				sacuvajOdgovorNaPitanjeDonje();
			}
			rezultat = new Rezultat();
			rezultat.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					zatvoriKviz();
					rezultat.dispose();
				}
			});
			Random rand = new Random();
			rezultat.getTextField_1().setText(komentar[rand.nextInt(5)]);

			rezultat.getTextField().setText(String.valueOf(SistemskiKontroler.izracunajBodove()));
			rezultat.setLocationRelativeTo(kviz);
			rezultat.setVisible(true);

			Kviz.odgovoriNaPitanja.clear();
		}

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

	public static void zatvoriKviz() {
		kviz.dispose();

	}

}
