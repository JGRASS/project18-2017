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
		this.id = id;
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

	public String getGrupa() {
		return grupa;
	}

	public void setGrupa(String grupa) {
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
