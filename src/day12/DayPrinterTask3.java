package day12;

import java.util.Scanner;

public class DayPrinterTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Task4
		
		//Switch vs if else
		//Switch:should be used when checkinh
		/* switch statement to accomplish this task 
	     *  
	     *  declare a int variable dayNum 
	     *  declare a String variable dayWord
	     *  
	     *  use switch to check for equality of dayNum 
	     *  case 1  --- assign the value for dayWord as Monday 
	     *  case 2  --- assign the value for dayWord as Tuesday 
	     *  case 3  --- assign the value for dayWord as Wednesday
	     *  case 4  --- assign the value for dayWord as Thursday 
	     *  case 5  --- assign the value for dayWord as Friday 
	     *  case 6  --- assign the value for dayWord as Saturday 
	     *  case 7  --- assign the value for dayWord as Sunday
	     *  
	     *  if nothing match assign value dayWord as invalid day 
	     *  
	     *  after switch statement -- print out the dayWord value 
	     *   
	     *   
	     *  
	     * 
	     * 
	     * */
		
	    Scanner scan = new Scanner(System.in);

	    System.out.println("Enter Day number : ");
	    int dayNum = scan.nextInt();
		String dayWord="unknown";
		
		switch (dayNum) {
		case 1 :
			dayWord="Monday";
			
			break;
			
         case 2:
			
			dayWord = "Tuesday";
		
            		
			break;
			
		case 3:
			
			dayWord = "Wednesday";
            			
			break;
			
         case 4:
			
			dayWord = "Thursday";
               
			break;
			
		case 5:
			
			dayWord = "Friday";
		
            		
			break;
			
		    case 6:
			
			dayWord = "Saturday";
            		
			break;

            case 7:
			
			dayWord = "Sunday";
            		
			break;

		default: 
			
			System.out.println("It is not Valid Entry");
			break;
			
		
			
		
			
			
		
		
		
		
		//Akbarin notlar
		/*Scanner scan = new Scanner(System.in);

		    System.out.println("Enter 2 numbers : ");
		    int num1 = scan.nextInt();
		    int num2 = scan.nextInt();

		    System.out.println("Enter Operator  plus , minus , muliply , divide  : ");
		    String operator = scan.next();
		    
		    /// Task 3 : USE SWITH STATEMENT TO ACCOMPLISH SAME TASK as below
		    // optionally use ternary operator

		    switch (operator.toLowerCase()  ) {
		    case "plus":
		      System.out.println("the addition result is " + (num1 + num2));
		      break;
		    case "minus":
		      System.out.println("the substraction result is " + (num1 - num2));
		      break;
		    case "muliply":
		      System.out.println("the multiplication result is " + (num1 * num2));
		      break;
		    case "divide":
		      System.out.println("the division result is " + (num1 / num2));
		      break;

		    default:
		      System.out.println("INVALID ENTRY");
		      //break;
		    }

		    // if(operator.equals("+")){
		    // System.out.println("the addition result is " + (num1+num2) );
		    //
		    // }else if(operator.equals("-")){
		    // System.out.println("the substarction result is " + (num1-num2) );
		    //
		    // }else if(operator.equals("*")){
		    // System.out.println("the multiplication result is " + (num1*num2) );
		    //
		    // }else if(operator.equals("/")){
		    // System.out.println("the division result is " + (num1/num2) );
		    //
		    // }else{
		    // System.out.println("INVALID OPERATOR!");
		    // }
		    //
		     * */

		
		/*
		
		
		package day12;

import java.util.Scanner;

public class DayPrinter {

  public static void main(String[] args) {
    // Task 4
    /*
     * Switch VS Ternary VS if else
     * 
     * Switch : should be used when checking for equality of certain
     * variable in multiple specific case Ternary : conditionally assigning
     * a value . we can not take actions we can only assign value according
     * to condition If else : most flexible , can do anything
     * 
     * use switch statement to accomplish this task
     * 
     * declare a int variable dayNum declare a String variable dayWord
     * 
     * use switch to check for equality of dayNum case 1 --- assign the
     * value for dayWord as Monday : dayWord = "Monday" ; case 2 --- assign
     * the value for dayWord as Tuesday case 3 --- assign the value for
     * dayWord as Wednesday case 4 --- assign the value for dayWord as
     * Thursday case 5 --- assign the value for dayWord as Friday case 6 ---
     * assign the value for dayWord as Saturday case 7 --- assign the value
     * for dayWord as Sunday
     * 
     * if nothing match assign value dayWord as invalid day
     * 
     * after switch statement -- print out the dayWord value
     * 
     */
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter Day number : ");
    int dayNum = scan.nextInt();
    String dayWord = "Unknown";

    switch (dayNum) {

    case 1:
      dayWord = "Monday";
      break;
    case 2:
      dayWord = "Tuesday";
      break;
    case 3:
      dayWord = "Wendesday";
      break;
    case 4:
      dayWord = "Thursday";
      break;
    case 5:
      dayWord = "Friday";
      break;
    case 6:
      dayWord = "Saturday";
      break;
    case 7:
      dayWord = "Sunday";
      break;

    default:
      dayWord = "Invalid Day";
      break;
    }
    System.out.println("the day is:" + dayWord);

  }

}


// Shared via @CodeMix. To open this file type:
// /code-open DayPrinter.java 1-72 lg/HBg
		
	*/
			
	
	/*
	 * 
	 * 
	 * Esranin ternary:
	 * dayWord=num1==1?"monday"
				:num1==2?"tuesday"	
				:num1==3?"wednesday"
				:num1==4?"thursday"
				:num1==5?"friday"
				:num1==6?"saturday"
				:num1==7?"sunday"
				:"invalid number";
		System.out.println(dayWord);
		
	 * */
	 */
		
		  }

		}

		
		
		
	}

}
