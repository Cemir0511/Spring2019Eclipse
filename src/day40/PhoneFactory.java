package day40;

public class PhoneFactory {

	public static void main(String[] args) {
		
		//you have to create new object to be able to access
		// those instances in the Phone class. 
		
			
			Phone iphone = new Phone();
			iphone.brand = "Apple";
			iphone.type = "IOS";
			iphone.OS = "apple";
			iphone.capacity= 128;
			iphone.ring();
			iphone.dial(434434566L);
			
			
			
			iphone.displayBrand();
			
			System.out.println(iphone.OS);
			
			
					
			Phone sumsung = new Phone();
			sumsung.type = "9";
			sumsung.OS ="Android";
			sumsung.capacity = 64;
			sumsung.ring();
		    sumsung.dial(425678936L);
		    
			
			System.out.println( sumsung.capacity  );
		    
			
			Phone pixel = new Phone();
			pixel.type = "5";
			pixel.OS = "no idea";
			pixel.capacity=500;
			pixel.ring();
		    pixel.dial(425678936L);
		    
		    System.out.println( pixel.brand  );
		    
		    //System.out.println(iphone.brand);
			
			
			
			
			
			
	}

}



    
    /*
     * Create class Phone
     * add few instance variable to define   attribute | properties| state of object 
     * type as String , OS as String , capacity as int 
     * add few methods 
     *    ring -->> accept no param return no value , just print ringing
     *   dial -->> accept one param number as long and print dialing number 
     * 
     * OPTIONALLY 
     *   add a behavior to Phone object  
     *   displayPhoneInfo method accept no param return no value 
     *   --> this should print all phone attributes 
     * 
     * 
     * Create another class called PhoneFactory with main method 
     * create 3 different phone object , iphone, sumsung , pixel 
     * assign value for all attributes 
     * and call methods 
     * 
     *   
     * 
     * */ 
    

