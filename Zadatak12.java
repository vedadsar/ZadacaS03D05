/**
 * Napisite funkciju koja kao parametar prima cijeli broj n a vraca njegovu binarnu
reprezentaciju u obliku string-a. Binarna reprezentacija treba da ima 8 bitova, 
odnosno broj 255 ce biti 11111111 a broj 3 ce biti 00000011.
Napomena
Pri izradi zadatka zabranjeno je koristiti metode iz Integer klase. Prisjetiti se da se 
negativni binarni brojevi mogu dobiti pomocu komplementa dvojke.
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

	private static void binarni(int unos) {
		String binarniBroj = "";
		for ( int i = 0; i<8;i++){
			
			if(unos % 2 != 0){
				binarniBroj="1"+binarniBroj;
				
			}
			if(unos % 2 ==0){
				binarniBroj="0"+binarniBroj;
			}
			
			unos=unos/2;
			
		}
		System.out.println(binarniBroj);
	}
}