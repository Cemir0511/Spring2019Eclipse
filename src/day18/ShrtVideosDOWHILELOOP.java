package day18;

public class ShrtVideosDOWHILELOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Do While Loop :
		
		int apples= 1;
		int totalCips=5;
		 do { 
			 System.out.println("eating apples:" +apples);
			 apples++;
		 } while (apples<7);
			 
			 //baska ornek:
		 
		 int chipsPackage= 1;
		 
		 do {
			 System.out.println("packages of chips:" +chipsPackage);
			 chipsPackage++;
		 }while (chipsPackage<6);
		 System.out.println(totalCips);
			 
		 
		 int fruits=1;
		 int totalFruits=15;
		 do {
			 System.out.println("eating fruits" +fruits);
			 fruits++;
			 
		 }while (fruits<+15);
		 
		 //PRINT NUMBERS WITH DO WHILE LOOP EX:
		 
		 
			int numbers = 1; // starts from 1
			int until = 17;
			
			do {
				
				System.out.println(numbers + ",");
				numbers++;
			}while(until >=numbers);
		 
			
			int num =5;
			do {
				System.out.println("&");
				num--;
			}while(num>=0);
	}

}
