package sistemske_operacije;

import modeli.Kviz;
import modeli.Pitanje;

public class SOPrimiPitanje {

	public static void izvrsi(String pitanje, String odg1, String odg2, String odg3, String tacan) {
		Kviz.pitanja.add(new Pitanje(pitanje, odg1, odg2, odg3, tacan));
	}
}
