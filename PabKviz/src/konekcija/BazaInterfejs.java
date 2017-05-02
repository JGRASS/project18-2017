package konekcija;

import java.util.Collection;
import modeli.Clan;
import modeli.Pitanje;

public interface BazaInterfejs {

	public void dodajClana(Clan clan);

	public void izbrisiClana(int id);

	public void dodajPitanje(Pitanje pitanje);

	public void izbrisiPitanje(int id);

	public Collection<Clan> vratiClanove();

	public Collection<Pitanje> vratiPitanja();

}
