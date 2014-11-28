/**
 * Napisite funkciju koja prima niz cijelih brojeva vecih od nula, funkcija treba da

napravi dva nova niza, prosti i slozeni, koje treba da popuni prostim odnosno 

slozenim brojevima iz niza primljenog kao parametar. Zatim treba da u jednom 

redu ispise sve elemente iz niza prosti I u novom redu sve elemente iz niza slozeni.

Elementi trebaju biti odvojeni zarezom, osim zadnjeg elementa.
 * @author vedadzornic
 *
 */
public class Zadatak16 {

	
	public static int[] niz(){
		int [] niz = new int [10];
		for(int i=0; i<10;i++){
			System.out.println("Unesite 10 brojeva vecih od 0 ");
			int broj = TextIO.getInt();
			niz[i]=broj;
		}
		
		return niz;
	}
	
	
	
	public static void main(String[] args) {
		
	}
	
}
