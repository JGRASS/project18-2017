package modeli;

import java.util.Collection;

public class Grupa {

	private long id;
	private Collection<Clan> clanovi;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Collection<Clan> getClanovi() {
		return clanovi;
	}

	public void setClanovi(Collection<Clan> clanovi) {
		this.clanovi = clanovi;
	}

}
