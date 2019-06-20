package day17;

import java.util.Scanner;

public class warmUpRepl74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*We have a message variable already declared and assigned value in this format

Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}

Variables are already declared:

sender, phoneNumber, message
- by using String methods:
retrieve related information from SMSmessage string and assign to those 3 variables.
-print each variable in separate line

Sender: Mike Smith
Phone Number: 202-123-3456
Message body: I love programing and problem solving
		 * Sender: Mike Smith
Phone Number: 202-123-3456
Message body: I love programing and problem solving
		 * 
		 */
		
		
		
		Scanner scan = new Scanner(System.in);
	    String message = scan.nextLine();
	    String sender;
	    String phoneNumber;
	    String messageBody;
	    
	    
	    
	    int firstVariable = message.indexOf("<");
	    int secondVariable = message.indexOf(">");
	    int thirdVariable = message.indexOf("[");
	    int fourthdVariable = message.indexOf("]");
	    int fifthVariable = message.indexOf("{");
	    int sixthdVariable = message.indexOf("}");
	    
	    sender =    message.substring(firstVariable+1,secondVariable);
	    phoneNumber = message.substring(thirdVariable+1,fourthdVariable);
	    messageBody =  message.substring(fifthVariable+1,sixthdVariable);
	    
	    System.out.println("Sender: "+sender);
	    System.out.println("Phone Number: "+phoneNumber);
	    System.out.println("Message body: "+messageBody);
	    
	    
	    
	}

}
