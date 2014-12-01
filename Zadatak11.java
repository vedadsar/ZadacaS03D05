/**
 * Napisite funkciju koja prima neki string kao parametar, a koja vraća kao rezultat
isti string sifriran Cezarovom šifrom. Ova sifra spada u najstarije poznate sisteme 
sifrovanja, prema kojoj se svaki znak izvorne recenice zamijenjuje sa znakom koji 
se po abecedi nalazi 3 znaka ispred (uz izuzetak posljednja tri znaka abecede, koji se 
mijenjaju sa prva tri znaka abecede).
Primjer
String bitcamp treba da postane elwfdps
 * @author Vedad
 *
 */
public class Zadatak11 {
	/**
	 * Funkcija prima string (rijec) i svaki karakter te rijeci pomjera za 3 vrijednosti u ascii tabeli.
	 * @param rijec
	 */
	public static void ispis(String rijec){
		char [] niz = rijec.toCharArray();
	
		for (int i =0; i<niz.length;i++){
			int j=niz[i]+3;
		
			
			
			System.out.print((char)j );
		}
		
	}
	
	
public static void main(String[] args) {
	
	System.out.println("Unesite vasu rijec: ");
	String rijec = TextIO.getln();
	System.out.println("Vasa rijec sifrovana glasi: ");
	ispis(rijec);
	
}
}