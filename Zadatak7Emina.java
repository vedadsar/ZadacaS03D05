

public class Zadatak7Emina {
	/**
	 * Odredjuje da li je zadani string polindrom
	 * @param s String bilo koji string
	 * @return true ili false
	 */
	public static boolean DaLiJePalindrom(String s)
	{
		int i=0, j=0, brojac=0;
		while(s.length()-1-j>=0)
			{
			if(s.charAt(s.length()-1-j)== s.charAt(i)) brojac++;
			i++;
			j++;
			}
		if(brojac==s.length())return true;
		return false;
	}
	/**
	 * Ispisuje sve stringove koji su palindromi
	 * @param s String bilo koji string
	 */
	public static void Palindromi(String s)
	{
		String novaR="";
		int i=0;
		while(i<s.length())
		{
			if(s.charAt(i)!= ' ') 
				novaR+=s.substring(i, i+1);
			else 
			{
			if(DaLiJePalindrom(novaR)==true) System.out.println(novaR);
			novaR="";
			}
			i++;		
		}
	}
	public static void main(String[] args) {
		System.out.println("Unesite string: ");
		String s=TextIO.getlnString();
		Palindromi(s);
	}

}