package day30;

public class MyMethodsWithParaMetersYaniReturnValueVeNonVoid {

	public static void main(String[] args) {
		//buildEmail("Mike", "Smith");
		System.out.println(buildEmail ("Mike", "Smith"));
		System.out.println(buildEmail ("Zeliha", "Kocak"));
//////////////////
	    getMax(100,3);//and pass numbers inside..returning value here only
	                   //no comparison here yet
	                  //returning value but no printing so print now:
	    System.out.println(getMax(100,3));
	    //yada:
	    
	    int myNum = getMax(38, 75);
	    System.out.println("My max num is : " + myNum); ///wowww, 75 max print etti
	    
////////////////
	    getMax3(103, 89, 56);
	    System.out.println(getMax3(103, 89, 56));
	    
	    /////
	    
	   // writeEmail("Fatma", "Er");
	   // writeEmail("Murvet", "Er");
	    System.out.println(writeEmail("Fatma" , "Er")); //iki kere yazdi
	    System.out.println(writeEmail("Murvet" , "Er"));
	   
	    ////
	    bill(4, 7, 2);
	    System.out.println(bill ( 4, 7, 2));
	    
	    ////
	    
	    System.out.println(vacationCost ( 100050, 700, 500));
	    
	/////
	    System.out.println("total hours: "+ hours ( 4, 8, 4, 7));
	   
	}	
		//buildEmail that will accept 2 parameters: firstname and lastname
		//and return a full email by adding @gmail.com
		
		public static String buildEmail (String firstName,String lastName) {
			String email= firstName.toLowerCase() + "_"+ lastName.toLowerCase() + "@gmail.com";
			return email;
		}
		
		public static int getMax (int num1, int num2) {
			int largest;
			if (num1>num2) {
				largest=num1;
				
			}else {
				largest=num2;	
			}
			return largest;	
		}
		
		
		//method getMax that accepts 3 ints and returns largest value:
		public static int getMax3 (int num1, int num2, int num3) {
			int largest;
			if (num1>num2 && num1> num3) {
				return num1;
			}else if (num2>num3 && num2>num1){
				return num2;
			}else {
				return num3;
			}
		}
		
		
		public static String writeEmail(String firstName, String lastName) {
			String fullEmail = firstName.toLowerCase() + "_" + lastName.toLowerCase() + "@gmail.com";
			return fullEmail;
			
		}
		
		public static int bill ( int coffee, int latte, int water) {
			int total = coffee + latte + water;
			return total; 
		}
		
		public static int vacationCost ( int hotel, int food, int gas) {
			int totalCost = hotel + food + gas;
			return totalCost; 
		}
		
		public static int hours ( int practice, int repl, int slides, int testing) {
		     int totalHours = practice + repl + slides+testing; 
			return totalHours;
			
		}
		
		
		
		
		
		
	   
	    }


	    	
	  
			
	
		
		



