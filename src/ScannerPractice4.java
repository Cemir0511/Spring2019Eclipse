import java.util.Scanner;

public class ScannerPractice4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
    //scanner shorthcut   command shft o
		

		//ask user question
		//System.out.println("Enter your name today: ");
		
		
		//save user input into String
		String name = input.next();//this will only pick up a word as stringf
		
       // System.out.println("Enter you age today");
        //save user input into int
       // int age = input.nextInt();
        //Task2
		//ask user to enter birth year as a number
		//and calculate user's age
		//System.out.println("Enter your birth year please");
		//int birthYear = input.nextInt();
		//int age = 2019-birthYear;
		
		//Be careful, bear shouldn't ingest large fluffy dog
		// boolean, char, byte, short, int, long, float, double
		
		System.out.println("Enter float value:");
		
		//byte b1 = input.nextByte();
		
	    //Short b1 = input.nextShort();
		
		//float b1 = input.nextFloat();
		//double d1 = input.nextDouble();
		System.out.println("you have entered float value");
		
		//System.out.println("so your age is:" + (2019 - birthYear) );
        //System.out.println("Your name is" +name);
       // System.out.println("your age is"+ age);
        
        System.out.println("are you hungry?");
        boolean isHungry = input.nextBoolean();
        System.out.println("I am hungry"+ isHungry);
        
        
		System.out.println("Your name is " +name+
        		           " \n your age is" );
        
        
        
        
        
	}

}
