package day47;

import java.util.ArrayList;
import java.util.Arrays;

public class Marathon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// counting objects 
	    // there is no way to count object programmatically 
	    // just by looking at new keyword 
	    // we need to find a block of code that run 
	      // when object is being created so we can 
	      // increase the count there

		Bike b1 = new Bike ("Kawasaki",4, 20);
		Bike b2 = new Bike ("Ducati", 5, 30);
		Bike b3 = new Bike ("Yamaha", 5, 25);
		Bike b4 = new Bike ("Harley-Davidson", 3, 27);
		
		
		
		ArrayList<Bike>allBikes = new ArrayList<> (Arrays.asList(b1,b2, b3, b4));
		
		for (int i = 0; i<allBikes.size(); i++) {
			System.out.println(allBikes.get(i));
		}
		System.out.println("---------------------");
		
		for (Bike each : allBikes) {
			//System.out.println(each);
			System.out.println( each.getId() + "---- "+ each.getBrand());
			
		}
		
		System.out.println("-----------------");
		
		b1.speedUp(10);
		System.out.println(b1.getSpeed());
		b2.speedUp(10);
		b3.speedUp(10);
		b4.speedUp(10);
		
		Bike.showCurrentCount();  // Bike Count is 4 now
		
		Bike.reserCount();
		Bike.showCurrentCount();
		
		
		Bike b5 = new Bike("Yamaha", 4, 88);
	    System.out.println("current id of b5 is " + b5.getId());
	    Bike b6 = new Bike("Harley-Davidson", 3, 70);  
	    System.out.println("current id of b6 is " + b6.getId());
	    Bike.showCurrentCount(); //-->> Bike count is 4 now
	      
	    
		
	}

}
