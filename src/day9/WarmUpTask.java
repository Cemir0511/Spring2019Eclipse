package day9;

public class WarmUpTask {

	public static void main(String[] args) {
		
int num1 , num2 , sum; 
		
		Scanner scan = new Scanner(System.in) ; 
		
		System.out.println("Enter two numbers : ");
		 num1 = scan.nextInt() ; 
		 num2 = scan.nextInt() ; 
		
		 /*
		  * {} -- curly braces 
		  * [] -- square bracket
		  * () -- parenthesis
		 
		  * Logical Operator &&, & ||, | , ! 
		  * && ---> AND  it will not evaluate right hand 
		  * 			side if left hand side is already false 
		  * & ---> AND it will always check both sides of operation
		  * || -->  OR  it will only evaluate right hand side 
		  * 				if left hand side is false
		  * | --->  OR  it will always evaluate both sides 
		  * ! --->  LOGICAL NOT 
		  * */
		 sum = num1 + num2 ; 
		 
		 
		 
		 if(sum > 100 ){
			 
			 System.out.println("you entered great numbers");
			 
		 }else{
			 
			 System.out.println("looks like your sum is less than or equal 100 ");
		 }
		 
		 
		
		
		

		
	}

}
