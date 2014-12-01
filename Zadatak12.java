/**
 * Napisite funkciju koja kao parametar prima cijeli broj n a vraca njegovu binarnu
reprezentaciju u obliku string-a. Binarna reprezentacija treba da ima 8 bitova, 
odnosno broj 255 ce biti 11111111 a broj 3 ce biti 00000011.
Napomena
Pri izradi zadatka zabranjeno je koristiti metode iz Integer klase. 
 * @author Vedad
 *
 */
public class Zadatak12 {

	
	
	
	
	public static void main(String[] args) {
	System.out.println("Unesite vas broj: ");
	int unos = TextIO.getInt();
	System.out.println("Vas broj u binarnom sistemu glasi: ");
	binarni(unos);
	System.out.println(Integer.toBinaryString(unos));
	
}
/**
 * Funkcija pretvara pozitivne int brojeve u binarne brojeve.
 * @param unos
 */
	public static void binarni(int unos) {
		String binarniBroj = "";// prazan string koji cemo popunjavati sa nulama i jedinicama.
		for ( int i = 0; i<8;i++){
			
			if(unos % 2 != 0){//ukoliko je ostatak pri djeljenju unosa sa 2 razlicit od nule, na string dodajemo 1
				binarniBroj="1"+binarniBroj;
				
			}
			if(unos % 2 ==0){//ukoliko je ostatak pri djeljenju unosa sa 2 jednak  nuli, na string dodajemo 0
				binarniBroj="0"+binarniBroj;
			}
			
			unos=unos/2;// novi unos.
			
		}
		System.out.println(binarniBroj);
	}
}