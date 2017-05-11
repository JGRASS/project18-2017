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
	 * 
	 * @throws Exception
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
	 * 
	 * @throws SQLException
	 */
	private void zatvoriKonekciju() {
		try {
			konekcija.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Metoda dodaje clana u tabelu clanovi u bazu
	 * 
	 * @param objekat
	 *            Clan koji se ubacuje u bazu
	 * @throws SQLException
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
		} catch (SQLException e) {
			e.printStackTrace();
		}
		zatvoriKonekciju();
	}

	/**
	 * Metoda vraca listu svih clanova iz baze
	 * 
	 * @return Lista clanova iz baze
	 * @throws SQLException
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
	 * Metoda dodaje grupu u tabelu grupe u bazu
	 * 
	 * @param objekat
	 *            Grupa koja se ubacuje u bazu
	 * @throws SQLException
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
	 * Metoda vraca listu svih grupa iz baze
	 * 
	 * @return lista grupa iz baze
	 * @throws SQLException
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