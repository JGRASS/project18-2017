package modeli;

public class Clan {

	private String ime;
	private String prezime;

	public Clan(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
	}

	public Clan() {

	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	@Override
	public String toString() {
		return "Clan [ime=" + ime + ", prezime=" + prezime + "]";
	}

}
