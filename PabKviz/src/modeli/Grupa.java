package modeli;

import java.util.LinkedList;

import sistemske_operacije.SODodajGrupu;

public class Grupa {

	private long id;
	private String naziv;

	public Grupa() {

	}

	public Grupa(long id, String naziv) {
		this.id = id;
		this.naziv = naziv;
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

	@Override
	public String toString() {
		return "Grupa [id=" + id + ", naziv=" + naziv + "]";
	}

	public void dodajGrupu(String imeGrupe, LinkedList<Clan> clanovi) {
		SODodajGrupu.izvrsi(imeGrupe, clanovi);
	}
}
