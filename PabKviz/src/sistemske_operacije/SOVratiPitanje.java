package sistemske_operacije;

import modeli.Kviz;
import modeli.Pitanje;

public class SOVratiPitanje {

	public static Pitanje izvrsi(int i) {
		return Kviz.pitanja.get(i);
	}
}
