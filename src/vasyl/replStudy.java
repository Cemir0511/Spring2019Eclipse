package vasyl;

import java.util.Scanner;

public class replStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
	    String email = scan.next();
	    
	    String firstName;
	    String lastName;
	    
	    if(email.contains("_")){
	      
	    System.out.println(email.replace(firstName,lastName));
	    }else{
	      System.out.println(email);
	    }

	}

}
