package day21LoopsPractice;
import java.util.Scanner;
public class NumberMoreThan100  {
            //iki numaranin toplami more than 100 olana kadar num gir
	public static void main(String[] args) {
		//**Sum almayi iyi ogren, hep var
		Scanner scan = new Scanner(System.in);	
		int sum = 0;
		//int sumOfSums=o;	
		do {
			System.out.println("Enter 2 numbers");	
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		sum= num1+num2;
		//sumsOfSums+=sum;
			
		}while(sum<=100);
		
		System.out.println("Good Numbers");	
	}
}
