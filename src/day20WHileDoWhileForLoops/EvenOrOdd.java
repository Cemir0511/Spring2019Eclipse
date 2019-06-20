package day20WHileDoWhileForLoops;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		//if statements 
				//using for loop: 1-100 ...
				//1.print all even numbers in same line  ..if statement
				for(int n = 1; n <= 100; n++) {
					if(n % 2 == 0) { //check if it is even
						System.out.print(n+" ");
				
					}
				 for (int t = 1; t<=100; t++)
					 if (t%2==0)
					 System.out.println(t);
				
				}
				

				System.out.println();
				//2.print all odd numbers in same line
				for(int j = 1; j <= 100; j++) {
					if(j % 2 != 0) {
						System.out.print(j +" ");
					}
				}
				//3.sumOfOdds, sumOfEvens -  calculate them
				// and print out after the loop
				//sum of 1 - 10
				//1+2+3+4+5+6+7+8+9+10

				System.out.println();

				int sumOfOdds = 0;
				int sumOfEvens = 0;

				for(int num = 1; num <= 100; num++) {
					if(num % 2 == 0) {
						sumOfEvens += num;
					}else {
						sumOfOdds += num;
					}
				}

				System.out.println("Sum of evens:" + sumOfEvens);
				System.out.println("Sum of odds:" + sumOfOdds);
		         
			/*	
				int k=0;
				
				int sum=0;
				
				
				for ( k=1;k<=100;k++) {
					sum=sum+k;	
						
				System.out.print("k is:"+ k+" ");
					System.out.println(("sum is: "+ sum));
				
				}
			*/	
	}

}
