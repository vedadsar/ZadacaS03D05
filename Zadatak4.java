/** Napisati funkciju koja korisniku omogucava da unosi proizvoljni broj cijelih brojeva,

unos brojeva treba prekinuti kad korisnik unese -1, ovdje -1 ne racunamo kao deseti 

uneseni broj. Fukcija treba da vrati zadnjih 10 unesenih brojeva. Funciju demonstrirati 

u programu koji ce od korisnika traziti da unosi brojeve a zatim ispisuje zadnjih 10 

unesenih brojeva u istom redoslijedu u kojem su uneseni.
 */


public class Zadatak4 {
/**
 * Funkcija prima brojeve, i smjesta ih u niz. Na unos -1 program prekida unos. 
 * Zatim funkcija uzima i ispisuje zadnjih 10 unesenih brojeva ( novi niz )
 * @return = Niz zadnjih 10 unesenih brojeva.
 */
	public static int[] unosBrojeva() {
		
		int kraj = -1;
		int unos = 0;
		int brojac=0;
		int[] niz = new int[100];
		int[] praviNiz = new int[10];
		System.out.println("Unesite bar 10 brojeva razlicitih od -1");
		do {
			int i=0;
			while (unos != kraj) {
				System.out.println("Unesite broj");
				unos = TextIO.getlnInt();

				if (unos == kraj) {
					System.out.println("Unijeli ste -1, prekid");
					break;
				}
				brojac++;
				niz[i] = unos;
				i++;
			}  
		} while (unos != kraj);
        
		
		
		for(int j=0; j<10;j++){
			
			praviNiz[j] = niz[(brojac-10)];
			brojac++;
		}
		
		System.out.println("Zadnjih 10 brojeva koje ste unijeli su: ");
		for (int i = 0; i <10 ; i++) {
			System.out.print(praviNiz[i] +" ");
			
		}
		
		
		
		return niz;
	}

	public static void main(String[] args) {
		
		unosBrojeva();
	}
}
