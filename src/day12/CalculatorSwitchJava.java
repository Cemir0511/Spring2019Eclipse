package day12;

public class CalculatorSwitchJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// ask 2 numbers from the user
				// ask the operation from the user
				Scanner scan = new Scanner(System.in);

				System.out.println("Enter 2 numbers : ");
				int num1 = scan.nextInt();
				int num2 = scan.nextInt();

				System.out.println("Enter Operator  + , - , * , /  : ");
				String operator = scan.next();

				/// Task 3 : USE SWITH STATEMENT TO ACCOMPLISH SAME TASK as below
				// optionally use ternary operator

				switch (operator) {
				case "+":
					System.out.println("the addition result is " + (num1 + num2));
					break;
				case "-":
					System.out.println("the substraction result is " + (num1 - num2));
					break;
				case "*":
					System.out.println("the multiplication result is " + (num1 * num2));
					break;
				case "/":
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

			}

		}

		
		
	}

}
