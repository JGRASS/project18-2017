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
import modeli.Grupa;
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
			Class.forName("com.mysql.jdbc.Driver");
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
		String upit = "INSERT INTO clanovi(id, ime, prezime, grupa) VALUES(?, ?, ?, ?)";
		try {
			PreparedStatement pripremljenaIzjava = konekcija.prepareStatement(upit);
			pripremljenaIzjava.setLong(1, clan.getId());
			pripremljenaIzjava.setString(2, clan.getIme());
			pripremljenaIzjava.setString(3, clan.getPrezime());
			pripremljenaIzjava.setString(4, clan.getGrupa());
			pripremljenaIzjava.executeUpdate();
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
			pripremljenaIzjava.executeUpdate();
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
				clan.setGrupa(rezultat.getString("grupa"));
				clanovi.add(clan);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		zatvoriKonekciju();
		return clanovi;
	}

	/**
	 * Metoda dodaje grupu koja je ulazni argument u tabelu grupe u bazu
	 */
	@Override
	public void dodajGrupu(Grupa grupa) {
		otvoriKonekciju();
		String upit = "INSERT INTO grupe(id, naziv, sifra) VALUES(?, ?, ?)";
		try {
			PreparedStatement pripremljenaIzjava = konekcija.prepareStatement(upit);
			pripremljenaIzjava.setLong(1, grupa.getId());
			pripremljenaIzjava.setString(2, grupa.getNaziv());
			pripremljenaIzjava.setString(3, grupa.getPassword());
			pripremljenaIzjava.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		zatvoriKonekciju();
	}

	/**
	 * Metoda brise grupu sa zadatim id-om iz tabele grupe iz baze
	 */
	@Override
	public void izbrisiGrupu(int id) {
		otvoriKonekciju();
		String upit = "DELETE FROM grupe WHERE id=?";
		try {
			PreparedStatement pripremljenaIzjava = konekcija.prepareStatement(upit);
			pripremljenaIzjava.setInt(1, id);
			pripremljenaIzjava.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		zatvoriKonekciju();
	}

	/**
	 * Metoda vraca listu svih grupa iz baze
	 */
	@Override
	public Collection<Grupa> vratiGrupe() {
		Collection<Grupa> grupe = new LinkedList<>();
		otvoriKonekciju();
		try {
			ResultSet rezultat = izjava.executeQuery("SELECT * FROM grupe");
			while (rezultat.next()) {
				Grupa grupa = new Grupa();
				grupa.setId(rezultat.getLong("id"));
				grupa.setNaziv(rezultat.getString("naziv"));
				grupa.setPassword(rezultat.getString("sifra"));
				grupe.add(grupa);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		zatvoriKonekciju();
		return grupe;
	}

}