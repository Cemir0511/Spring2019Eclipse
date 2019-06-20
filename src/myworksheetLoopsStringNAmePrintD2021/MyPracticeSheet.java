package myworksheetLoopsStringNAmePrintD2021;

public class MyPracticeSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String word= "aabcdd";
		
		for (int i =0; i <word.length()-1;i++) {
			if(word.charAt(i)==word.charAt(i+1)) {
				
			
			System.out.println(" Beep"+word.charAt(i));
			
			
			}
		}
		
		
	}

}
