package day5;

public class variablettask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	    double  cucumber_price = 2.5;
	    int tomatoes_price = 3;
		double onion_price = 1.5;
		int pepper_price = 2;
		int carrot_price = 4;
		
		double total_price = cucumber_price+tomatoes_price*4+onion_price*2+pepper_price+ carrot_price*6;
		
		System.out.println ("Expected results are shown below:"); 
		System.out.println( "1 Cucumber is " + cucumber_price + " dollars."); 
		System.out.println ("4 Tomatoes is " + tomatoes_price*4 + " dollars."); 
	    System.out.println("2 Onion is " + onion_price*2 + " dollars.");
	    System.out.println("1 Pepper is  " + pepper_price + " dollars.");
	    System.out.println("6 Carrot is " + carrot_price*6 + " dollars.");
	    
	    System.out.println("Total price is: "+ total_price + " dollars." );
	    

	
	}
	

}
