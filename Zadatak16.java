/**
 * Napisite funkciju koja prima niz cijelih brojeva vecih od nula, funkcija
 * treba da napravi dva nova niza, prosti i slozeni, koje treba da popuni
 * prostim odnosno slozenim brojevima iz niza primljenog kao parametar. Zatim
 * treba da u jednom redu ispise sve elemente iz niza prosti I u novom redu sve
 * elemente iz niza slozeni. Elementi trebaju biti odvojeni zarezom, osim
 * zadnjeg elementa.
 * 
 * @author vedadzornic
 *
 */
public class Zadatak16 {
	/**
	 * Funkcija ispisuje prosti i slozeni niz.
	 */
	public static void niz() {
		int[] niz = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Unesite 10 brojeva vecih od 0 ");
			int broj = TextIO.getInt();
			niz[i] = broj;

		}
		System.out.println("Vas prosti niz je : ");
		prostiNiz(niz);
		System.out.println();
		System.out.println("Vas slozeni niz je : ");
		slozenNiz(niz);

	}

	/**
	 * Funkcija prima neki niz, i vraca proste brojeve iz tog niza.
	 * 
	 * @param broj
	 *            niz brojeva
	 * @return niz prostih brojeva
	 */
	public static int[] prostiNiz(int[] broj) {
		boolean prost = true;
		int[] prostNiz = new int[broj.length];
		int idx = 0;
		for (int j = 0; j < broj.length; j++) {
			for (int i = 2; i < broj[j]; i++) {

				if (broj[j] == 1) {
					prost = true;

				}

				if (broj[j] % i == 0) {
					prost = false;
					break;

				}
				if (broj[j] % i != 0) {
					prost = true;

				}
			}
			if (prost) {
				prostNiz[idx] = broj[j];
				idx++;
			}

		}

		for (int i = 0; i < prostNiz.length; i++) {
			if(prostNiz[i] != 0){
			System.out.print(prostNiz[i] + " ");
		}
		}
		return prostNiz;
	}

	/**
	 * Funkcija prima neki niz, i vraca slozene brojeve iz tog niza.
	 * 
	 * @param broj
	 *            niz brojeva
	 * @return niz slozenih brojeva.
	 */
	public static int[] slozenNiz(int[] broj) {

		boolean prost = true;
		int[] slozeniNiz = new int[broj.length];
		int idx = 0;
		for (int j = 0; j < broj.length; j++) {
			for (int i = 2; i < broj[j]; i++) {

				if (broj[j] == 1)
					prost = false;

				if (broj[j] % i == 0 && broj[j] != 1) {
					prost = true;
					break;

				}
				if (broj[j] % i != 0) {
					prost = false;

				}
			}
			if (prost) {
				slozeniNiz[idx] = broj[j];
				idx++;
			}

		}

		for (int i = 0; i < slozeniNiz.length; i++) {
			if (slozeniNiz[i] != 0 && slozeniNiz[i] != 1) {
				System.out.print(slozeniNiz[i] + " ");
			}
		}
		return slozeniNiz;

	}

	public static void main(String[] args) {
		niz();

	}

}