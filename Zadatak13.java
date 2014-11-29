public class Zadatak13 {

	
	
	
	
	public static void main(String[] args) {
	System.out.println("Unesite vas broj: ");
	int unos = TextIO.getInt();
	System.out.println("Vas broj u binarnom sistemu glasi: ");
	System.out.print("{ ");
	binarni(unos);
	System.out.println("}");
	
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
		char [] binarniNiz = new char [8];
		binarniNiz = binarniBroj.toCharArray();
		
		for(int i =0; i<8;i++)
		System.out.print( binarniNiz[i] +" ");
	}
}
