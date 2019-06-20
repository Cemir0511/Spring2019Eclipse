package myworksheetLoopsStringNAmePrintD2021;

public class ZelihaDaKacAVar {

	public static void main(String[] args) {
		
		String name="ZelihaaaAA";
		
		int count=0;
		int x=0;
		
		do {
			char c= name.charAt(x);
			if (c=='a' || c=='A') {
				System.out.println("Bingo at index: " + x );
				count++;
			}
				x++;//karakteri icrement etmeyi unutma
		
			
		}while(x<name.length());
		
		
		System.out.println("total a seen is: " + count);
		
		
		
		

	}

}
