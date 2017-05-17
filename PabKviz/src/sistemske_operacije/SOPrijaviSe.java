package sistemske_operacije;

import java.util.LinkedList;

import konekcija.Konektor;
import modeli.Grupa;
import pubkviz.sistemski_kontroler.SistemskiKontroler;

public class SOPrijaviSe {

	public static boolean izvrsi(String imeGrupe, String sifra) {
		try {
			String enkriptovanaSifra = SistemskiKontroler.enkripcija(sifra);
			Konektor konektor = new Konektor();
			LinkedList<Grupa> grupe = (LinkedList<Grupa>) konektor.vratiGrupe();
			for (Grupa grupa : grupe) {
				if (grupa.getPassword().equals(enkriptovanaSifra)) {
					return true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
