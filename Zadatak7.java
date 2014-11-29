/**
 * Napisati funkciju koja za neku unesenu recenicu(string) ispisuje sve simetricne rijeci
(palindrome), odnosno sve rijeci koje se citaju jednako sa obje strane. Takve rijeci su 
naprimjer Ana, kapak, pop.
 */
import java.util.Scanner;

public class Zadatak7 {

	
/**
 * Funkcija provjeravava svaku rijec da li je jednaka sa njenom okrenutom rijeci
 * iz funkcije okrenutaRijec. Ukoliko jeste, ubacuje je u niz stringova.
 * @param str = nasa recenica
 * @return = niz stringova palindroma
 */
	public static String[] nizRijeci(String str) {

		String[] nizStringova = new String[str.length()];
		String novaRijec = "";
		char karakter = ' ';
		int i = 0, j = 0;

		while (i < str.length()) {
			if (str.charAt(i) != karakter) {
				novaRijec = novaRijec + str.substring(i, i + 1);
	              
			} else {
			if(novaRijec.equalsIgnoreCase(okrenutaRijec(novaRijec))){
				nizStringova[j] = novaRijec;
				j++;
			}
				
				novaRijec = "";
			}

			i++;
             
		}
        
		for (int k = 0; k < nizStringova.length; k++) {
             if(nizStringova[k]==null){
            	 nizStringova[k]="";
             }
			System.out.print(nizStringova[k] + " ");
		}
		
		return nizStringova;
	}

	
/**
 * Funkcija prima jednu rijec, i okrece je.
 * @param rijec bilo koji string
 * @return okrenuta rijec.
 */
	public static String okrenutaRijec (String rijec){
		
		String okrenutaRijec = "";
		for(int i = (rijec.length()-1);i>=0;i--){
		
			okrenutaRijec= okrenutaRijec+ ""+rijec.charAt(i);
			
		
		}
		okrenutaRijec = okrenutaRijec.trim();
		return okrenutaRijec;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Unesite vasu recenicu");
		String recenica=TextIO.getln();
		System.out.println("Palindromi u vasoj recenicu su: ");
		
		nizRijeci(recenica);
         
	}
}