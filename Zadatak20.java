public class Zadatak20 {
/**
 * Funkcija deklarise prvu matricu.
 * @return
 */
	public static int[][] prvaMatrica() {

		System.out.println("unesite format matrica");
		int kolona = TextIO.getInt();
		int red = TextIO.getInt();

		int[][] matrica = new int[kolona][red];

		for (int i = 0; i < kolona; i++) {
			for (int j = 0; j < red; j++) {
				System.out.println("Unesite broj");
				int unos = TextIO.getInt();
				matrica[i][j] = unos;
				
			}
		
		}
		
		
		for ( int i=0; i<matrica.length;i++){
			for(int j=0;j<matrica[i].length;j++){
				
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
			
		}
		
		

		return matrica;
	}
/**
 * Funkcija deklarise drugu matricu
 * @return
 */
	public static int[][] drugaMatrica() {

		System.out.println("unesite format matrica");
		int kolona = TextIO.getInt();
		int red = TextIO.getInt();

		int[][] matrica = new int[kolona][red];

		for (int i = 0; i < kolona; i++) {
			for (int j = 0; j < red; j++) {
				System.out.println("Unesite broj");
				int unos = TextIO.getInt();
				matrica[i][j] = unos;
				
			}
		
		}
		
		
		for ( int i=0; i<matrica.length;i++){
			for(int j=0;j<matrica[i].length;j++){
				
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
			
		}
		
		

		return matrica;
	}

	/**
	 * Funkcija sabira dvije matrice po sistemu, i ispisuje novu zbir matricu.
	 * @param prva matrica
	 * @param druga matrica
	 * @return
	 */
	public static int[][] sumaMatrica(int [][] prva, int [][]druga){
		int [][] sumaMatrica =new int [prva.length] [prva.length];
		
		
		if(prva.length != druga.length){
			System.out.println("Matrice nisu istih dimenzija");
			return sumaMatrica;
		}
		
		
		
		for (int i=0; i<prva.length; i++){
			for(int j=0; j<prva[i].length;j++){
				sumaMatrica[i][j]=prva[i][j] + druga[i][j];
			}
			
		}
		System.out.println("Suma matrica je ");
		for ( int i=0; i<sumaMatrica.length;i++){
			for(int j=0;j<sumaMatrica[i].length;j++){
				
				System.out.print(sumaMatrica[i][j] + " ");
			}
			System.out.println();
			
			
		}
		return sumaMatrica;
		
	}
	

	
	
	public static void main(String[] args) {

	sumaMatrica(prvaMatrica(), drugaMatrica());
		
	}
}
