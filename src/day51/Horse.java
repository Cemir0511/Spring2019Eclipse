package day51;

public class Horse extends Animal{

	// everytime horse make noise 
		// it should make animal noise first 
		// then it should make horse specific noise 
		
		@Override
		public void makeNoise() {
			//System.out.println("General Noise");
			super.makeNoise(); // to tell compiler that i am calling super class version of the method
			// this will call current method itself rather than super class version 
			//makeNoise();
			// below 3 statements are all legal !!!!
//			super.eat();
//			eat();
//			this.eat();
			System.out.println("Neigh Neigh");
		}
		/*
		 * public void eat() {
		 *	System.out.println("eating !!!!");
		 * }
		 * */

	
	
}
