package sistemske_operacije;

import modeli.Kviz;
import modeli.Pitanje;

public class SOVratiPitanje {

	public static Pitanje izvrsi(int i) {
		Pitanje pitanje = Kviz.pitanja.get(i);
		if (pitanje == null) {
			return null;
		}
		return pitanje;
	}
}
