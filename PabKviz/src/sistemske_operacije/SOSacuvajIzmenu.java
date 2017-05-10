package sistemske_operacije;

import modeli.Kviz;

public class SOSacuvajIzmenu {

	public static void izvrsi(int i, String pitanje, String odg1, String odg2, String odg3, String tacan) {
		Kviz.pitanja.get(i).setTekst(pitanje);
		Kviz.pitanja.get(i).setPrviOdgovor(odg1);
		Kviz.pitanja.get(i).setDrugiOdgovor(odg2);
		Kviz.pitanja.get(i).setTreciOdgovor(odg3);
		Kviz.pitanja.get(i).setTacanOdgovor(tacan);
	}
}
