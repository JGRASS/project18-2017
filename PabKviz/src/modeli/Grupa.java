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
		if (id < 0 || naziv == null || password == null) {
			throw new RuntimeException("Morate adekvatno uneti grupu");
		}
		this.id = id;
		this.naziv = naziv;
		this.password = password;
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

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		if (naziv == null || naziv.isEmpty()) {
			throw new RuntimeException("Naziv ne sme biti null niti prazan string");
		}
		this.naziv = naziv;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (password == null || password.isEmpty()) {
			throw new RuntimeException("Sifra ne sme biti null niti prazan string");
		}
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
