package repl.it;

import java.util.Scanner;

public class Repl71 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String email = scan.next();
	    String firstName = "";
	    String lastName = "";
	    String lastForm = "";
	    int count=email.length();
	    
	      firstName=email.substring(0, email.indexOf("_"));
	      lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
	       lastForm= email.substring ("@", count);
	      if(email.contains("_")) {
	      System.out.println(lastName+"_"+firstName+lastForm);
	    }else{
	      System.out.println(email);
	    }
	      
	

	
	}

	private static int indexOf(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

}
