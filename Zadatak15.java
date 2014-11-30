
/**
 * Citav program je copy paste zadatka 14, samo umjesto znaka "+", znak "-".
 * @author Vedad
 *
 */

public class Zadatak15 {

	public static int binToInt(String bin) {

		int stepen = 128;
		int zbir = 0;
		while (bin.length() < 8) {
			bin = "0" + bin;

		}

		for (int i = 0; i < 8; i++) {
			if (bin.charAt(i) == '1') {

				zbir = zbir + stepen * 1;
			}
			stepen = stepen / 2;
		}

		return zbir;
	}

	public static int zbirBin(String bin1, String bin2) {

		int sumaBin = binToInt(bin1) - binToInt(bin2);

		return sumaBin;
	}

	private static void stringZbirBin(int sumaBin) {

		String binarniBroj = "";
		for (int i = 0; i < 8; i++) {

			if (sumaBin % 2 != 0) {
				binarniBroj = "1" + binarniBroj;

			}
			if (sumaBin % 2 == 0) {
				binarniBroj = "0" + binarniBroj;
			}

			sumaBin = sumaBin / 2;

		}
		System.out.println(binarniBroj);
	}

	public static void main(String[] args) {
		System.out
				.println("Unesite binarni brojeve koje hocete da saberemo ( maksimalno 8 brojeva) ");
		String unos1 = TextIO.getln();
		String unos2 = TextIO.getln();
		stringZbirBin(zbirBin(unos1, unos2));
	}
}