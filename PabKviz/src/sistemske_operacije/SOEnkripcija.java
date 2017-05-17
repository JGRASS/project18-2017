package sistemske_operacije;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SOEnkripcija {

	public static String izvrsi(String sifra) {

		String md5 = null;

		if (null == sifra)
			return null;

		try {

			MessageDigest digest = MessageDigest.getInstance("MD5");

			digest.update(sifra.getBytes(), 0, sifra.length());

			md5 = new BigInteger(1, digest.digest()).toString(16);

		} catch (NoSuchAlgorithmException e) {

			e.printStackTrace();
		}
		return md5;
	}
}
