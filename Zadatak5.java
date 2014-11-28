/**
 * Napisati funkciju razdijeli koja prima 2 parametra, varijablu tipa string i
 * varijablu tipa
 * 
 * char.
 * 
 * Funkcija treba da vrati niz stringova koji se sastoje od dijelova koje
 * dobijemo kad
 * 
 * poslani string podijelimo na mjestima gdje se pojavljuje znak koji smo
 * poslali.
 * 
 * Primjer:
 * 
 * Ako funkciju pozovemo sa parametrima “ovaj zadatak je zabavan” i znakom
 * 
 * razmak ‘ ‘ funkcija treba da vrati niz { “ovaj”, “zadatak”, “je”, “zabavan” }
 * 
 * Napomena:
 * 
 * Pri izradi zadatka zabranjeno je koristiti metodu split iz klase string.
 * 
 * @author vedadzornic
 *
 */
public class Zadatak5 {

	public static String[] podjeljeniString(String[] nekiString) {
		String[] str = nekiString;
		for (int i = 0; i < nekiString.length; i++) {

			System.out.print(nekiString[i] + " ");

		}

		return str;
	}

	public static String[] str(String recenica, char karakter) {
		String[] nizStringova = new String[recenica.length()];
		String novaRijec = "";
		int i = 0, j = 0;

		while (i < recenica.length()) {
			if (recenica.charAt(i) != karakter) {
				novaRijec = novaRijec + recenica.substring(i, i + 1);

				
			} else {
				nizStringova[j] = novaRijec;
				j++;
				novaRijec = "";
			}

			i++;

		}
		return nizStringova;
	}

	public static void main(String[] args) {

		System.out.println("Unesire recenicu");
		String rijec = TextIO.getln();
		System.out.println("Unesite karakter");
		char slovo = TextIO.getChar();
        String rijec1 = rijec + slovo;
		podjeljeniString(str((rijec1), slovo));
	}

}