public class Zadatak18 {
/**
 * Funkcija izvrsava mnozenje i ispis tablice.
 * @param a kolona matrice
 * @param b  red matrice
 */
	public static void tablicaMnozenja(int a, int b) {

		int[][] tablica = new int[a][b];

		for (int i = 1; i <a; i++) {
			for (int j =1; j < b; j++) {
				tablica[i][j] =i*j;
              System.out.printf("%5d", tablica [i][j] );
              
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		System.out.println("Unesite format tablice mnozenja");
		int kolona = TextIO.getInt();
		int red = TextIO.getInt();
		
            tablicaMnozenja((kolona+1), (red+1));
	}
}
