package day43;

public class Course {

	String name;
	int courseID;
	
	
	//Constructor
	// --- a special method that being called whenever an object is created
	// it has same name as class
	// it has no explicit return type (This doesn't mean that return type is void 
	
	
	// if you don't explicitly create one constructor like below, 
	//the compiler will add an empty constructor (as default constructor is there)
	// because we can not call something we don't have
	// we call it default constructor.. not seen
	
	// taskcagiz:
	//modify this constructor 
	//if any object is being created using no-arg constructor
	//the first name should be set to unknown
	//the course id should be set to 100.
	
	
	
	public Course() {
		this.name ="unknown";  // yukardaki task i ekledik buraya
		this.courseID = 100;   //CourseAction sinifinda Course Constructo, inkown , 100cikar
		                       //(diger herseyleri comment out yapinca)
		System.out.println("Course constructor"); //bu olmasa da new object create olur, 
		                                          //cunku bu default ta vardir gozukmese bile
	}
	
	
	
	//ve bu da constructor overloading:
	
	public Course (String name ) {
		this.name = name ; // whenever u create vy useing this, it give back u name actuclly
		System.out.println("passing  1 argument");
	}
	
	//Task:
	public Course (String name, int id) {

		this.name = name;
		this.courseID = id;
		System.out.println("passing two arguments");
	}
	
	//  nerden bilirim constructor mu degil mi?? 
	// THIS IS NOT A CONSTRUCTOR
	//CAUSE IT SHOULDN"T HAVE A RETURN TYPE
	//AND IT HAS TO HAVE SAME NAME AS CLASS NAME 
	
	//public void Course () {  (CONSTRUCTUR DEGIL BU, void olmaz constructur da)
	
	// yani kisaca: what constructor exists, what u do with it? 
	// Constructor used to execute some action when you are creating a new object
    // as long as u see new keyword, constructor of that class must be called.
	// whenever u see a new keyword, it must call the constructor


	
	// So how many ways of creating object exists in my programming right now?
	// we have 3 constructor , 3 ways to create object we have

}
