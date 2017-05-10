package sistemske_operacije;

import modeli.Kviz;
import modeli.Pitanje;

public class SOSacuvajIzmenu {

	public static void izvrsi(int i, String pitanje, String odg1, String odg2, String odg3, String tacan) {
		Kviz.pitanja.add(i, new Pitanje(pitanje, odg1, odg2, odg3, tacan));
	}
}
