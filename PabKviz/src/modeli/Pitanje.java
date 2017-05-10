package modeli;

import java.io.Serializable;

public class Pitanje implements Serializable {

	private String tekst;
	private String prviOdgovor;
	private String drugiOdgovor;
	private String treciOdgovor;
	private String tacanOdgovor;

	public Pitanje() {

	}

	public Pitanje(String tekst, String prviOdgovor, String drugiOdgovor, String treciOdgovor, String tacanOdgovor) {
		if (tekst == null || prviOdgovor == null || drugiOdgovor == null || treciOdgovor == null
				|| tacanOdgovor == null) {
			throw new RuntimeException("Morate adekvatno uneti pitanje");
		}
		this.tekst = tekst;
		this.prviOdgovor = prviOdgovor;
		this.drugiOdgovor = drugiOdgovor;
		this.treciOdgovor = treciOdgovor;
		this.tacanOdgovor = tacanOdgovor;
	}

	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		if (tekst == null || tekst.isEmpty()) {
			throw new RuntimeException("Tekst ne sme biti null niti prazan string");
		}
		this.tekst = tekst;
	}

	public String getPrviOdgovor() {
		return prviOdgovor;
	}

	public void setPrviOdgovor(String prviOdgovor) {
		if (prviOdgovor == null || prviOdgovor.isEmpty()) {
			throw new RuntimeException("Prvi odgovor ne sme biti null niti prazan string");
		}
		this.prviOdgovor = prviOdgovor;
	}

	public String getDrugiOdgovor() {
		return drugiOdgovor;
	}

	public void setDrugiOdgovor(String drugiOdgovor) {
		if (drugiOdgovor == null || drugiOdgovor.isEmpty()) {
			throw new RuntimeException("Drugi odgovor ne sme biti null niti prazan string");
		}
		this.drugiOdgovor = drugiOdgovor;
	}

	public String getTreciOdgovor() {
		return treciOdgovor;
	}

	public void setTreciOdgovor(String treciOdgovor) {
		if (treciOdgovor == null || treciOdgovor.isEmpty()) {
			throw new RuntimeException("Treci odgovor ne sme biti null niti prazan string");
		}
		this.treciOdgovor = treciOdgovor;
	}

	public String getTacanOdgovor() {
		return tacanOdgovor;
	}

	public void setTacanOdgovor(String tacanOdgovor) {
		if (tacanOdgovor == null || tacanOdgovor.isEmpty()) {
			throw new RuntimeException("Tacan odgovor ne sme biti null niti prazan string");
		}
		this.tacanOdgovor = tacanOdgovor;
	}

	@Override
	public String toString() {
		return "Pitanje [tekst=" + tekst + "]";
	}

}
