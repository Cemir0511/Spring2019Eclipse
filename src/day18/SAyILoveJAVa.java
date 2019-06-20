package day18;

import java.util.Scanner;

public class SAyILoveJAVa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String theAnswer="";
		System.out.println("");
				while(! theAnswer.equalsIgnoreCase("yes") ) {//negate yapmazsan direk cikar 
					                                          //looptan
					System.out.println("do you love java?");
					theAnswer=scan.next();
					
				}
		
		System.out.println("finallay correct answer!!");//loopa girmedi bile nunu yazmadiysa 

		
		
		
		/*Akbar's:
		 * String theAnswer = ""  ; 
    
    while(! theAnswer.equalsIgnoreCase("yes")) {
    
      System.out.println("DO YOU LOVE JAVA ? ");
      theAnswer = scan.next(); 
      
    }
    System.out.println("FINALLY , CORRECT ANSWER");

  }

}

		 */
	}

}
