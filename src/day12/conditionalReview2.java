package day12;

public class conditionalReview2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// any ternary operator can be turned into if else statement 
				// one and only one purpose of ternary operator is conditional assignement 
				
				String weather  ;  // get the weather value from scanner  
				String action ; 
				// TASK 1
				/*
				 * 
				 * check for weather equal to sunny or not 
				 * and assign the value of --if sunny assign action value to go out 
				 * if not assign action value to stay home 
				 * 
				 * print out your action after the statement 
				 * 
				 * optional : try to check for multiple condition of sunny/cloudy/windy/rainy/
				 * 
				 * */
				
				  Scanner s = new Scanner(System.in);
				  
				  System.out.println("how is weather today?");
				  
				  weather=s.next();
				  
				  /// ALWAYSE USE  str1.equal(str2) for String equality check 
				 
				  /// add 2 more condition nice or warm 
				  
				  // Commenting multiple line ---> Command /  or Ctr / 
				  
//				  if(weather.equalsIgnoreCase("sunny")  ||  weather.equalsIgnoreCase("nice")     ){
//					  action = "go out";
//				  }else{
//					  action =  "stay home";
//				  }
				  action = (weather.equalsIgnoreCase("sunny")  || weather.equalsIgnoreCase("nice") )
						  		? "go out" : "stay home" ; 
				   
				System.out.println("THE ACTION according to weather is : " + action);
				
				

		
		
	}

}
