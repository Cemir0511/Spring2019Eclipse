package myworksheetLoopsStringNAmePrintD2021;

public class CharByCharZelihaYazdirma {

	public static void main(String[] args) {
		
		String str= "Zeliha";
		
		int x=0;
		do {
			char c = str.charAt(x);
			System.out.print(c);
			x++;
			
		}while(x<str.length());
		
		System.out.println();
		String name= "Zeliha Kemal Cemal Melih";
		
		int i=0;
		do {
			char y =name.charAt(i);
			System.out.print(y);
			i++;
			
		}while(i<name.length());
		
		
		

	}

}
