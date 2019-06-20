package day21LoopsPractice;
import java.util.Scanner;
public class WarmUp {
	public static void main(String[] args) {
		/* WARM UP..with Do While Loop.common interview quest.
		ASK USER TWO NUMBER
		KEEP ASKING UNTIL THE SUM OF
		TWO NUMBERS ARE MORE THAN 100
		PRINT THE END AFTER THE LOOP
		*/
		//OPTIONAL : 3 ATTEMPS ONLY
		//bu ozellikle do while loopla yapilir!! cunku u need to try 
		//once..u let user try at least once, then check the condition, 
		//and do more times if needed.
		
		
		
	   
		
	    	
	    int num1=0;
	    int num2 = 0;
	    int attempts=0;
	    do {
	    	
		Scanner scanet= new Scanner(System.in) ;
		System.out.println("enter two numbers");
		num1=scanet.nextInt();
		num2=scanet.nextInt();
		  attempts++; //kac attempt yaptigini basa koy ki hesaplayabilsin, sonra if condition
		   if (attempts==3) {
			   System.out.println("you lost your chance");
			   break;
		   }
		 
	    }while( num1+num2<=100);
	    System.out.println("the end");
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int x=0, y=0;
		int tryCount=0;
		Scanner scan=new Scanner(System.in) ;
	do {
		System.out.println("Enter num1:");
	    x=scan.nextInt();
		System.out.println("Enter num2:");
	    y=scan.nextInt();
	    
		++tryCount;//kac attemp olacagini sayi verdik
		if(tryCount==3) { //3 kere den sonra lost olacak
			System.out.println("You lost!");//clear olsn dite
			break; //to get out of the loop
		}	
	}while (x+y<=100); 
		System.out.println("THE END");	
	}
	
}


