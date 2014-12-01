/**
 * Za poslani string aaabbaaacddd funkcija treba da vrati a3b2a3cd3.
 * 
 * @author Vedad
 *
 */
public class Zadatak17 {
/**
 * Funkcija provjerava da li neki string sadrzi vise slova za redom te umjesto da ispise aaaa, ispisuje a4.
 * @param rijeci bilo koji string
 */
	public static void niz(String rijeci) {
		String[] niz = new String[10];
		String prazno = " ";
		int brojac = 0;
		rijeci = rijeci + prazno;
		int idx = 0;
		for (int i = 0; i < rijeci.length() - 1; i++) {

			String slovoI = "" + rijeci.charAt(i);
			String slovoI1 = "" + rijeci.charAt(i + 1);

			if (slovoI.equals(slovoI1)) {
				brojac++;
				
				
				
			} else {
				
				niz[idx] = slovoI + (brojac + 1);
				idx++;
				brojac = 0;

			}
        
		}
		for (int i = 0; i < niz.length; i++) {
        String jedan = "1";
			if (niz[i] == null) {
				niz[i] = "";
			}
			
			if(niz[i].contains(jedan))
				niz[i] = niz[i].substring(0,1);

			System.out.print(niz[i]);

		}

	}

	public static void main(String[] args) {
		System.out.println("Unesite vas string");
		String unos = TextIO.getln();
		niz(unos);
	}

}