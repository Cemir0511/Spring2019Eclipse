package day15;

import java.util.Scanner;

public class TAskASKII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ismin ASCII si,  int verecegi icin int ascii ..charAt() bulursun
		
		
		String name="Murad";
		
		 int ascii=name.charAt(0); // 77
		 int ascii1=name.charAt(4);  //100
		 System.out.println(ascii +"\n"+ascii1);
		 
		 
		 
		 
		 
		 String name1 = "Firdevs"; 
		 char a = name1.charAt(0); //70
		 char b = name1.charAt(name1.length()- 1); //115
		 int num = a;
		 int num2 = b;
		 System.out.println(num);
		 System.out.println(num2);	
		 
		 
		 Scanner scan=new Scanner(System.in);
			System.out.println("Enter your name:");
			String name11=scan.next();
			char c1=name11.charAt(0);
			char c2=name11.charAt(name11.length()-1);
			int n1=c1;
			int n2=c2;
			System.out.println("First char and number: "+c1+"="+n1+" Last char and number: "+c2+"="+n2);
			
			String myNames = "Zeliha";
			int asciisayi1 = myNames.charAt(0);
			int ascisayi2 = myNames.charAt(myNames.length()-1);
			System.out.println("Zeliha'nin ascii, si: " + asciisayi1 + ", " + ascisayi2);
			
			
			String name111="Sevda";
	         char firstchar=name111.charAt(0);
		     char last=name111.charAt(4);
		     
		    int firstNum=firstchar;
		    int lastNum= last;
		     
			System.out.println(firstNum+" "+lastNum);	
		 
		 /*
			String name = "Moses";
			int n = name.charAt(0);
			int last = name.length()-1;
			
			System.out.println(n);
			System.out.println(last);
			
			
			
			String name = "Shahriyor";
			char first = name.charAt(0);
			char last = name.charAt(name.length()-1);
			
			int firstAscii = (int) first;
			int lastAscii = (int) last;
			
			System.out.println(firstAscii);
			System.out.println(lastAscii);
			
			
			
			String name="emray";
		      char c1='e';
		      int num1=c1;
		      char c2='y';
		      int num2=c2;
		      System.out.println(num1);
		      System.out.println(num2);
		      
		      
		      
		      String name = "Shahriyor";
				

				System.out.println((int)name.charAt(0));
				System.out.println((int)name.charAt(name.length()-1));
				
				*/
				
				
				
				
						
						char a1 =' ';
						int charNum=0;
						
						for(int i=65;i<=122;i++)
						{
							a1=(char)i;
							charNum = a1;
							System.out.println("ASCII of " +a1 +" is " +charNum);
						}
						}
						
			/*	
				
				char x1 = '0';
		        char x2 = '1';
		        
		        System.out.println(x1);            //0
		        System.out.println(x2);            //1
		        System.out.println(x1+x2);        //97            ?!
		        System.out.println(x1+" "+x2);    //0 1
			
		 
*/
	

}
