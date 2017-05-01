package modeli;

import java.util.Collection;

public class Grupa {

	private long id;
	private String naziv;
	private Collection<Clan> clanovi;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public Collection<Clan> getClanovi() {
		return clanovi;
	}

	public void setClanovi(Collection<Clan> clanovi) {
		this.clanovi = clanovi;
	}

}
