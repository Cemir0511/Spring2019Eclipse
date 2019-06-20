package day18;

public class VAsylLOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//while loop ile email i print ettirme:
		String email = "mike_tyson@gmail.com";
		int index = 0;
		while(index<email.length()){
			System.out.print(email.charAt(index++));
		}
		//email i tersten yazdirma while loop ile:
		System.out.println();
		while(index>0){
			System.out.print(email.charAt(--index));
		}
		
		
		System.out.println();
		index = 0;
		while(index<email.length()-1){
			System.out.print(email.charAt(++index));
		}
		
		
	}

}
