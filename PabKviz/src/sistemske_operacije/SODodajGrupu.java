package sistemske_operacije;

import java.util.LinkedList;
import konekcija.Konektor;
import modeli.Clan;
import modeli.Grupa;

public class SODodajGrupu {

	public static void izvrsi(String imeGrupe, LinkedList<Clan> clanovi, String password) {
		try {
			Konektor konektor = new Konektor();
			LinkedList<Grupa> sveGrupe = (LinkedList<Grupa>) konektor.vratiGrupe();
			Grupa grupa = new Grupa(sveGrupe.size() + 1, imeGrupe, password);
			konektor.dodajGrupu(grupa);
			LinkedList<Clan> sviClanovi = (LinkedList<Clan>) konektor.vratiClanove();
			int brojClanovaUBazi = sviClanovi.size();
			for (int i = 0; i < clanovi.size(); i++) {
				Clan clan = clanovi.get(i);
				clan.setId(++brojClanovaUBazi);
				konektor.dodajClana(new Clan(clan.getId(), clan.getIme(), clan.getPrezime(), clan.getGrupa()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
