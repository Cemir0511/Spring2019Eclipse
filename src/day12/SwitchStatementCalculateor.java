package day12;

import java.util.Scanner;

public class SwitchStatementCalculateor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//ask two num fromusers
		//ask operation from the user
		//
		 // ask 2 numbers from the user
	    // ask the operation from the user
	    Scanner scan = new Scanner(System.in); 
	    
	    System.out.println("Enter 2 numbers : ");
	    int num1 = scan.nextInt();
	    int num2 = scan.nextInt();
	  
	    System.out.println("Enter Operator  + , - , * , /  : ");
	    String operator = scan.next(); 
	    
	    
	    //if hali:
//	    if(operator.equals("+")){
//	      System.out.println("the addition result is " + (num1+num2) );
	//    
//	    }else if(operator.equals("-")){
//	      System.out.println("the substarction result is " + (num1-num2) );
	//    
//	    }else if(operator.equals("*")){
//	      System.out.println("the multiplication result is " + (num1*num2) );
	//    
//	    }else if(operator.equals("/")){
//	      System.out.println("the division result is " + (num1/num2) );
	//    
//	    }else{
//	      System.out.println("INVALID OPERATOR!");
//	    }
//	     
	    
	    
	    //Switch hali:
	    switch (operator) {
	    case "+" : {
			System.out.println("The result is " + (num1+num2));
			break;
		}
		case "-" : {
			System.out.println("The result is " + (num1-num2));
			break;
		}		
		case "*" : {
			System.out.println("The result is " + (num1*num2));
			break;
		}			
		case "/" : {
			System.out.println("The result is " + (num1/num2));
			break;
		}
		case "%" : {
			System.out.println("The result is " + (num1%num2));
			break;
		}		

		default: {
			System.out.println("Invalid operator");
			break;
	    	
	    	
	    	
	    }
	    
	    
	    
	    
	    
	    //ternary hali:
		
	    System.out.println((operator.equals("*")
	    		?num1*num2:operator.contentEquals("-")
	    		?num1-num2:operator.contentEquals("/")
	    		?num1/num2:operator.contentEquals("+")
	    		?num1+num2:"Not available"));
	    
	    //baska ternary hali:
	    
	    System.out.println("Enter two numbers:");
		double n1=s.nextInt();
		double n2=s.nextInt();
		System.out.println("Enter operator:");
		String op=s.next();
		
		String result=(op.equals("+"))?"Additional result is: "+(n1+n2):
			(op.equals("-"))?"Substraction result is: "+(n1-n2):	
				(op.equals("*"))?"Multiplication result is: "+(n1*n2):
					(op.equals("/"))?"Division result is: "+(n1/n2):
						"INVALID OPERATOR";
					System.out.println(result);
	    
	    
	}

		}
