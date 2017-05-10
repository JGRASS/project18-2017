package konekcija;

import java.util.Collection;
import modeli.Clan;
import modeli.Grupa;
import modeli.Pitanje;

public interface BazaInterfejs {

	public void dodajClana(Clan clan);

	public void izbrisiClana(int id);

	public void dodajGrupu(Grupa grupa);

	public void izbrisiGrupu(int id);

	public Collection<Clan> vratiClanove();

	public Collection<Grupa> vratiGrupe();
}
