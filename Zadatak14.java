public class Zadatak14 {
/**
 * funkcija pretvara binarni broj u int.
 * @param bin bilo koji binarni broj.
 * @return int broj
 */
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
/**
 * funkcija sabira dva broja koja cemo poslije vratiti u binarni string.
 * @param bin1  broj1
 * @param bin2 broj 2 
 * @return suma.
 */
	public static int zbirBin(String bin1, String bin2) {

		int sumaBin = binToInt(bin1) + binToInt(bin2);

		return sumaBin;
	}
/**
 * funkcija pretvara broj u binarni broj ( ubacuje u string )
 * @param sumaBin
 */
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
