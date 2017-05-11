package konekcija;

import java.util.Collection;
import modeli.Clan;
import modeli.Grupa;

public interface BazaInterfejs {

	public void dodajClana(Clan clan);

	public void dodajGrupu(Grupa grupa);

	public Collection<Clan> vratiClanove();

	public Collection<Grupa> vratiGrupe();
}
