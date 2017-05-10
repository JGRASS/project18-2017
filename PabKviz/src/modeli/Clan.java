package modeli;

import sistemske_operacije.SONapraviListuClanova;

public class Clan {

	private long id;
	private String ime;
	private String prezime;
	private String grupa;

	public Clan() {

	}

	public Clan(long id, String ime, String prezime, String grupa) {
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.grupa = grupa;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		if (id < 0) {
			throw new RuntimeException("Id ne sme biti manji od 0");
		}
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		if (ime == null || ime.isEmpty()) {
			throw new RuntimeException("Ime ne sme biti null niti prazan string");
		}
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		if (prezime == null || prezime.isEmpty()) {
			throw new RuntimeException("Prezime ne sme biti null niti prazan string");
		}
		this.prezime = prezime;
	}

	public String getGrupa() {
		return grupa;
	}

	public void setGrupa(String grupa) {
		if (grupa == null || grupa.isEmpty()) {
			throw new RuntimeException("Grupa ne sme biti null niti prazan string");
		}
		this.grupa = grupa;
	}

	@Override
	public String toString() {
		return "Clan [id=" + id + ", ime=" + ime + ", prezime=" + prezime + ", grupa=" + grupa + "]";
	}

	public void napraviListuClanova(String[] imena, String[] prezimena, int brojClanova, String imeGrupe) {
		SONapraviListuClanova.izvrsi(imena, prezimena, brojClanova, imeGrupe);
	}

}
