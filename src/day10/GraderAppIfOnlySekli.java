package day10;

import java.util.Scanner;

public class GraderAppIfOnlySekli {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your score please");
				
		int score = scan.nextInt();
		
		if(score > 100 || score < 0){
			System.out.println("INVALID NUMBER");
		} else if (score > 90) {
			System.out.println("Great score : A!");
		} else if (score > 80) {
			System.out.println(" Good score : B !!");
		} else if (score > 70) {
			System.out.println(" OK SCORE : C !!");
		} else {
			System.out.println("STDUY HARDER!!!!!");
		}
		
		
		
		
		if (score>90)
			System.out.println("Great score : A!");
		if (score >80 &&score<=90) {
			System.out.println("good score : B!");
		}
		if (score >70 &&score<=80) {
			System.out.println("Good score : C!");
		}
		if (score <70) {
			System.out.println("Study harder!!");
			
		// bu sekliyle else if olmayinca, tek if olunca hepsini ayri ayri check eder
			//bagimsiz if ler
			//block degil, ve daha yavas
			//ama else if li statementllar block oluyor
			
	
		
		}
			
		
		
	}

}
