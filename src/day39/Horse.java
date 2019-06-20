package day39;

public class Horse {

	/// CREATE A CUSTOM CLASS CALLED 
	// Horse 
	// it should have 4 instance variables 
	// any object created out of this class 
	// should have 4 attribute as below 
	/*
	 * breed as String 
	 * age as int 
	 * color as String 
	 * height as double 
	 * */

	// instance field/variable 
	  // to define properties/ attributes of objects 
	  // that being created out of this class
	
	  String breed;
	  int age;
	  String color;
	  double height;
	  
	  
	  
	  public static void main(String[] args) {
	    
	    // each objects attribues 
	    // are completely independent from
	    // any other objects that created 
	    // from same class 
	    
	    Horse h1 = new Horse(); 
	    h1.age = 4;
	    h1.breed= "Mongolian horse";
	    h1.color ="black";
	    h1.height= 5.10;
	    
	    Horse h2 = new Horse();
	        // Setting attributes of object
	        h2.breed = "Arabian" ;
	        h2.age = 5 ;
	        h2.color = "black";
	        h2.height = 5.5;
	        
	        System.out.println( h1.color );
	        System.out.println( h2.height);
	        // reassigned to new value 
	        h1.color = "brown"; //degistirebilirsin value yu
	        
	        System.out.println(h1.color);
	        System.out.println(h2.color);
	        
	        
	        
	      System.out.println(h1); //desen directly hashcode verir, because  u need toString method
	      System.out.println(h1.breed +":"+ h1.age+":"+h1.height+":"+h1.color); //anca concationation la hepsini print edersin

		
		
		
		
	}

}
