package day44;

public class ReviewConstructor {

	public void ReviewConstructor() {      // bu method // normalde boyle yapilmaz, 
		                                      // normalde you never create a method with same class name
		System.out.println("BOOM");           // ama sinav icin
	}
	
	// we can use any access modifier for constructor: (public, private, ...)
	public ReviewConstructor(String abc) {          // bu constructor
		System.out.println("BOOM REAL");    
	}
	// karisik gozukse de degil, 2 seye bakacaksin:
	//does it have return type? , 
	//and does it have same name?
	
	
	
	
	//  WHAT'S THE MOST USEFUL WAY TO USE CONSTRUCTOR?
	//  INITIALIZE ALL THE FIELD VALUES OF AN OBJECT WHILE BEING CREATED
	
	public static void main(String[]args) { // bu da olur yani main method
	
//	ReviewConstructor re = new ReviewConstructor();	
		
		
	}
	
}
