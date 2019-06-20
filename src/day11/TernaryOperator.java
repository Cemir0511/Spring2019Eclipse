package day11;

public class TernaryOperator {

	public static void main(String[] args) {
	
		//used for conditionally assigning a value
		
		// used for conditionally assigning a value 
				int score = 98 ; 
				//String abc = "";
				
//				if(score>75)
//					abc = "pass";
//				else
//					abc = "fail"; 
				
				String abc = (score>75) ? "pass" : "fail" ; 
				System.out.println(abc);
				
				// TASK 3 : 
				// create variable price as double , String as label 
				// if the price is more than 100 assign value of label as expensive
				// else assign value as cheap 
				// Create a char variable 
				
				String label ; 
				double price = 99.99; 
				//String label = (price>100)?"expensive":"cheap";
				//System.out.println(label);
//				
//				if(price>100){
//					label= "expensive"; 
//				}else if(price>90){
//					label = "moderate" ; 
//				}else{
//					label = "cheap" ; 
//				}
//				just for your eyes , just observe , do not try at home 
				label = (price>100) ? "expensive" : ( (price>90) ? "moderate" : "cheap" )  ; 
				System.out.println(label);
				//String label2 = (price<=100 && price>90) ? "moderate" : "cheapOrExp" ; 
				
				
				
				

		
		

	}

}
