package sistemske_operacije;

import modeli.Kviz;
import modeli.Pitanje;

public class SOVratiPitanje {

	public static Pitanje izvrsi(int i) {
		if(i > Kviz.pitanja.size() - 1){
			return null;
		}
		return Kviz.pitanja.get(i);
	}
}
