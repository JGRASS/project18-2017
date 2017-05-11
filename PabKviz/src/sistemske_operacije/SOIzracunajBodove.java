package sistemske_operacije;

import modeli.Kviz;
import modeli.Pitanje;

public class SOIzracunajBodove {

	public static double izvrsi() {
		int brojPitanja = Kviz.pitanja.size();
		int brojTacnihOdgovora = 0, brojNetacnihOdgovora = 0;
		for (int i = 0; i < brojPitanja; i++) {
			Pitanje pitanje = Kviz.pitanja.get(i);
			Pitanje odgovorNaPitanje = Kviz.odgovoriNaPitanja.get(i);
			if (pitanje.getTacanOdgovor().equals(odgovorNaPitanje.getTacanOdgovor())) {
				brojTacnihOdgovora++;
			} else if (!(odgovorNaPitanje.getTacanOdgovor().equals("Ne znam"))) {
				brojNetacnihOdgovora++;
			}
		}
		double pozitivniBodovi = (double) brojTacnihOdgovora / brojPitanja * 100;
		double negativniBodovi = (double) brojNetacnihOdgovora / brojPitanja * 25;
		return (int) (pozitivniBodovi - negativniBodovi);
	}
}
