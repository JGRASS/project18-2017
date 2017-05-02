package modeli;

public class Pitanje {

	private long id;
	private String tekst;

	public Pitanje() {

	}

	public Pitanje(long id, String tekst) {
		this.id = id;
		this.tekst = tekst;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	@Override
	public String toString() {
		return "Pitanje [id=" + id + ", tekst=" + tekst + "]";
	}

}
