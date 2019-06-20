package day19;

public class StairCase {

	public static void main(String[] args) {
		
//COK ONEMLI..common interview sorusu
		
		
		String stars="*";
		int a=0;
		
		while (a<5) {
			System.out.println(stars);
			stars+= "*";
			a++;
			
			System.out.println();
		}
		System.out.println();
		
		String sta = "**";
		int s = 1;
		while (s<=5) {
			System.out.println("My sta" + sta);
			sta+= "**";
			s++;
		}
		
		//AKBAR"S:
		String star="*";
		int x =1;
		while(x<=5) {
			System.out.println(star);
			
			star=star+"*";//add one star existing star
			x++;//and so on add on existing star
		}
		System.out.println();
		
		
		//AKBAR"S different way for staircase:
		int y=1;
		String allstar="";
		while (y<+5) {
			
			allstar=allstar+star;
			
			System.out.println(allstar);
			
			y++;
			System.out.println(allstar);	
		}
		
		String and = "&";
		int an = 1;
		
	while (an <= 5) {
		System.out.println(and);
		and+="&&";
		an++;
	}
		
		
		
	}

}
