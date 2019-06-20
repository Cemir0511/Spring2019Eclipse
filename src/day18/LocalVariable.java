package day18;

import java.util.Scanner;

public class LocalVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x;
		int y=10;
		if(y>15) {
			x=10;
		}else {
			
			x=5;
		}
		System.out.println(x);//burdaki x else likullanilmazsa initialize te der..
	
		
		
		int a = 0;
		
		Scanner scan = new Scanner(System.in);
		
		
		//GIVE ME BILL:
				
				while(!(a==5 || a ==10)) {
					System.out.println("Give me 5, or 10");
					
					a = scan.nextInt();
					
					
				}
				System.out.println("good job,,get ur money");
				}
		
		
		
		
	}
		
		
	


