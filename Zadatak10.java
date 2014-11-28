/**
 * Napisite program koji prvo trazi da se sa tastature unese reèenica, a koji
 * zatim ispisuje
 * 
 * posljednju rijeè te reèenice. Dobro obratite paþnju na to da reèenica moze
 * imati samo
 * 
 * jednu rijec, kao i da se nakon posljednje rijeci u recenici mogu nalaziti
 * razmaci (koje
 * 
 * ne treba ispisivati).
 * 
 * @author Vedad
 *
 */
public class Zadatak10 {

	public static String str(String recenica) {

		int brojac = 0;
		for (int i = 0; i < recenica.length(); i++) {
			recenica = recenica.trim();
		

		}
		System.out.println(recenica.substring(1+recenica.lastIndexOf(' ')));
		return recenica.substring(brojac);
	}

	public static void main(String[] args) {
		System.out.println("Unesite vasu recenicu");
		String recenica = TextIO.getln();
		System.out.println("Zadnja rijec vase recenice je: ");	
		str(recenica);

	}
}