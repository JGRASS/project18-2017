package sistemske_operacije;

import java.util.LinkedList;

import konekcija.Konektor;
import modeli.Clan;

public class SONapraviListuClanova {

	public static LinkedList<Clan> izvrsi(String[] imena, String[] prezimena, int brojClanova, String imeGrupe) {
		LinkedList<Clan> clanovi = new LinkedList<>();
		Konektor konektor = new Konektor();
		LinkedList<Clan> sviClanovi = (LinkedList<Clan>) konektor.vratiClanove();
		int brojSvihclanova = sviClanovi.size();
		for (int i = 0; i < brojClanova; i++) {
			Clan clan = new Clan(++brojSvihclanova, imena[i], prezimena[i], imeGrupe);
			konektor.dodajClana(clan);
		}
		return clanovi;
	}
}
