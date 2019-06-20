package day42;

public class Employee {

	
		// access modifiers: public, protected, default, and private
		//public accessible everywhere
	    // default :no access modifier, only in same package access only (default, package private da deniyor)
	    //private : access only in same class
		
	
	
	//instance variable  --->> used to define properties or attributes of the objects 
	    String name;
		int age;
		String title;
		double salary;
	
		
	// instance methods --->> are used to read or manipulate property or  attribute of the object 	
		public void printAllInfo() {
			
			System.out.println("name is: " + name +
					"age is: " + age + 
					"title is: " + title + 
					" salary is : "+ salary);
			
		}
		
		
		// static method doesnot need an object, instance methods need an object
		// o yuzden instance methodlar public void oluyor genelde
		//static olmuyor
		
		

	

}
