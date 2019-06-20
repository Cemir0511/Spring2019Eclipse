package day29;

public class Spartan2 {

	
		
		//method is created inside class
		//it should not be inside ant method (like in main method)
		//method is a action--> always named as like doSomething!
		//method name just like variable name always start with lower case by convention, 
				//if you have multiple names use camelCase for multiple words.
		
		
		public static void releaseTheHorse() {
			System.out.println("release it now please go !!");
			System.out.println("go!!!!");
		}

		public static void holdYourHorse() {
			
			String owner = "Ahmed";
			System.out.println(owner + " hold your horse please!");
		}
		
		public static void main(String[] args) {
		
			Spartan2.releaseTheHorse();
			Spartan2.releaseTheHorse();
			// if you are in same class where the method is defined or created;
					//className. is optional.
			releaseTheHorse();
			holdYourHorse();
			
			
			
			//release the horse
			// we will start with method does not take external data
			//method that does not return any value 
			//method that does not need an object to be called
			
			
			//Arrays.toString(arr)
			
			
		//	JavaMethod.releaseTheHorse();
			
			//public --> access modifier , to define where it can be used
			//static --> non-access modifier , if defined it means no object needed to call this method.
			//void --> it means this method only take action and does not return any value

		}

		

	
	

}
