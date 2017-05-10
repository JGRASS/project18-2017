package sistemske_operacije;

import modeli.Kviz;

public class SOObrisiPitanje {

	public static void izvrsi(int iterator) {
		Kviz.pitanja.remove(iterator);
	}
}
