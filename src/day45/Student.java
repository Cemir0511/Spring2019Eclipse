package day45;

public class Student {

	String name ;
	int age;
	String major;
	
	//one constructor can be called 
	//in another constructor of same class using
	// this(argument) 
	
	// however ,
	// THIS CAN BE ONLY A SINGLE CALL
	// this (arguments)  CAN NOT BE CALLED MORE THAN ONCE !!
	
	
	// this (args..) 
	//  call MUST BE the FIRST LINE of your constructor
	
	// yani u can only call once, and it has to ve the very first line, very first statement in your constructor call
	
	public Student() {  // control space ile getirirsin bunu 
	// calling constructor with 1 arg
	// to put default name
	this("NO NAME");	                
	System.out.println("no args");	
	}
	
	
	public Student (String name) {
		System.out.println("1 arg" +name);
	}
	
	
	
	
	public Student (String name, int age, String major) {
		this();
		// this ("may name") --->> we can not do it, cause we can call this() only once  
		System.out.println("3 args");
		//this.name = name;
		//this.age = age;
		//this.major = major;
		//this (); cannot happen cause it must be in the first line, the first line order rule
		
		
	}
}


/*
 * String name; 
  int age ; 
  String major; 
  
  // one constructor can be called 
  // in another constructor of same class
  // this(arguments)
  
  // However , 
  // THIS CAN BE ONLY A SINGLE CALL 
  // this(arguments) can not be called more than once 
  
  // this(args..) 
    // call MUST BE first line of your constructor
  
  
  
  public Student() {
    
    //System.out.println("asdasdsadsa");
    // calling constructor with 1 argument 
    // to put default name 
    this("NO NAME"); 
    //this("NO NAME"); 
    System.out.println("no arg");
    
  }
  
  public Student(String name) {
    
    System.out.println("1 arg " + name);
  }


  public Student(String name, int age, String major) {
    
    this() ; 
    //this("my name");
    System.out.println("3 arg");
//    this.name = name;
//    this.age = age;
//    this.major = major;
    //this() ;     
  }
  
  
 * 
 */
*/