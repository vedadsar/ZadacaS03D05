/**
 * Napisati funkciju pomjeriLijevo koja prima niz brojeva a zatim svaki od
 * clanova niza
 * 
 * pomjeri za jedno mjesto u lijevo. Vrijednost iz prvog clana niza treba biti
 * izbacena, a
 * 
 * zadnji clan niza (nakon pomjeranja) treba imati vrijednost 0.
 * 
 * Primjer:
 * 
 * Ako funkciji posaljemo niz {1, 2, 3, 4, 5} funkcija treba da vrati niz {2, 3,
 * 4, 5, 0}
 * 
 * @author vedadzornic
 *
 */
import java.util.Scanner;

public class Zadatak3 {
/**
 * Funkcija upisuje brojeve u niz
 * @param brojClanova = broj clanova niza, bilo koji int.
 * @return niz brojove
 */
	public static int[] niz(int brojClanova) {
		Scanner in = new Scanner(System.in);
		int[] niz = new int[brojClanova];
		for (int i = 0; i < brojClanova; i++) {
			System.out.println("Unesite broj");
			int broj = in.nextInt();
			niz[i] = broj;

		}
		return niz;
	}
/**
 * Novi niz pomjeren za jedno mjesto u lijevo. zadnja pozicija 0.
 * @param niz  niz integera.
 * @return niz pomjeren u lijevo.
 */
	public static int[] promjeniNiz(int[] niz) {

		for (int i = 1; i < niz.length; i++) {
			niz[i - 1] = niz[i];

		}
		niz[niz.length - 1] = 0;
		for (int i = 0; i < niz.length; i++)
			System.out.print(niz[i] + " ");

		return niz;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Unesite broj clanova niza");
		int broj = in.nextInt();
		promjeniNiz(niz(broj));

	}
}
