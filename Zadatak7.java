/**
 * Napisati funkciju koja za neku unesenu recenicu(string) ispisuje sve simetricne rijeci

(palindrome), odnosno sve rijeci koje se citaju jednako sa obje strane. Takve rijeci su 

naprimjer Ana, kapak, pop.
 */
import java.util.Scanner;

public class Zadatak7 {

	/**
	 * Funkcija okrece jedan string i ispisuje niz stringova okrenutim
	 * redosljedom.
	 * 
	 * @param rijec
	 * @return
	 */
	public static void main(String[] args) {

	}

	
	public static char[] normalanNiz(String recenica) {

		char[] normNiz = recenica.toCharArray();
		 return normNiz;
	}
	
	public static char[] okrenutiNiz(String recenica){
		
		char [] okrNiz = recenica.toCharArray();
		char [] niz;
		for (int i=okrNiz.length-1;i>=0;i--){
			niz[i]=okrNiz[i];
			
		}
	}

}
