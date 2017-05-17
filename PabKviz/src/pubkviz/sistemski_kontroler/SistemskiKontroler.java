package pubkviz.sistemski_kontroler;

import java.util.LinkedList;
import modeli.Clan;
import modeli.Pitanje;
import sistemske_operacije.SODodajGrupu;
import sistemske_operacije.SOEnkripcija;
import sistemske_operacije.SOIzracunajBodove;
import sistemske_operacije.SONapraviListuClanova;
import sistemske_operacije.SOObrisiPitanje;
import sistemske_operacije.SOPrijaviSe;
import sistemske_operacije.SOPrimiOdgovorNaPitanje;
import sistemske_operacije.SOPrimiPitanje;
import sistemske_operacije.SOSacuvajIzmenu;
import sistemske_operacije.SOSerijalizujKviz;
import sistemske_operacije.SOUcitajKviz;
import sistemske_operacije.SOVratiPitanje;

public class SistemskiKontroler {

	public static void dodajGrupu(String imeGrupe, LinkedList<Clan> clanovi, String password) {
		SODodajGrupu.izvrsi(imeGrupe, clanovi, password);
	}

	public static double izracunajBodove() {
		return SOIzracunajBodove.izvrsi();
	}

	public static LinkedList<Clan> napraviListuClanova(String[] imena, String[] prezimena, int brojClanova,
			String imeGrupe) throws Exception {
		return SONapraviListuClanova.izvrsi(imena, prezimena, brojClanova, imeGrupe);
	}

	public static void obrisiPitanje(int iterator) {
		SOObrisiPitanje.izvrsi(iterator);
	}

	public static boolean prijaviSe(String imeGrupe, String sifra) {
		return SOPrijaviSe.izvrsi(imeGrupe, sifra);
	}

	public static void primiOdgovorNaPitanje(String pitanje, String odg1, String odg2, String odg3, String izabran) {
		SOPrimiOdgovorNaPitanje.izvrsi(pitanje, odg1, odg2, odg3, izabran);
	}

	public static void primiPitanje(String pitanje, String odg1, String odg2, String odg3, String tacan) {
		SOPrimiPitanje.izvrsi(pitanje, odg1, odg2, odg3, tacan);
	}

	public static void sacuvajIzmenu(int i, String pitanje, String odg1, String odg2, String odg3, String tacan) {
		SOSacuvajIzmenu.izvrsi(i, pitanje, odg1, odg2, odg3, tacan);
	}

	public static void serijalizujKviz(LinkedList<Pitanje> pitanja) {
		SOSerijalizujKviz.izvrsi(pitanja);
	}

	public static void ucitajKviz() throws Exception {
		SOUcitajKviz.izvrsi();
	}

	public static Pitanje vratiPitanje(int i) {
		return SOVratiPitanje.izvrsi(i);
	}

	public static String enkripcija(String sifra) {
		return SOEnkripcija.izvrsi(sifra);
	}
}
