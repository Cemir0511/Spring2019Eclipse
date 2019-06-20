package day12;

import java.util.Scanner;

public class Day12Homework {
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number of the month:");
	int num = scan. nextInt();
	String season;
	
		
		switch (num) {
		case 1:
		case 2:	
		case 12:
			season ="Winter";
			break;		
		case 3:
		case 4:	
		case 5:
			season = "Spring";
			break;
		case 6:
		case 7:
		case 8:
			season = "Summer";
			break;
		case 9:
		case 10:
		case 11:
			season = "Fall";
			break;
		default:
			season = "Invalid Entry. Please Try Again!";
			break;
		}
		System.out.println("It is: " + season);
			
			
		
		
		
		
		
		
	}

}
