package day41;

public class StudentTester {

	public static void main(String[] args) {
		
		Student muammar = new Student() ;
			muammar.name = "muammar";
			muammar.age = 27;
			muammar.ssn=1234567;
		    
			muammar.displayName();
			muammar.displayNameAndAge();  // class ta private oldugundan gozukmuyor burda
			muammar.showSSN();
		   
			
			
			
	}

}

