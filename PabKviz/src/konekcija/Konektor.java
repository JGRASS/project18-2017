package konekcija;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.LinkedList;
import modeli.Clan;
import modeli.Pitanje;

public class Konektor implements BazaInterfejs {

	private final String baza = "jdbc:mysql://localhost:3306/pabkviz";
	private final String username = "root";
	private final String password = "root";

	Connection konekcija = null;
	Statement izjava = null;

	private void otvoriKonekciju() {
		try {
			konekcija = DriverManager.getConnection(baza, username, password);
			izjava = konekcija.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void zatvoriKonekciju() {
		try {
			konekcija.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void dodajClana(Clan clan) {
		otvoriKonekciju();
		String upit = "INSERT INTO clanovi(id, ime, prezime) VALUES(?, ?, ?)";
		try {
			PreparedStatement pripremljenaIzjava = konekcija.prepareStatement(upit);
			pripremljenaIzjava.setLong(1, clan.getId());
			pripremljenaIzjava.setString(2, clan.getIme());
			pripremljenaIzjava.setString(3, clan.getPrezime());
			pripremljenaIzjava.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		zatvoriKonekciju();
	}

	@Override
	public void izbrisiClana(int id) {
		otvoriKonekciju();
		String upit = "DELETE FROM clanovi WHERE id=?";
		try {
			PreparedStatement pripremljenaIzjava = konekcija.prepareStatement(upit);
			pripremljenaIzjava.setInt(1, id);
			pripremljenaIzjava.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		zatvoriKonekciju();
	}

	@Override
	public void dodajPitanje(Pitanje pitanje) {
		otvoriKonekciju();
		String upit = "INSERT INTO pitanja(id, tekst) VALUES(?, ?)";
		try {
			PreparedStatement pripremljenaIzjava = konekcija.prepareStatement(upit);
			pripremljenaIzjava.setLong(1, pitanje.getId());
			pripremljenaIzjava.setString(2, pitanje.getTekst());
			pripremljenaIzjava.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		zatvoriKonekciju();
	}

	@Override
	public void izbrisiPitanje(int id) {
		otvoriKonekciju();
		String upit = "DELETE FROM pitanja WHERE id=?";
		try {
			PreparedStatement pripremljenaIzjava = konekcija.prepareStatement(upit);
			pripremljenaIzjava.setInt(1, id);
			pripremljenaIzjava.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		zatvoriKonekciju();
	}

	@Override
	public Collection<Clan> vratiClanove() {
		Collection<Clan> clanovi = new LinkedList<>();
		otvoriKonekciju();
		try {
			ResultSet rezultat = izjava.executeQuery("SELECT * FROM clanovi");
			while (rezultat.next()) {
				Clan clan = new Clan();
				clan.setId(rezultat.getLong("id"));
				clan.setIme(rezultat.getString("ime"));
				clan.setPrezime(rezultat.getString("prezime"));
				clanovi.add(clan);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		zatvoriKonekciju();
		return clanovi;
	}

	@Override
	public Collection<Pitanje> vratiPitanja() {
		Collection<Pitanje> pitanja = new LinkedList<>();
		otvoriKonekciju();
		try {
			ResultSet rezultat = izjava.executeQuery("SELECT * FROM pitanja");
			while (rezultat.next()) {
				Pitanje pitanje = new Pitanje();
				pitanje.setId(rezultat.getLong("id"));
				pitanje.setTekst(rezultat.getString("tekst"));
				pitanja.add(pitanje);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		zatvoriKonekciju();
		return pitanja;
	}

}