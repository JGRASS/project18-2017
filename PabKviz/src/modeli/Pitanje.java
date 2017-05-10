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
		this.tekst = tekst;
	}

	public String getPrviOdgovor() {
		return prviOdgovor;
	}

	public void setPrviOdgovor(String prviOdgovor) {
		this.prviOdgovor = prviOdgovor;
	}

	public String getDrugiOdgovor() {
		return drugiOdgovor;
	}

	public void setDrugiOdgovor(String drugiOdgovor) {
		this.drugiOdgovor = drugiOdgovor;
	}

	public String getTreciOdgovor() {
		return treciOdgovor;
	}

	public void setTreciOdgovor(String treciOdgovor) {
		this.treciOdgovor = treciOdgovor;
	}

	public String getTacanOdgovor() {
		return tacanOdgovor;
	}

	public void setTacanOdgovor(String tacanOdgovor) {
		this.tacanOdgovor = tacanOdgovor;
	}

	@Override
	public String toString() {
		return "Pitanje [tekst=" + tekst + "]";
	}

}
