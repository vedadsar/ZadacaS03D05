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
		str = str +" ";
		String novaRijec = "";
		char karakter = ' ';
		int i = 0, j = 0;

		while (i < str.length()) {
			if (str.charAt(i) != karakter) {// Trazenje rijeci, kada dodjemo da razmaka odvajamo rijec.
				novaRijec = novaRijec + str.substring(i, i + 1);
	              
			} else {// provjeravamo da li je rijec koju ispitujemo palindrom, rijec mora biti veca od 2 ( nekako logicno )
			if(novaRijec.equalsIgnoreCase(okrenutaRijec(novaRijec)) && novaRijec.length()>2){
				nizStringova[j] = novaRijec; //Novu rijec ubacujemo u niz stringova.
				j++;// povecavamo index niza stringova.
			}
				
				novaRijec = "";// Novu rijec vracamo na prazan string
			}

			i++;//povecavamo brojac karaktera.
             
		}
        
		for (int k = 0; k < nizStringova.length; k++) {//for petlja za ispis niza
             if(nizStringova[k]==null){// ukoliko je neki clan jednak null da preskoci
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
		for(int i = (rijec.length()-1);i>=0;i--){//for petlja ubacuje u novi string rijeci od zadnje do pr ve.
		
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