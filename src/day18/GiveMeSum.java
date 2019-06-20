package day18;

import java.util.Scanner;

public class GiveMeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Sayi girilip, hepsinin toplamini hesaplatma: whileda ust limiti yazacaksin
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		int count=1;
		
		while(count<20) {
			
			sum= sum+count;
			System.out.println("current sum is: " + sum + "and"+ "count is: " +count);
			//System.out.println(count);
			count++;
		}
		System.out.println("total sum is: "+sum);
		
		/*Birinin:
		 * int firstNumber = 0;
        int secondNumber = 0;
        int total = 0;
        int tempNumber = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        firstNumber = scan.nextInt();
        System.out.println("Enter second number: ");
        secondNumber = scan.nextInt();
        
        if ( firstNumber > secondNumber) {
            tempNumber = firstNumber;
            firstNumber = secondNumber;
            secondNumber = tempNumber;
        }
        int x = firstNumber;
        while (x <=secondNumber) {
            total = total + x++;
        }
        System.out.println("The total :"+total);
		 */
		
		
		// how do you get the the sum of number 
				// starting from one till desiged number 
				// user input 5 --> 1+2+3+4+5 = 15 ; 
				
			//	int sum = 0 ; 
				// 1 + 0 = 1 
				// 2 + 1 = 3 
				// 3 + 3 = 6 
				// ..... 
				//int count = 1 ; 
				
				//while(count <=100) {
					
				//	sum = sum + count ; 
				//	System.out.println("current sum :"+sum + " count is "+ count );
					//System.out.println(count);
					//count++;
				//}
				
				//System.out.println(sum);

		
	}

}
