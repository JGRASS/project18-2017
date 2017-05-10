package modeli;

import java.util.LinkedList;

import sistemske_operacije.SODodajGrupu;

public class Grupa {

	private long id;
	private String naziv;
	private String password;

	public Grupa() {

	}

	public Grupa(long id, String naziv, String password) {
		this.id = id;
		this.naziv = naziv;
		this.password = password;
	}

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void dodajGrupu(String imeGrupe, LinkedList<Clan> clanovi, String password) {
		SODodajGrupu.izvrsi(imeGrupe, clanovi, password);
	}

	@Override
	public String toString() {
		return "Grupa [id=" + id + ", naziv=" + naziv + "]";
	}
}
