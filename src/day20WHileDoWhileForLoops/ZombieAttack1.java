package day20WHileDoWhileForLoops;

import java.util.Scanner;

public class ZombieAttack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int inhabitants = scan.nextInt();

		int day = 0;
		while(inhabitants > 0) {
			System.out.println("Day "+day+" [" + inhabitants +"]");
			day++; // add 1 to day
			inhabitants = inhabitants / 2; //decrease by half	
		}
		System.out.println("---- EXTINCT ----");
	}
		
		
	}


