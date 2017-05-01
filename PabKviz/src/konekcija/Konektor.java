package konekcija;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Konektor {

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

}