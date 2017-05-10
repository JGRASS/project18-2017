package sistemske_operacije;

import java.util.LinkedList;
import konekcija.Konektor;
import modeli.Grupa;

public class SOPrijaviSe {

	public static boolean izvrsi(String imeGrupe, String sifra) {
		try {
			Konektor konektor = new Konektor();
			LinkedList<Grupa> grupe = (LinkedList<Grupa>) konektor.vratiGrupe();
			for (Grupa grupa : grupe) {
				if (grupa.getPassword().equals(sifra)) {
					return true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
