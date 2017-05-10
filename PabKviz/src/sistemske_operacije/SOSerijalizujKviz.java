package sistemske_operacije;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import modeli.Pitanje;

public class SOSerijalizujKviz {

	public static void izvrsi(LinkedList<Pitanje> pitanja) {
		try {
			ObjectOutputStream out = new ObjectOutputStream(
					new BufferedOutputStream(new FileOutputStream("data/kviz.dat")));
			for (Pitanje pitanje : pitanja) {
				out.writeObject(pitanje);
			}
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
