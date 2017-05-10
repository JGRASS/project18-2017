package sistemske_operacije;

import java.io.BufferedInputStream;

import java.io.FileInputStream;

import java.io.ObjectInputStream;

import java.util.LinkedList;

import modeli.Kviz;
import modeli.Pitanje;

public class SOUcitajKviz {

	public static void izvrsi() {
		try {
			Kviz.pitanja.clear();
			ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("data/kviz.dat")));
			try {
				while (true) {
					Pitanje pitanje = (Pitanje) in.readObject();
					Kviz.pitanja.add(pitanje);
				}
			} catch (Exception e) {
			
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
