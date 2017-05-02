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

/**
 * Klasa uspostavlja vezu i komunicira sa mySQL bazom
 * 
 * @version 0.1
 */
public class Konektor implements BazaInterfejs {

	/**
	 * Putanja do mySQL baze
	 */
	private final String baza = "jdbc:mysql://localhost:3306/pabkviz";

	/**
	 * Username koji se koristi za pristupanje bazi
	 */
	private final String username = "root";

	/**
	 * Password koji se koristi za pristupanje bazi
	 */
	private final String password = "root";

	/**
	 * Konekcija sa bazom
	 */
	Connection konekcija = null;

	/**
	 * Odgovor baze
	 */
	Statement izjava = null;

	/**
	 * Otvaranje konecije sa bazom
	 */
	private void otvoriKonekciju() {
		try {
			konekcija = DriverManager.getConnection(baza, username, password);
			izjava = konekcija.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Zatvaranje konekcije sa bazom
	 */
	private void zatvoriKonekciju() {
		try {
			konekcija.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Metoda dodaje clana koji je ulazni argument u tabelu clanovi u bazu
	 */
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

	/**
	 * Metoda brise clana sa zadatim id-om iz tabele clanovi iz baze
	 */
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

	/**
	 * Metoda dodaje pitanje koje je ulazni argument u tabelu pitanja u bazu
	 */
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

	/**
	 * Metoda brise pitanje sa zadatim id-om iz tabele pitanja iz baze
	 */
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

	/**
	 * Metoda vraca listu svih clanova iz baze
	 */
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

	/**
	 * Metoda vraca listu svih pitanja iz baze
	 */
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